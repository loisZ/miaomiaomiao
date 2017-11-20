package org.apache.spark;
/**
 * Test add and remove behavior of ExecutorAllocationManager.
 */
public  class ExecutorAllocationManagerSuite extends org.scalatest.FunSuite implements org.apache.spark.LocalSparkContext {
  static private  long schedulerBacklogTimeout () { throw new RuntimeException(); }
  static private  long sustainedSchedulerBacklogTimeout () { throw new RuntimeException(); }
  static private  long executorIdleTimeout () { throw new RuntimeException(); }
  static private  org.apache.spark.SparkContext createSparkContext (int minExecutors, int maxExecutors) { throw new RuntimeException(); }
  static private  org.apache.spark.scheduler.StageInfo createStageInfo (int stageId, int numTasks) { throw new RuntimeException(); }
  static private  org.apache.spark.scheduler.TaskInfo createTaskInfo (int taskId, int taskIndex, java.lang.String executorId) { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _numExecutorsToAdd () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _numExecutorsPending () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.Set<java.lang.String>> _executorsPendingToRemove () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.Set<java.lang.String>> _executorIds () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _addTime () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.collection.Map<java.lang.String, java.lang.Object>> _removeTimes () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _schedule () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _addExecutors () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<java.lang.Object> _removeExecutor () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorAdded () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorRemoved () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onSchedulerBacklogged () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onSchedulerQueueEmpty () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorIdle () { throw new RuntimeException(); }
  static private  org.scalatest.PrivateMethodTester.PrivateMethod<scala.runtime.BoxedUnit> _onExecutorBusy () { throw new RuntimeException(); }
  static private  int numExecutorsToAdd (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  int numExecutorsPending (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  scala.collection.Set<java.lang.String> executorsPendingToRemove (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  scala.collection.Set<java.lang.String> executorIds (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  long addTime (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  scala.collection.Map<java.lang.String, java.lang.Object> removeTimes (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  void schedule (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  int addExecutors (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  boolean removeExecutor (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  static private  void onExecutorAdded (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  static private  void onExecutorRemoved (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  static private  void onSchedulerBacklogged (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  void onSchedulerQueueEmpty (org.apache.spark.ExecutorAllocationManager manager) { throw new RuntimeException(); }
  static private  void onExecutorIdle (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  static private  void onExecutorBusy (org.apache.spark.ExecutorAllocationManager manager, java.lang.String id) { throw new RuntimeException(); }
  public   ExecutorAllocationManagerSuite () { throw new RuntimeException(); }
}
