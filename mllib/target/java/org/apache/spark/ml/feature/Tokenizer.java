package org.apache.spark.ml.feature;
/**
 * :: AlphaComponent ::
 * A tokenizer that converts the input string to lowercase and then splits it by white spaces.
 */
public  class Tokenizer extends org.apache.spark.ml.UnaryTransformer<java.lang.String, scala.collection.Seq<java.lang.String>, org.apache.spark.ml.feature.Tokenizer> {
  public   Tokenizer () { throw new RuntimeException(); }
  protected  scala.Function1<java.lang.String, scala.collection.Seq<java.lang.String>> createTransformFunc (org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.catalyst.types.DataType inputType) { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.types.DataType outputDataType () { throw new RuntimeException(); }
}
