package org.apache.spark.ui;
/**
 * ConsoleProgressBar shows the progress of stages in the next line of the console. It poll the
 * status of active stages from <code>sc.statusTracker</code> periodically, the progress bar will be showed
 * up after the stage has ran at least 500ms. If multiple stages run in the same time, the status
 * of them will be combined together, showed in one line.
 */
public  class ConsoleProgressBar implements org.apache.spark.Logging {
  public   ConsoleProgressBar (org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  public  char CR () { throw new RuntimeException(); }
  public  long UPDATE_PERIOD () { throw new RuntimeException(); }
  public  long FIRST_DELAY () { throw new RuntimeException(); }
  public  int TerminalWidth () { throw new RuntimeException(); }
  public  long lastFinishTime () { throw new RuntimeException(); }
  public  long lastUpdateTime () { throw new RuntimeException(); }
  public  java.lang.String lastProgressBar () { throw new RuntimeException(); }
  private  java.util.Timer timer () { throw new RuntimeException(); }
  /**
   * Try to refresh the progress bar in every cycle
   */
  private  void refresh () { throw new RuntimeException(); }
  /**
   * Show progress bar in console. The progress bar is displayed in the next line
   * after your last output, keeps overwriting itself to hold in one line. The logging will follow
   * the progress bar, then progress bar will be showed in next line without overwrite logs.
   */
  private  void show (long now, scala.collection.Seq<org.apache.spark.SparkStageInfo> stages) { throw new RuntimeException(); }
  /**
   * Clear the progress bar if showed.
   */
  private  void clear () { throw new RuntimeException(); }
  /**
   * Mark all the stages as finished, clear the progress bar if showed, then the progress will not
   * interweave with output of jobs.
   */
  public  void finishAll () { throw new RuntimeException(); }
}
