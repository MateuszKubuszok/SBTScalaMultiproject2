addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

addSbtPlugin("com.github.tkawachi" % "sbt-lock" % "0.4.0")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.12")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.0")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.0")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"
