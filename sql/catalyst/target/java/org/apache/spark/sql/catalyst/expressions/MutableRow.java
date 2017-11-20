package org.apache.spark.sql.catalyst.expressions;
/**
 * An extended interface to {@link Row} that allows the values for each column to be updated.  Setting
 * a value through a primitive function implicitly marks that column as not null.
 */
public  interface MutableRow extends org.apache.spark.sql.catalyst.expressions.Row {
  public  void setNullAt (int i) ;
  public  void update (int ordinal, Object value) ;
  public  void setInt (int ordinal, int value) ;
  public  void setLong (int ordinal, long value) ;
  public  void setDouble (int ordinal, double value) ;
  public  void setBoolean (int ordinal, boolean value) ;
  public  void setShort (int ordinal, short value) ;
  public  void setByte (int ordinal, byte value) ;
  public  void setFloat (int ordinal, float value) ;
  public  void setString (int ordinal, java.lang.String value) ;
}
