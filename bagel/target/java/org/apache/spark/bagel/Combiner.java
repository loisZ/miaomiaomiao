package org.apache.spark.bagel;
public  interface Combiner<M extends java.lang.Object, C extends java.lang.Object> {
  public  C createCombiner (M msg) ;
  public  C mergeMsg (C combiner, M msg) ;
  public  C mergeCombiners (C a, C b) ;
}
