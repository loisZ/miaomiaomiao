package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Returned for the "CACHE TABLE tableName [AS SELECT ...]" command.
 */
public  class CacheTableCommand extends org.apache.spark.sql.catalyst.plans.logical.Command implements scala.Product, scala.Serializable {
  public  java.lang.String tableName () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plan () { throw new RuntimeException(); }
  public  boolean isLazy () { throw new RuntimeException(); }
  // not preceding
  public   CacheTableCommand (java.lang.String tableName, scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> plan, boolean isLazy) { throw new RuntimeException(); }
}
