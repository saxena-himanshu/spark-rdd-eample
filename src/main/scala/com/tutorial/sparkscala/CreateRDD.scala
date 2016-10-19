package com.tutorial.sparkscala

import com.tutorial.utils.SparkCommon

/**
  * Created by himanshu on 06/03/15.
  */
object CreateRDD {

  /**
    * Create a Scala Spark Context.
    */
  val sc = SparkCommon.sparkContext
  def main(args: Array[String]) {

    /**
      * Create RDDs using parallelize() method of SparkContext
      */
    val lines = sc.parallelize(List("pandas", "i like pandas"))
    lines.collect().map(println)

    /**
      * Create RDDs is to load data from external storage
      */
    val rddDataset = sc.textFile("src/main/resources/test_file.txt")
    rddDataset.collect().map(println)
    sc.stop()
  }

}
