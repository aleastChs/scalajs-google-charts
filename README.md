# scalajs-google-charts
Type-safe and Scala-friendly facade-library over Google Charts

## branch master

# Current version
**Ongoing:**    0.5.1.Test

**Published:**  0.4.6.Final

<a href='https://bintray.com/aleastchs/aleastChs-releases/scalajs-google-charts/0.4.5.Test/link'><img src='https://api.bintray.com/packages/aleastchs/aleastChs-releases/scalajs-google-charts/images/download.svg?version=0.4.5.Test'></a>

# Warning!
**Versions Below 1.0.0 means it can be unstable or not containing the most of the funcionallities**

Versions That I've used in other projects:
```
scalajs-google-charts v0.4.0 with Scala 2.11 and sbt 0.13.x,
scalajs-google-charts v0.4.1 with Scala 2.11 and sbt 0.13.x
```
# How To Use
In {root}/build.sbt add:
```
lazy val scalajsGoogleChartsVersion = "<FACADE_VERSION>"
lazy val chartsScalaVersion = "2.11"
lazy val chartsSbtVersion = "0.13"

lazy val googleChartsUrl = "https://dl.bintray.com/aleastchs/aleastChs-releases/org.aleastChs/scalajs-google-charts/scala_"+ chartsScalaVersion +"/sbt_"+ chartsSbtVersion +"/"+ scalajsGoogleChartsVersion +"/jars/scalajs-google-charts.jar"

libraryDependencies ++= Seq(
"org.aleastChs" % "scalajs-google-charts" % scalajsGoogleChartsVersion from googleChartsUrl
)
```

Now You are able to use the Facade with imports in .scala-files
Example.scala:
```
import aleastchs.googleCharts.google.visualization.Timeline
object Example {
    val timeline = new Timeline("some Div")
}
```

or

```
import aleastchs.googleCharts.google
object Example {
    val timeline = new google.visualization.Timeline("some Div")
}
```

# About 
I wanted to use Timeline Chart (https://developers.google.com/chart/interactive/docs/gallery/timeline) 
for an ungoing project (https://github.com/kristoferB/SP), 
so I started implement it under googleTimeSeries branch.

Then I realised that somebody else also wanted to use Google Charts 
for their project so it would be nice to only add a libraryDependency!

# Contribute
Feel free to help me with this library
