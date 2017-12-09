package org.apache.spark.sql.catalyst.types;
public abstract class DataType {
  // no position
  static private  class JSortedObject$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JSortedObject$ MODULE$ = null;
    public   JSortedObject$ () { throw new RuntimeException(); }
    public  scala.Option<scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>>> unapplySeq (org.json4s.JsonAST.JValue value) { throw new RuntimeException(); }
  }
  // no position
  static private  class CaseClassStringParser$ implements scala.util.parsing.combinator.RegexParsers {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CaseClassStringParser$ MODULE$ = null;
    public   CaseClassStringParser$ () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> primitiveType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> fixedDecimalType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> arrayType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> mapType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.StructField> structField () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.Object> boolVal () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> structType () { throw new RuntimeException(); }
    protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> dataType () { throw new RuntimeException(); }
    /**
     * Parses a string representation of a DataType.
     * <p>
     * TODO: Generate parser as pickler...
     */
    public  org.apache.spark.sql.catalyst.types.DataType apply (java.lang.String asString) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.sql.catalyst.types.DataType fromJson (java.lang.String json) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.types.DataType parseDataType (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  static private  org.apache.spark.sql.catalyst.types.StructField parseStructField (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.DataType fromCaseClassString (java.lang.String string) { throw new RuntimeException(); }
  static protected  void buildFormattedString (org.apache.spark.sql.catalyst.types.DataType dataType, java.lang.String prefix, scala.collection.mutable.StringBuilder builder) { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring nullability of ArrayType, MapType, StructType.
   */
  static public  boolean equalsIgnoreNullability (org.apache.spark.sql.catalyst.types.DataType left, org.apache.spark.sql.catalyst.types.DataType right) { throw new RuntimeException(); }
  public   DataType () { throw new RuntimeException(); }
  /** Matches any expression that evaluates to this DataType */
  public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression a) { throw new RuntimeException(); }
  public  boolean isPrimitive () { throw new RuntimeException(); }
  public  java.lang.String typeName () { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue jsonValue () { throw new RuntimeException(); }
  public  java.lang.String json () { throw new RuntimeException(); }
  public  java.lang.String prettyJson () { throw new RuntimeException(); }
}
