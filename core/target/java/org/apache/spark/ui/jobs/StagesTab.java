package org.apache.spark.ui.jobs;
/** Web UI showing progress status of all stages in the given SparkContext. */
public  class StagesTab extends org.apache.spark.ui.SparkUITab {
  public   StagesTab (org.apache.spark.ui.SparkUI parent) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.SparkContext> sc () { throw new RuntimeException(); }
  public  boolean killEnabled () { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.JobProgressListener listener () { throw new RuntimeException(); }
  public  boolean isFairScheduler () { throw new RuntimeException(); }
  public  void handleKillRequest (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
}
