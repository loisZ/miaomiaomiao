package org.apache.spark.repl;
/**
 * <i>scala.tools.nsc.Settings</i> implementation adding Spark-specific REPL
 * command line options.
 */
public  class SparkRunnerSettings extends scala.tools.nsc.Settings {
  public   SparkRunnerSettings (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> error) { throw new RuntimeException(); }
  public  scala.tools.nsc.settings.MutableSettings.MultiStringSetting loadfiles () { throw new RuntimeException(); }
}
