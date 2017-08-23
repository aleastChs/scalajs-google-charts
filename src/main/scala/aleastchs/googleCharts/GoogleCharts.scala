package aleastchs.googleCharts

import aleastchs.googleCharts.GoogleVisualization.{DataTable, DataView}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal("google")
@js.native
object google extends js.Object {

  @js.native
  object charts extends js.Object {
    def load(): Unit = js.native
    def load(loading: String): Unit = js.native
    def load(loading: String, loadObject: js.Object): Unit = js.native

    def setOnLoadCallback(): Unit = js.native
    def setOnLoadCallback(callback: Unit): Unit = js.native
    def setOnLoadCallback(callback: js.Function): Unit = js.native
    def setOnLoadCallback(callback: js.Function0[Unit]): Unit = js.native
    def setOnLoadCallback(callback: js.Function1[Unit, Unit]): Unit = js.native


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

  @js.native
  class QueryResponse extends js.Object {

  }

  @js.native
  object visualization extends js.Object {
    // STATIC METHODS
    def arrayToDataTable(twoDArray: js.Array[js.Array[js.Any]], opt_firstRowIsData: Boolean = false): DataTable = js.native
    def arrayToDataTable(): Unit = js.native

    def drawChart(chart_JSON_or_object: js.Any): Unit = js.native

    def drawToolbar(): Unit = js.native

    // CHARTS
    @js.native
    class AnnotationChart(container: js.Dynamic) extends js.Object {
      def clearChart(): Unit = js.native

      def draw(data: DataTable, options: js.Object, state: js.Object): Unit = js.native
      def draw(data: DataView, options: js.Object, state: js.Object): Unit = js.native

      def getContainer(): js.Any = js.native

      def getSelection(): js.Array[js.Any] = js.native

      def getVisibleChartRange(): js.Object = js.native

      def hideDataColumns(columnIndexes: js.Array[Int]): Unit = js.native

      def setVisibleChartRange(start: js.Date, end: js.Date): Unit = js.native

      def showDataColumns(columnIndexes: js.Array[Int]): Unit = js.native
    }

    @js.native
    class AreaChart(container: js.Dynamic) extends js.Object {
      def clearChart(): Unit = js.native

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

    @js.native
    class BarChart(container: js.Dynamic) extends js.Object {
      def clearChart(): Unit = js.native

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


    @js.native
    class ColumnChart(container: js.Dynamic) extends js.Object {

    }

    @js.native
    class Gauge(container: js.Dynamic) extends js.Object {
      def draw(data: DataTable, options: js.Object): Unit = js.native
      def draw(data: DataView, options: js.Object): Unit = js.native

      def clearChart(): Unit = js.native
    }





    @js.native
    class events extends js.Object {
      // todo Fix source_visualization and handling_function
      // todo fix result value
      //def addListener(source_visualization: _, event_name: String, handling_function: _): Unit = js.native
      //def addOneTimeListener(source_visualization: _, event_name: String, handling_function: _): Unit = js.native
      //def removeListener(listener_handler: _): Unit = js.native
      //def removeAllListeners(source_visualization: _): Unit = js.native
      //def trigger(source_visualization: _, event_name: String, event_args: _): Unit = js.native
    }

    @js.native
    object errors extends js.Object {
      def addError(container: js.Dynamic, message: String, opt_detailedMessage: String, opt_options: js.Object): Unit = js.native

      // todo fix response value
      def addErrorFromQueryResponse(container: js.Dynamic, response: js.Any): Unit = js.native

    }

  }

}