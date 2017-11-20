package org.apache.spark.sql.catalyst.expressions;
public  class AttributeMap<A extends java.lang.Object> implements scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Attribute, A>, scala.Serializable {
  static public <A extends java.lang.Object> org.apache.spark.sql.catalyst.expressions.AttributeMap<A> apply (scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, A>> kvs) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   AttributeMap (scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, A>> baseMap) { throw new RuntimeException(); }
  public  scala.Option<A> get (org.apache.spark.sql.catalyst.expressions.Attribute k) { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, A>> iterator () { throw new RuntimeException(); }
}
