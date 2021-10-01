import sbt.Keys._
import sbt._
//import org.scalafmt.config.SortSettings

/** Only update this file in the ./build folder, and use the update_build.sh script to populate the project with new
  * changes
  */
object LibraryDeps {

  val libreVersion            = "6.4.3"
  // Breaking api changes
  // val libreVersion = "7.1.3"
  val libreOfficeDependencies = Seq(
    "org.libreoffice"         % "unoil"               % s"$libreVersion",
    "org.libreoffice"         % "juh"                 % s"$libreVersion",
    "org.libreoffice"         % "officebean"          % s"$libreVersion",
    "org.libreoffice"         % "ridl"                % s"$libreVersion",
    "org.libreoffice"         % "jurt"                % s"$libreVersion",
    "org.libreoffice"         % "unoloader"           % s"$libreVersion",
    "com.github.jeremysolarz" % "bootstrap-connector" % "1.0.0"
  )

  lazy val OSLibVersion      = "0.7.8"
  lazy val PPrintVersion     = "0.6.6"
  lazy val SourcecodeVersion = "0.2.7"
  lazy val mUnitVersion      = "0.7.29"
  lazy val uPickleVersion    = "1.4.1"

  val lihaoyiStack = Seq(
    "com.lihaoyi" %% "sourcecode" % SourcecodeVersion,
    "com.lihaoyi" %% "pprint"     % PPrintVersion,
    "com.lihaoyi" %% "os-lib"     % OSLibVersion,
    "com.lihaoyi" %% "upickle"    % uPickleVersion
  )

  lazy val ZioVersion        = "1.0.12"
  lazy val ZioProcessVersion = "0.5.0"
  lazy val ZioConfigVersion  = "1.0.10"
  lazy val ZioOpticsVersion  = "0.1.0"
  lazy val ZioPreludeVersion = "1.0.0-RC6"
  lazy val ZioJSON= "1.0.0-RC6"

  val zioStack = Seq(
    "dev.zio" %% "zio"          % ZioVersion,
    "dev.zio" %% "zio-streams"  % ZioVersion,
    "dev.zio" %% "zio-test"     % ZioVersion % Test,
    "dev.zio" %% "zio-test-sbt" % ZioVersion % Test
  )

  lazy val zioProjects = Seq(
    "dev.zio" %% "zio-optics"  % ZioOpticsVersion,
    //"dev.zio"       %% "zio-json"     % ZioJsonVersion,
    "dev.zio" %% "zio-process" % ZioProcessVersion,
    "dev.zio" %% "zio-config"  % ZioConfigVersion,
    "dev.zio" %% "zio-config-yaml"  % ZioConfigVersion,
    "dev.zio" %% "zio-config-typesafe"  % ZioConfigVersion,
    "dev.zio" %% "zio-config-derivation"  % ZioConfigVersion,
    "dev.zio" %% "zio-config-magnolia"  % ZioConfigVersion,
    "dev.zio" %% "zio-prelude" % ZioPreludeVersion,
    "dev.zio" %% "zio-json"    % ZioJSON
    //"dev.zio" %% "zio-cli" %  ZioProcessVersion
  )

  lazy val testLibs = Seq(
    "dev.zio"       %% "zio-test"     % ZioVersion   % Test,
    "dev.zio"       %% "zio-test-sbt" % ZioVersion   % Test,
    "org.scalameta" %% "munit"        % mUnitVersion % Test
  )

  lazy val testFrameworkStack = Seq(
    new TestFramework("munit.Framework"),
    new TestFramework("zio.test.sbt.ZTestFramework")
  )
  val otherScalaLibs          = Seq(
    "com.softwaremill.sttp.client3" %% "core"                          % "3.3.6",
    "com.softwaremill.sttp.client3" %% "async-http-client-backend-zio" % "3.3.6"
  )

  val typelevelStack = Seq(
    "org.typelevel" %% "cats-core" % "2.6.1"
  )

  val htmlLibs = Seq(
    "io.github.ciaraobrien" %% "dottytags" % "1.1.0"
  )

  lazy val PostgresVersion = "42.2.20"
  lazy val ZHttpVersion    = "1.0.0.0-RC17"
  lazy val JWTVersion      = "8.0.2"
  lazy val CalibanVersion  = "1.1.0"

  lazy val serverStack = Seq(
    "io.d11"                %% "zhttp"            % ZHttpVersion,
    "com.github.ghostdogpr" %% "caliban"          % CalibanVersion,
    "com.github.ghostdogpr" %% "caliban-zio-http" % CalibanVersion,
    "com.github.jwt-scala"  %% "jwt-core"         % JWTVersion
  )

  lazy val ProtoQuill = "3.10.0.Beta1.5"

  lazy val dbStack = Seq(
    "org.postgresql" % "postgresql"            % PostgresVersion,
    "io.getquill"   %% "quill-jdbc"            % ProtoQuill,
    // Or ZIO Modules
    "io.getquill"   %% "quill-jdbc-zio"        % ProtoQuill,
    // Postgres Async
    "io.getquill"   %% "quill-jasync-postgres" % ProtoQuill
  )

  lazy val laminarV   = "0.13.0"
  lazy val airstreamV = "0.13.0"

  lazy val lamiNext = "0.13.7"

  lazy val scalajsDomV = "1.1.0"
  lazy val zioV        = "1.0.9"

  lazy val JannovarVersion = "0.36"
  lazy val bioStack        = Seq(
    "de.charite.compbio" % "Jannovar"                     % JannovarVersion,
    "de.charite.compbio" % "jannovar-cli"                 % JannovarVersion,
    "de.charite.compbio" % "jannovar-stats"               % JannovarVersion,
    "de.charite.compbio" % "jannovar-filter"              % JannovarVersion,
    "de.charite.compbio" % "jannovar-vardbs"              % JannovarVersion,
    "de.charite.compbio" % "jannovar-htsjdk"              % JannovarVersion,
    "de.charite.compbio" % "jannovar-inheritance-checker" % "0.20"
  )
}
