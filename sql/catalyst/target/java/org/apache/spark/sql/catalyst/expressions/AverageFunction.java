package org.apache.spark.sql.catalyst.expressions;
public  class AverageFunction extends org.apache.spark.sql.catalyst.expressions.AggregateFunction implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression expr () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AggregateExpression base () { throw new RuntimeException(); }
  // not preceding
  public   AverageFunction (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.expressions.AggregateExpression base) { throw new RuntimeException(); }
  public   AverageFunction () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.types.DataType calcType () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Cast zero () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.MutableLiteral count () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.MutableLiteral sum () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Add addFunction (Object value) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.Add countFunction () { throw new RuntimeException(); }
  /** This method computes the actual average as sum / count. The tricky part here is doing division while maintaining
   * the correct type. Note: both sum and count are expression! Therefore you can use the arithmetic functions
   * already packed with Spark to implement division (just be careful and properly case all the sub-expressions,
   * check the other aggregation functions for a hint).
   */
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
