package aleastchs.googleCharts

import aleastchs.googleCharts.GoogleVisualization.{DataTable, DataView}

import scala.scalajs.js.annotation.JSGlobal
import scalajs.js

@js.native
@JSGlobal
object GoogleCharts extends js.Object {
  @js.native
  class Bar extends js.Object {
    def clearChart(): Unit = js.native
    // Todo search for docs
    def convertOptions(options: js.Object): js.Object = js.native

    def draw(data: DataView, options: js.Object): Unit = js.native
    def draw(data: DataTable, options: js.Object): Unit = js.native

    def getAction(actionID: js.Object): js.Object = js.native

    def getBoundingBox(id: js.Any): js.Object = js.native

    def getChartAreaBoundingBox(): js.Object = js.native

    def getChartLayoutInterface(): js.Object = js.native
    // Todo fix parameters at HAxis and VAxis
    def getHAxisValue(position: js.Any, optional_axis_index: js.Any): Int = js.native

    def getImageURI(): String = js.native

    def getSelection(): js.Array[js.Any] = js.native

    def getVAxisValue(position: js.Any, optional_axis_index: js.Any): Int = js.native
    // Todo fix parameters at XLoc and YLoc
    def getXLocation(position: js.Any, optional_axis_index: js.Any): Int = js.native

    def getYLocation(position: js.Any, optional_axis_index: js.Any): Int = js.native

    def removeAction(actionID: js.Object): Unit = js.native

    def setAction(action: js.Object): Unit = js.native

    def setSelection(selection_array: js.Object): Unit = js.native
  }

}

