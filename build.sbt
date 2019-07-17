name := "test-cover"
organization := "io.github.lashchenko"

version := "0.1.1"

scalaVersion := "2.12.8"

scalacOptions ++= Seq(
  "-explaintypes",
  "-deprecation",
  "-Xlint:-missing-interpolator,_",
  "-Ywarn-unused:imports",
  "-Ywarn-unused:params"
)

parallelExecution in Test := true

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
