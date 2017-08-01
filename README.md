# scalajs-google-charts
Type-safe and Scala-friendly facade-library over Google Charts

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

I got much help from Corey Auger and his scalajs-google-maps library!
(see: https://github.com/coreyauger/scalajs-google-maps)

# Contribute
Feel free to help me with this library
To Create a New Version:
1. Create Your Changes in org.aleastChs.clientlib.GoogleCharts.scala
2. Update Version in README.md
3. Update Version in project/Versions.scala
4. Create a Pull Request

To Upload New Version:
1. Stage Your Changes locally and On the Private Bintray site of User: aleastchs. Do this with: sbt +publish (sbt-bintray help)
2. Change the target/scala_2.11/sbt_0.13/ivy-XX.YY.ZZ.xml to <ivy-module..>..<info .. module="scalajs-google-charts_2.11"
3. Change the target/scala_2.12/sbt_0.13/ivy-XX.YY.ZZ.xml to <ivy-module..>..<info .. module="scalajs-google-charts_2.12"
4. Copy the Two ivy-files To Desktop, Keep the _2.11 and _2.12 Versions in two seperate folders on the Desktop
5. Also the scalajs-google-charts-XX.YY.ZZ.jar and -javadoc and -sources .jar-files from both scala_2.11 and scala_2.12
5. Delete Every Versioning From the Names in the Desktop ( from scalajs-google-charts-XX.YY.ZZ.jar to scalajs-google-charts.jar )
6. Upload to Bintray Separatly
(org.aleastChs/scalajs-google-charts_2.1x/scala_2.1x/sbt_0.13/XX.YY.ZZ/docs, ../jars, ../srcs, ../ivys)