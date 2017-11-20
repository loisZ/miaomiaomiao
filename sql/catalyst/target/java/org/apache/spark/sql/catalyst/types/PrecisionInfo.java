package org.apache.spark.sql.catalyst.types;
/** Precision parameters for a Decimal */
public  class PrecisionInfo implements scala.Product, scala.Serializable {
  public  int precision () { throw new RuntimeException(); }
  public  int scale () { throw new RuntimeException(); }
  // not preceding
  public   PrecisionInfo (int precision, int scale) { throw new RuntimeException(); }
}
