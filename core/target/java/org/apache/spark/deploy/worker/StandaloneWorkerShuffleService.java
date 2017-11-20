package org.apache.spark.deploy.worker;
/**
 * Provides a server from which Executors can read shuffle files (rather than reading directly from
 * each other), to provide uninterrupted access to the files in the face of executors being turned
 * off or killed.
 * <p>
 * Optionally requires SASL authentication in order to read. See {@link SecurityManager}.
 */
public  class StandaloneWorkerShuffleService implements org.apache.spark.Logging {
  public   StandaloneWorkerShuffleService (org.apache.spark.SparkConf sparkConf, org.apache.spark.SecurityManager securityManager) { throw new RuntimeException(); }
  private  boolean enabled () { throw new RuntimeException(); }
  private  int port () { throw new RuntimeException(); }
  private  boolean useSasl () { throw new RuntimeException(); }
  private  org.apache.spark.network.util.TransportConf transportConf () { throw new RuntimeException(); }
  private  org.apache.spark.network.shuffle.ExternalShuffleBlockHandler blockHandler () { throw new RuntimeException(); }
  private  org.apache.spark.network.TransportContext transportContext () { throw new RuntimeException(); }
  private  org.apache.spark.network.server.TransportServer server () { throw new RuntimeException(); }
  /** Starts the external shuffle service if the user has configured us to. */
  public  void startIfEnabled () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}
