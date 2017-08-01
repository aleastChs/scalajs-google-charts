/**
  * Created by aleast on 01/08/2017.
  */

import scala.scalajs.js

package aleastchs {
  package facade {
    package helpers {
      package google {
        class AnnotationChart(
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
                               max: Int = null,
                               min: Int = null,
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
            table = js.Dynamic.literal(
              sortAscending = this.sortAscending,
              sortColumn = this.sortColumn
            ),
            thickness = this.thickness,
            zoomEndTime = this.zoomEndTime,
            zoomStartTime = this.zoomStartTime
          )
        }

        object AnnotationChart {
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
                     max: Int = null,
                     min: Int = null,
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
                   ): AnnotationChart = new AnnotationChart(allowHtml, allValuesSuffix, annotationsWidth, colors, dateFormat, displayAnnotations, displayAnnotationsFilter, displayDateBarSeparator, displayExactValues, displayLegendDots, displayLegendValues, displayRangeSelector, displayZoomButtons, fill, legendPosition, max, min, numberFormats, scaleColumns, scaleFormat, scaleType, table, sortAscending, sortColumn, thickness, zoomEndTime, zoomStartTime)
        }

        class GaugeOption(
                           duration: Int = 400,
                           easing: String = "linear",
                           forceIFrame: Boolean = false,
                           greenColor: String = "#109618",
                           greenFrom: Int = null,
                           greenTo: Int = null,
                           height: Int = null,
                           majorTicks: js.Array[String] = null,
                           max: Int = 100,
                           min: Int = 0,
                           minorTicks: Int = 2,
                           redColor: String = "#DC3912",
                           redFrom: Int = null,
                           redTo: Int = null,
                           width: Int = null,
                           yellowColor: String = "#FF9900",
                           yellowFrom: Int = null,
                           yellowTo: Int = null
                         ) {

          def toDynamic: js.Object = js.Dynamic.literal(
            animation = js.Dynamic.literal(
              duration = this.duration,
              easing = this.easing
            ),
            forceIFrame = this.forceIFrame,
            greenColor = this.greenColor,
            greenFrom = this.greenFrom,
            greenTo = this.greenTo,
            height = this.height,
            majorTicks = this.majorTicks,
            max = this.max,
            min = this.min,
            minorTicks = this.minorTicks,
            redColor = this.redColor,
            redFrom = this.redFrom,
            redTo = this.redTo,
            width = this.width,
            yellowColor = this.yellowColor,
            yellowFrom = this.yellowFrom,
            yellowTo = this.yellowTo
          )

        }

        object GaugeOption {
          def apply(
                     duration: Int = 400,
                     easing: String = "linear",
                     forceIFrame: Boolean = false,
                     greenColor: String = "#109618",
                     greenFrom: Int = null,
                     greenTo: Int = null,
                     height: Int = null,
                     majorTicks: js.Array[String] = null,
                     max: Int = 100,
                     min: Int = 0,
                     minorTicks: Int = 2,
                     redColor: String = "#DC3912",
                     redFrom: Int = null,
                     redTo: Int = null,
                     width: Int = null,
                     yellowColor: String = "#FF9900",
                     yellowFrom: Int = null,
                     yellowTo: Int = null
                   ): GaugeOption = new GaugeOption(duration, easing, forceIFrame, greenColor, greenFrom, greenTo, height, majorTicks, max, min, minorTicks, redColor, redFrom, redTo, width, yellowColor, yellowFrom, yellowTo)


        }

        class TimelineOption {

        }

        object TimelineOption {

        }

      }
    }
  }
}