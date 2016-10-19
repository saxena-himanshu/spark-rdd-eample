name := """spark-scala-tutorial"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val spark = "1.6.0"

// Dependencies for using spark

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % spark,
  "org.apache.spark" %% "spark-sql" % spark,
  "org.apache.spark" %% "spark-streaming" % spark,
  "org.apache.spark" %% "spark-graphx" % "1.6.0",
  "com.databricks" %% "spark-csv" % "1.4.0",
 "org.elasticsearch" %% "elasticsearch-spark" % "2.3.4",
 "com.github.davidmoten" % "grumpy" % "0.2.3",
 "com.github.davidmoten" % "rtree" % "0.5.6"
)
