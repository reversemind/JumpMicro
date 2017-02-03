
// @todo Should not need to depend on my branch of this, can I change this back to the origional?
lazy val sbtOsgiFelixPlugin = uri("https://github.com/PhilAndrew/sbt-osgi-felix.git#1e57ed751b977943c55acce92ad3ff22d37dd533")

lazy val root = project.in(file(".")).dependsOn(sbtOsgiFelixPlugin)

addSbtPlugin("org.doolse" % "sbt-osgi-felix" % "1.0.7-PHILIP")

// ScalaJS https://www.scala-js.org/
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.14")

//addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % sys.props.getOrElse("plugin.version", sys.error("'plugin.version' environment variable is not set")))

// Copy paste detector https://github.com/sbt/cpd4sbt
addSbtPlugin("de.johoop" % "cpd4sbt" % "1.2.0")

// Clippy helps to show better Scala error messages https://scala-clippy.org/
addSbtPlugin("com.softwaremill.clippy" % "plugin-sbt" % "0.5.0")

// sbt-docker-compose https://github.com/Tapad/sbt-docker-compose
addSbtPlugin("com.tapad" % "sbt-docker-compose" % "1.0.17")
addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.1.0")