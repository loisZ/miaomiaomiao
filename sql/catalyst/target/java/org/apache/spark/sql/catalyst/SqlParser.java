package org.apache.spark.sql.catalyst;
/**
 * A very simple SQL parser.  Based loosely on:
 * https://github.com/stephentu/scala-sql-parser/blob/master/src/main/scala/parser.scala
 * <p>
 * Limitations:
 *  - Only supports a very limited subset of SQL.
 * <p>
 * This is currently included mostly for illustrative purposes.  Users wanting more complete support
 * for a SQL like language should checkout the HiveQL support in the sql/hive sub-project.
 */
public  class SqlParser extends org.apache.spark.sql.catalyst.AbstractSparkSQLParser {
  public   SqlParser () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> asParser (org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword k) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ABS () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ALL () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword AND () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword APPROXIMATE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword AS () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ASC () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword AVG () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword BETWEEN () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword BY () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword CACHE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword CASE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword CAST () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword COUNT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword DECIMAL () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword DESC () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword DISTINCT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword DOUBLE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ELSE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword END () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword EXCEPT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword FALSE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword FIRST () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword FROM () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword FULL () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword GROUP () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword HAVING () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword IF () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword IN () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INNER () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INSERT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INTERSECT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword INTO () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword IS () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword JOIN () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LAST () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LEFT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LIKE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LIMIT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LOWER () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword MAX () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword MIN () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword NOT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword NULL () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ON () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword OR () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword ORDER () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SORT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword OUTER () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword OVERWRITE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword REGEXP () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword RIGHT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword RLIKE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SELECT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SEMI () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SQRT () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword STRING () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SUBSTR () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SUBSTRING () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SUM () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword TABLE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword THEN () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword TIMESTAMP () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword TRUE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword UNION () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword UPPER () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword WHEN () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword WHERE () { throw new RuntimeException(); }
  protected  java.lang.String[] reservedWords () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.SqlLexical lexical () { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> assignAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> start () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> select () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> insert () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> projection () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> relations () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> relation () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> relationFactor () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> joinedRelation () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> joinConditions () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.JoinType> joinType () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> sortType () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> ordering () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.SortDirection> direction () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> expression () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> orExpression () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> andExpression () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> comparisonExpression () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> termExpression () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> productExpression () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> function () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> cast () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> literal () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> booleanLiteral () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> numericLiteral () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> sign () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> signedNumericLiteral () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Literal> unsignedNumericLiteral () { throw new RuntimeException(); }
  private  Object toNarrowestIntegerType (java.lang.String value) { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> floatLit () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> baseExpression () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> signedPrimary () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.PackratParsers.PackratParser<org.apache.spark.sql.catalyst.expressions.Expression> primary () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.expressions.Expression> dotExpressionHeader () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> dataType () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.types.DataType> fixedDecimalType () { throw new RuntimeException(); }
}
