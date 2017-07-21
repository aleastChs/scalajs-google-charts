import sbt.Keys._
import sbt._

// COMMONSETTINGS
lazy val commonSettings = Seq(
  version in ThisBuild := Versions.scalaJSGoogleCharts,   // version of current scalajs-google-charts facade
  organization in ThisBuild := Settings.organizationName  // organization name
)

// PUBLISHING
lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug
// PUBLISHING-SETTINGS
lazy val publishSettings = Seq(
  bintrayVersionAttributes := Map(),
  bintrayReleaseOnPublish := true,
  bintrayPackage := Settings.facadeName,
  bintrayRepository := Settings.bintrayRepo,              // bintray repo name    (<user>/<repo> on bintray)
  bintrayOrganization := Some(Settings.bintrayOrg),       // bintray organization (<user> on bintray)
  licenses += (Settings.license, url(Settings.licenseURL)),   // license for this repo
  bintrayPublishIvyStyle := true                               // publish in Ivy-format style
)

// ROOT
lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)                           // enable scalajs plugin
  .settings(
    commonSettings,                                       // enable commonsettings
    publishSettings,                                      // enable publish settings
    sbtPlugin := true,                                    // to make an auto plugin, create a project and configure sbtPlugin to true
    name := Settings.facadeName,                          // name (same as <user>/<repo>/<NAME> on bintray)
    description := "Scala-friendly Google Charts Facades",// description
    scalaVersion := Versions.scalaPrimary,                // scala version for root
    crossScalaVersions := Versions.scalaOlder             // cross scala ver. for rott
  )
// My Github
homepage := Some(url(Settings.homePageName))

// MIT License
licenses += (Settings.license, url(Settings.licenseURL))

// info for scm
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