package org.apache.spark.mllib.tree.configuration;
/**
 * :: Experimental ::
 * Stores all the configuration options for tree construction
 * @param algo  Learning goal.  Supported:
 *              {@link org.apache.spark.mllib.tree.configuration.Algo.Classification},
 *              {@link org.apache.spark.mllib.tree.configuration.Algo.Regression}
 * @param impurity Criterion used for information gain calculation.
 *                 Supported for Classification: {@link org.apache.spark.mllib.tree.impurity.Gini},
 *                  {@link org.apache.spark.mllib.tree.impurity.Entropy}.
 *                 Supported for Regression: {@link org.apache.spark.mllib.tree.impurity.Variance}.
 * @param maxDepth Maximum depth of the tree.
 *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
 * @param numClasses Number of classes for classification.
 *                                    (Ignored for regression.)
 *                                    Default value is 2 (binary classification).
 * @param maxBins Maximum number of bins used for discretizing continuous features and
 *                for choosing how to split on features at each node.
 *                More bins give higher granularity.
 * @param quantileCalculationStrategy Algorithm for calculating quantiles.  Supported:
 *                             {@link org.apache.spark.mllib.tree.configuration.QuantileStrategy.Sort}
 * @param categoricalFeaturesInfo A map storing information about the categorical variables and the
 *                                number of discrete values they take. For example, an entry (n ->
 *                                k) implies the feature n is categorical with k categories 0,
 *                                1, 2, ... , k-1. It's important to note that features are
 *                                zero-indexed.
 * @param minInstancesPerNode Minimum number of instances each child must have after split.
 *                            Default value is 1. If a split cause left or right child
 *                            to have less than minInstancesPerNode,
 *                            this split will not be considered as a valid split.
 * @param minInfoGain Minimum information gain a split must get. Default value is 0.0.
 *                    If a split has less information gain than minInfoGain,
 *                    this split will not be considered as a valid split.
 * @param maxMemoryInMB Maximum memory in MB allocated to histogram aggregation. Default value is
 *                      256 MB.
 * @param subsamplingRate Fraction of the training data used for learning decision tree.
 * @param useNodeIdCache If this is true, instead of passing trees to executors, the algorithm will
 *                      maintain a separate RDD of node Id cache for each row.
 * @param checkpointDir If the node Id cache is used, it will help to checkpoint
 *                      the node Id cache periodically. This is the checkpoint directory
 *                      to be used for the node Id cache.
 * @param checkpointInterval How often to checkpoint when the node Id cache gets updated.
 *                           E.g. 10 means that the cache will get checkpointed every 10 updates.
 */
public  class Strategy implements scala.Serializable {
  /**
   * Construct a default set of parameters for {@link org.apache.spark.mllib.tree.DecisionTree}
   * @param algo  "Classification" or "Regression"
   */
  static public  org.apache.spark.mllib.tree.configuration.Strategy defaultStrategy (java.lang.String algo) { throw new RuntimeException(); }
  public  scala.Enumeration.Value algo () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity impurity () { throw new RuntimeException(); }
  public  void setImpurity (org.apache.spark.mllib.tree.impurity.Impurity x$1) { throw new RuntimeException(); }
  public  int maxDepth () { throw new RuntimeException(); }
  public  void setMaxDepth (int x$1) { throw new RuntimeException(); }
  public  int numClasses () { throw new RuntimeException(); }
  public  void setNumClasses (int x$1) { throw new RuntimeException(); }
  public  int maxBins () { throw new RuntimeException(); }
  public  void setMaxBins (int x$1) { throw new RuntimeException(); }
  public  scala.Enumeration.Value quantileCalculationStrategy () { throw new RuntimeException(); }
  public  void setQuantileCalculationStrategy (scala.Enumeration.Value x$1) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo () { throw new RuntimeException(); }
  public  int minInstancesPerNode () { throw new RuntimeException(); }
  public  void setMinInstancesPerNode (int x$1) { throw new RuntimeException(); }
  public  double minInfoGain () { throw new RuntimeException(); }
  public  void setMinInfoGain (double x$1) { throw new RuntimeException(); }
  public  int maxMemoryInMB () { throw new RuntimeException(); }
  public  void setMaxMemoryInMB (int x$1) { throw new RuntimeException(); }
  public  double subsamplingRate () { throw new RuntimeException(); }
  public  void setSubsamplingRate (double x$1) { throw new RuntimeException(); }
  public  boolean useNodeIdCache () { throw new RuntimeException(); }
  public  void setUseNodeIdCache (boolean x$1) { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> checkpointDir () { throw new RuntimeException(); }
  public  void setCheckpointDir (scala.Option<java.lang.String> x$1) { throw new RuntimeException(); }
  public  int checkpointInterval () { throw new RuntimeException(); }
  public  void setCheckpointInterval (int x$1) { throw new RuntimeException(); }
  // not preceding
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int minInstancesPerNode, double minInfoGain, int maxMemoryInMB, double subsamplingRate, boolean useNodeIdCache, scala.Option<java.lang.String> checkpointDir, int checkpointInterval) { throw new RuntimeException(); }
  public  boolean isMulticlassClassification () { throw new RuntimeException(); }
  public  boolean isMulticlassWithCategoricalFeatures () { throw new RuntimeException(); }
  /**
   * Java-friendly constructor for {@link org.apache.spark.mllib.tree.configuration.Strategy}
   */
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo) { throw new RuntimeException(); }
  /**
   * Sets Algorithm using a String.
   */
  public  void setAlgo (java.lang.String algo) { throw new RuntimeException(); }
  /**
   * Sets categoricalFeaturesInfo using a Java Map.
   */
  public  void setCategoricalFeaturesInfo (java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo) { throw new RuntimeException(); }
  /**
   * Check validity of parameters.
   * Throws exception if invalid.
   */
  public  void assertValid () { throw new RuntimeException(); }
  /** Returns a shallow copy of this instance. */
  public  org.apache.spark.mllib.tree.configuration.Strategy copy () { throw new RuntimeException(); }
  // not preceding
  public  scala.Enumeration.Value getAlgo () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity getImpurity () { throw new RuntimeException(); }
  public  int getMaxDepth () { throw new RuntimeException(); }
  public  int getNumClasses () { throw new RuntimeException(); }
  public  int getMaxBins () { throw new RuntimeException(); }
  public  scala.Enumeration.Value getQuantileCalculationStrategy () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getCategoricalFeaturesInfo () { throw new RuntimeException(); }
  public  int getMinInstancesPerNode () { throw new RuntimeException(); }
  public  double getMinInfoGain () { throw new RuntimeException(); }
  public  int getMaxMemoryInMB () { throw new RuntimeException(); }
  public  double getSubsamplingRate () { throw new RuntimeException(); }
  public  boolean getUseNodeIdCache () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> getCheckpointDir () { throw new RuntimeException(); }
  public  int getCheckpointInterval () { throw new RuntimeException(); }
}
