package org.apache.spark.sql.catalyst;
/**
 * Support for generating catalyst schemas for scala objects.
 */
public  interface ScalaReflection {
  public  class Schema implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.catalyst.types.DataType dataType () { throw new RuntimeException(); }
    public  boolean nullable () { throw new RuntimeException(); }
    // not preceding
    public   Schema (org.apache.spark.sql.catalyst.types.DataType dataType, boolean nullable) { throw new RuntimeException(); }
  }
  // no position
  public  class Schema$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.catalyst.types.DataType, java.lang.Object, org.apache.spark.sql.catalyst.ScalaReflection.Schema> implements scala.Serializable {
    public   Schema$ () { throw new RuntimeException(); }
  }
  public  class CaseClassRelation<A extends scala.Product> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Ident(scala), scala.Product))))
    public   CaseClassRelation (scala.collection.Seq<A> data, scala.reflect.api.TypeTags.TypeTag<A> evidence$3) { throw new RuntimeException(); }
    /**
     * Implicitly added to Sequences of case class objects.  Returns a catalyst logical relation
     * for the the data in the sequence.
     */
    public  org.apache.spark.sql.catalyst.plans.logical.LocalRelation asRelation () { throw new RuntimeException(); }
  }
  /** The universe we work in (runtime or macro) */
  public  scala.reflect.api.Universe universe () ;
  /**
   * Converts Scala objects to catalyst rows / types.
   * Note: This is always called after schemaFor has been called.
   *       This ordering is important for UDT registration.
   */
  public  Object convertToCatalyst (Object a, org.apache.spark.sql.catalyst.types.DataType dataType) ;
  /** Converts Catalyst types used internally in rows to standard Scala types */
  public  Object convertToScala (Object a, org.apache.spark.sql.catalyst.types.DataType dataType) ;
  public  org.apache.spark.sql.catalyst.expressions.Row convertRowToScala (org.apache.spark.sql.catalyst.expressions.Row r, org.apache.spark.sql.catalyst.types.StructType schema) ;
  /** Returns a Sequence of attributes for the given case class type. */
  public <T extends java.lang.Object> scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributesFor (scala.reflect.api.TypeTags.TypeTag<T> evidence$1) ;
  /** Returns a catalyst DataType and its nullability for the given Scala Type using reflection. */
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.ScalaReflection.Schema schemaFor (scala.reflect.api.TypeTags.TypeTag<T> evidence$2) ;
  /** Returns a catalyst DataType and its nullability for the given Scala Type using reflection. */
  public  org.apache.spark.sql.catalyst.ScalaReflection.Schema schemaFor (org.apache.spark.sql.catalyst.ScalaReflection.universe tpe) ;
  public  scala.PartialFunction<java.lang.Object, org.apache.spark.sql.catalyst.types.DataType> typeOfObject () ;
}
