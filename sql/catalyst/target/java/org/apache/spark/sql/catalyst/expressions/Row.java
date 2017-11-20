package org.apache.spark.sql.catalyst.expressions;
/**
 * Represents one row of output from a relational operator.  Allows both generic access by ordinal,
 * which will incur boxing overhead for primitives, as well as native primitive access.
 * <p>
 * It is invalid to use the native primitive interface to retrieve a value that is null, instead a
 * user must check {@link isNullAt} before attempting to retrieve a value that might be null.
 */
public  interface Row extends scala.collection.Seq<java.lang.Object>, scala.Serializable {
  public  Object apply (int i) ;
  public  boolean isNullAt (int i) ;
  public  int getInt (int i) ;
  public  long getLong (int i) ;
  public  double getDouble (int i) ;
  public  float getFloat (int i) ;
  public  boolean getBoolean (int i) ;
  public  short getShort (int i) ;
  public  byte getByte (int i) ;
  public  java.lang.String getString (int i) ;
  public <T extends java.lang.Object> T getAs (int i) ;
  public  java.lang.String toString () ;
  public  org.apache.spark.sql.catalyst.expressions.Row copy () ;
  /** Returns true if there are any NULL values in this row. */
  public  boolean anyNull () ;
}
