name := "OurExpenses"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalatra"               %% "scalatra"               % "2.5.1",
  "org.scalatra"               %% "scalatra-auth"          % "2.5.1",
  "org.eclipse.jetty"           % "jetty-webapp"           % "8.1.7.v20120910"        % "container,compile",
  "org.eclipse.jetty.orbit"     % "javax.servlet"          % "3.0.0.v201112011016",
  "org.scalatra"               %% "scalatra-json"          % "2.5.1",
  "org.json4s"                 %% "json4s-jackson"         % "3.5.0",
  "com.typesafe.slick"         %% "slick"                  % "3.2.0",
  "org.slf4j"                   % "slf4j-nop"              % "1.6.4",
  "mysql"                       % "mysql-connector-java"   % "6.0.6",
  "com.mchange"                 % "c3p0"                   % "0.9.5.2")

Seq(webSettings :_*)