package org.apache.spark.ui;
/**
 * Selenium tests for the Spark Web UI.  These tests are not run by default
 * because they're slow.
 */
public  class UISeleniumSuite extends org.scalatest.FunSuite implements org.scalatest.selenium.WebBrowser, org.scalatest.Matchers {
  public   UISeleniumSuite () { throw new RuntimeException(); }
  public  org.openqa.selenium.WebDriver webDriver () { throw new RuntimeException(); }
  /**
   * Create a test SparkContext with the SparkUI enabled.
   * It is safe to <code>get</code> the SparkUI directly from the SparkContext returned here.
   */
  private  org.apache.spark.SparkContext newSparkContext () { throw new RuntimeException(); }
}
