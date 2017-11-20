package org.apache.spark.mllib.linalg;
/**
 * User-defined type for {@link Vector} which allows easy interaction with SQL
 * via {@link org.apache.spark.sql.SchemaRDD}.
 */
public  class VectorUDT extends org.apache.spark.sql.catalyst.types.UserDefinedType<org.apache.spark.mllib.linalg.Vector> {
  public   VectorUDT () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType sqlType () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Row serialize (Object obj) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector deserialize (Object datum) { throw new RuntimeException(); }
  public  java.lang.String pyUDT () { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.mllib.linalg.Vector> userClass () { throw new RuntimeException(); }
}
