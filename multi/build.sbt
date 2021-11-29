ThisBuild / organization := "com.meymaar"
ThisBuild / scalaVersion := "3.1.0"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .aggregate(core1, core2)
  .dependsOn(core1, util1)
  .settings(
    name := "main",
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % Test,
      "org.scalatest" % "scalatest-featurespec_3" % "3.2.10" % Test
    )
  )

lazy val commonSettings = Seq(
  target := { baseDirectory.value / "target2" },
  libraryDependencies ++= Seq(
    "com.novocode" % "junit-interface" % "0.11" % Test,
    "org.scalatest" % "scalatest-flatspec_3" % "3.2.10" % "test"
  )
)

lazy val core1 = (project in file("core1"))
  .settings(
    commonSettings,
    // other settings
  )

lazy val core2 = (project in file("core2"))
  .dependsOn(util2)
  .settings(
    commonSettings,
    // other settings
  )

lazy val util1 = (project in file("util1"))
  .settings(
    commonSettings,
    // other settings
  )
lazy val util2 = (project in file("util2"))
  .settings(
    commonSettings,
    // other settings
  )