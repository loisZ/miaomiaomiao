package org.apache.spark.deploy.worker;
// no position
/**
 ** Utilities for running commands with the spark classpath.
 */
public  class CommandUtils$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CommandUtils$ MODULE$ = null;
  public   CommandUtils$ () { throw new RuntimeException(); }
  /**
   * Build a ProcessBuilder based on the given parameters.
   * The <code>env</code> argument is exposed for testing.
   */
  public  java.lang.ProcessBuilder buildProcessBuilder (org.apache.spark.deploy.Command command, int memory, java.lang.String sparkHome, scala.Function1<java.lang.String, java.lang.String> substituteArguments, scala.collection.Seq<java.lang.String> classPaths, scala.collection.Map<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> buildCommandSeq (org.apache.spark.deploy.Command command, int memory, java.lang.String sparkHome) { throw new RuntimeException(); }
  /**
   * Build a command based on the given one, taking into account the local environment
   * of where this command is expected to run, substitute any placeholders, and append
   * any extra class paths.
   */
  private  org.apache.spark.deploy.Command buildLocalCommand (org.apache.spark.deploy.Command command, scala.Function1<java.lang.String, java.lang.String> substituteArguments, scala.collection.Seq<java.lang.String> classPath, scala.collection.Map<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  /**
   * Attention: this must always be aligned with the environment variables in the run scripts and
   * the way the JAVA_OPTS are assembled there.
   */
  private  scala.collection.Seq<java.lang.String> buildJavaOpts (org.apache.spark.deploy.Command command, int memory, java.lang.String sparkHome) { throw new RuntimeException(); }
  /** Spawn a thread that will redirect a given stream to a file */
  public  void redirectStream (java.io.InputStream in, java.io.File file) { throw new RuntimeException(); }
}
