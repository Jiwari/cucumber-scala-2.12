import sbt._

name := "cucumber-with-scala-2.12"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "io.cucumber" %% "cucumber-scala" % "2.0.0-SNAPSHOT",
  "io.cucumber" % "cucumber-junit" % "2.0.0-SNAPSHOT",
  "junit" % "junit" % "4.12",
  "org.scalatest" %% "scalatest" % "3.0.0",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
