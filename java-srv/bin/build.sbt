lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "spring-boot-scala-web",

  version := "1.0",

  scalaVersion := "2.13.1",

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
    "org.springframework.boot" % "spring-boot-starter-thymeleaf" % "2.4.2",
    "org.springframework.boot"%"spring-boot-starter-data-solr"%"2.4.2"
   ),

  mainClass := Some("example.Main")
)
