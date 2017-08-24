package aleastchs.googleCharts.google

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by alexa on 24/08/2017.
  */

@js.native
@JSGlobal("google.charts")
object Charts extends js.Object {
  def load(): Unit = js.native
  def load(loading: String): Unit = js.native
  def load(loading: String, loadObject: js.Object): Unit = js.native

  def setOnLoadCallback(): Unit = js.native
  def setOnLoadCallback(callback: Unit): Unit = js.native
  def setOnLoadCallback(callback: js.Function): Unit = js.native
  def setOnLoadCallback(callback: js.Function0[Unit]): Unit = js.native
  def setOnLoadCallback(callback: js.Function1[Unit, Unit]): Unit = js.native
}