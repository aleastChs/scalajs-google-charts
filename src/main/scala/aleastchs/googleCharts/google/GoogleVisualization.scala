package aleastchs.googleCharts.google

import aleastchs.googleCharts.google.visualization.DataTable

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal}



@js.native
@JSGlobal
object GoogleVisualization extends js.Object {
  def arrayToDataTable(twoDArray: js.Array[js.Array[js.Any]], opt_firstRowIsData: Boolean = false): DataTable = js.native
  def arrayToDataTable(): Unit = js.native

  def drawChart(chart_JSON_or_object: js.Any): Unit = js.native

  def drawToolbar(): Unit = js.native
}

