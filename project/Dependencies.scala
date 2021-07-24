import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"
  lazy val embeddedRedis = "com.github.kstyrc" % "embedded-redis" % "0.7-SNAPSHOT"
  lazy val redisScala = "com.github.etaty" %% "rediscala" % "1.9.0"
  lazy val akka = "com.typesafe.akka" %% "akka-actor" % "2.6.4"
}
