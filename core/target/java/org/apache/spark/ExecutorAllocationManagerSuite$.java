package org.apache.spark;
// no position
/**
 * Helper methods for testing ExecutorAllocationManager.
 * This includes methods to access private methods and fields in ExecutorAllocationManager.
 */
public  class ExecutorAllocationManagerSuite$ implements org.scalatest.PrivateMethodTester, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorAllocationManagerSuite$ MODULE$ = null;
  public   ExecutorAllocationManagerSuite$ () { throw new RuntimeException(); }
  private  long schedulerBacklogTimeout () { throw new RuntimeException(); }
  private  long sustainedSchedulerBacklogTimeout () { throw new RuntimeException(); }
  private  long executorIdleTimeout () { throw new RuntimeException(); }
  private  org.apache.spark.SparkContext createSparkContext (int minExecutors, int maxExecutors) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.StageInfo createStageInfo (int stageId, int numTasks) { throw new RuntimeException(); }
  private  org.apache.spark.scheduler.TaskInfo createTaskInfo (int taskId, int taskIndex, java.lang.String executorId) { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _numExecutorsToAdd () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _numExecutorsPending () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.Set<java.lang.String>> _executorsPendingToRemove () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.Set<java.lang.String>> _executorIds () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _addTime () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.Map<java.lang.String, java.lang.Object>> _removeTimes () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _schedule () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _addExecutors () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _removeExecutor () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorAdded () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorRemoved () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onSchedulerBacklogged () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onSchedulerQueueEmpty () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorIdle () { throw new RuntimeException(); }
  private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorBusy () { throw new RuntimeException(); }
  private  int numExecutorsToAdd (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  int numExecutorsPending (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  scala.collection.Set<java.lang.String> executorsPendingToRemove (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  scala.collection.Set<java.lang.String> executorIds (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  long addTime (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.String, java.lang.Object> removeTimes (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  void schedule (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  int addExecutors (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  boolean removeExecutor (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  private  void onExecutorAdded (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  private  void onExecutorRemoved (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  private  void onSchedulerBacklogged (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  void onSchedulerQueueEmpty (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  private  void onExecutorIdle (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  private  void onExecutorBusy (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
}
