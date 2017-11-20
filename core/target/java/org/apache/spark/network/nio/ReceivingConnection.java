package org.apache.spark.network.nio;
public  class ReceivingConnection extends org.apache.spark.network.nio.Connection {
  public   ReceivingConnection (java.nio.channels.SocketChannel channel_, java.nio.channels.Selector selector_, org.apache.spark.network.nio.ConnectionId id_, org.apache.spark.SecurityManager securityMgr_) { throw new RuntimeException(); }
  public  boolean isSaslComplete () { throw new RuntimeException(); }
  public  class Inbox {
    public   Inbox () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.network.nio.BufferMessage> messages () { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.network.nio.MessageChunk> getChunk (org.apache.spark.network.nio.MessageChunkHeader header) { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.network.nio.BufferMessage> getMessageForChunk (org.apache.spark.network.nio.MessageChunk chunk) { throw new RuntimeException(); }
    public  void removeMessage (org.apache.spark.network.nio.Message message) { throw new RuntimeException(); }
  }
  private  org.apache.spark.network.nio.ConnectionManagerId inferredRemoteManagerId () { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.ConnectionManagerId getRemoteConnectionManagerId () { throw new RuntimeException(); }
  private  void processConnectionManagerId (org.apache.spark.network.nio.MessageChunkHeader header) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.ReceivingConnection.Inbox inbox () { throw new RuntimeException(); }
  public  java.nio.ByteBuffer headerBuffer () { throw new RuntimeException(); }
  public  scala.Function2<org.apache.spark.network.nio.Connection, org.apache.spark.network.nio.Message, scala.runtime.BoxedUnit> onReceiveCallback () { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.MessageChunk currentChunk () { throw new RuntimeException(); }
  public  boolean read () { throw new RuntimeException(); }
  public  void onReceive (scala.Function2<org.apache.spark.network.nio.Connection, org.apache.spark.network.nio.Message, scala.runtime.BoxedUnit> callback) { throw new RuntimeException(); }
  public  boolean changeInterestForRead () { throw new RuntimeException(); }
  public  boolean changeInterestForWrite () { throw new RuntimeException(); }
  public  void registerInterest () { throw new RuntimeException(); }
  public  void unregisterInterest () { throw new RuntimeException(); }
  public  boolean resetForceReregister () { throw new RuntimeException(); }
}
