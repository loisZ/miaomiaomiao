package org.apache.spark.streaming.ui;
public  class StreamingJobProgressListener implements org.apache.spark.streaming.scheduler.StreamingListener {
  public   StreamingJobProgressListener (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.streaming.scheduler.BatchInfo> waitingBatchInfos () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.streaming.scheduler.BatchInfo> runningBatchInfos () { throw new RuntimeException(); }
  private  scala.collection.mutable.Queue<org.apache.spark.streaming.scheduler.BatchInfo> completedaBatchInfos () { throw new RuntimeException(); }
  private  int batchInfoLimit () { throw new RuntimeException(); }
  private  long totalCompletedBatches () { throw new RuntimeException(); }
  private  long totalReceivedRecords () { throw new RuntimeException(); }
  private  long totalProcessedRecords () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.scheduler.ReceiverInfo> receiverInfos () { throw new RuntimeException(); }
  public  long batchDuration () { throw new RuntimeException(); }
  public  void onReceiverStarted (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStarted receiverStarted) { throw new RuntimeException(); }
  public  void onReceiverError (org.apache.spark.streaming.scheduler.StreamingListenerReceiverError receiverError) { throw new RuntimeException(); }
  public  void onReceiverStopped (org.apache.spark.streaming.scheduler.StreamingListenerReceiverStopped receiverStopped) { throw new RuntimeException(); }
  public  void onBatchSubmitted (org.apache.spark.streaming.scheduler.StreamingListenerBatchSubmitted batchSubmitted) { throw new RuntimeException(); }
  public  void onBatchStarted (org.apache.spark.streaming.scheduler.StreamingListenerBatchStarted batchStarted) { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted) { throw new RuntimeException(); }
  public  int numReceivers () { throw new RuntimeException(); }
  public  long numTotalCompletedBatches () { throw new RuntimeException(); }
  public  long numTotalReceivedRecords () { throw new RuntimeException(); }
  public  long numTotalProcessedRecords () { throw new RuntimeException(); }
  public  long numUnprocessedBatches () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.BatchInfo> waitingBatches () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.BatchInfo> runningBatches () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.BatchInfo> retainedCompletedBatches () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.Distribution> processingDelayDistribution () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.Distribution> schedulingDelayDistribution () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.Distribution> totalDelayDistribution () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.Option<org.apache.spark.util.Distribution>> receivedRecordsDistributions () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> lastReceivedBatchRecords () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.ReceiverInfo> receiverInfo (int receiverId) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.BatchInfo> lastCompletedBatch () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.BatchInfo> lastReceivedBatch () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.streaming.scheduler.BatchInfo> retainedBatches () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.util.Distribution> extractDistribution (scala.Function1<org.apache.spark.streaming.scheduler.BatchInfo, scala.Option<java.lang.Object>> getMetric) { throw new RuntimeException(); }
}
