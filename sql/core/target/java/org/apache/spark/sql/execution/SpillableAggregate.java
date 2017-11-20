package org.apache.spark.sql.execution;
public  class SpillableAggregate extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  /**
   * An aggregate that needs to be computed for each row in a group.
   * <p>
   * @param unbound Unbound version of this aggregate, used for result substitution.
   * @param aggregate A bound copy of this aggregate used to create a new aggregation buffer.
   * @param resultAttribute An attribute used to refer to the result of this aggregate in the final
   *                        output.
   */
  public  class ComputedAggregate implements scala.Product, scala.Serializable {
    public  org.apache.spark.sql.catalyst.expressions.AggregateExpression unbound () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.AggregateExpression aggregate () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.AttributeReference resultAttribute () { throw new RuntimeException(); }
    // not preceding
    public   ComputedAggregate (org.apache.spark.sql.catalyst.expressions.AggregateExpression unbound, org.apache.spark.sql.catalyst.expressions.AggregateExpression aggregate, org.apache.spark.sql.catalyst.expressions.AttributeReference resultAttribute) { throw new RuntimeException(); }
  }
  // no position
  public  class ComputedAggregate$ extends scala.runtime.AbstractFunction3<org.apache.spark.sql.catalyst.expressions.AggregateExpression, org.apache.spark.sql.catalyst.expressions.AggregateExpression, org.apache.spark.sql.catalyst.expressions.AttributeReference, org.apache.spark.sql.execution.SpillableAggregate.ComputedAggregate> implements scala.Serializable {
    public   ComputedAggregate$ () { throw new RuntimeException(); }
  }
  public  boolean partial () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingExpressions () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregateExpressions () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  // not preceding
  public   SpillableAggregate (boolean partial, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregateExpressions, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  /** Creates a new aggregator instance.  */
  private  org.apache.spark.sql.catalyst.expressions.AggregateFunction newAggregatorInstance () { throw new RuntimeException(); }
  /**
   * A map of substitutions that are used to insert the aggregate expressions and grouping
   * expression into the final result expression.
   */
  protected  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Attribute> resultMap () { throw new RuntimeException(); }
  /**
   * Substituted version of aggregateExpressions expressions which are used to compute final
   * output rows given a group and the result of all aggregate computations.
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> execute () { throw new RuntimeException(); }
  /**
   * This method takes an iterator as an input. The iterator is drained either by aggregating
   * values or by spilling to disk. Spilled partitions are successively aggregated one by one
   * until no data is left.
   * <p>
   * @param input the input iterator
   * @param memorySize the memory size limit for this aggregate
   * @return the result of applying the projection
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row> generateIterator (scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row> input, long memorySize, int numPartitions) { throw new RuntimeException(); }
}
