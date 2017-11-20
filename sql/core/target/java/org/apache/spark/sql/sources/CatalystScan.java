package org.apache.spark.sql.sources;
/**
 * ::Experimental::
 * An interface for experimenting with a more direct connection to the query planner.  Compared to
 * {@link PrunedFilteredScan}, this operator receives the raw expressions from the
 * {@link org.apache.spark.sql.catalyst.plans.logical.LogicalPlan}.  Unlike the other APIs this
 * interface is not designed to be binary compatible across releases and thus should only be used
 * for experimentation.
 */
public abstract class CatalystScan extends org.apache.spark.sql.sources.BaseRelation {
  public   CatalystScan () { throw new RuntimeException(); }
  public abstract  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> buildScan (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> requiredColumns, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters) ;
}
