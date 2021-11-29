ThisBuild / organization := "com.meymaar"
ThisBuild / scalaVersion := "3.1.0"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .enablePlugins(DockerPlugin)
  .enablePlugins(AshScriptPlugin)
  .settings(
    name := "hello-docker",
    libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest-flatspec_3" % "3.2.10" % Test
    ),

    dockerBaseImage := "openjdk:jre-alpine"
  )