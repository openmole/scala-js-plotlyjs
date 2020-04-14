scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/" 

resolvers += Resolver.sonatypeRepo("releases")

// Scala.js
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.1")

// Publishing
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

// Code Quality
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0") // scalastyle

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.0") // dependencyUpdates

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3") // scalariformFormat

addSbtPlugin("fr.iscpif" % "scalajs-execnpm" % "0.9")
