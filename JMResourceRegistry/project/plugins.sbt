
// Coursier https://github.com/alexarchambault/coursier
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15")

// @todo Should not need to depend on my branch of this, can I change this back to the origional?

//lazy val root = project.in(file(".")).dependsOn(sbtOsgiFelixPlugin).dependsOn(sbtKaraf)

//lazy val concatPlugin = uri("https://github.com/ground5hark/sbt-concat.git#342acc34195438799b8a278fda94b126238aae17")

lazy val sbtOsgiFelixPlugin = uri("https://github.com/PhilAndrew/sbt-osgi-felix-p.git#8de84e6d019ed853076e72a70b69f3203060b058")

lazy val root = project.in(file(".")).dependsOn(sbtOsgiFelixPlugin)













//addSbtPlugin("org.doolse" % "sbt-osgi-felix" % "1.0.10-PHILIP")

// ScalaJS https://www.scala-js.org/
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.14")

//addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % sys.props.getOrElse("plugin.version", sys.error("'plugin.version' environment variable is not set")))

// @todo Commented out because slow
// Copy paste detector https://github.com/sbt/cpd4sbt
//addSbtPlugin("de.johoop" % "cpd4sbt" % "1.2.0")

// Clippy helps to show better Scala error messages https://scala-clippy.org/
addSbtPlugin("com.softwaremill.clippy" % "plugin-sbt" % "0.5.0")

// sbt-docker-compose https://github.com/Tapad/sbt-docker-compose
addSbtPlugin("com.tapad" % "sbt-docker-compose" % "1.0.17")
addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.1.0")


// https://github.com/jrudolph/sbt-dependency-graph/
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
