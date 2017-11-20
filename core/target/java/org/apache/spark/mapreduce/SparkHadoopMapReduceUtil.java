package org.apache.spark.mapreduce;
public  interface SparkHadoopMapReduceUtil {
  public  org.apache.hadoop.mapreduce.JobContext newJobContext (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.mapreduce.JobID jobId) ;
  public  org.apache.hadoop.mapreduce.TaskAttemptContext newTaskAttemptContext (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.mapreduce.TaskAttemptID attemptId) ;
  public  org.apache.hadoop.mapreduce.TaskAttemptID newTaskAttemptID (java.lang.String jtIdentifier, int jobId, boolean isMap, int taskId, int attemptId) ;
  public  java.lang.Class<?> firstAvailableClass (java.lang.String first, java.lang.String second) ;
}
