package org.apache.spark.sql.catalyst.expressions;
public abstract class NamedExpression extends org.apache.spark.sql.catalyst.expressions.Expression {
  static private  java.util.concurrent.atomic.AtomicLong curId () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.ExprId newExprId () { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.types.DataType>> unapply (org.apache.spark.sql.catalyst.expressions.NamedExpression expr) { throw new RuntimeException(); }
  public   NamedExpression () { throw new RuntimeException(); }
  public abstract  java.lang.String name () ;
  public abstract  org.apache.spark.sql.catalyst.expressions.ExprId exprId () ;
  public abstract  scala.collection.Seq<java.lang.String> qualifiers () ;
  public abstract  org.apache.spark.sql.catalyst.expressions.Attribute toAttribute () ;
  /** Returns the metadata when an expression is a reference to another expression with metadata. */
  public  org.apache.spark.sql.catalyst.util.Metadata metadata () { throw new RuntimeException(); }
  protected  java.lang.String typeSuffix () { throw new RuntimeException(); }
}
