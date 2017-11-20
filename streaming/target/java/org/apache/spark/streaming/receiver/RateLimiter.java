package org.apache.spark.streaming.receiver;
/** Provides waitToPush() method to limit the rate at which receivers consume data.
 * <p>
 * waitToPush method will block the thread if too many messages have been pushed too quickly,
 * and only return when a new message has been pushed. It assumes that only one message is
 * pushed at a time.
 * <p>
 * The spark configuration spark.streaming.receiver.maxRate gives the maximum number of messages
 * per second that each receiver will accept.
 * <p>
 * @param conf spark configuration
 */
public abstract class RateLimiter implements org.apache.spark.Logging {
  public   RateLimiter (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  long lastSyncTime () { throw new RuntimeException(); }
  private  long messagesWrittenSinceSync () { throw new RuntimeException(); }
  private  int desiredRate () { throw new RuntimeException(); }
  private  long SYNC_INTERVAL () { throw new RuntimeException(); }
  public  void waitToPush () { throw new RuntimeException(); }
}
