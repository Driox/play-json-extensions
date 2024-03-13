import scalariform.formatter.preferences._
import com.typesafe.sbt.SbtScalariform.{ScalariformKeys, autoImport}

val projectName = "play-json-extensions"
lazy val root = Project(id = projectName, base = file("."))

version := "0.43.1"
organization := "com.particeep"
name := projectName
scalaVersion := "2.13.12"
// crossScalaVersions := Seq("2.12.10", "2.13.1")
useGpg := true
credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credential")
description := "Additional type classes for the play-json serialization library"
organizationName := "com.particeep - Particeep"

// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "com.particeep"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

val ghProject = "Particeep/"+projectName
val ghUrl = url( "https://github.com/" + ghProject )

homepage  := Some( ghUrl )
startYear := Some(2015)
licenses  += (
  "Two-clause BSD-style license",
  url( ghUrl + "/blob/master/LICENSE.txt" )
)
scmInfo := Some(
  ScmInfo( ghUrl, "git@github.com:" + ghProject + ".git" )
)
developers := List(
  Developer("cvogt", "Jan Christopher Vogt", "@cvogt", url("https://github.com/cvogt")),
  Developer("driox", "Adrien Crovetto", "@Driox", url("https://github.com/Driox"))
)

ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / sonatypeRepository := "https://s01.oss.sonatype.org/service/local"

//publishTo := sonatypePublishTo.value
publishTo := sonatypePublishToBundle.value

Test / publishArtifact := false
pomIncludeRepository := { _ => false }



libraryDependencies ++=   Seq(
  "com.typesafe.play" %% "play-json" % "2.10.4",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided",
  "org.scalatest" %% "scalatest" % "3.2.14" % Test
)

resolvers ++= Resolver.sonatypeOssRepos("releases")
resolvers ++= Resolver.sonatypeOssRepos("snapshots")

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:experimental.macros",
  "-Ywarn-unused:imports",
  "-Xfatal-warnings"
)

Test / testOptions  += Tests.Argument(TestFrameworks.ScalaTest, "-oFD")
parallelExecution := false // <- until TMap thread-safety issues are resolved

Compile / doc / scalacOptions ++= Seq(
  "-doc-title", name.value,
  "-doc-version", version.value,
  "-doc-footer", projectName+" is developed by "+organizationName,
  "-sourcepath", (Compile / sourceDirectory).value.getPath, // needed for scaladoc to strip the location of the linked source path
  "-doc-source-url", ghUrl+"/blob/"+version.value+"/src/main€{FILE_PATH}.scala",
  "-implicits",
  "-diagrams", // requires graphviz
  "-groups"
)

scalariformPreferences := scalariformPreferences.value
  .setPreference(AlignParameters, true)
  .setPreference(AlignArguments, true)
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(MultilineScaladocCommentsStartOnFirstLine, true)
  .setPreference(SpaceInsideParentheses, true)
  .setPreference(SpacesWithinPatternBinders, true)
  .setPreference(SpacesAroundMultiImports, true)
  .setPreference(DanglingCloseParenthesis, Preserve)
  .setPreference(DoubleIndentConstructorArguments, true)
