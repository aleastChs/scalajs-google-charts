object Versions extends ScalaJS {
  val scalaPrimary = "2.12.2"
  val secondary = "2.11.8"
  val scalaOlder = Seq("2.12.1", "2.11.8")  // todo add more
}

trait ScalaJS {
  // this is the current version of facades
  // bintray do not use SNAPSHOT
  // todo on update:
  //                What do with version? Must change on every publish?
  val scalaJSGoogleCharts = "0.4.2"
}