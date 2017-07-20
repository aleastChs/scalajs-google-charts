import sbt.Keys._
import sbt._


// COMMONSETTINGS
lazy val commonSettings = Seq(
  version in ThisBuild := Versions.scalaJSGoogleCharts,
  organization in ThisBuild := Settings.organizationName
)


// PUBLISHING
lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug

lazy val publishSettings = Seq(
  bintrayRepository := Settings.bintrayRepo,
  bintrayOrganization := Some(Settings.bintrayOrg),
  licenses += (Settings.license, url(Settings.licenseURL)),
  bintrayPublishIvyStyle := true
)

// ROOT
lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    commonSettings,
    publishSettings,
    sbtPlugin := true,
    name := Settings.facadeName,
    description := Settings.facadeName,
    scalaVersion := Versions.scalaPrimary,
    crossScalaVersions := Versions.scalaOlder
  )
// My Github
homepage := Some(url("https://github.com/aleastChs"))

// MIT License
licenses += (Settings.license, url(Settings.licenseURL))

scmInfo := Some(ScmInfo(
  url("https://github.com/aleastChs/scalajs-google-charts"),
  "scm:git:git@github.com/aleastChs/scalajs-google-charts.git",
  Some("scm:git:git@github.com:aleastChs/scalajs-google-charts.git")))


// EXTRA POM
pomExtra :=
  <licenses>
    <license>
      <name>MIT License</name>
      <url>https://opensource.org/licenses/MIT</url>
    </license>
  </licenses>
    <developers>
      <developer>
        <id>aleastChs</id>
        <name>Alexander Åstrand (@chalmersUniversity)</name>
        <url>https://github.com/aleastChs/</url>
      </developer>
    </developers>


pomIncludeRepository := { _ => false }