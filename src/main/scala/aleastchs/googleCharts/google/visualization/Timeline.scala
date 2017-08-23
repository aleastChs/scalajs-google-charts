package aleastchs.googleCharts.google.visualization

import scala.scalajs.js

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
object Timeline extends js.Object {
  def apply(container: js.Dynamic): Timeline =
    new Timeline(container)
}