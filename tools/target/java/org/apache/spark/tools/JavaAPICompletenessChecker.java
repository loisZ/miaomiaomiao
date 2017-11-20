package org.apache.spark.tools;
// no position
/**
 * A tool for identifying methods that need to be ported from Scala to the Java API.
 * <p>
 * It uses reflection to find methods in the Scala API and rewrites those methods' signatures
 * into appropriate Java equivalents.  If those equivalent methods have not been implemented in
 * the Java API, they are printed.
 */
public  class JavaAPICompletenessChecker {
  static private  org.apache.spark.tools.SparkType parseType (java.lang.String typeStr) { throw new RuntimeException(); }
  static private  scala.collection.Seq<org.apache.spark.tools.SparkType> parseTypeList (java.lang.String typeStr) { throw new RuntimeException(); }
  static private  org.apache.spark.tools.SparkType parseReturnType (java.lang.String typeStr) { throw new RuntimeException(); }
  static private  org.apache.spark.tools.SparkMethod toSparkMethod (java.lang.reflect.Method method) { throw new RuntimeException(); }
  static private  org.apache.spark.tools.SparkType toJavaType (org.apache.spark.tools.SparkType scalaType, boolean isReturnType) { throw new RuntimeException(); }
  static private  org.apache.spark.tools.SparkMethod toJavaMethod (org.apache.spark.tools.SparkMethod method) { throw new RuntimeException(); }
  static private  boolean isExcludedByName (java.lang.reflect.Method method) { throw new RuntimeException(); }
  static private  boolean isExcludedByInterface (java.lang.reflect.Method method) { throw new RuntimeException(); }
  static private  void printMissingMethods (java.lang.Class<?> scalaClass, java.lang.Class<?> javaClass) { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
}
