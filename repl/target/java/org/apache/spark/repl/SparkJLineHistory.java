package org.apache.spark.repl;
/** Changes the default history file to not collide with the scala repl's. */
public  class SparkJLineHistory extends scala.tools.nsc.interpreter.session.JLineHistory.JLineFileHistory {
  public   SparkJLineHistory () { throw new RuntimeException(); }
  public  java.lang.String defaultFileName () { throw new RuntimeException(); }
  protected  scala.reflect.io.File historyFile () { throw new RuntimeException(); }
}
