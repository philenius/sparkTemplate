package de.bigdata.spark

import org.apache.spark.sql.SparkSession

/**
  * IntelliJ IDEA template for Apache Spark Standalone App with Scala and Maven.
  */
object App {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().master("local").appName("spark-test").getOrCreate()

    spark.stop()

  }
}
