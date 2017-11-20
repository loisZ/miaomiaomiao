package org.apache.spark.ml;
/**
 * :: AlphaComponent ::
 * A fitted model, i.e., a {@link Transformer} produced by an {@link Estimator}.
 * <p>
 * @tparam M model type
 */
public abstract class Model<M extends org.apache.spark.ml.Model<M>> extends org.apache.spark.ml.Transformer {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.Model), List(TypeTree().setOriginal(Ident(newTypeName("M"))))))))
  public   Model () { throw new RuntimeException(); }
  /**
   * The parent estimator that produced this model.
   */
  public abstract  org.apache.spark.ml.Estimator<M> parent () ;
  /**
   * Fitting parameters, such that parent.fit(..., fittingParamMap) could reproduce the model.
   */
  public abstract  org.apache.spark.ml.param.ParamMap fittingParamMap () ;
}
