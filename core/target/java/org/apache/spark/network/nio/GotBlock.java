package org.apache.spark.network.nio;
public  class GotBlock implements scala.Product, scala.Serializable {
  public  org.apache.spark.storage.BlockId id () { throw new RuntimeException(); }
  public  java.nio.ByteBuffer data () { throw new RuntimeException(); }
  // not preceding
  public   GotBlock (org.apache.spark.storage.BlockId id, java.nio.ByteBuffer data) { throw new RuntimeException(); }
}
