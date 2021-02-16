
name := "SparkHiveJdbcConnector"

version := "0.1"

scalaVersion := "2.11.12"
val sparkVersion = "2.0.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

test in assembly := {}
assemblyJarName in assembly := s"${name.value}-${version.value}.jar"
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)