package org.apache.spark.mllib.feature;
/**
 * :: Experimental ::
 * Represents a StandardScaler model that can transform vectors.
 * <p>
 * @param withMean whether to center the data before scaling
 * @param withStd whether to scale the data to have unit standard deviation
 * @param mean column mean values
 * @param variance column variance values
 */
public  class StandardScalerModel implements org.apache.spark.mllib.feature.VectorTransformer {
  public  boolean withMean () { throw new RuntimeException(); }
  public  boolean withStd () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector mean () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector variance () { throw new RuntimeException(); }
  // not preceding
  public   StandardScalerModel (boolean withMean, boolean withStd, org.apache.spark.mllib.linalg.Vector mean, org.apache.spark.mllib.linalg.Vector variance) { throw new RuntimeException(); }
  private  double[] factor () { throw new RuntimeException(); }
  private  double[] shift () { throw new RuntimeException(); }
  /**
   * Applies standardization transformation on a vector.
   * <p>
   * @param vector Vector to be standardized.
   * @return Standardized vector. If the variance of a column is zero, it will return default <code>0.0</code>
   *         for the column with zero variance.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector) { throw new RuntimeException(); }
}
