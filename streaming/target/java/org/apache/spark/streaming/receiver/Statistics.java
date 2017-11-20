package org.apache.spark.streaming.receiver;
/**
 * :: DeveloperApi ::
 * Statistics for querying the supervisor about state of workers. Used in
 * conjunction with <code>StreamingContext.actorStream</code> and
 * {@link org.apache.spark.streaming.receiver.ActorHelper}.
 */
public  class Statistics implements scala.Product, scala.Serializable {
  public  int numberOfMsgs () { throw new RuntimeException(); }
  public  int numberOfWorkers () { throw new RuntimeException(); }
  public  int numberOfHiccups () { throw new RuntimeException(); }
  public  java.lang.String otherInfo () { throw new RuntimeException(); }
  // not preceding
  public   Statistics (int numberOfMsgs, int numberOfWorkers, int numberOfHiccups, java.lang.String otherInfo) { throw new RuntimeException(); }
}
