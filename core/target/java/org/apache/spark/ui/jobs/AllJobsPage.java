package org.apache.spark.ui.jobs;
/** Page showing list of all ongoing and recently finished jobs */
public  class AllJobsPage extends org.apache.spark.ui.WebUIPage {
  public   AllJobsPage (org.apache.spark.ui.jobs.JobsTab parent) { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> startTime () { throw new RuntimeException(); }
  private  org.apache.spark.ui.jobs.JobProgressListener listener () { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> jobsTable (scala.collection.Seq<org.apache.spark.ui.jobs.UIData.JobUIData> jobs) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
}
