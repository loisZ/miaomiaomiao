package org.apache.spark;
/**
 * Listener class used for testing when any item has been cleaned by the Cleaner class.
 */
public  interface CleanerListener {
  public  void rddCleaned (int rddId) ;
  public  void shuffleCleaned (int shuffleId) ;
  public  void broadcastCleaned (long broadcastId) ;
}
