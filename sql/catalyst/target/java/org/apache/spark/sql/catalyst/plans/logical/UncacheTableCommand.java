package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Returned for the "UNCACHE TABLE tableName" command.
 */
public  class UncacheTableCommand extends org.apache.spark.sql.catalyst.plans.logical.Command implements scala.Product, scala.Serializable {
  public  java.lang.String tableName () { throw new RuntimeException(); }
  // not preceding
  public   UncacheTableCommand (java.lang.String tableName) { throw new RuntimeException(); }
}
