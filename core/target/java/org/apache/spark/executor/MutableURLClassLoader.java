package org.apache.spark.executor;
/**
 * The addURL method in URLClassLoader is protected. We subclass it to make this accessible.
 * We also make changes so user classes can come before the default classes.
 */
public  interface MutableURLClassLoader {
  public  void addURL (java.net.URL url) ;
  public  java.net.URL[] getURLs () ;
}
