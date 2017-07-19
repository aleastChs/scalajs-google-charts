import sbt.Keys._
import sbt._

lazy val commonSettings = Seq(
  version in ThisBuild := Versions.scalaJSGoogleCharts,
  organization in ThisBuild := Settings.organizationName
)

lazy val bintrayPublishIvyStyle = settingKey[Boolean]("=== !publishMavenStyle") //workaround for sbt-bintray bug

lazy val publishSettings = Seq(
  bintrayRepository := Settings.bintrayRepo,
  bintrayOrganization := Some(Settings.bintrayOrg),
  licenses += (Settings.license, url(Settings.licenseURL)),
  bintrayPublishIvyStyle := true
)


lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    commonSettings,
    publishSettings,
    sbtPlugin := true,
    name := Settings.facadeName,
    description := Settings.normalizedNamed,
    normalizedName := Settings.normalizedNamed,
    scalaVersion := Versions.scalaPrimary,
    crossScalaVersions := Versions.scalaOlder
  )

homepage := Some(url("https://github.com/aleastChs"))

licenses += (Settings.license, url(Settings.licenseURL))

scmInfo := Some(ScmInfo(
  url("https://github.com/aleastChs/scalajs-google-charts"),
  "scm:git:git@github.com/aleastChs/scalajs-google-charts.git",
  Some("scm:git:git@github.com:aleastChs/scalajs-google-charts.git")))


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