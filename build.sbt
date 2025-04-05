ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.6.4"

lazy val root = (project in file("."))
  .aggregate(core, app, db)
  .settings(
    name := "naming-things"
  )

lazy val core = project in file("core")

lazy val app = (project in file("app")).dependsOn(core, db)

lazy val db = (project in file("db")).dependsOn(core)

lazy val integration = (project in file("integration"))
  .dependsOn(app % "compile->compile;test->test", db % "compile->compile;test->test")
