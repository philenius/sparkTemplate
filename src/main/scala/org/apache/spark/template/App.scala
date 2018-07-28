package org.apache.spark.template

import org.apache.spark.sql.SparkSession

/**
  * IntelliJ IDEA template for Apache Spark Standalone App with Scala and Maven / SBT.
  */
object App {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().master("local").appName("spark-test").getOrCreate()

    spark.stop()

  }
}
