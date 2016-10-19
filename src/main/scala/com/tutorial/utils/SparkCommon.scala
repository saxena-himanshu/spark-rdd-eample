package com.tutorial.utils

import org.apache.spark.sql.SQLContext
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by himanshu on 06/03/15.
  */
object SparkCommon {

  lazy val conf = {
    new SparkConf(false)
      .setMaster("local[*]")
      .setAppName("Spark Scala Tutorial")
  }

  lazy val sparkContext = new SparkContext(conf)
  lazy val sparkSQLContext = SQLContext.getOrCreate(sparkContext)

}
