package org.apache.spark.util.random;
public  class RandomSamplerSuite extends org.scalatest.FunSuite implements org.scalatest.Matchers {
  public   RandomSamplerSuite () { throw new RuntimeException(); }
  /**
   * My statistical testing methodology is to run a Kolmogorov-Smirnov (KS) test
   * between the random samplers and simple reference samplers (known to work correctly).
   * The sampling gap sizes between chosen samples should show up as having the same
   * distributions between test and reference, if things are working properly.  That is,
   * the KS test will fail to strongly reject the null hypothesis that the distributions of
   * sampling gaps are the same.
   * There are no actual KS tests implemented for scala (that I can find) - and so what I
   * have done here is pre-compute "D" - the KS statistic - that corresponds to a "weak"
   * p-value for a particular sample size.  I can then test that my measured KS stats
   * are less than D.  Computing D-values is easy, and implemented below.
   * <p>
   * I used the scipy 'kstwobign' distribution to pre-compute my D value:
   * <p>
   * def ksdval(q=0.1, n=1000):
   *     en = np.sqrt(float(n) / 2.0)
   *     return stats.kstwobign.isf(float(q)) / (en + 0.12 + 0.11 / en)
   * <p>
   * When comparing KS stats I take the median of a small number of independent test runs
   * to compensate for the issue that any sampled statistic will show "false positive" with
   * some probability.  Even when two distributions are the same, they will register as
   * different 10% of the time at a p-value of 0.1
   */
  public  int sampleSize () { throw new RuntimeException(); }
  public  double D () { throw new RuntimeException(); }
  public  java.util.Random rngSeed () { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Iterator<T> sample (scala.collection.Iterator<T> data, double f) { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Iterator<T> sampleWR (scala.collection.Iterator<T> data, double f) { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> gaps (scala.collection.Iterator<java.lang.Object> data) { throw new RuntimeException(); }
  public  double[] cumulativeDist (int[] hist) { throw new RuntimeException(); }
  public  scala.Tuple2<double[], double[]> cumulants (int[] d1, int[] d2, int ss) { throw new RuntimeException(); }
  public  double KSD (double[] cdf1, double[] cdf2) { throw new RuntimeException(); }
  public  double medianKSD (scala.Function0<scala.collection.Iterator<java.lang.Object>> data1, scala.Function0<scala.collection.Iterator<java.lang.Object>> data2, int m) { throw new RuntimeException(); }
}
