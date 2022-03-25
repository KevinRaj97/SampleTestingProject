name := "SampleTestingProject"

version := "0.1"

scalaVersion := "2.13.8"


//TestingDependency
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.2.7",
  "org.scalatest" %% "scalatest" % "3.2.7" % "test")

//munit
// https://mvnrepository.com/artifact/org.scalameta/munit
libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M3" % Test


libraryDependencies += "org.scalafx" %% "scalafx" % "12.0.2-R18"
libraryDependencies += "org.scalafx" %% "scalafx" % "14-R19"


