package org.apache.spark.sql.sources;
/**
 * ::DeveloperApi::
 * A BaseRelation that can eliminate unneeded columns and filter using selected
 * predicates before producing an RDD containing all matching tuples as Row objects.
 * <p>
 * The pushed down filters are currently purely an optimization as they will all be evaluated
 * again.  This means it is safe to use them with methods that produce false positives such
 * as filtering partitions based on a bloom filter.
 */
public abstract class PrunedFilteredScan extends org.apache.spark.sql.sources.BaseRelation {
  public   PrunedFilteredScan () { throw new RuntimeException(); }
  public abstract  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> buildScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters) ;
}
