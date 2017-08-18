package aleastchs.googleCharts.helpers.chartsHelp

/**
  * Created by alexa on 03/08/2017.
  */
import scalajs.js

class AnnotationChartOption(
                             val allowHtml: Boolean = false,
                             val allValuesSuffix: String = null,
                             val annotationsWidth: Int = 25,
                             val colors: js.Array[String] = null,
                             val dateFormat: String = null,
                             val displayAnnotations: Boolean = true,
                             val displayAnnotationsFilter: Boolean = false,
                             val displayDateBarSeparator: Boolean = true,
                             val displayExactValues: Boolean = false,
                             val displayLegendDots: Boolean = true,
                             val displayLegendValues: Boolean = true,
                             val displayRangeSelector: Boolean = true,
                             val displayZoomButtons: Boolean = true,
                             val fill: Int = 0,
                             val legendPosition: String = "sameRow",
                             val max: Int = 100,
                             val min: Int = 0,
                             val numberFormats: String = null,
                             val scaleColumns: js.Array[Int] = null,
                             val scaleFormat: String = "#",
                             val scaleType: String = "fixed",
                             val table: js.Object = null,
                             val thickness: Int = 0,
                             val zoomEndTime: js.Date = null,
                             val zoomStartTime: js.Date = null
                           ) {
  def toDynamic: js.Object = js.Dynamic.literal(
    allowHtml = this.allowHtml,
    allValuesSuffix = this.allValuesSuffix,
    annotationsWidth = this.annotationsWidth,
    colors = this.colors,
    dateFormat = this.dateFormat,
    displayAnnotations = this.displayAnnotations,
    displayAnnotationsFilter = this.displayAnnotationsFilter,
    displayDateBarSeparator = this.displayDateBarSeparator,
    displayExactValues = this.displayExactValues,
    displayLegendDots = this.displayLegendDots,
    displayLegendValues = this.displayLegendValues,
    displayRangeSelector = this.displayRangeSelector,
    displayZoomButtons = this.displayZoomButtons,
    fill = this.fill,
    legendPosition = this.legendPosition,
    max = this.max,
    min = this.min,
    numberFormats = this.numberFormats,
    scaleColumns = this.scaleColumns,
    scaleFormat = this.scaleFormat,
    scaleType = this.scaleType,
    table = this.table,
    thickness = this.thickness,
    zoomEndTime = this.zoomEndTime,
    zoomStartTime = this.zoomStartTime
  )
}

object AnnotationChartOption {
  def apply(
             allowHtml: Boolean = false,
             allValuesSuffix: String = null,
             annotationsWidth: Int = 25,
             colors: js.Array[String] = null,
             dateFormat: String = null,
             displayAnnotations: Boolean = true,
             displayAnnotationsFilter: Boolean = false,
             displayDateBarSeparator: Boolean = true,
             displayExactValues: Boolean = false,
             displayLegendDots: Boolean = true,
             displayLegendValues: Boolean = true,
             displayRangeSelector: Boolean = true,
             displayZoomButtons: Boolean = true,
             fill: Int = 0,
             legendPosition: String = "sameRow",
             max: Int = 100,
             min: Int = 0,
             numberFormats: String = null,
             scaleColumns: js.Array[Int] = null,
             scaleFormat: String = "#",
             scaleType: String = "fixed",
             table: js.Object = null,
             sortAscending: Boolean = false,
             sortColumn: Int = 0,
             thickness: Int = 0,
             zoomEndTime: js.Date = null,
             zoomStartTime: js.Date = null
           ): AnnotationChartOption = new AnnotationChartOption(allowHtml, allValuesSuffix, annotationsWidth, colors, dateFormat, displayAnnotations, displayAnnotationsFilter, displayDateBarSeparator, displayExactValues, displayLegendDots, displayLegendValues, displayRangeSelector, displayZoomButtons, fill, legendPosition, max, min, numberFormats, scaleColumns, scaleFormat, scaleType, table, thickness, zoomEndTime, zoomStartTime)
}