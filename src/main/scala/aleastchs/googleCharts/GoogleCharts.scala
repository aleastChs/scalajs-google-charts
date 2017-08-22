package aleastchs.googleCharts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal
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

      def draw(data: google.visualization.DataView, options: js.Object): Unit = js.native
      def draw(data: google.visualization.DataTable, options: js.Object): Unit = js.native

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
    class Timeline(container: js.Dynamic) extends js.Object {
      def draw(data: DataTable): Unit = js.native
      def draw(data: DataView): Unit = js.native
      def draw(data: DataTable, options: js.Object): Unit = js.native
      def draw(data: DataView, options: js.Object): Unit = js.native

      def clearChart(): Unit = js.native

      def getSelection(): js.Array[js.Any] = js.native

    }

    @js.native
    class DataTable(
                     optional_data: String = "",
                     optional_version: String = "") extends js.Object {
      def addColumn(`type`: String, opt_label: String = "", opt_id: String = ""): Int = js.native

      def addColumn(description_object: Array[String]): Int = js.native

      def addRows(rows: js.Array[js.Array[js.Any]]): Int = js.native

      def addRows(numOrArray: Int): Int = js.native

      def addRow(row: js.Array[js.Any]): Int = js.native

      def addRow(): Int = js.native

      def getColumnId(columnIndex: Int): String = js.native

      def getColumnLabel(columnIndex: Int): String = js.native

      def getColumnPattern(columnIndex: Int): String = js.native

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

      def getProperty(rowIndex: Int, columnIndex: Int, name: String): js.Any = js.native

      def getRowProperties(rowIndex: Int): js.Object = js.native

      def getRowProperty(rowIndex: Int, name: String): js.Any = js.native

      def getSortedRows(singleNumber: Int): js.Array[Int] = js.native

      def getSortedRows(singleObject: js.Object): js.Array[Int] = js.native

      def getSortedRows(numberOrObjectArray: js.Array[js.Any]): js.Array[Int] = js.native

      def getTableProperties(): js.Object = js.native

      def getTableProperty(name: String): js.Any = js.native

      def getValue(rowIndex: Int, columnIndex: Int): js.Object = js.native

      def insertColumn(columnIndex: Int, `type`: String): Unit = js.native

      def insertColumn(columnIndex: Int, `type`: String, label: String = "", id: String = ""): Unit = js.native

      def insertRows(rowIndex: Int, numberOrArray: Int): Unit = js.native

      def insertRows(rowIndex: Int, numberOrArray: js.Array[js.Array[js.Any]]): Unit = js.native

      def removeColumn(columnIndex: Int): Unit = js.native

      def removeColumns(columnIndex: Int, numberOfColumns: Int): Unit = js.native

      def removeRow(rowIndex: Int): Unit = js.native

      def removeRows(rowIndex: Int, numberOfRows: Int): Unit = js.native

      def setCell(rowIndex: Int, columnIndex: Int): Unit = js.native

      def setCell(rowIndex: Int, columnIndex: Int, value: String): Unit = js.native

      def setCell(rowIndex: Int, columnIndex: Int, value: String = null, formattedValue: String = null, properties: js.Object = null): Unit = js.native

      def setColumnLabel(columnIndex: Int, label: String): Unit = js.native

      def setColumnProperty(columnIndex: Int, name: String, value: String): Unit = js.native

      def setColumnProperties(columnIndex: Int, properties: js.Object): Unit = js.native

      def setFormattedValue(rowIndex: Int, columnIndex: Int, formattedValue: String): Unit = js.native

      def setProperty(rowIndex: Int, columnIndex: Int, name: String, value: String): Unit = js.native

      def setProperties(rowIndex: Int, columnIndex: Int, properties: js.Object): Unit = js.native

      def setRowProperty(rowIndex: Int, name: String, value: String): Unit = js.native

      def setRowProperties(rowIndex: Int, properties: js.Object): Unit = js.native

      def setTableProperty(name: String, value: String): Unit = js.native

      def setTableProperties(properties: js.Object): Unit = js.native

      def setValue(rowIndex: Int, columnIndex: Int, value: String): Unit = js.native

      def sort(singleNumber: Int): Unit = js.native

      def sort(singleObject: js.Object): Unit = js.native

      def sort(numberOrObjectArray: js.Array[js.Any]): Unit = js.native

      def toJSON(): String = js.native

      override def clone(): DataTable = js.native
    }


    // Todo Test data parameter
    @js.native
    class DataView (
                     data: js.Any,
                     viewAsJson: String = ""
                   ) extends js.Object {
      def getColumnId(columnIndex: Int): String = js.native

      def getColumnLabel(columnIndex: Int): String = js.native

      def getColumnPattern(columnIndex: Int): String = js.native

      def getColumnProperty(columnIndex: Int, name: String): js.Any = js.native

      def getColumnRange(columnIndex: Int): js.Object = js.native

      def getColumnType(columnIndex: Int): String = js.native

      def getDistinctValues(columnIndex: Int): js.Array[js.Object] = js.native

      def getFilteredRows(filters: js.Array[js.Object]): js.Array[js.Object] = js.native

      def getFormattedValue(rowIndex: Int, columnIndex: Int): String = js.native

      def getNumberOfColumns(): Int = js.native

      def getNumberOfRows(): Int = js.native

      def getProperties(rowIndex: Int, columnIndex: Int): js.Object = js.native

      def getProperty(rowIndex: Int, columnIndex: Int, name: String): js.Any = js.native

      def getRowProperty(rowIndex: Int, name: String): js.Any = js.native

      def getSortedRows(singleNumber: Int): js.Array[Int] = js.native

      def getSortedRows(singleObject: js.Object): js.Array[Int] = js.native

      def getSortedRows(numberOrObjectArray: js.Array[js.Any]): js.Array[Int] = js.native

      def getTableColumnIndex(viewColumnIndex: Int): Int = js.native

      def getTableProperty(name: String): js.Any = js.native

      def getTableRowIndex(viewRowIndex: Int): Int = js.native

      def getValue(rowIndex: Int, columnIndex: Int): js.Object = js.native

      def getViewColumnIndex(tableColumnIndex: Int): Int = js.native

      def getViewColumns(): js.Array[Int] = js.native

      def getViewRowIndex(tableRowIndex: Int): Int = js.native

      def getViewRows(): js.Array[Int] = js.native

      def hideColumns(columnIndexes: js.Array[Int]): Unit = js.native

      def hideRows(min: Int, max: Int): Unit = js.native

      def hideRows(rowIndexes: js.Array[Int]): Unit = js.native

      def setColumns(columnIndexes: js.Array[js.Any]): Unit = js.native

      def setRows(min: Int, max: Int): Unit = js.native

      def setRows(rowIndexes: js.Array[Int]): Unit = js.native

      def toDataTable(): DataTable = js.native

      def toJSON(): String = js.native
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