package org.apache.spark.ml.tuning;
/**
 * Params for {@link CrossValidator} and {@link CrossValidatorModel}.
 */
public  interface CrossValidatorParams extends org.apache.spark.ml.param.Params {
  /** param for the estimator to be cross-validated */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator () ;
  public  org.apache.spark.ml.Estimator<?> getEstimator () ;
  /** param for estimator param maps */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps () ;
  public  org.apache.spark.ml.param.ParamMap[] getEstimatorParamMaps () ;
  /** param for the evaluator for selection */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Evaluator> evaluator () ;
  public  org.apache.spark.ml.Evaluator getEvaluator () ;
  /** param for number of folds for cross validation */
  public  org.apache.spark.ml.param.IntParam numFolds () ;
  public  int getNumFolds () ;
}
