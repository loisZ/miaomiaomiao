package org.apache.spark.streaming.scheduler;
public  class RegisterReceiver implements org.apache.spark.streaming.scheduler.ReceiverTrackerMessage, scala.Product, scala.Serializable {
  public  int streamId () { throw new RuntimeException(); }
  public  java.lang.String typ () { throw new RuntimeException(); }
  public  java.lang.String host () { throw new RuntimeException(); }
  public  akka.actor.ActorRef receiverActor () { throw new RuntimeException(); }
  // not preceding
  public   RegisterReceiver (int streamId, java.lang.String typ, java.lang.String host, akka.actor.ActorRef receiverActor) { throw new RuntimeException(); }
}
