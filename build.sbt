
scalaVersion := "2.11.8"

val paradiseVersion = "2.1.0"

val boilerlessVersion = "0.1-SNAPSHOT"


resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.scalamacros" % "paradise" % paradiseVersion cross CrossVersion.full)

libraryDependencies += "com.github.lptk" %% "boilerless" % boilerlessVersion



