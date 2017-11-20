package org.apache.spark.sql.json;
public  class JSONRelation extends org.apache.spark.sql.sources.TableScan implements scala.Product, scala.Serializable {
  public  java.lang.String fileName () { throw new RuntimeException(); }
  public  double samplingRatio () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  // not preceding
  public   JSONRelation (java.lang.String fileName, double samplingRatio, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  private  org.apache.spark.rdd.RDD<java.lang.String> baseRDD () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType schema () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> buildScan () { throw new RuntimeException(); }
}
