/**
  * Created by aleastChs on 11/07/2017.
  */

import scala.scalajs.js
import js.annotation.{JSName, JSGlobal}


package aleastchs {

  package facade {

    package google {

      @JSGlobal("aleastchs.facade.google.charts")
      @js.native
      object charts extends js.Object {
        def load(): Unit = js.native

        def setOnLoadCallback(): Unit = js.native
      }

      @JSGlobal("aleastchs.facade.google.QueryResponse")
      @js.native
      class QueryResponse extends js.Object {

      }

      @JSGlobal("aleastchs.facade.google.visualization")
      @js.native
      object visualization extends js.Object {
        // STATIC METHODS
        def arrayToDataTable(twoDArray: js.Array[js.Array[js.Any]], opt_firstRowIsData: Boolean = false): DataTable = js.native

        def drawChart(chart_JSON_or_object: js.Any): Unit = js.native

        def drawToolbar(): Unit = js.native

        // CHARTS
        @JSName("aleastchs.facade.google.visualization.AnnotationChart")
        @js.native
        class AnnotationChart(container: js.Dynamic) extends js.Object {

        }

        def arrayToDataTable(): Unit = js.native


        @JSName("aleastchs.facade.google.visualization.ColumnChart")
        @js.native
        class ColumnChart(container: js.Dynamic) extends js.Object {

        }

        @JSName("aleastchs.facade.google.visualization.Gauge")
        @js.native
        class Gauge(container: js.Dynamic) extends js.Object {
          def draw(data: DataTable, options: js.Object): Unit = js.native
          def draw(data: DataView, options: js.Object): Unit = js.native

          def clearChart(): Unit = js.native
        }


        @JSName("aleastchs.facade.google.visualization.Timeline")
        @js.native
        class Timeline(container: js.Dynamic) extends js.Object {
          def draw(data: DataTable, options: js.Object): Unit = js.native
          def draw(data: DataView, options: js.Object): Unit = js.native

          def clearChart(): Unit = js.native

          def getSelection(): js.Array[js.Any] = js.native

        }

        sealed trait DataTrait

        @JSName("aleastchs.facade.google.visualization.DataTable")
        @js.native
        class DataTable(
                         optional_data: String = "",
                         optional_version: String = "") extends js.Object with DataTrait{
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


        @JSName("aleastchs.facade.google.visualization.DataView")
        @js.native
        class DataView (
                       data: DataTrait,
                       viewAsJson: String = ""
                       ) extends js.Object with DataTrait {
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

        @JSName("aleastchs.facade.google.visualization.events")
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


        @JSName("aleastchs.facade.google.visualization.errors")
        @js.native
        object errors extends js.Object {
          def addError(container: js.Dynamic, message: String, opt_detailedMessage: String, opt_options: js.Object): Unit = js.native

          // todo fix response value
          def addErrorFromQueryResponse(container: js.Dynamic, response: js.Any): Unit = js.native

        }

      }

    }

  }

}