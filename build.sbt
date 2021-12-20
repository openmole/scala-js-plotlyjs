
import sbt.Keys._
import sbt._

val projectName = "scala-js-plotlyjs"

val organisation = "org.openmole"

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
releaseTagComment := s"Releasing ${(ThisBuild / version).value}"
releaseCommitMessage := s"Bump version to ${(ThisBuild / version).value}"
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
  //setReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("+publishSigned"),
  releaseStepCommand("sonatypeBundleRelease"),
  setNextVersion,
  commitNextVersion,
  pushChanges
)

lazy val plotlyjs: Project = Project(id = projectName, base = file(".")) enablePlugins (ScalaJSPlugin, JSDependenciesPlugin) settings (
  name := projectName,
  organization := organisation,
  scalaVersion := "3.1.0",
  crossScalaVersions := Seq("2.13.7", "3.1.0"),
  shellPrompt := { state => s"[${Project.extract(state).currentProject.id}] $$ " },
  packageJSDependencies / skip := false,
  // Using webjars beacause plotly.js webpacking does not work properly
  jsDependencies += "org.webjars.bower" % "plotly.js" % "1.54.1" / "dist/plotly.min.js",
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.0.0",
    "org.querki" %%% "querki-jsext" % "0.10" cross (CrossVersion.for3Use2_13)
  )
)
