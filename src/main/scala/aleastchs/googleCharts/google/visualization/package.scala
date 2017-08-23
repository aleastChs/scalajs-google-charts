package aleastchs.googleCharts.google

import scala.scalajs.js

/**
  * Created by alexa on 23/08/2017.
  */


package object visualization {
  // STATIC METHODS
  def arrayToDataTable(twoDArray: js.Array[js.Array[js.Any]], opt_firstRowIsData: Boolean = false): DataTable = js.native
  def arrayToDataTable(): Unit = js.native

  def drawChart(chart_JSON_or_object: js.Any): Unit = js.native

  def drawToolbar(): Unit = js.native
}
