package org.apache.spark.mapred;
public  interface SparkHadoopMapRedUtil {
  public  org.apache.hadoop.mapred.JobContext newJobContext (org.apache.hadoop.mapred.JobConf conf, org.apache.hadoop.mapred.JobID jobId) ;
  public  org.apache.hadoop.mapred.TaskAttemptContext newTaskAttemptContext (org.apache.hadoop.mapred.JobConf conf, org.apache.hadoop.mapred.TaskAttemptID attemptId) ;
  public  org.apache.hadoop.mapred.TaskAttemptID newTaskAttemptID (java.lang.String jtIdentifier, int jobId, boolean isMap, int taskId, int attemptId) ;
  public  java.lang.Class<?> firstAvailableClass (java.lang.String first, java.lang.String second) ;
}
