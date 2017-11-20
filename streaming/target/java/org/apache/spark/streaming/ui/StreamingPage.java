package org.apache.spark.streaming.ui;
/** Page for Spark Web UI that shows statistics of a streaming job */
public  class StreamingPage extends org.apache.spark.ui.WebUIPage implements org.apache.spark.Logging {
  public   StreamingPage (org.apache.spark.streaming.ui.StreamingTab parent) { throw new RuntimeException(); }
  private  org.apache.spark.streaming.ui.StreamingJobProgressListener listener () { throw new RuntimeException(); }
  private  java.util.Date startTime () { throw new RuntimeException(); }
  private  java.lang.String emptyCell () { throw new RuntimeException(); }
  /** Render the page */
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  /** Generate basic stats of the streaming program */
  private  scala.collection.Seq<scala.xml.Node> generateBasicStats () { throw new RuntimeException(); }
  /** Generate stats of data received by the receivers in the streaming program */
  private  scala.collection.Seq<scala.xml.Node> generateReceiverStats () { throw new RuntimeException(); }
  /** Generate stats of batch jobs of the streaming program */
  private  scala.collection.Seq<scala.xml.Node> generateBatchStatsTable () { throw new RuntimeException(); }
  /**
   * Returns a human-readable string representing a duration such as "5 second 35 ms"
   */
  private  java.lang.String formatDurationOption (scala.Option<java.lang.Object> msOption) { throw new RuntimeException(); }
  /** Get quantiles for any time distribution */
  private  scala.collection.immutable.IndexedSeq<java.lang.String> getQuantiles (scala.Option<org.apache.spark.util.Distribution> timeDistributionOption) { throw new RuntimeException(); }
  /** Generate HTML table from string data */
  private  scala.collection.Seq<scala.xml.Node> listingTable (scala.collection.Seq<java.lang.String> headers, scala.collection.Seq<scala.collection.Seq<java.lang.String>> data) { throw new RuntimeException(); }
}
