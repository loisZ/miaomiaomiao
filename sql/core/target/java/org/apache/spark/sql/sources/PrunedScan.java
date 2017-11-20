package org.apache.spark.sql.sources;
/**
 * ::DeveloperApi::
 * A BaseRelation that can eliminate unneeded columns before producing an RDD
 * containing all of its tuples as Row objects.
 */
public abstract class PrunedScan extends org.apache.spark.sql.sources.BaseRelation {
  public   PrunedScan () { throw new RuntimeException(); }
  public abstract  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> buildScan (java.lang.String[] requiredColumns) ;
}
