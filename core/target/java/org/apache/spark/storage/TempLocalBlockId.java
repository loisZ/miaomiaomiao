package org.apache.spark.storage;
/** Id associated with temporary local data managed as blocks. Not serializable. */
public  class TempLocalBlockId extends org.apache.spark.storage.BlockId implements scala.Product, scala.Serializable {
  public  java.util.UUID id () { throw new RuntimeException(); }
  // not preceding
  public   TempLocalBlockId (java.util.UUID id) { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
}
