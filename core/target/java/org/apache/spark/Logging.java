package org.apache.spark;
/**
 * :: DeveloperApi ::
 * Utility trait for classes that want to log data. Creates a SLF4J logger for the class and allows
 * logging messages at different levels using methods that only evaluate parameters lazily if the
 * log level is enabled.
 * <p>
 * NOTE: DO NOT USE this class outside of Spark. It is intended as an internal utility.
 *       This will likely be changed or removed in future releases.
 */
public  interface Logging {
  public  org.slf4j.Logger log_ () ;
  public  java.lang.String logName () ;
  public  org.slf4j.Logger log () ;
  public  void logInfo (scala.Function0<java.lang.String> msg) ;
  public  void logDebug (scala.Function0<java.lang.String> msg) ;
  public  void logTrace (scala.Function0<java.lang.String> msg) ;
  public  void logWarning (scala.Function0<java.lang.String> msg) ;
  public  void logError (scala.Function0<java.lang.String> msg) ;
  public  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  public  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  public  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  public  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  public  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable) ;
  public  boolean isTraceEnabled () ;
  public  void initializeIfNecessary () ;
  public  void initializeLogging () ;
}
