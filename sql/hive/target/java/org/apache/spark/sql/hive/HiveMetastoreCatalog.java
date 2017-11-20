package org.apache.spark.sql.hive;
public  class HiveMetastoreCatalog implements org.apache.spark.sql.catalyst.analysis.Catalog, org.apache.spark.Logging {
  public   HiveMetastoreCatalog (org.apache.spark.sql.hive.HiveContext hive) { throw new RuntimeException(); }
  /** Connection to hive metastore.  Usages should lock on `this`. */
  protected  org.apache.hadoop.hive.ql.metadata.Hive client () { throw new RuntimeException(); }
  public  boolean caseSensitive () { throw new RuntimeException(); }
  public  boolean tableExists (scala.Option<java.lang.String> db, java.lang.String tableName) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan lookupRelation (scala.Option<java.lang.String> db, java.lang.String tableName, scala.Option<java.lang.String> alias) { throw new RuntimeException(); }
  /**
   * Create table with specified database, table name, table description and schema
   * @param databaseName Database Name
   * @param tableName Table Name
   * @param schema Schema of the new table, if not specified, will use the schema
   *               specified in crtTbl
   * @param allowExisting if true, ignore AlreadyExistsException
   * @param desc CreateTableDesc object which contains the SerDe info. Currently
   *               we support most of the features except the bucket.
   */
  public  void createTable (java.lang.String databaseName, java.lang.String tableName, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> schema, boolean allowExisting, scala.Option<org.apache.hadoop.hive.ql.plan.CreateTableDesc> desc) { throw new RuntimeException(); }
  // no position
  public  class CreateTables extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Creates any tables required for query execution.
     * For example, because of a CREATE TABLE X AS statement.
     */
    public   CreateTables () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.CreateTables$ CreateTables () { throw new RuntimeException(); }
  // no position
  public  class PreInsertionCasts extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Casts input data to correct data types according to table definition before inserting into
     * that table.
     */
    public   PreInsertionCasts () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan castChildOutput (org.apache.spark.sql.catalyst.plans.logical.InsertIntoTable p, org.apache.spark.sql.hive.MetastoreRelation table, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.sql.hive.HiveMetastoreCatalog.PreInsertionCasts$ PreInsertionCasts () { throw new RuntimeException(); }
  /**
   * UNIMPLEMENTED: It needs to be decided how we will persist in-memory tables to the metastore.
   * For now, if this functionality is desired mix in the in-memory {@link OverrideCatalog}.
   */
  public  void registerTable (scala.Option<java.lang.String> databaseName, java.lang.String tableName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  /**
   * UNIMPLEMENTED: It needs to be decided how we will persist in-memory tables to the metastore.
   * For now, if this functionality is desired mix in the in-memory {@link OverrideCatalog}.
   */
  public  void unregisterTable (scala.Option<java.lang.String> databaseName, java.lang.String tableName) { throw new RuntimeException(); }
  public  void unregisterAllTables () { throw new RuntimeException(); }
}
