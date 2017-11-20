package org.apache.spark.sql.catalyst;
public abstract class AbstractSparkSQLParser extends scala.util.parsing.combinator.syntactical.StandardTokenParsers implements scala.util.parsing.combinator.PackratParsers {
  public   AbstractSparkSQLParser () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (java.lang.String input) { throw new RuntimeException(); }
  protected  class Keyword implements scala.Product, scala.Serializable {
    public  java.lang.String str () { throw new RuntimeException(); }
    // not preceding
    public   Keyword (java.lang.String str) { throw new RuntimeException(); }
  }
  // no position
  protected  class Keyword extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword> implements scala.Serializable {
    // not preceding
    public   Keyword () { throw new RuntimeException(); }
  }
  protected abstract  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> start () ;
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> wholeInput () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> restInput () { throw new RuntimeException(); }
}
