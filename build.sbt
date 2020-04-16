import com.typesafe.sbt.SbtScalariform
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

import execnpm.NpmDeps.Dep
import sbt.Keys._
import sbt._

val projectName = "scala-js-plotlyjs"

val appVersion = "1.4.0"
val organisation = "org.openmole" 

val plotlySettings = Seq(
  name := projectName,
  version := appVersion,
  organization := organisation,  
  scalaVersion := "2.13.1",
  shellPrompt := { state => s"[${Project.extract(state).currentProject.id}] $$ " },
  //resolvers += Resolver.jcenterRepo,
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "1.0.0",
    "org.querki" %%% "querki-jsext" % "0.10"),
  npmDeps in Compile += Dep("plotly.js", "1.52.1", List("plotly.min.js")),
  scalaJSStage in Global := FullOptStage
)


version in ThisBuild := appVersion
releasePublishArtifactsAction := PgpKeys.publishSigned.value
releaseVersionBump := sbtrelease.Version.Bump.Minor
releaseTagComment := s"Releasing ${(version in ThisBuild).value}"
releaseCommitMessage := s"Bump version to ${(version in ThisBuild).value}"
sonatypeProfileName := organisation
publishConfiguration := publishConfiguration.value.withOverwrite(true)

publishTo := sonatypePublishToBundle.value
publishMavenStyle := true
autoCompilerPlugins := true 

import sbtrelease.ReleasePlugin.autoImport.ReleaseTransformations._

releaseProcess := Seq[ReleaseStep](
    checkSnapshotDependencies,
    //inquireVersions,
    runClean,
    runTest,
    //setReleaseVersion,
    tagRelease,
    releaseStepCommand("publishSigned"),
    releaseStepCommand("sonatypeBundleRelease"),
    setNextVersion,
    commitNextVersion,
    pushChanges
  )

lazy val plotlyjs: Project = Project(id = projectName, base = file(".")).settings(plotlySettings) enablePlugins (ExecNpmPlugin)
