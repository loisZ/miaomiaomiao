package org.apache.spark.deploy;
/**
 * Parses and encapsulates arguments from the spark-submit script.
 * The env argument is used for testing.
 */
public  class SparkSubmitArguments {
  public   SparkSubmitArguments (scala.collection.Seq<java.lang.String> args, scala.collection.immutable.Map<java.lang.String, java.lang.String> env) { throw new RuntimeException(); }
  public  java.lang.String master () { throw new RuntimeException(); }
  public  java.lang.String deployMode () { throw new RuntimeException(); }
  public  java.lang.String executorMemory () { throw new RuntimeException(); }
  public  java.lang.String executorCores () { throw new RuntimeException(); }
  public  java.lang.String totalExecutorCores () { throw new RuntimeException(); }
  public  java.lang.String propertiesFile () { throw new RuntimeException(); }
  public  java.lang.String driverMemory () { throw new RuntimeException(); }
  public  java.lang.String driverExtraClassPath () { throw new RuntimeException(); }
  public  java.lang.String driverExtraLibraryPath () { throw new RuntimeException(); }
  public  java.lang.String driverExtraJavaOptions () { throw new RuntimeException(); }
  public  java.lang.String driverCores () { throw new RuntimeException(); }
  public  boolean supervise () { throw new RuntimeException(); }
  public  java.lang.String queue () { throw new RuntimeException(); }
  public  java.lang.String numExecutors () { throw new RuntimeException(); }
  public  java.lang.String files () { throw new RuntimeException(); }
  public  java.lang.String archives () { throw new RuntimeException(); }
  public  java.lang.String mainClass () { throw new RuntimeException(); }
  public  java.lang.String primaryResource () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> childArgs () { throw new RuntimeException(); }
  public  java.lang.String jars () { throw new RuntimeException(); }
  public  boolean verbose () { throw new RuntimeException(); }
  public  boolean isPython () { throw new RuntimeException(); }
  public  java.lang.String pyFiles () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> sparkProperties () { throw new RuntimeException(); }
  /** Default properties present in the currently defined defaults file. */
  public  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> defaultSparkProperties () { throw new RuntimeException(); }
  /**
   * Merge values from the default properties file with those specified through --conf.
   * When this is called, <code>sparkProperties</code> is already filled with configs from the latter.
   */
  private  void mergeDefaultSparkProperties () { throw new RuntimeException(); }
  /**
   * Load arguments from environment variables, Spark properties etc.
   */
  private  void loadEnvironmentArguments () { throw new RuntimeException(); }
  /** Ensure that required fields exists. Call this only once all defaults are loaded. */
  private  void checkRequiredArguments () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Fill in values by parsing user options.
   * NOTE: Any changes here must be reflected in YarnClientSchedulerBackend.
   */
  private  void parseOpts (scala.collection.Seq<java.lang.String> opts) { throw new RuntimeException(); }
  // not preceding
  private  void printUsageAndExit (int exitCode, Object unknownParam) { throw new RuntimeException(); }
}
