package org.apache.spark.sql.parquet;
/**
 * Allows creation of parquet based tables using the syntax
 * <code>CREATE TEMPORARY TABLE ... USING org.apache.spark.sql.parquet</code>.  Currently the only option 
 * required is <code>path</code>, which should be the location of a collection of, optionally partitioned,
 * parquet files.
 */
public  class DefaultSource implements org.apache.spark.sql.sources.RelationProvider {
  public   DefaultSource () { throw new RuntimeException(); }
  /** Returns a new base relation with the given parameters. */
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters) { throw new RuntimeException(); }
}
