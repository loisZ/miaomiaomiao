package org.apache.spark.mllib.optimization;
/**
 * Class used to solve an optimization problem using Gradient Descent.
 * @param gradient Gradient function to be used.
 * @param updater Updater to be used to update weights after every iteration.
 */
public  class GradientDescent implements org.apache.spark.mllib.optimization.Optimizer, org.apache.spark.Logging {
  /**
   * Run stochastic gradient descent (SGD) in parallel using mini batches.
   * In each iteration, we sample a subset (fraction miniBatchFraction) of the total data
   * in order to compute a gradient estimate.
   * Sampling, and averaging the subgradients over this subset is performed using one standard
   * spark map-reduce in each iteration.
   * <p>
   * @param data - Input data for SGD. RDD of the set of data examples, each of
   *               the form (label, [feature values]).
   * @param gradient - Gradient object (used to compute the gradient of the loss function of
   *                   one single data example)
   * @param updater - Updater function to actually perform a gradient step in a given direction.
   * @param stepSize - initial step size for the first step
   * @param numIterations - number of iterations that SGD should be run.
   * @param regParam - regularization parameter
   * @param miniBatchFraction - fraction of the input data set that should be used for
   *                            one iteration of SGD. Default value 1.0.
   * <p>
   * @return A tuple containing two elements. The first element is a column matrix containing
   *         weights for every feature, and the second element is an array containing the
   *         stochastic loss computed for every iteration.
   */
  static public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, double[]> runMiniBatchSGD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater, double stepSize, int numIterations, double regParam, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.Gradient gradient () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.Updater updater () { throw new RuntimeException(); }
  // not preceding
  public   GradientDescent (org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater) { throw new RuntimeException(); }
  private  double stepSize () { throw new RuntimeException(); }
  private  int numIterations () { throw new RuntimeException(); }
  private  double regParam () { throw new RuntimeException(); }
  private  double miniBatchFraction () { throw new RuntimeException(); }
  /**
   * Set the initial step size of SGD for the first step. Default 1.0.
   * In subsequent steps, the step size will decrease with stepSize/sqrt(t)
   */
  public  org.apache.spark.mllib.optimization.GradientDescent setStepSize (double step) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Set fraction of data to be used for each SGD iteration.
   * Default 1.0 (corresponding to deterministic/classical gradient descent)
   */
  public  org.apache.spark.mllib.optimization.GradientDescent setMiniBatchFraction (double fraction) { throw new RuntimeException(); }
  /**
   * Set the number of iterations for SGD. Default 100.
   */
  public  org.apache.spark.mllib.optimization.GradientDescent setNumIterations (int iters) { throw new RuntimeException(); }
  /**
   * Set the regularization parameter. Default 0.0.
   */
  public  org.apache.spark.mllib.optimization.GradientDescent setRegParam (double regParam) { throw new RuntimeException(); }
  /**
   * Set the gradient function (of the loss function of one single data example)
   * to be used for SGD.
   */
  public  org.apache.spark.mllib.optimization.GradientDescent setGradient (org.apache.spark.mllib.optimization.Gradient gradient) { throw new RuntimeException(); }
  /**
   * Set the updater function to actually perform a gradient step in a given direction.
   * The updater is responsible to perform the update from the regularization term as well,
   * and therefore determines what kind or regularization is used, if any.
   */
  public  org.apache.spark.mllib.optimization.GradientDescent setUpdater (org.apache.spark.mllib.optimization.Updater updater) { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Runs gradient descent on the given training data.
   * @param data training data
   * @param initialWeights initial weights
   * @return solution vector
   */
  public  org.apache.spark.mllib.linalg.Vector optimize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
}
