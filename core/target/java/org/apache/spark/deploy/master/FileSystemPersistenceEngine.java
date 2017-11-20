package org.apache.spark.deploy.master;
/**
 * Stores data in a single on-disk directory with one file per application and worker.
 * Files are deleted when applications and workers are removed.
 * <p>
 * @param dir Directory to store files. Created if non-existent (but not recursively).
 * @param serialization Used to serialize our objects.
 */
public  class FileSystemPersistenceEngine implements org.apache.spark.deploy.master.PersistenceEngine, org.apache.spark.Logging {
  public  java.lang.String dir () { throw new RuntimeException(); }
  public  akka.serialization.Serialization serialization () { throw new RuntimeException(); }
  // not preceding
  public   FileSystemPersistenceEngine (java.lang.String dir, akka.serialization.Serialization serialization) { throw new RuntimeException(); }
  public  void persist (java.lang.String name, java.lang.Object obj) { throw new RuntimeException(); }
  public  void unpersist (java.lang.String name) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Seq<T> read (java.lang.String prefix, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  private  void serializeIntoFile (java.io.File file, java.lang.Object value) { throw new RuntimeException(); }
  private <T extends java.lang.Object> T deserializeFromFile (java.io.File file, scala.reflect.ClassTag<T> m) { throw new RuntimeException(); }
}
