package org.apache.spark.mllib.stat;
// no position
/**
 * API for statistical functions in MLlib.
 */
public  class Statistics$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Statistics$ MODULE$ = null;
  public   Statistics$ () { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Computes column-wise summary statistics for the input RDD[Vector].
   * <p>
   * @param X an RDD[Vector] for which column-wise summary statistics are to be computed.
   * @return {@link MultivariateStatisticalSummary} object containing column-wise summary statistics.
   */
  public  org.apache.spark.mllib.stat.MultivariateStatisticalSummary colStats (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Compute the Pearson correlation matrix for the input RDD of Vectors.
   * Columns with 0 covariance produce NaN entries in the correlation matrix.
   * <p>
   * @param X an RDD[Vector] for which the correlation matrix is to be computed.
   * @return Pearson correlation matrix comparing columns in X.
   */
  public  org.apache.spark.mllib.linalg.Matrix corr (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Compute the correlation matrix for the input RDD of Vectors using the specified method.
   * Methods currently supported: <code>pearson</code> (default), <code>spearman</code>.
   * <p>
   * Note that for Spearman, a rank correlation, we need to create an RDD[Double] for each column
   * and sort it in order to retrieve the ranks and then join the columns back into an RDD[Vector],
   * which is fairly costly. Cache the input RDD before calling corr with <code>method = "spearman"</code> to
   * avoid recomputing the common lineage.
   * <p>
   * @param X an RDD[Vector] for which the correlation matrix is to be computed.
   * @param method String specifying the method to use for computing correlation.
   *               Supported: <code>pearson</code> (default), <code>spearman</code>
   * @return Correlation matrix comparing columns in X.
   */
  public  org.apache.spark.mllib.linalg.Matrix corr (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X, java.lang.String method) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Compute the Pearson correlation for the input RDDs.
   * Returns NaN if either vector has 0 variance.
   * <p>
   * Note: the two input RDDs need to have the same number of partitions and the same number of
   * elements in each partition.
   * <p>
   * @param x RDD[Double] of the same cardinality as y.
   * @param y RDD[Double] of the same cardinality as x.
   * @return A Double containing the Pearson correlation between the two input RDD[Double]s
   */
  public  double corr (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Compute the correlation for the input RDDs using the specified method.
   * Methods currently supported: <code>pearson</code> (default), <code>spearman</code>.
   * <p>
   * Note: the two input RDDs need to have the same number of partitions and the same number of
   * elements in each partition.
   * <p>
   * @param x RDD[Double] of the same cardinality as y.
   * @param y RDD[Double] of the same cardinality as x.
   * @param method String specifying the method to use for computing correlation.
   *               Supported: <code>pearson</code> (default), <code>spearman</code>
   *@return A Double containing the correlation between the two input RDD[Double]s using the
   *         specified method.
   */
  public  double corr (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y, java.lang.String method) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Conduct Pearson's chi-squared goodness of fit test of the observed data against the
   * expected distribution.
   * <p>
   * Note: the two input Vectors need to have the same size.
   *       <code>observed</code> cannot contain negative values.
   *       <code>expected</code> cannot contain nonpositive values.
   * <p>
   * @param observed Vector containing the observed categorical counts/relative frequencies.
   * @param expected Vector containing the expected categorical counts/relative frequencies.
   *                 <code>expected</code> is rescaled if the <code>expected</code> sum differs from the <code>observed</code> sum.
   * @return ChiSquaredTest object containing the test statistic, degrees of freedom, p-value,
   *         the method used, and the null hypothesis.
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSqTest (org.apache.spark.mllib.linalg.Vector observed, org.apache.spark.mllib.linalg.Vector expected) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Conduct Pearson's chi-squared goodness of fit test of the observed data against the uniform
   * distribution, with each category having an expected frequency of <code>1 / observed.size</code>.
   * <p>
   * Note: <code>observed</code> cannot contain negative values.
   * <p>
   * @param observed Vector containing the observed categorical counts/relative frequencies.
   * @return ChiSquaredTest object containing the test statistic, degrees of freedom, p-value,
   *         the method used, and the null hypothesis.
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSqTest (org.apache.spark.mllib.linalg.Vector observed) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Conduct Pearson's independence test on the input contingency matrix, which cannot contain
   * negative entries or columns or rows that sum up to 0.
   * <p>
   * @param observed The contingency matrix (containing either counts or relative frequencies).
   * @return ChiSquaredTest object containing the test statistic, degrees of freedom, p-value,
   *         the method used, and the null hypothesis.
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSqTest (org.apache.spark.mllib.linalg.Matrix observed) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Conduct Pearson's independence test for every feature against the label across the input RDD.
   * For each feature, the (feature, label) pairs are converted into a contingency matrix for which
   * the chi-squared statistic is computed. All label and feature values must be categorical.
   * <p>
   * @param data an <code>RDD[LabeledPoint]</code> containing the labeled dataset with categorical features.
   *             Real-valued features will be treated as categorical for each distinct value.
   * @return an array containing the ChiSquaredTestResult for every feature against the label.
   *         The order of the elements in the returned array reflects the order of input features.
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult[] chiSqTest (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data) { throw new RuntimeException(); }
}
