package org.apache.spark.sql.parquet;
/**
 * An alternative to {@link ParquetRelation} that plugs in using the data sources API.  This class is
 * currently not intended as a full replacement of the parquet support in Spark SQL though it is
 * likely that it will eventually subsume the existing physical plan implementation.
 * <p>
 * Compared with the current implementation, this class has the following notable differences:
 * <p>
 * Partitioning: Partitions are auto discovered and must be in the form of directories <code>key=value/</code>
 * located at <code>path</code>.  Currently only a single partitioning column is supported and it must
 * be an integer.  This class supports both fully self-describing data, which contains the partition
 * key, and data where the partition key is only present in the folder structure.  The presence
 * of the partitioning key in the data is also auto-detected.  The <code>null</code> partition is not yet
 * supported.
 * <p>
 * Metadata: The metadata is automatically discovered by reading the first parquet file present.
 * There is currently no support for working with files that have different schema.  Additionally,
 * when parquet metadata caching is turned on, the FileStatus objects for all data will be cached
 * to improve the speed of interactive querying.  When data is added to a table it must be dropped
 * and recreated to pick up any changes.
 * <p>
 * Statistics: Statistics for the size of the table are automatically populated during metadata
 * discovery.
 */
public  class ParquetRelation2 extends org.apache.spark.sql.sources.CatalystScan implements org.apache.spark.Logging, scala.Product, scala.Serializable {
  public  java.lang.String path () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  // not preceding
  public   ParquetRelation2 (java.lang.String path, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext () { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> partitionKeys () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.parquet.Partition> partitions () { throw new RuntimeException(); }
  private  void discoverPartitions () { throw new RuntimeException(); }
  // not preceding
  public  long sizeInBytes () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType dataSchema () { throw new RuntimeException(); }
  public  boolean dataIncludesKey () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType schema () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> buildScan (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates) { throw new RuntimeException(); }
}
