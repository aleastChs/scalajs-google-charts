# You have Noticed an Issue
1. Look at **Issues**, Do you Find something related?
2. There is No excisting Issue that is Related to Yours, _Create a New_! 

Be sure to add a descriping Label, set a Milestone and Document your Issue so everyone else can Understand.

3. Like Programming? Try To fix it by yourself and send a Pull Request 


To Create a New Version:
1. Create Your Changes in src/main/scala/org/aleastChs/clientlib/GoogleCharts.scala
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
