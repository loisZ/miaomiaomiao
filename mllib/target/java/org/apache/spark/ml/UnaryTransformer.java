package org.apache.spark.ml;
/**
 * Abstract class for transformers that take one input column, apply transformation, and output the
 * result as a new column.
 */
public abstract class UnaryTransformer<IN extends java.lang.Object, OUT extends java.lang.Object, T extends org.apache.spark.ml.UnaryTransformer<IN, OUT, T>> extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.HasInputCol, org.apache.spark.ml.param.HasOutputCol, org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.UnaryTransformer), List(TypeTree().setOriginal(Ident(newTypeName("IN"))), TypeTree().setOriginal(Ident(newTypeName("OUT"))), TypeTree().setOriginal(Ident(newTypeName("T"))))))))
  public   UnaryTransformer () { throw new RuntimeException(); }
  public  T setInputCol (java.lang.String value) { throw new RuntimeException(); }
  public  T setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  /**
   * Creates the transform function using the given param map. The input param map already takes
   * account of the embedded param map. So the param values should be determined solely by the input
   * param map.
   */
  protected abstract  scala.Function1<IN, OUT> createTransformFunc (org.apache.spark.ml.param.ParamMap paramMap) ;
  /**
   * Returns the data type of the output column.
   */
  protected abstract  org.apache.spark.sql.catalyst.types.DataType outputDataType () ;
  /**
   * Validates the input type. Throw an exception if it is invalid.
   */
  protected  void validateInputType (org.apache.spark.sql.catalyst.types.DataType inputType) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
