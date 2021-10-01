import LibraryDeps._

val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "pipeline",
    version := "0.0.1-M1",

    scalaVersion := scala3Version,

    libraryDependencies ++= zioStack ++ otherScalaLibs, //++ typelevelStack ++ otherScalaLibs ++ testLibs,
    testFrameworks ++= testFrameworkStack,
  )
