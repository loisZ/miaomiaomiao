package org.apache.spark.mllib.tree;
/**
 * :: Experimental ::
 * A class which implements a decision tree learning algorithm for classification and regression.
 * It supports both continuous and categorical features.
 * @param strategy The configuration parameters for the tree algorithm which specify the type
 *                 of algorithm (classification, regression, etc.), feature type (continuous,
 *                 categorical), depth of the tree, quantile calculation strategy, etc.
 */
public  class DecisionTree implements scala.Serializable, org.apache.spark.Logging {
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param strategy The configuration parameters for the tree algorithm which specify the type
   *                 of algorithm (classification, regression, etc.), feature type (continuous,
   *                 categorical), depth of the tree, quantile calculation strategy, etc.
   * @return DecisionTreeModel that can be used for prediction
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo algorithm, classification or regression
   * @param impurity impurity criterion used for information gain calculation
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * @return DecisionTreeModel that can be used for prediction
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo algorithm, classification or regression
   * @param impurity impurity criterion used for information gain calculation
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * @param numClasses number of classes for classification. Default value of 2.
   * @return DecisionTreeModel that can be used for prediction
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model.
   * The method supports binary and multiclass classification and regression.
   * <p>
   * Note: Using {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   *       and {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   *       is recommended to clearly separate classification and regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param algo classification or regression
   * @param impurity criterion used for information gain calculation
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   * @param numClasses number of classes for classification. Default value of 2.
   * @param maxBins maximum number of bins used for splitting features
   * @param quantileCalculationStrategy  algorithm for calculating quantiles
   * @param categoricalFeaturesInfo Map storing arity of categorical features.
   *                                E.g., an entry (n -> k) indicates that feature n is categorical
   *                                with k categories indexed from 0: {0, 1, ..., k-1}.
   * @return DecisionTreeModel that can be used for prediction
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for binary or multiclass classification.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels should take values {0, 1, ..., numClasses-1}.
   * @param numClasses number of classes for classification.
   * @param categoricalFeaturesInfo Map storing arity of categorical features.
   *                                E.g., an entry (n -> k) indicates that feature n is categorical
   *                                with k categories indexed from 0: {0, 1, ..., k-1}.
   * @param impurity Criterion used for information gain calculation.
   *                 Supported values: "gini" (recommended) or "entropy".
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   *                  (suggested value: 5)
   * @param maxBins maximum number of bins used for splitting features
   *                 (suggested value: 32)
   * @return DecisionTreeModel that can be used for prediction
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainClassifier (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.DecisionTree$#trainClassifier}
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainClassifier (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numClasses, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model for regression.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              Labels are real numbers.
   * @param categoricalFeaturesInfo Map storing arity of categorical features.
   *                                E.g., an entry (n -> k) indicates that feature n is categorical
   *                                with k categories indexed from 0: {0, 1, ..., k-1}.
   * @param impurity Criterion used for information gain calculation.
   *                 Supported values: "variance".
   * @param maxDepth Maximum depth of the tree.
   *                 E.g., depth 0 means 1 leaf node; depth 1 means 1 internal node + 2 leaf nodes.
   *                  (suggested value: 5)
   * @param maxBins maximum number of bins used for splitting features
   *                 (suggested value: 32)
   * @return DecisionTreeModel that can be used for prediction
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainRegressor (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.DecisionTree$#trainRegressor}
   */
  static public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainRegressor (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo, java.lang.String impurity, int maxDepth, int maxBins) { throw new RuntimeException(); }
  /**
   * Get the node index corresponding to this data point.
   * This function mimics prediction, passing an example from the root node down to a leaf
   * or unsplit node; that node's index is returned.
   * <p>
   * @param node  Node in tree from which to classify the given data point.
   * @param binnedFeatures  Binned feature vector for data point.
   * @param bins possible bins for all features, indexed (numFeatures)(numBins)
   * @param unorderedFeatures  Set of indices of unordered features.
   * @return  Leaf index if the data point reaches a leaf.
   *          Otherwise, last node reachable in tree matching this example.
   *          Note: This is the global node index, i.e., the index used in the tree.
   *                This index is different from the index used during training a particular
   *                group of nodes on one call to {@link findBestSplits()}.
   */
  static private  int predictNodeIndex (org.apache.spark.mllib.tree.model.Node node, int[] binnedFeatures, org.apache.spark.mllib.tree.model.Bin[][] bins, scala.collection.immutable.Set<java.lang.Object> unorderedFeatures) { throw new RuntimeException(); }
  /**
   * Helper for binSeqOp, for data which can contain a mix of ordered and unordered features.
   * <p>
   * For ordered features, a single bin is updated.
   * For unordered features, bins correspond to subsets of categories; either the left or right bin
   * for each subset is updated.
   * <p>
   * @param agg  Array storing aggregate calculation, with a set of sufficient statistics for
   *             each (feature, bin).
   * @param treePoint  Data point being aggregated.
   * @param bins possible bins for all features, indexed (numFeatures)(numBins)
   * @param unorderedFeatures  Set of indices of unordered features.
   * @param instanceWeight  Weight (importance) of instance in dataset.
   */
  static private  void mixedBinSeqOp (org.apache.spark.mllib.tree.impl.DTStatsAggregator agg, org.apache.spark.mllib.tree.impl.TreePoint treePoint, org.apache.spark.mllib.tree.model.Bin[][] bins, scala.collection.immutable.Set<java.lang.Object> unorderedFeatures, double instanceWeight, scala.Option<int[]> featuresForNode) { throw new RuntimeException(); }
  /**
   * Helper for binSeqOp, for regression and for classification with only ordered features.
   * <p>
   * For each feature, the sufficient statistics of one bin are updated.
   * <p>
   * @param agg  Array storing aggregate calculation, with a set of sufficient statistics for
   *             each (feature, bin).
   * @param treePoint  Data point being aggregated.
   * @param instanceWeight  Weight (importance) of instance in dataset.
   */
  static private  void orderedBinSeqOp (org.apache.spark.mllib.tree.impl.DTStatsAggregator agg, org.apache.spark.mllib.tree.impl.TreePoint treePoint, double instanceWeight, scala.Option<int[]> featuresForNode) { throw new RuntimeException(); }
  /**
   * Given a group of nodes, this finds the best split for each node.
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.tree.impl.TreePoint}
   * @param metadata Learning and dataset metadata
   * @param topNodes Root node for each tree.  Used for matching instances with nodes.
   * @param nodesForGroup Mapping: treeIndex --> nodes to be split in tree
   * @param treeToNodeToIndexInfo Mapping: treeIndex --> nodeIndex --> nodeIndexInfo,
   *                              where nodeIndexInfo stores the index in the group and the
   *                              feature subsets (if using feature subsets).
   * @param splits possible splits for all features, indexed (numFeatures)(numSplits)
   * @param bins possible bins for all features, indexed (numFeatures)(numBins)
   * @param nodeQueue  Queue of nodes to split, with values (treeIndex, node).
   *                   Updated with new non-leaf nodes which are created.
   * @param nodeIdCache Node Id cache containing an RDD of Array[Int] where
   *                    each value in the array is the data point's node Id
   *                    for a corresponding tree. This is used to prevent the need
   *                    to pass the entire tree to the executors during
   *                    the node stat aggregation phase.
   */
  static public  void findBestSplits (org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.BaggedPoint<org.apache.spark.mllib.tree.impl.TreePoint>> input, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, org.apache.spark.mllib.tree.model.Node[] topNodes, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.tree.model.Node[]> nodesForGroup, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.mllib.tree.RandomForest.NodeIndexInfo>> treeToNodeToIndexInfo, org.apache.spark.mllib.tree.model.Split[][] splits, org.apache.spark.mllib.tree.model.Bin[][] bins, scala.collection.mutable.Queue<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.tree.model.Node>> nodeQueue, org.apache.spark.mllib.tree.impl.TimeTracker timer, scala.Option<org.apache.spark.mllib.tree.impl.NodeIdCache> nodeIdCache) { throw new RuntimeException(); }
  /**
   * Calculate the information gain for a given (feature, split) based upon left/right aggregates.
   * @param leftImpurityCalculator left node aggregates for this (feature, split)
   * @param rightImpurityCalculator right node aggregate for this (feature, split)
   * @return information gain and statistics for split
   */
  static private  org.apache.spark.mllib.tree.model.InformationGainStats calculateGainForSplit (org.apache.spark.mllib.tree.impurity.ImpurityCalculator leftImpurityCalculator, org.apache.spark.mllib.tree.impurity.ImpurityCalculator rightImpurityCalculator, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, double impurity) { throw new RuntimeException(); }
  static private  org.apache.spark.mllib.tree.model.Predict calculatePredict (org.apache.spark.mllib.tree.impurity.ImpurityCalculator impurityCalculator) { throw new RuntimeException(); }
  /**
   * Calculate predict value for current node, given stats of any split.
   * Note that this function is called only once for each node.
   * @param leftImpurityCalculator left node aggregates for a split
   * @param rightImpurityCalculator right node aggregates for a split
   * @return predict value and impurity for current node
   */
  static private  scala.Tuple2<org.apache.spark.mllib.tree.model.Predict, java.lang.Object> calculatePredictImpurity (org.apache.spark.mllib.tree.impurity.ImpurityCalculator leftImpurityCalculator, org.apache.spark.mllib.tree.impurity.ImpurityCalculator rightImpurityCalculator) { throw new RuntimeException(); }
  /**
   * Find the best split for a node.
   * @param binAggregates Bin statistics.
   * @return tuple for best split: (Split, information gain, prediction at node)
   */
  static private  scala.Tuple3<org.apache.spark.mllib.tree.model.Split, org.apache.spark.mllib.tree.model.InformationGainStats, org.apache.spark.mllib.tree.model.Predict> binsToBestSplit (org.apache.spark.mllib.tree.impl.DTStatsAggregator binAggregates, org.apache.spark.mllib.tree.model.Split[][] splits, scala.Option<int[]> featuresForNode, org.apache.spark.mllib.tree.model.Node node) { throw new RuntimeException(); }
  /**
   * Returns splits and bins for decision tree calculation.
   * Continuous and categorical features are handled differently.
   * <p>
   * Continuous features:
   *   For each feature, there are numBins - 1 possible splits representing the possible binary
   *   decisions at each node in the tree.
   *   This finds locations (feature values) for splits using a subsample of the data.
   * <p>
   * Categorical features:
   *   For each feature, there is 1 bin per split.
   *   Splits and bins are handled in 2 ways:
   *   (a) "unordered features"
   *       For multiclass classification with a low-arity feature
   *       (i.e., if isMulticlass && isSpaceSufficientForAllCategoricalSplits),
   *       the feature is split based on subsets of categories.
   *   (b) "ordered features"
   *       For regression and binary classification,
   *       and for multiclass classification with a high-arity feature,
   *       there is one bin per category.
   * <p>
   * @param input Training data: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}
   * @param metadata Learning and dataset metadata
   * @return A tuple of (splits, bins).
   *         Splits is an Array of {@link org.apache.spark.mllib.tree.model.Split}
   *          of size (numFeatures, numSplits).
   *         Bins is an Array of {@link org.apache.spark.mllib.tree.model.Bin}
   *          of size (numFeatures, numBins).
   */
  static protected  scala.Tuple2<org.apache.spark.mllib.tree.model.Split[][], org.apache.spark.mllib.tree.model.Bin[][]> findSplitsBins (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata) { throw new RuntimeException(); }
  /**
   * Nested method to extract list of eligible categories given an index. It extracts the
   * position of ones in a binary representation of the input. If binary
   * representation of an number is 01101 (13), the output list should (3.0, 2.0,
   * 0.0). The maxFeatureValue depict the number of rightmost digits that will be tested for ones.
   */
  static public  scala.collection.immutable.List<java.lang.Object> extractMultiClassCategories (int input, int maxFeatureValue) { throw new RuntimeException(); }
  /**
   * Find splits for a continuous feature
   * NOTE: Returned number of splits is set based on <code>featureSamples</code> and
   *       could be different from the specified <code>numSplits</code>.
   *       The <code>numSplits</code> attribute in the <code>DecisionTreeMetadata</code> class will be set accordingly.
   * @param featureSamples feature values of each sample
   * @param metadata decision tree metadata
   *                 NOTE: <code>metadata.numbins</code> will be changed accordingly
   *                       if there are not enough splits to be found
   * @param featureIndex feature index to find splits
   * @return array of splits
   */
  static public  double[] findSplitsForContinuousFeature (double[] featureSamples, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, int featureIndex) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.tree.configuration.Strategy strategy () { throw new RuntimeException(); }
  // not preceding
  public   DecisionTree (org.apache.spark.mllib.tree.configuration.Strategy strategy) { throw new RuntimeException(); }
  /**
   * Method to train a decision tree model over an RDD
   * @param input Training data: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}
   * @return DecisionTreeModel that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input) { throw new RuntimeException(); }
}
