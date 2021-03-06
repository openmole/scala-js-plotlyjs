import com.typesafe.sbt.SbtScalariform
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

import execnpm.NpmDeps.Dep
import sbt.Keys._
import sbt._

val projectName = "scala-js-plotlyjs"

val organisation = "org.openmole" 

val plotlySettings = Seq(
  name := projectName,
  organization := organisation,  
  scalaVersion := "2.13.2",
  crossScalaVersions := Seq("2.12.11", "2.13.2"),
  shellPrompt := { state => s"[${Project.extract(state).currentProject.id}] $$ " },
  //resolvers += Resolver.jcenterRepo,
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "1.0.0",
    "org.querki" %%% "querki-jsext" % "0.10"),
  npmDeps in Compile += Dep("plotly.js", "1.53.0", List("plotly.min.js")),
  scalaJSStage in Global := FullOptStage
)


licenses := Seq("Affero GPLv3" -> url("http://www.gnu.org/licenses/"))
homepage := Some(url("https://github.com/openmole/scala-js-plotlyjs"))
scmInfo := Some(ScmInfo(url("https://github.com/openmole/scala-js-plotlyjs.git"), "git@github.com:openmole/scala-js-plotlyjs.git"))
pomExtra := (
  <developers>
    <developer>
      <id>mathieu.leclaire</id>
      <name>Mathieu Leclaire</name>
    </developer>
  </developers>
  )

releasePublishArtifactsAction := PgpKeys.publishSigned.value
releaseVersionBump := sbtrelease.Version.Bump.Minor
releaseTagComment := s"Releasing ${(version in ThisBuild).value}"
releaseCommitMessage := s"Bump version to ${(version in ThisBuild).value}"
sonatypeProfileName := organisation
publishConfiguration := publishConfiguration.value.withOverwrite(true)

publishTo := sonatypePublishToBundle.value
publishMavenStyle := true
releaseCrossBuild := true
autoCompilerPlugins := true

import sbtrelease.ReleasePlugin.autoImport.ReleaseTransformations._

releaseProcess := Seq[ReleaseStep](
    checkSnapshotDependencies,
    inquireVersions,
    runClean,
    runTest,
    //setReleaseVersion,
    tagRelease,
    releaseStepCommandAndRemaining("+publishSigned"),
    releaseStepCommand("sonatypeBundleRelease"),
    setNextVersion,
    commitNextVersion,
    pushChanges
  )

lazy val plotlyjs: Project = Project(id = projectName, base = file(".")).settings(plotlySettings) enablePlugins (ExecNpmPlugin)
