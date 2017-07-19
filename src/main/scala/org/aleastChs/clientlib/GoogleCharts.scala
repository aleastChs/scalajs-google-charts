/**
  * Created by alexa on 11/07/2017.
  */

import scala.scalajs.js
import js.annotation._
import org.scalajs.dom._
//import org.scalajs.dom.raw.{HTMLInputElement,HTMLDivElement}
import scala.scalajs.js.Date


package google {

  @JSName("google.charts")
  @js.native
  object charts extends js.Object {
    def load(): Unit = js.native
    def setOnLoadCallback(): Unit = js.native
  }

  @JSName("google.QueryResponse")
  class QueryResponse extends js.Object {

  }

  @JSName("google.visualization")
  @js.native
  object visualization {
    // STATIC METHODS
    def arrayToDataTable(twoDArray: js.Array[js.Any][js.Any], opt_firstRowIsData: Boolean = false): DataTable = js.native
    def drawChart(chart_JSON_or_object: js.Any): Unit = js.native
    def drawToolbar(): Unit = js.native

    // EXCEPTION FOR CHARTS
    // Thrown if Chart does not have the method from StandardChart Trait
    case class NoSuchMethodInChartException(message: String) extends Exception(message)

    trait StandardChart {
      // todo fix result value
      def getAction(id: String): Unit = js.native
      def getSelection(): js.Array[js.Object] = js.native
      def removeAction(id: String): Unit = js.native
      def setAction(action_object: js.Object): Unit = js.native
      def setSelection(selection_array: js.Array[js.Object]): Unit = js.native

//      def clearChart(): Unit = js.native
//      // TODO Fix state
//      def draw(data: DataTable, options: js.Object): Unit = js.native
//      def draw(dataTable: DataTable, options: js.Object, state: _): Unit = js.native
//
//      // Todo fix Handler
//      def getContainer(): Unit = js.native
//      def getSelection(): js.Array[js.Object] = js.native
//      def getVisibleChartRange(): js.Object = js.native
//      def hideDataColumns(columnIndexes: Int): Unit = js.native
//      def setVisibleChartRange(start: js.Date, end: js.Date): Unit = js.native
//      def showDataColumns(columnIndexes: Int): Unit = js.native
    }


    @JSName("google.visualization.AnnotationChart")
    @js.native
    case class AnnotationChart(container: js.Dynamic) extends js.Object with StandardChart{

    }

    def arrayToDataTable(): Unit = js.native


    @JSName("google.visualization.ColumnChart")
    @js.native
    case class ColumnChart(container: js.Dynamic) extends js.Object {

    }


    @JSName("google.visualization.Timeline")
    @js.native
    case class Timeline(container: js.Dynamic) extends js.Object with StandardChart {
    }

    @JSName("google.visualization.DataTable")
    @js.native
    class DataTable(
                     optional_data: String = "",
                     optional_version: String = "") extends js.Object {
      def addColumn(`type`: String, opt_label: String = "", opt_id: String = ""): Int = js.native
      def addColumn(description_object: Array[String]): Int = js.native
      def addRows(rows: js.Array[js.Array[js.Any]]): Int = js.native
      def addRows(numOrArray: js.Any): Int = js.native
      def addRow(row: js.Array[js.Any]): Int = js.native
      def addRow(): Int = js.native
      def getColumnId(columnIndex: Int): String = js.native
      def getColumnLabel(columnIndex: Int):	String = js.native
      def getColumnPattern(columnIndex: Int):	String = js.native
      def getColumnProperties(columnIndex: Int): js.Object = js.native
      def getColumnProperty(columnIndex: Int, name: String): js.Any = js.native
      def getColumnRange(columnIndex: Int): js.Object = js.native
      def getColumnRole(columnIndex: Int): String = js.native
      def getColumnType(columnIndex: Int): String = js.native
      def getDistinctValues(columnIndex: Int): js.Array[js.Object] = js.native
      def getFilteredRows(filters: js.Array[js.Object]): js.Array[js.Object] = js.native
      def getFormattedValue(rowIndex: Int, columnIndex: Int): String = js.native
      def getNumberOfColumns(): Int = js.native
      def getNumberOfRows(): Int = js.native
      def getProperties(rowIndex: Int, columnIndex: Int): js.Object = js.native
      def getTableProperties(): js.Object = js.native
      def toJSON(): String = js.native
      override def clone(): DataTable = js.native
    }

    @JSName("google.visualization.events")
    @js.native
    class events extends js.Object{
      // todo Fix source_visualization and handling_function
      // todo fix result value
      def addListener(source_visualization: _, event_name: String, handling_function: _): Unit = js.native
      def addOneTimeListener(source_visualization: _, event_name: String, handling_function: _): Unit = js.native
      def removeListener(listener_handler: _): Unit = js.native
      def removeAllListeners(source_visualization: _): Unit = js.native
      def trigger(source_visualization: _, event_name: String, event_args: _): Unit = js.native
    }


    @JSName("google.visualization.errors")
    @js.native
    object errors extends js.Object {
      def addError(container: js.Dynamic, message: String, opt_detailedMessage: String, opt_options: js.Object): Unit = js.native
      // todo fix response value
      def addErrorFromQueryResponse(container: js.Dynamic, response: js.Any): Unit = js.native

    }
  }

}