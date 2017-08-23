object Versions extends ScalaJS {
  val scalaPrimary = "2.12.2"
  val scalaOlder = Seq("2.11.8", "2.10.5")
}

trait ScalaJS {
  // this is the current version of facades
  // bintray do not use SNAPSHOT
  // todo on update:
  //                What do with version? Must change on every publish?
  val scalaJSGoogleCharts = "0.5.1.Test"
}