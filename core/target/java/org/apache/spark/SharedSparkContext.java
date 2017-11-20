package org.apache.spark;
/** Shares a local `SparkContext` between all tests in a suite and closes it at the end */
public  interface SharedSparkContext extends org.scalatest.BeforeAndAfterAll {
  public  org.apache.spark.SparkContext _sc () ;
  public  org.apache.spark.SparkContext sc () ;
  public  org.apache.spark.SparkConf conf () ;
  public  void beforeAll () ;
  public  void afterAll () ;
}
