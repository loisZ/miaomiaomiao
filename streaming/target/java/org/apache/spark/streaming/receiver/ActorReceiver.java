package org.apache.spark.streaming.receiver;
/**
 * Provides Actors as receivers for receiving stream.
 * <p>
 * As Actors can also be used to receive data from almost any stream source.
 * A nice set of abstraction(s) for actors as receivers is already provided for
 * a few general cases. It is thus exposed as an API where user may come with
 * their own Actor to run as receiver for Spark Streaming input source.
 * <p>
 * This starts a supervisor actor which starts workers and also provides
 * [http://doc.akka.io/docs/akka/snapshot/scala/fault-tolerance.html fault-tolerance].
 * <p>
 * Here's a way to start more supervisor/workers as its children.
 * <p>
 * @example <pre><code>
 *  context.parent ! Props(new Supervisor)
 * &lt;/code&gt;&lt;/pre&gt; OR &lt;pre&gt;&lt;code&gt;
 *  context.parent ! Props(new Worker, "Worker")
 * </code></pre>
 */
public  class ActorReceiver<T extends java.lang.Object> extends org.apache.spark.streaming.receiver.Receiver<T> implements org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   ActorReceiver (akka.actor.Props props, java.lang.String name, org.apache.spark.storage.StorageLevel storageLevel, akka.actor.SupervisorStrategy receiverSupervisorStrategy, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  protected  akka.actor.ActorRef supervisor () { throw new RuntimeException(); }
  public  class Supervisor implements akka.actor.Actor {
    public   Supervisor () { throw new RuntimeException(); }
    public  akka.actor.SupervisorStrategy supervisorStrategy () { throw new RuntimeException(); }
    public  akka.actor.ActorRef worker () { throw new RuntimeException(); }
    public  java.util.concurrent.atomic.AtomicInteger n () { throw new RuntimeException(); }
    public  java.util.concurrent.atomic.AtomicInteger hiccups () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  }
  public  void onStart () { throw new RuntimeException(); }
  public  void onStop () { throw new RuntimeException(); }
}
