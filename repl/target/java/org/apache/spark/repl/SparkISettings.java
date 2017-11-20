package org.apache.spark.repl;
/** Utility methods for the Interpreter. */
public  class SparkISettings implements org.apache.spark.Logging {
  public   SparkISettings (org.apache.spark.repl.SparkIMain intp) { throw new RuntimeException(); }
  /** A list of paths where :load should look */
  public  scala.collection.immutable.List<java.lang.String> loadPath () { throw new RuntimeException(); }
  /** Set this to true to see repl machinery under -Yrich-exceptions.
   */
  public  boolean showInternalStackTraces () { throw new RuntimeException(); }
  /** The maximum length of toString to use when printing the result
   *  of an evaluation.  0 means no maximum.  If a printout requires
   *  more than this number of characters, then the printout is
   *  truncated.
   */
  public  int maxPrintString () { throw new RuntimeException(); }
  /** The maximum number of completion candidates to print for tab
   *  completion without requiring confirmation.
   */
  public  int maxAutoprintCompletion () { throw new RuntimeException(); }
  /** String unwrapping can be disabled if it is causing issues.
   *  Settings this to false means you will see Strings like "$iw.$iw.".
   */
  public  boolean unwrapStrings () { throw new RuntimeException(); }
  public  boolean deprecation () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allSettings () { throw new RuntimeException(); }
  private  java.lang.String allSettingsString () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
