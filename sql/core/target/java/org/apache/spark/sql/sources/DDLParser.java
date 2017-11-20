package org.apache.spark.sql.sources;
/**
 * A parser for foreign DDL commands.
 */
public  class DDLParser extends scala.util.parsing.combinator.syntactical.StandardTokenParsers implements scala.util.parsing.combinator.PackratParsers, org.apache.spark.Logging {
  public   DDLParser () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> apply (java.lang.String input) { throw new RuntimeException(); }
  protected  class Keyword implements scala.Product, scala.Serializable {
    public  java.lang.String str () { throw new RuntimeException(); }
    // not preceding
    public   Keyword (java.lang.String str) { throw new RuntimeException(); }
  }
  // no position
  protected  class Keyword extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.sources.DDLParser.Keyword> implements scala.Serializable {
    public   Keyword () { throw new RuntimeException(); }
  }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> asParser (org.apache.spark.sql.sources.DDLParser.Keyword k) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.sources.DDLParser.Keyword CREATE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.sources.DDLParser.Keyword TEMPORARY () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.sources.DDLParser.Keyword TABLE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.sources.DDLParser.Keyword USING () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.sources.DDLParser.Keyword OPTIONS () { throw new RuntimeException(); }
  protected  java.lang.String[] reservedWords () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.SqlLexical lexical () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> ddl () { throw new RuntimeException(); }
  /**
   * CREATE TEMPORARY TABLE avroTable
   * USING org.apache.spark.sql.avro
   * OPTIONS (path "../hive/src/test/resources/data/files/episodes.avro")
   */
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> createTable () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<scala.collection.immutable.Map<java.lang.String, java.lang.String>> options () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> className () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<scala.Tuple2<java.lang.String, java.lang.String>> pair () { throw new RuntimeException(); }
}
