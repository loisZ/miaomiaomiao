package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Estimates of various statistics.  The default estimation logic simply lazily multiplies the
 * corresponding statistic produced by the children.  To override this behavior, override
 * <code>statistics</code> and assign it an overriden version of <code>Statistics</code>.
 * <p>
 * '''NOTE''': concrete and/or overriden versions of statistics fields should pay attention to the
 * performance of the implementations.  The reason is that estimations might get triggered in
 * performance-critical processes, such as query plan planning.
 * <p>
 * @param sizeInBytes Physical size in bytes. For leaf operators this defaults to 1, otherwise it
 *                    defaults to the product of children's <code>sizeInBytes</code>.
 */
public  class Statistics implements scala.Product, scala.Serializable {
  public  scala.math.BigInt sizeInBytes () { throw new RuntimeException(); }
  // not preceding
  public   Statistics (scala.math.BigInt sizeInBytes) { throw new RuntimeException(); }
}
