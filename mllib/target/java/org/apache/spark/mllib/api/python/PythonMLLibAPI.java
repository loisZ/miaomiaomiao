package org.apache.spark.mllib.api.python;
/**
 * :: DeveloperApi ::
 * The Java stubs necessary for the Python mllib bindings.
 */
public  class PythonMLLibAPI implements scala.Serializable {
  public   PythonMLLibAPI () { throw new RuntimeException(); }
  /**
   * Loads and serializes labeled points saved with <code>RDD#saveAsTextFile</code>.
   * @param jsc Java SparkContext
   * @param path file or directory path in any Hadoop-supported file system URI
   * @param minPartitions min number of partitions
   * @return serialized labeled points stored in a JavaRDD of byte array
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> loadLabeledPoints (org.apache.spark.api.java.JavaSparkContext jsc, java.lang.String path, int minPartitions) { throw new RuntimeException(); }
  private  java.util.List<java.lang.Object> trainRegressionModel (org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<? extends org.apache.spark.mllib.regression.GeneralizedLinearModel> learner, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
  /**
   * Return the Updater from string
   */
  public  org.apache.spark.mllib.optimization.Updater getUpdaterFromString (java.lang.String regType) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LinearRegressionWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainLinearRegressionModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, double regParam, java.lang.String regType, boolean intercept) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LassoWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainLassoModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RidgeRegressionWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainRidgeModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib SVMWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainSVMModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, java.lang.String regType, boolean intercept) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LogisticRegressionWithSGD.train()
   */
  public  java.util.List<java.lang.Object> trainLogisticRegressionModelWithSGD (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights, double regParam, java.lang.String regType, boolean intercept) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib LogisticRegressionWithLBFGS.train()
   */
  public  java.util.List<java.lang.Object> trainLogisticRegressionModelWithLBFGS (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, int numIterations, org.apache.spark.mllib.linalg.Vector initialWeights, double regParam, java.lang.String regType, boolean intercept, int corrections, double tolerance) { throw new RuntimeException(); }
  /**
   * Java stub for NaiveBayes.train()
   */
  public  java.util.List<java.lang.Object> trainNaiveBayes (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, double lambda) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib KMeans.train()
   */
  public  org.apache.spark.mllib.clustering.KMeansModel trainKMeansModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode) { throw new RuntimeException(); }
  /**
   * A Wrapper of MatrixFactorizationModel to provide helpfer method for Python
   */
  public  class MatrixFactorizationModelWrapper extends org.apache.spark.mllib.recommendation.MatrixFactorizationModel {
    public   MatrixFactorizationModelWrapper (org.apache.spark.mllib.recommendation.MatrixFactorizationModel model) { throw new RuntimeException(); }
    public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> predict (org.apache.spark.api.java.JavaRDD<java.lang.Object[]> userAndProducts) { throw new RuntimeException(); }
    public  org.apache.spark.rdd.RDD<java.lang.Object[]> getUserFeatures () { throw new RuntimeException(); }
    public  org.apache.spark.rdd.RDD<java.lang.Object[]> getProductFeatures () { throw new RuntimeException(); }
  }
  /**
   * Java stub for Python mllib ALS.train().  This stub returns a handle
   * to the Java object instead of the content of the Java object.  Extra care
   * needs to be taken in the Python code to ensure it gets freed on exit; see
   * the Py4J documentation.
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainALSModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> ratingsJRDD, int rank, int iterations, double lambda, int blocks, boolean nonnegative, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib ALS.trainImplicit().  This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicitALSModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> ratingsJRDD, int rank, int iterations, double lambda, int blocks, double alpha, boolean nonnegative, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Normalizer.transform()
   */
  public  org.apache.spark.mllib.linalg.Vector normalizeVector (double p, org.apache.spark.mllib.linalg.Vector vector) { throw new RuntimeException(); }
  /**
   * Java stub for Normalizer.transform()
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalizeVector (double p, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> rdd) { throw new RuntimeException(); }
  /**
   * Java stub for IDF.fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   */
  public  org.apache.spark.mllib.feature.StandardScalerModel fitStandardScaler (boolean withMean, boolean withStd, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data) { throw new RuntimeException(); }
  /**
   * Java stub for IDF.fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   */
  public  org.apache.spark.mllib.feature.IDFModel fitIDF (int minDocFreq, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> dataset) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib Word2Vec fit(). This stub returns a
   * handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on
   * exit; see the Py4J documentation.
   * @param dataJRDD input JavaRDD
   * @param vectorSize size of vector
   * @param learningRate initial learning rate
   * @param numPartitions number of partitions
   * @param numIterations number of iterations
   * @param seed initial seed for random generator
   * @return A handle to java Word2VecModelWrapper instance at python side
   */
  public  org.apache.spark.mllib.api.python.PythonMLLibAPI.Word2VecModelWrapper trainWord2Vec (org.apache.spark.api.java.JavaRDD<java.util.ArrayList<java.lang.String>> dataJRDD, int vectorSize, double learningRate, int numPartitions, int numIterations, long seed) { throw new RuntimeException(); }
  public  class Word2VecModelWrapper {
    public   Word2VecModelWrapper (org.apache.spark.mllib.feature.Word2VecModel model) { throw new RuntimeException(); }
    public  org.apache.spark.mllib.linalg.Vector transform (java.lang.String word) { throw new RuntimeException(); }
    /**
     * Transforms an RDD of words to its vector representation
     * @param rdd an RDD of words
     * @return an RDD of vector representations of words
     */
    public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> transform (org.apache.spark.api.java.JavaRDD<java.lang.String> rdd) { throw new RuntimeException(); }
    public  java.util.List<java.lang.Object> findSynonyms (java.lang.String word, int num) { throw new RuntimeException(); }
    public  java.util.List<java.lang.Object> findSynonyms (org.apache.spark.mllib.linalg.Vector vector, int num) { throw new RuntimeException(); }
  }
  /**
   * Java stub for Python mllib DecisionTree.train().
   * This stub returns a handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on exit;
   * see the Py4J documentation.
   * @param data  Training data
   * @param categoricalFeaturesInfo  Categorical features info, as Java map
   */
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel trainDecisionTreeModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String algoStr, int numClasses, java.util.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, java.lang.String impurityStr, int maxDepth, int maxBins, int minInstancesPerNode, double minInfoGain) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomForest.train().
   * This stub returns a handle to the Java object instead of the content of the Java object.
   * Extra care needs to be taken in the Python code to ensure it gets freed on exit;
   * see the Py4J documentation.
   */
  public  org.apache.spark.mllib.tree.model.RandomForestModel trainRandomForestModel (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String algoStr, int numClasses, java.util.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int numTrees, java.lang.String featureSubsetStrategy, java.lang.String impurityStr, int maxDepth, int maxBins, int seed) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.colStats(X: RDD[Vector]).
   * TODO figure out return type.
   */
  public  org.apache.spark.mllib.stat.MultivariateStatisticalSummary colStats (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> rdd) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.corr(X: RDD[Vector], method: String).
   * Returns the correlation matrix serialized into a byte array understood by deserializers in
   * pyspark.
   */
  public  org.apache.spark.mllib.linalg.Matrix corr (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> x, java.lang.String method) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.corr(x: RDD[Double], y: RDD[Double], method: String).
   */
  public  double corr (org.apache.spark.api.java.JavaRDD<java.lang.Object> x, org.apache.spark.api.java.JavaRDD<java.lang.Object> y, java.lang.String method) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.chiSqTest()
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSqTest (org.apache.spark.mllib.linalg.Vector observed, org.apache.spark.mllib.linalg.Vector expected) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.chiSqTest(observed: Matrix)
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSqTest (org.apache.spark.mllib.linalg.Matrix observed) { throw new RuntimeException(); }
  /**
   * Java stub for mllib Statistics.chiSqTest(RDD[LabelPoint])
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult[] chiSqTest (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> data) { throw new RuntimeException(); }
  private  java.lang.String getCorrNameOrDefault (java.lang.String method) { throw new RuntimeException(); }
  private  long getSeedOrDefault (java.lang.Long seed) { throw new RuntimeException(); }
  private  int getNumPartitionsOrDefault (java.lang.Integer numPartitions, org.apache.spark.api.java.JavaSparkContext jsc) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.uniformRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> uniformRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.normalRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> normalRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.poissonRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> poissonRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.uniformVectorRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.normalVectorRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
  /**
   * Java stub for Python mllib RandomRDDGenerators.poissonVectorRDD()
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, java.lang.Integer numPartitions, java.lang.Long seed) { throw new RuntimeException(); }
}
