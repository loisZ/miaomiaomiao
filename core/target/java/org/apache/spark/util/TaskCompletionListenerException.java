package org.apache.spark.util;
/**
 * Exception thrown when there is an exception in
 * executing the callback in TaskCompletionListener.
 */
public  class TaskCompletionListenerException extends java.lang.Exception {
  public   TaskCompletionListenerException (scala.collection.Seq<java.lang.String> errorMessages) { throw new RuntimeException(); }
  public  java.lang.String getMessage () { throw new RuntimeException(); }
}
