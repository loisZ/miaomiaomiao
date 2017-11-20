package org.apache.spark;
// no position
/**
 * This class exists to restrict the visibility of TaskContext setters.
 */
public  class TaskContextHelper {
  static public  void setTaskContext (org.apache.spark.TaskContext tc) { throw new RuntimeException(); }
  static public  void unset () { throw new RuntimeException(); }
}
