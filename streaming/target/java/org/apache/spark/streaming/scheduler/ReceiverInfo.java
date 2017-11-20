package org.apache.spark.streaming.scheduler;
/**
 * :: DeveloperApi ::
 * Class having information about a receiver
 */
public  class ReceiverInfo implements scala.Product, scala.Serializable {
  // not preceding
  public  int streamId () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  akka.actor.ActorRef actor () { throw new RuntimeException(); }
  public  boolean active () { throw new RuntimeException(); }
  public  java.lang.String location () { throw new RuntimeException(); }
  public  java.lang.String lastErrorMessage () { throw new RuntimeException(); }
  public  java.lang.String lastError () { throw new RuntimeException(); }
  // not preceding
  public   ReceiverInfo (int streamId, java.lang.String name, akka.actor.ActorRef actor, boolean active, java.lang.String location, java.lang.String lastErrorMessage, java.lang.String lastError) { throw new RuntimeException(); }
}
