package org.apache.spark.sql.catalyst;
public  class MultipleConstructorsData implements scala.Product, scala.Serializable {
  public  int a () { throw new RuntimeException(); }
  public  java.lang.String b () { throw new RuntimeException(); }
  public  double c () { throw new RuntimeException(); }
  // not preceding
  public   MultipleConstructorsData (int a, java.lang.String b, double c) { throw new RuntimeException(); }
  public   MultipleConstructorsData (java.lang.String b, int a) { throw new RuntimeException(); }
}
