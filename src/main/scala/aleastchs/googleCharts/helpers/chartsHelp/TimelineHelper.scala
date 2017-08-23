/**
  * Created by aleast on 02/08/2017.
  */

package aleastchs.googleCharts.helpers.chartsHelp

import aleastchs.googleCharts.google
import scala.scalajs.js

class TimelineHelper(
                      val data:     google.visualization.DataTable,
                      val timeline: google.visualization.Timeline,
                      val options:  TimelineOption
                    ) {

  // draw()-method
  // this calls the Timeline.draw() with the given data and options
  def draw(): Unit = {
    // TODO: this can work, but then you need to filter rows of the same row label
    // Todo: this approach can work, look at SQL-formatting with data.group()
    // options.setHeight(data.getNumberOfRows() * heightPerRow + margin )
    timeline.draw(
      data,
      TimelineOption(
        this.data.getNumberOfRows() * 31 + 40,
        this.options.width,
        this.options.timeline,
        this.options.tooltip,
        this.options.title,
        this.options.avoidOverlappingGridLines,
        this.options.backgroundColor,
        this.options.colors,
        this.options.enableInteractivity,
        this.options.fontName,
        this.options.fontSize,
        this.options.forceIFrame
      ).toDynamic
    )
  }

  // clears the timelineChart
  def clear(): Unit = timeline.clearChart()

  // TODO: convert to js.Date so User cannot see any js-code??
  // newRow()-method
  // set the rowLabel, barLabel, startDate and endDate
  // add a new row to the DataTable with the given data, with some minor help of TimelineRow
  def newRow(rowLabel: String, barLabel: String, startDate: js.Date, endDate: js.Date): Unit =
  data.addRow(TimelineRow(rowLabel, barLabel, startDate, endDate).toArray)

  def newRow(row: TimelineRow): Unit =
    data.addRow(row.toArray)

  // TODO: Fix data.addRow()
  // TODO: Error 'Missing value in row 1'
  def emptyRow(): Unit = data.addRow()
}

// simple helper to timeline
// companion object
// this setups the predefined data
object TimelineHelper {
  // if we set colorByRowLabel and !showBarLabel we get a nicer view
  private val innerOptions = TimelineInner(null, true, true, null, false, true, null)

  // simple init of dataTable
  private def preDefTimelineData: google.visualization.DataTable = {
    val toInit: google.visualization.DataTable = new google.visualization.DataTable()
    // todo: use description object
    // todo: do functional
    /*
// simple setup of the description objects for each column
val descriptionObjects: List[DescriptionObject] =
new DescriptionObject("date"     , "TimelineDate"     , "End Date"  ) ::
new DescriptionObject("date"     , "TimelineDate"     , "Start Date") ::
new DescriptionObject("string"   , "TimelineString"   , "Bar Label" ) ::
new DescriptionObject("string"   , "TimelineString"   , "Row Label" ) :: Nil
// add each description object to table
descriptionObjects.foreach(obj => toInit addColumn obj.toArray() )
*/
    // creates a example column setup to the DataTable
    toInit.addColumn("string", "TimelineString", "Row Label")
    toInit.addColumn("string", "TimelineString", "Bar Label")
    toInit.addColumn("date", "TimelineDate", "Start Date")
    toInit.addColumn("date", "TimelineDate", "End Date")

    // result value is the table that now is ready to use
    toInit
  }

  def apply(
             dataTable: google.visualization.DataTable,
             timeline: google.visualization.Timeline,
             optionsTimeline: TimelineOption
           ) = new TimelineHelper(
    dataTable,
    timeline,
    optionsTimeline
  )

  // element and options apply
  def apply(
             element: js.Dynamic,
             options: TimelineOption
           ) = new TimelineHelper( // create a new TimelineHelper
    // get the predef data table
    preDefTimelineData,
    // create a new GoogleVisualization.Timeline() with the given element as argument
    new google.visualization.Timeline(element),
    // set the options
    options
  )

  def apply(
             element: js.Dynamic,
             jsonData: String,
             title: String
           ) = new TimelineHelper(
    // create a new DataTable with the jsonData-string
    new google.visualization.DataTable(jsonData),
    // create a new GoogleVisualization.Timeline() with the given element as argument
    new google.visualization.Timeline(element),
    // create a new OptionsTimeline
    TimelineOption(
      0,
      0,
      innerOptions,
      title
    )
  )

  def apply(
             element: js.Dynamic,
             title: String
           ) = new TimelineHelper(// create a new TimelineHelper
    // get the predef data table
    preDefTimelineData,
    // create a new GoogleVisualization.Timeline() with the given element as argument
    new google.visualization.Timeline(element),
    // create a new OptionsTimeline
    TimelineOption(
      0,
      0,
      innerOptions,
      title
    )
  )
}



