import sbt.Keys._

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin).settings(
  publishMavenStyle := true
)

name := "Type-safe and Scala-friendly library over Google Charts"

normalizedName := "scalajs-google-charts"

version := "0.1"

organization := "org.aleastChs"

scalaVersion := "2.12.2"
scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

crossScalaVersions := Seq("2.10.4", "2.11.5")

crossScalaVersions in ThisBuild := Seq("2.11.5", "2.10.4", "2.12.2", "2.13.0-M1")
scalaVersion in ThisBuild := (crossScalaVersions in ThisBuild).value.head

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.3"
)

jsDependencies in Test += RuntimeDOM

homepage := Some(url("https://github.com/aleastChs"))

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

scmInfo := Some(ScmInfo(
  url("https://github.com/aleastChs/scalajs-google-charts"),
  "scm:git:git@github.com/aleastChs/scalajs-google-charts.git",
  Some("scm:git:git@github.com:aleastChs/scalajs-google-charts.git")))


publishMavenStyle := true

/*
TODO: http://central.sonatype.org/pages/ossrh-guide.html#initial-setup

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}*/

pomExtra := (
  <developers>
    <developer>
      <id>aleastChs</id>
      <name>Alexander Åstrand (@chalmersUniversity)</name>
      <url>https://github.com/aleastChs/</url>
    </developer>
  </developers>
  )

pomIncludeRepository := { _ => false }