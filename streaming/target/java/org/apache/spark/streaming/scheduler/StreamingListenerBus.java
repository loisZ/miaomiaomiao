package org.apache.spark.streaming.scheduler;
/** Asynchronously passes StreamingListenerEvents to registered StreamingListeners. */
public  class StreamingListenerBus implements org.apache.spark.Logging {
  public   StreamingListenerBus () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.scheduler.StreamingListener> listeners () { throw new RuntimeException(); }
  private  int EVENT_QUEUE_CAPACITY () { throw new RuntimeException(); }
  private  java.util.concurrent.LinkedBlockingQueue<org.apache.spark.streaming.scheduler.StreamingListenerEvent> eventQueue () { throw new RuntimeException(); }
  private  boolean queueFullErrorMessageLogged () { throw new RuntimeException(); }
  public  java.lang.Thread listenerThread () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void addListener (org.apache.spark.streaming.scheduler.StreamingListener listener) { throw new RuntimeException(); }
  public  void post (org.apache.spark.streaming.scheduler.StreamingListenerEvent event) { throw new RuntimeException(); }
  /**
   * Waits until there are no more events in the queue, or until the specified time has elapsed.
   * Used for testing only. Returns true if the queue has emptied and false is the specified time
   * elapsed before the queue emptied.
   */
  public  boolean waitUntilEmpty (int timeoutMillis) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}
