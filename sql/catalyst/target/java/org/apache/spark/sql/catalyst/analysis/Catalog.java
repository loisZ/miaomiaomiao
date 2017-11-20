package org.apache.spark.sql.catalyst.analysis;
/**
 * An interface for looking up relations by name.  Used by an {@link Analyzer}.
 */
public  interface Catalog {
  public  boolean caseSensitive () ;
  public  boolean tableExists (scala.Option<java.lang.String> db, java.lang.String tableName) ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (scala.Option<java.lang.String> databaseName, java.lang.String tableName, scala.Option<java.lang.String> alias) ;
  public  void registerTable (scala.Option<java.lang.String> databaseName, java.lang.String tableName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
  public  void unregisterTable (scala.Option<java.lang.String> databaseName, java.lang.String tableName) ;
  public  void unregisterAllTables () ;
  public  scala.Tuple2<scala.Option<java.lang.String>, java.lang.String> processDatabaseAndTableName (scala.Option<java.lang.String> databaseName, java.lang.String tableName) ;
  public  scala.Tuple2<java.lang.String, java.lang.String> processDatabaseAndTableName (java.lang.String databaseName, java.lang.String tableName) ;
}
