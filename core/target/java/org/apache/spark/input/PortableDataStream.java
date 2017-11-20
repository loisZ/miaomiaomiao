package org.apache.spark.input;
/**
 * A class that allows DataStreams to be serialized and moved around by not creating them
 * until they need to be read
 * @note TaskAttemptContext is not serializable resulting in the confBytes construct
 * @note CombineFileSplit is not serializable resulting in the splitBytes construct
 */
public  class PortableDataStream implements scala.Serializable {
  public   PortableDataStream (org.apache.hadoop.mapreduce.lib.input.CombineFileSplit isplit, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.Integer index) { throw new RuntimeException(); }
  private  java.io.DataInputStream fileIn () { throw new RuntimeException(); }
  private  boolean isOpen () { throw new RuntimeException(); }
  private  byte[] confBytes () { throw new RuntimeException(); }
  private  byte[] splitBytes () { throw new RuntimeException(); }
  private  org.apache.hadoop.mapreduce.lib.input.CombineFileSplit split () { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  /**
   * Calculate the path name independently of opening the file
   */
  private  java.lang.String path () { throw new RuntimeException(); }
  /**
   * Create a new DataInputStream from the split and context
   */
  public  java.io.DataInputStream open () { throw new RuntimeException(); }
  /**
   * Read the file as a byte array
   */
  public  byte[] toArray () { throw new RuntimeException(); }
  /**
   * Close the file (if it is currently open)
   */
  public  void close () { throw new RuntimeException(); }
  public  java.lang.String getPath () { throw new RuntimeException(); }
}
