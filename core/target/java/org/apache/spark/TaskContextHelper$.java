package org.apache.spark;
// no position
/**
 * This class exists to restrict the visibility of TaskContext setters.
 */
public  class TaskContextHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TaskContextHelper$ MODULE$ = null;
  public   TaskContextHelper$ () { throw new RuntimeException(); }
  public  void setTaskContext (org.apache.spark.TaskContext tc) { throw new RuntimeException(); }
  public  void unset () { throw new RuntimeException(); }
}
