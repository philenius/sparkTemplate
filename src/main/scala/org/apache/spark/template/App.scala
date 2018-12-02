package org.apache.spark.template

import org.apache.spark.sql.SparkSession
import org.apache.spark.template.util.CustomLogging

/**
  * IntelliJ IDEA template for Apache Spark Standalone App with Scala and Maven / SBT.
  */
object App {

  def main(args: Array[String]): Unit = {

    CustomLogging.setLogLevels()

    val spark = SparkSession
      .builder()
      .master("local[*]")
      .appName("spark-template")
      .getOrCreate()

    spark.stop()

  }

}
