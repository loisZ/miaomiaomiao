package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Task failed due to a runtime exception. This is the most common failure case and also captures
 * user program exceptions.
 * <p>
 * <code>stackTrace</code> contains the stack trace of the exception itself. It still exists for backward
 * compatibility. It's better to use <code>this(e: Throwable, metrics: Option[TaskMetrics])</code> to
 * create <code>ExceptionFailure</code> as it will handle the backward compatibility properly.
 * <p>
 * <code>fullStackTrace</code> is a better representation of the stack trace because it contains the whole
 * stack trace including the exception and its causes
 */
public  class ExceptionFailure implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  public  java.lang.String className () { throw new RuntimeException(); }
  public  java.lang.String description () { throw new RuntimeException(); }
  public  java.lang.StackTraceElement[] stackTrace () { throw new RuntimeException(); }
  public  java.lang.String fullStackTrace () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.TaskMetrics> metrics () { throw new RuntimeException(); }
  // not preceding
  public   ExceptionFailure (java.lang.String className, java.lang.String description, java.lang.StackTraceElement[] stackTrace, java.lang.String fullStackTrace, scala.Option<org.apache.spark.executor.TaskMetrics> metrics) { throw new RuntimeException(); }
  public   ExceptionFailure (java.lang.Throwable e, scala.Option<org.apache.spark.executor.TaskMetrics> metrics) { throw new RuntimeException(); }
  public  java.lang.String toErrorString () { throw new RuntimeException(); }
  /**
   * Return a nice string representation of the exception, including the stack trace.
   * Note: It does not include the exception's causes, and is only used for backward compatibility.
   */
  private  java.lang.String exceptionString (java.lang.String className, java.lang.String description, java.lang.StackTraceElement[] stackTrace) { throw new RuntimeException(); }
}
