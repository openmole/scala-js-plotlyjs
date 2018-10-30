import com.typesafe.sbt.SbtScalariform
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

import execnpm.NpmDeps.Dep
import sbt.Keys._
import sbt._

val projectId = "scala-js-plotlyjs"
val projectName = "scala-js-plotlyjs"

val appVersion = "1.1.5-SNAPSHOT"
val scalaVersions = Seq("2.11.8", "2.12.4")


val commonSettings = Seq(
  version := appVersion,
  crossScalaVersions := scalaVersions,
  scalacOptions ++= Seq(
    "-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked", "–Xcheck-null", "-Xfatal-warnings", /* "-Xlint", */
    "-Ywarn-adapted-args", /* "-Ywarn-dead-code", */ "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen"),
  scalacOptions in(Compile, doc) := Seq("-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked"),
  scalacOptions in Test ++= Seq("-Yrangepos"),

  shellPrompt := { state => s"[${Project.extract(state).currentProject.id}] $$ " },
  resolvers += Resolver.jcenterRepo,
  SbtScalariform.ScalariformKeys.preferences := SbtScalariform.ScalariformKeys.preferences.value) ++ SbtScalariform.autoImport.scalariformSettings(true)

val scalaJsSettings = Seq(
  name := projectName,
  organization := "com.definitelyscala",
  homepage := Some(url("https://github.com/DefinitelyScala/scala-js-plotlyjs")),
  scmInfo := Some(ScmInfo(
    url("https://github.com/DefinitelyScala/scala-js-plotlyjs"),
    "scm:git:git@github.com:DefinitelyScala/scala-js-plotlyjs.git",
    Some("scm:git:git@github.com:DefinitelyScala/scala-js-plotlyjs.git"))),
  bintrayOrganization := Some("definitelyscala"),
  bintrayPackageLabels := Seq("scala", "scala.js"),
  bintrayPackage := "scala-js-plotlyjs",
  bintrayRepository := "maven",
  bintrayVcsUrl := Some("git:git@github.com:DefinitelyScala/scala-js-plotlyjs.git"),
  publishMavenStyle := true,
  licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
  libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.2",
    "org.querki" %%% "querki-jsext" % "0.8"),
  npmDeps in Compile += Dep("plotly.js", "1.42.0", List("plotly.min.js")),
  scalacOptions += "-P:scalajs:sjsDefinedByDefault",
  scalaJSStage in Global := FastOptStage)

lazy val plotlyjs: Project = Project(id = projectId, base = file(".")).settings(commonSettings ++ scalaJsSettings) enablePlugins (ExecNpmPlugin)