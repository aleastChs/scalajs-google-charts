import SettingsBintray._
import SPSettings._
import sbt._

// COMMONSETTINGS
lazy val commonSettings = Seq(
  version in ThisBuild := Versions.scalaJSGoogleCharts,   // version of current scalajs-google-charts facade
  organization in ThisBuild := SettingsBintray.organizationName  // organization name
)

// PUBLISHING
lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug
// PUBLISHING-SETTINGS
lazy val publishBintraySettings = Seq(
  bintrayVersionAttributes := Map(),
  bintrayReleaseOnPublish := false,
  //bintrayPackage := Settings.facadeName,
  bintrayRepository := SettingsBintray.bintrayRepo,              // bintray repo name    (<user>/<repo> on bintray)
  bintrayOrganization := None,       // bintray organization (<user> on bintray)
  licenses += (SettingsBintray.license, url(SettingsBintray.licenseURL)),   // license for this repo
  bintrayPublishIvyStyle := true                               // publish in Ivy-format style
)

lazy val publishSonatypeSettings = Seq(

)

// ROOT
lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)                           // enable scalajs plugin
  .settings(
    commonSettings,
    publishBintraySettings
  )
  .settings(
    sbtPlugin := true,                                    // to make an auto plugin, create a project and configure sbtPlugin to true
    name := SettingsBintray.facadeName,                          // name (same as <user>/<repo>/<NAME> on bintray)
    description := "Scala-friendly Google Charts Facades",// description
    scalaVersion := Versions.scalaPrimary,
  // scala version for root
    crossScalaVersions := Versions.scalaOlder             // cross scala ver. for rott
  )
// My Github
homepage := Some(url(SettingsBintray.homePageName))

// MIT License
licenses += (SettingsBintray.license, url(SettingsBintray.licenseURL))

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