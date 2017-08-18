package aleastchs.googleCharts.helpers.chartsHelp

import scala.scalajs.js

/**
  * Created by alexa on 03/08/2017.
  */
class GaugeOption(
                   val duration: Int = 400,
                   val easing: String = "linear",
                   val forceIFrame: Boolean = false,
                   val greenColor: String = "#109618",
                   val greenFrom: Int = 25,
                   val greenTo: Int = 75,
                   val height: Int = 200,
                   val majorTicks: js.Array[String] = null,
                   val max: Int = 100,
                   val min: Int = 0,
                   val minorTicks: Int = 2,
                   val redColor: String = "#DC3912",
                   val redFrom: Int = 90,
                   val redTo: Int = 100,
                   val width: Int = 200,
                   val yellowColor: String = "#FF9900",
                   val yellowFrom: Int = 75,
                   val yellowTo: Int = 90
                 ) {

  def toDynamic: js.Object = js.Dynamic.literal(
    animation = js.Dynamic.literal(
      duration = this.duration,
      easing = this.easing
    ),
    forceIFrame = this.forceIFrame,
    greenColor = this.greenColor,
    greenFrom = this.greenFrom,
    greenTo = this.greenTo,
    height = this.height,
    majorTicks = this.majorTicks,
    max = this.max,
    min = this.min,
    minorTicks = this.minorTicks,
    redColor = this.redColor,
    redFrom = this.redFrom,
    redTo = this.redTo,
    width = this.width,
    yellowColor = this.yellowColor,
    yellowFrom = this.yellowFrom,
    yellowTo = this.yellowTo
  )

}

object GaugeOption {
  def apply(
             duration: Int = 400,
             easing: String = "linear",
             forceIFrame: Boolean = false,
             greenColor: String = "#109618",
             greenFrom: Int = 25,
             greenTo: Int = 75,
             height: Int = 200,
             majorTicks: js.Array[String] = null,
             max: Int = 100,
             min: Int = 0,
             minorTicks: Int = 2,
             redColor: String = "#DC3912",
             redFrom: Int = 90,
             redTo: Int = 100,
             width: Int = 200,
             yellowColor: String = "#FF9900",
             yellowFrom: Int = 75,
             yellowTo: Int = 90
           ): GaugeOption =
    new GaugeOption(
      duration,
      easing,
      forceIFrame,
      greenColor,
      greenFrom,
      greenTo,
      height,
      majorTicks,
      max,
      min,
      minorTicks,
      redColor,
      redFrom,
      redTo,
      width,
      yellowColor,
      yellowFrom,
      yellowTo
    )
}

