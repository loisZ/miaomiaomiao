package org.apache.spark;
public  class SparkContextSchedulerCreationSuite extends org.scalatest.FunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.PrivateMethodTester, org.apache.spark.Logging {
  public   SparkContextSchedulerCreationSuite () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl createTaskScheduler (java.lang.String master) { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl createTaskScheduler (java.lang.String master, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  void testYarn (java.lang.String master, java.lang.String expectedClassName) { throw new RuntimeException(); }
  public  void testMesos (java.lang.String master, java.lang.Class<?> expectedClass, boolean coarse) { throw new RuntimeException(); }
}
