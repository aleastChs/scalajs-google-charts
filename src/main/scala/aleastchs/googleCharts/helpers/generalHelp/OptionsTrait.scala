/****************************************
  *      HELP CLASS TO GOOGLE CHARTS     *
  ****************************************/

package aleastchs.googleCharts.helpers.generalHelp

import scala.scalajs.js


// this is a general options trait for the google charts
// extend the trait for each new chart implemented
trait OptionsTrait {
  val height: Int
  val width: Int

  def toDynamic: js.Object
}