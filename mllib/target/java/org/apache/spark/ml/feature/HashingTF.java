package org.apache.spark.ml.feature;
/**
 * :: AlphaComponent ::
 * Maps a sequence of terms to their term frequencies using the hashing trick.
 */
public  class HashingTF extends org.apache.spark.ml.UnaryTransformer<scala.collection.Iterable<java.lang.Object>, org.apache.spark.mllib.linalg.Vector, org.apache.spark.ml.feature.HashingTF> {
  public   HashingTF () { throw new RuntimeException(); }
  /** number of features */
  public  org.apache.spark.ml.param.IntParam numFeatures () { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.HashingTF setNumFeatures (int value) { throw new RuntimeException(); }
  public  int getNumFeatures () { throw new RuntimeException(); }
  protected  scala.Function1<scala.collection.Iterable<java.lang.Object>, org.apache.spark.mllib.linalg.Vector> createTransformFunc (org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.types.DataType outputDataType () { throw new RuntimeException(); }
}
