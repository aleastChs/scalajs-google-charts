# scalajs-google-charts
Type-safe and Scala-friendly facade-library over Google Charts

# How To Use
In {root}/build.sbt add:
```
resolvers += Resolver.url("aleastchs @ bintray", url("https://dl.bintray.com/aleastchs/aleastChs-releases"))(Resolver.ivyStylePatterns)
libraryDependencies += "org.aleastChs" % "scalajs-google-charts_<Your Scala Version>" % "<Current Facade Version>"
```

Now You are able to use the Facade with imports in .scala-files
Example.scala:
```
import google.visualization.Timeline
object Example {
    val timeline = new Timeline("some Div")
}
```

or

```
object Example {
    val timeline = new google.visualization.Timeline("some Div")
}
```
# Current version
0.2.13

# Warning
Versions Below 1.0.0 means it is unstable

# About 
I wanted to use Timeline Chart (https://developers.google.com/chart/interactive/docs/gallery/timeline) 
for an ungoing project (https://github.com/kristoferB/SP), 
so I started implement it under googleTimeSeries branch.

Then I realised that somebody else also wanted to use Google Charts 
for their project so it would be nice to only add a libraryDependency!

# Contribute
Feel free to help me with this library
