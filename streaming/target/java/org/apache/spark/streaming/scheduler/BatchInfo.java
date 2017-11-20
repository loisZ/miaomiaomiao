package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * Class having information on completed batches.
 * @param batchTime   Time of the batch
 * @param submissionTime  Clock time of when jobs of this batch was submitted to
 *                        the streaming scheduler queue
 * @param processingStartTime Clock time of when the first job of this batch started processing
 * @param processingEndTime Clock time of when the last job of this batch finished processing
 */
public  class BatchInfo implements scala.Product, scala.Serializable {
  public  org.apache.spark.streaming.Time batchTime () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.ReceivedBlockInfo[]> receivedBlockInfo () { throw new RuntimeException(); }
  public  long submissionTime () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> processingStartTime () { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> processingEndTime () { throw new RuntimeException(); }
  // not preceding
  public   BatchInfo (org.apache.spark.streaming.Time batchTime, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.ReceivedBlockInfo[]> receivedBlockInfo, long submissionTime, scala.Option<java.lang.Object> processingStartTime, scala.Option<java.lang.Object> processingEndTime) { throw new RuntimeException(); }
  /**
   * Time taken for the first job of this batch to start processing from the time this batch
   * was submitted to the streaming scheduler. Essentially, it is
   * <code>processingStartTime</code> - <code>submissionTime</code>.
   */
  public  scala.Option<java.lang.Object> schedulingDelay () { throw new RuntimeException(); }
  /**
   * Time taken for the all jobs of this batch to finish processing from the time they started
   * processing. Essentially, it is <code>processingEndTime</code> - <code>processingStartTime</code>.
   */
  public  scala.Option<java.lang.Object> processingDelay () { throw new RuntimeException(); }
  /**
   * Time taken for all the jobs of this batch to finish processing from the time they
   * were submitted.  Essentially, it is <code>processingDelay</code> + <code>schedulingDelay</code>.
   */
  public  scala.Option<java.lang.Object> totalDelay () { throw new RuntimeException(); }
}
