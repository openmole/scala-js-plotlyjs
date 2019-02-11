scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/" 

resolvers += Resolver.sonatypeRepo("releases")

// Scala.js
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.25")

// Dependency Resolution
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC12")

// Publishing
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")

// Code Quality
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0") // scalastyle

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.2") // dependencyUpdates

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.0") // scalariformFormat

addSbtPlugin("fr.iscpif" % "scalajs-execnpm" % "0.5")