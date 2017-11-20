package org.apache.spark.sql.execution;
public  class Student implements scala.Product, scala.Serializable {
  public  int sid () { throw new RuntimeException(); }
  public  int gpa () { throw new RuntimeException(); }
  // not preceding
  public   Student (int sid, int gpa) { throw new RuntimeException(); }
}
