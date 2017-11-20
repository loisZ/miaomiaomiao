package org.apache.spark;
/**
 * An agent that dynamically allocates and removes executors based on the workload.
 * <p>
 * The add policy depends on whether there are backlogged tasks waiting to be scheduled. If
 * the scheduler queue is not drained in N seconds, then new executors are added. If the queue
 * persists for another M seconds, then more executors are added and so on. The number added
 * in each round increases exponentially from the previous round until an upper bound on the
 * number of executors has been reached. The upper bound is based both on a configured property
 * and on the number of tasks pending: the policy will never increase the number of executor
 * requests past the number needed to handle all pending tasks.
 * <p>
 * The rationale for the exponential increase is twofold: (1) Executors should be added slowly
 * in the beginning in case the number of extra executors needed turns out to be small. Otherwise,
 * we may add more executors than we need just to remove them later. (2) Executors should be added
 * quickly over time in case the maximum number of executors is very high. Otherwise, it will take
 * a long time to ramp up under heavy workloads.
 * <p>
 * The remove policy is simpler: If an executor has been idle for K seconds, meaning it has not
 * been scheduled to run any tasks, then it is removed.
 * <p>
 * There is no retry logic in either case because we make the assumption that the cluster manager
 * will eventually fulfill all requests it receives asynchronously.
 * <p>
 * The relevant Spark properties include the following:
 * <p>
 *   spark.dynamicAllocation.enabled - Whether this feature is enabled
 *   spark.dynamicAllocation.minExecutors - Lower bound on the number of executors
 *   spark.dynamicAllocation.maxExecutors - Upper bound on the number of executors
 * <p>
 *   spark.dynamicAllocation.schedulerBacklogTimeout (M) -
 *     If there are backlogged tasks for this duration, add new executors
 * <p>
 *   spark.dynamicAllocation.sustainedSchedulerBacklogTimeout (N) -
 *     If the backlog is sustained for this duration, add more executors
 *     This is used only after the initial backlog timeout is exceeded
 * <p>
 *   spark.dynamicAllocation.executorIdleTimeout (K) -
 *     If an executor has been idle for this duration, remove it
 */
public  class ExecutorAllocationManager implements org.apache.spark.Logging {
  /**
   * A listener that notifies the given allocation manager of when to add and remove executors.
   * <p>
   * This class is intentionally conservative in its assumptions about the relative ordering
   * and consistency of events returned by the listener. For simplicity, it does not account
   * for speculated tasks.
   */
  private  class ExecutorAllocationListener implements org.apache.spark.scheduler.SparkListener {
    public   ExecutorAllocationListener (org.apache.spark.ExecutorAllocationManager allocationManager) { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> stageIdToNumTasks () { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<java.lang.Object, scala.collection.mutable.HashSet<java.lang.Object>> stageIdToTaskIndices () { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.Object>> executorIdToTaskIds () { throw new RuntimeException(); }
    public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted) { throw new RuntimeException(); }
    public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted) { throw new RuntimeException(); }
    public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart) { throw new RuntimeException(); }
    public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd) { throw new RuntimeException(); }
    public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded blockManagerAdded) { throw new RuntimeException(); }
    public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved blockManagerRemoved) { throw new RuntimeException(); }
    /**
     * An estimate of the total number of pending tasks remaining for currently running stages. Does
     * not account for tasks which may have failed and been resubmitted.
     */
    public  int totalPendingTasks () { throw new RuntimeException(); }
  }
  static public  long NOT_SET () { throw new RuntimeException(); }
  public   ExecutorAllocationManager (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  int minNumExecutors () { throw new RuntimeException(); }
  private  int maxNumExecutors () { throw new RuntimeException(); }
  private  long schedulerBacklogTimeout () { throw new RuntimeException(); }
  private  long sustainedSchedulerBacklogTimeout () { throw new RuntimeException(); }
  private  long executorIdleTimeout () { throw new RuntimeException(); }
  private  boolean testing () { throw new RuntimeException(); }
  private  int tasksPerExecutor () { throw new RuntimeException(); }
  private  int numExecutorsToAdd () { throw new RuntimeException(); }
  private  int numExecutorsPending () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> executorsPendingToRemove () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> executorIds () { throw new RuntimeException(); }
  private  long addTime () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> removeTimes () { throw new RuntimeException(); }
  private  long intervalMillis () { throw new RuntimeException(); }
  private  org.apache.spark.Clock clock () { throw new RuntimeException(); }
  private  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationListener listener () { throw new RuntimeException(); }
  /**
   * Verify that the settings specified through the config are valid.
   * If not, throw an appropriate exception.
   */
  private  void validateSettings () { throw new RuntimeException(); }
  /**
   * Use a different clock for this allocation manager. This is mainly used for testing.
   */
  public  void setClock (org.apache.spark.Clock newClock) { throw new RuntimeException(); }
  /**
   * Register for scheduler callbacks to decide when to add and remove executors.
   */
  public  void start () { throw new RuntimeException(); }
  /**
   * Start the main polling thread that keeps track of when to add and remove executors.
   */
  private  void startPolling () { throw new RuntimeException(); }
  /**
   * If the add time has expired, request new executors and refresh the add time.
   * If the remove time for an existing executor has expired, kill the executor.
   * This is factored out into its own method for testing.
   */
  private  void schedule () { throw new RuntimeException(); }
  /**
   * Request a number of executors from the cluster manager.
   * If the cap on the number of executors is reached, give up and reset the
   * number of executors to add next round instead of continuing to double it.
   * Return the number actually requested.
   */
  private  int addExecutors () { throw new RuntimeException(); }
  /**
   * Request the cluster manager to remove the given executor.
   * Return whether the request is received.
   */
  private  boolean removeExecutor (java.lang.String executorId) { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor has been added.
   */
  private  void onExecutorAdded (java.lang.String executorId) { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor has been removed.
   */
  private  void onExecutorRemoved (java.lang.String executorId) { throw new RuntimeException(); }
  /**
   * Callback invoked when the scheduler receives new pending tasks.
   * This sets a time in the future that decides when executors should be added
   * if it is not already set.
   */
  private  void onSchedulerBacklogged () { throw new RuntimeException(); }
  /**
   * Callback invoked when the scheduler queue is drained.
   * This resets all variables used for adding executors.
   */
  private  void onSchedulerQueueEmpty () { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor is no longer running any tasks.
   * This sets a time in the future that decides when this executor should be removed if
   * the executor is not already marked as idle.
   */
  private  void onExecutorIdle (java.lang.String executorId) { throw new RuntimeException(); }
  /**
   * Callback invoked when the specified executor is now running a task.
   * This resets all variables used for removing this executor.
   */
  private  void onExecutorBusy (java.lang.String executorId) { throw new RuntimeException(); }
}
