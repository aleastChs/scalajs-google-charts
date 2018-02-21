import sbt._
import sbt.Keys._
import sbt.{Developer, ScmInfo, url}

import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import com.typesafe.sbt.SbtPgp.autoImport._
import xerial.sbt.Sonatype.autoImport._

object SPSettings {
  val defaultBuildSettings = Seq(
    organization := SettingsSonatype.orgNameSonatype,
    homepage     := Some(SettingsSonatype.githubSP("")),
    licenses     := SettingsSonatype.mitLicense,
    scalaVersion := Versions.scalaPrimary,
    scalacOptions ++= scalacOpt,
    //resolvers ++= projectResolvers,
    useGpg := true,
    publishArtifact in Test := false,
    publishMavenStyle := true,
    publishTo := SettingsSonatype.pubTo.value,
    pomIncludeRepository := { _ => false },
    sonatypeProfileName := SettingsSonatype.groupIdSonatype,
    developers := List(
      Developer(
        id = "kristoferb",
        name = "kristofer Bengtsson",
        email = "kristofer@sekvensa.se",
        url   = url("https://github.com/kristoferB")
      ),
      Developer(
        id = "m-dahl",
        name = "Martin Dahl",
        email = "martin.dahl@chalmers.se",
        url   = url("https://github.com/m-dahl")
      ),
      Developer(
        id = "patrikm",
        name = "Patrik Bergagård",
        email = "Patrik.Bergagard@alten.se",
        url   = url("https://github.com/patrikm")
      ),
      Developer(
        id = "ashfaqfarooqui",
        name = "Ashfaq Farooqui",
        email = "ashfaqf@chalmers.se",
        url   = url("https://github.com/ashfaqfarooqui")
      ),
      Developer(
        id = "edvardlindelof",
        name = "Edvard Lindelöf",
        email = "edvardlindelof@gmail.com",
        url   = url("https://github.com/edvardlindelof")
      ),
      Developer(
        id = "marptt",
        name = "Martin Petterson",
        email = "laxenmeflaxen@gmail.com",
        url   = url("https://github.com/marptt")
      ),
      Developer(
        id = "ellenkorsberg",
        name = "Ellen Korsberg",
        email = "korsberg.ellen@gmail.com",
        url   = url("https://github.com/ellenkorsberg")
      ),
      Developer(
        id    = "aleastChs",
        name  = "Alexander Åstrand",
        email = "aleast@student.chalmers.se",
        url   = url("https://github.com/aleastChs")
      )
    )
  )

  /** Options for the scala compiler */
  lazy val scalacOpt = Seq(
    //"-Xlint",
    "-unchecked",
    "-deprecation",
    "-feature",
    "-language:implicitConversions",
    "-language:postfixOps"
  )
}
