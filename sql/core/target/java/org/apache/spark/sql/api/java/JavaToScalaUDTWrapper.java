package org.apache.spark.sql.api.java;
/**
 * Scala wrapper for a Java UserDefinedType
 */
public  class JavaToScalaUDTWrapper<UserType extends java.lang.Object> extends org.apache.spark.sql.catalyst.types.UserDefinedType<UserType> implements scala.Serializable {
  public  org.apache.spark.sql.api.java.UserDefinedType<UserType> javaUDT () { throw new RuntimeException(); }
  // not preceding
  public   JavaToScalaUDTWrapper (org.apache.spark.sql.api.java.UserDefinedType<UserType> javaUDT) { throw new RuntimeException(); }
  /** Underlying storage type for this UDT */
  public  org.apache.spark.sql.catalyst.types.DataType sqlType () { throw new RuntimeException(); }
  /** Convert the user type to a SQL datum */
  public  Object serialize (Object obj) { throw new RuntimeException(); }
  /** Convert a SQL datum to the user type */
  public  UserType deserialize (Object datum) { throw new RuntimeException(); }
  public  java.lang.Class<UserType> userClass () { throw new RuntimeException(); }
}
