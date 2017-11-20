package org.apache.spark.util.random;
/**
 * :: DeveloperApi ::
 * A sampler for sampling with replacement, based on values drawn from Poisson distribution.
 * <p>
 * @param fraction the sampling fraction (with replacement)
 * @tparam T item type
 */
public  class PoissonSampler<T extends java.lang.Object> implements org.apache.spark.util.random.RandomSampler<T, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   PoissonSampler (double fraction, scala.reflect.ClassTag<T> evidence$2) { throw new RuntimeException(); }
  private  org.apache.commons.math3.distribution.PoissonDistribution rng () { throw new RuntimeException(); }
  private  java.util.Random rngGap () { throw new RuntimeException(); }
  public  void setSeed (long seed) { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> sample (scala.collection.Iterator<T> items) { throw new RuntimeException(); }
  public  org.apache.spark.util.random.PoissonSampler<T> clone () { throw new RuntimeException(); }
}
