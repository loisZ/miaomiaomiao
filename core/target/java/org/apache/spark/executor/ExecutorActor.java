package org.apache.spark.executor;
/**
 * Actor that runs inside of executors to enable driver -> executor RPC.
 */
public  class ExecutorActor implements akka.actor.Actor, org.apache.spark.util.ActorLogReceive, org.apache.spark.Logging {
  public   ExecutorActor (java.lang.String executorId) { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveWithLogging () { throw new RuntimeException(); }
}
