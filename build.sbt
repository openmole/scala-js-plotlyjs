import com.typesafe.sbt.SbtScalariform
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

import execnpm.NpmDeps.Dep
import sbt.Keys._
import sbt._

val projectName = "scala-js-plotlyjs"

val appVersion = "1.3.0"

val plotlySettings = Seq(
  name := projectName,
  version := appVersion,
  organization := "org.openmole",  
  scalaVersion := "2.13.1",
  shellPrompt := { state => s"[${Project.extract(state).currentProject.id}] $$ " },
  resolvers += Resolver.jcenterRepo,
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "1.0.0",
    "org.querki" %%% "querki-jsext" % "0.10"),
  npmDeps in Compile += Dep("plotly.js", "1.52.1", List("plotly.min.js")),
  scalaJSStage in Global := FullOptStage
)

import sbtrelease.ReleasePlugin.autoImport.ReleaseTransformations._

lazy val defaultSettings = Seq(
  releasePublishArtifactsAction := PgpKeys.publishSigned.value,
  releaseVersionBump := sbtrelease.Version.Bump.Minor,
  releaseTagComment := s"Releasing ${(version in ThisBuild).value}",
  releaseCommitMessage := s"Bump version to ${(version in ThisBuild).value}",
  publishConfiguration in ThisBuild := publishConfiguration.value.withOverwrite(true),
  releaseProcess := Seq[ReleaseStep](
    checkSnapshotDependencies,
    inquireVersions,
    runClean,
    runTest,
    setReleaseVersion,
    tagRelease,
    releaseStepCommand("publishSigned"),
    setNextVersion,
    commitNextVersion,
    releaseStepCommand("sonatypeReleaseAll"),
    pushChanges
  ),
  publishTo in ThisBuild := {
    val nexus = "https://oss.sonatype.org/"
    if (version.value.trim.endsWith("SNAPSHOT"))
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases" at nexus + "service/local/staging/deploy/maven2")
  }
)

lazy val plotlyjs: Project = Project(id = projectName, base = file(".")).settings(plotlySettings ++ defaultSettings) enablePlugins (ExecNpmPlugin)
