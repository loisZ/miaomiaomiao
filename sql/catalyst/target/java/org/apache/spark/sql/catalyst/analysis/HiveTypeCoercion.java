package org.apache.spark.sql.catalyst.analysis;
/**
 * A collection of {@link Rule Rules} that can be used to coerce differing types that
 * participate in operations into compatible ones.  Most of these rules are based on Hive semantics,
 * but they do not introduce any dependencies on the hive codebase.  For this reason they remain in
 * Catalyst until we have a more standard set of coercions.
 */
public  interface HiveTypeCoercion {
  // no position
  /**
   * Applies any changes to {@link AttributeReference} data types that are made by other rules to
   * instances higher in the query tree.
   */
  public  class PropagateTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   PropagateTypes$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Converts string "NaN"s that are in binary operators with a NaN-able types (Float / Double) to
   * the appropriate numeric equivalent.
   */
  public  class ConvertNaNs$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ConvertNaNs$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.Literal stringNaN () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Widens numeric types and converts strings to numbers when appropriate.
   * <p>
   * Loosely based on rules from "Hadoop: The Definitive Guide" 2nd edition, by Tom White
   * <p>
   * The implicit conversion rules can be summarized as follows:
   *   - Any integral numeric type can be implicitly converted to a wider type.
   *   - All the integral numeric types, FLOAT, and (perhaps surprisingly) STRING can be implicitly
   *     converted to DOUBLE.
   *   - TINYINT, SMALLINT, and INT can all be converted to FLOAT.
   *   - BOOLEAN types cannot be converted to any other type.
   * <p>
   * Additionally, all types when UNION-ed with strings will be promoted to strings.
   * Other string conversions are handled by PromoteStrings.
   * <p>
   * Widening types might result in loss of precision in the following cases:
   * - IntegerType to FloatType
   * - LongType to FloatType
   * - LongType to DoubleType
   */
  public  class WidenTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   WidenTypes$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Promotes strings that appear in arithmetic expressions.
   */
  public  class PromoteStrings$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   PromoteStrings$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Calculates and propagates precision for fixed-precision decimals. Hive has a number of
   * rules for this based on the SQL standard and MS SQL:
   * https://cwiki.apache.org/confluence/download/attachments/27362075/Hive_Decimal_Precision_Scale_Support.pdf
   * <p>
   * In particular, if we have expressions e1 and e2 with precision/scale p1/s2 and p2/s2
   * respectively, then the following operations have the following precision / scale:
   * <p>
   *   Operation    Result Precision                        Result Scale
   *   ------------------------------------------------------------------------
   *   e1 + e2      max(s1, s2) + max(p1-s1, p2-s2) + 1     max(s1, s2)
   *   e1 - e2      max(s1, s2) + max(p1-s1, p2-s2) + 1     max(s1, s2)
   *   e1 * e2      p1 + p2 + 1                             s1 + s2
   *   e1 / e2      p1 - s1 + s2 + max(6, s1 + p2 + 1)      max(6, s1 + p2 + 1)
   *   e1 % e2      min(p1-s1, p2-s2) + max(s1, s2)         max(s1, s2)
   *   sum(e1)      p1 + 10                                 s1
   *   avg(e1)      p1 + 4                                  s1 + 4
   * <p>
   * Catalyst also has unlimited-precision decimals. For those, all ops return unlimited precision.
   * <p>
   * To implement the rules for fixed-precision types, we introduce casts to turn them to unlimited
   * precision, do the math on unlimited-precision numbers, then introduce casts back to the
   * required fixed precision. This allows us to do all rounding and overflow handling in the
   * cast-to-fixed-precision operator.
   * <p>
   * In addition, when mixing non-decimal types with decimals, we use the following rules:
   * - BYTE gets turned into DECIMAL(3, 0)
   * - SHORT gets turned into DECIMAL(5, 0)
   * - INT gets turned into DECIMAL(10, 0)
   * - LONG gets turned into DECIMAL(20, 0)
   * - FLOAT and DOUBLE cause fixed-length decimals to turn into DOUBLE (this is the same as Hive,
   *   but note that unlimited decimals are considered bigger than doubles in WidenTypes)
   */
  public  class DecimalPrecision$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   DecimalPrecision$ () { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.types.DataType, org.apache.spark.sql.catalyst.types.DecimalType> intTypeToFixed () { throw new RuntimeException(); }
    public  boolean isFloat (org.apache.spark.sql.catalyst.types.DataType t) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Changes Boolean values to Bytes so that expressions like true < false can be Evaluated.
   */
  public  class BooleanComparisons$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   BooleanComparisons$ () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> trueValues () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Literal> falseValues () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Casts to/from {@link BooleanType} are transformed into comparisons since
   * the JVM does not consider Booleans to be numeric types.
   */
  public  class BooleanCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   BooleanCasts$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * When encountering a cast from a string representing a valid fractional number to an integral
   * type the jvm will throw a <code>java.lang.NumberFormatException</code>.  Hive, in contrast, returns the
   * truncated version of this number.
   */
  public  class StringToIntegralCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   StringToIntegralCasts$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * This ensure that the types for various functions are as expected.
   */
  public  class FunctionArgumentConversion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   FunctionArgumentConversion$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Hive only performs integral division with the DIV operator. The arguments to / are always
   * converted to fractional types.
   */
  public  class Division$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   Division$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Coerces the type of different branches of a CASE WHEN statement to a common type.
   */
  public  class CaseWhenCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   CaseWhenCoercion$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.PropagateTypes$ PropagateTypes () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.ConvertNaNs$ ConvertNaNs () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.WidenTypes$ WidenTypes () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.PromoteStrings$ PromoteStrings () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.DecimalPrecision$ DecimalPrecision () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.BooleanComparisons$ BooleanComparisons () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.BooleanCasts$ BooleanCasts () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.StringToIntegralCasts$ StringToIntegralCasts () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.FunctionArgumentConversion$ FunctionArgumentConversion () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.Division$ Division () ;
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.CaseWhenCoercion$ CaseWhenCoercion () ;
}
