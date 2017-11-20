package org.apache.spark.sql.execution;
// no position
public  class CS143Utils {
  /**
   * Returns a Scala array that contains the bytes representing a Java ArrayList.
   * <p>
   * @param data the Java ArrayList we are converting
   * @return an array of bytes
   */
  static public  byte[] getBytesFromList (java.util.ArrayList<org.apache.spark.sql.catalyst.expressions.Row> data) { throw new RuntimeException(); }
  /**
   * Converts an array of bytes into a JavaArrayList of type {@link Row}.
   * <p>
   * @param bytes the input byte array
   * @return a {@link JavaArrayList} of Rows
   */
  static public  java.util.ArrayList<org.apache.spark.sql.catalyst.expressions.Row> getListFromBytes (byte[] bytes) { throw new RuntimeException(); }
  /**
   * Reads the next nextChunkSize bytes from the input stream provided. If the previous array read into is availab
   * please provide it so as to avoid allocating new object unless absolutely necessary.
   * <p>
   * @param inStream the input stream we are reading from
   * @param nextChunkSize the number of bytes to read
   * @param previousArray the previous array we read into
   * @return
   */
  static public  byte[] getNextChunkBytes (java.io.InputStream inStream, int nextChunkSize, byte[] previousArray) { throw new RuntimeException(); }
  /**
   * Return a new projection operator.
   * <p>
   * @param expressions
   * @param inputSchema
   * @return
   */
  static public  org.apache.spark.sql.catalyst.expressions.InterpretedProjection getNewProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  /**
   * Mutable wrapper concatenating two rows.
   * @return
   */
  static public  org.apache.spark.sql.catalyst.expressions.JoinedRow rowsConcatenator () { throw new RuntimeException(); }
  /**
   * This function returns the {@link ScalaUdf} from a sequence of expressions. If there is no UDF in the
   * sequence of expressions then it returns null. If there is more than one, it returns the one that is
   * sequentially last.
   * <p>
   * @param expressions
   */
  static public  org.apache.spark.sql.catalyst.expressions.ScalaUdf getUdfFromExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions) { throw new RuntimeException(); }
  /**
   * This function takes a sequence of expressions. If there is no UDF in the sequence of expressions, it does
   * a regular projection operation.
   * <p>
   * If there is a UDF, then it creates a caching iterator that caches the result of the UDF.
   * <p>
   * NOTE: This only works for a single UDF. If there are multiple UDFs, then it will only cache for the last UDF
   * and execute all other UDFs regularly.
   * <p>
   * @param expressions
   * @param inputSchema
   * @return
   */
  static public  scala.Function1<scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row>, scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row>> generateCachingIterator (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
  /**
   * This method is called before a new value is added to the aggregation table. The idea is to
   * check if the size of the aggregation table is proper in case the new record will trigger the
   * expansion of the table.
   * @param collection a map able to track its size
   * @param allowedMemory the maximum amount of memory allowed for the input collection
   * @return true if the addition of a new record will make the table grow beyond the allowed size
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> boolean maybeSpill (org.apache.spark.util.collection.SizeTrackingAppendOnlyMap<K, V> collection, long allowedMemory) { throw new RuntimeException(); }
}
