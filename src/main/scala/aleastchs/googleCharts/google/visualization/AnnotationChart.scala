package aleastchs.googleCharts.google.visualization

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
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
