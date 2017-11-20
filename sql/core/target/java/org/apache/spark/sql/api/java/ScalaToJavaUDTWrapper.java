package org.apache.spark.sql.api.java;
/**
 * Java wrapper for a Scala UserDefinedType
 */
public  class ScalaToJavaUDTWrapper<UserType extends java.lang.Object> extends org.apache.spark.sql.api.java.UserDefinedType<UserType> implements scala.Serializable {
  public  org.apache.spark.sql.catalyst.types.UserDefinedType<UserType> scalaUDT () { throw new RuntimeException(); }
  // not preceding
  public   ScalaToJavaUDTWrapper (org.apache.spark.sql.catalyst.types.UserDefinedType<UserType> scalaUDT) { throw new RuntimeException(); }
  /** Underlying storage type for this UDT */
  public  org.apache.spark.sql.api.java.DataType sqlType () { throw new RuntimeException(); }
  /** Convert the user type to a SQL datum */
  public  java.lang.Object serialize (Object obj) { throw new RuntimeException(); }
  /** Convert a SQL datum to the user type */
  public  UserType deserialize (Object datum) { throw new RuntimeException(); }
  public  java.lang.Class<UserType> userClass () { throw new RuntimeException(); }
}
