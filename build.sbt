name := """productApp"""
organization := "com.example"

description := "Play 2.7.x Module for Morphia http://mongodb.github.io/morphia/"



version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

libraryDependencies += guice

libraryDependencies ++= Seq(
  "org.mongodb" % "mongo-java-driver" % "3.9.1",
  "xyz.morphia.morphia" % "core" % "1.4.0",
  "org.easytesting" % "fest-assert" % "1.4" % "test"
)
