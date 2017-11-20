package org.apache.spark.repl;
/**
 *  Machinery for the asynchronous initialization of the repl.
 */
public  interface SparkILoopInit {
  /** Print a welcome message */
  public  void printWelcome () ;
  public  void asyncMessage (java.lang.String msg) ;
  public  java.util.concurrent.locks.ReentrantLock initLock () ;
  public  java.util.concurrent.locks.Condition initCompilerCondition () ;
  public  java.util.concurrent.locks.Condition initLoopCondition () ;
  public  long initStart () ;
  public <T extends java.lang.Object> T withLock (scala.Function0<T> body) ;
  public  boolean initIsComplete () ;
  public  java.lang.String initError () ;
  public  java.lang.String elapsed () ;
  public  void initializedCallback () ;
  public  java.util.concurrent.Future<scala.runtime.BoxedUnit> createAsyncListener () ;
  public  boolean awaitInitialized () ;
  public  scala.collection.immutable.List<scala.Function0<scala.runtime.BoxedUnit>> postInitThunks () ;
  public  void postInitialization () ;
  public  void initializeSpark () ;
  public  scala.collection.immutable.List<scala.Function0<scala.runtime.BoxedUnit>> pendingThunks () ;
  public  void addThunk (scala.Function0<scala.runtime.BoxedUnit> body) ;
  public  void runThunks () ;
}
