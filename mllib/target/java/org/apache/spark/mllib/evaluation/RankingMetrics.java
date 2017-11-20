package org.apache.spark.mllib.evaluation;
/**
 * ::Experimental::
 * Evaluator for ranking algorithms.
 * <p>
 * @param predictionAndLabels an RDD of (predicted ranking, ground truth set) pairs.
 */
public  class RankingMetrics<T extends java.lang.Object> implements org.apache.spark.Logging, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   RankingMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndLabels, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Compute the average precision of all the queries, truncated at ranking position k.
   * <p>
   * If for a query, the ranking algorithm returns n (n < k) results, the precision value will be
   * computed as #(relevant items retrieved) / k. This formula also applies when the size of the
   * ground truth set is less than k.
   * <p>
   * If a query has an empty ground truth set, zero will be used as precision together with
   * a log warning.
   * <p>
   * See the following paper for detail:
   * <p>
   * IR evaluation methods for retrieving highly relevant documents. K. Jarvelin and J. Kekalainen
   * <p>
   * @param k the position to compute the truncated precision, must be positive
   * @return the average precision at the first k ranking positions
   */
  public  double precisionAt (int k) { throw new RuntimeException(); }
  /**
   * Returns the mean average precision (MAP) of all the queries.
   * If a query has an empty ground truth set, the average precision will be zero and a log
   * warining is generated.
   */
  public  double meanAveragePrecision () { throw new RuntimeException(); }
  /**
   * Compute the average NDCG value of all the queries, truncated at ranking position k.
   * The discounted cumulative gain at position k is computed as:
   *    sum,,i=1,,^k^ (2^{relevance of ''i''th item}^ - 1) / log(i + 1),
   * and the NDCG is obtained by dividing the DCG value on the ground truth set. In the current
   * implementation, the relevance value is binary.
   * <p>
   * If a query has an empty ground truth set, zero will be used as ndcg together with
   * a log warning.
   * <p>
   * See the following paper for detail:
   * <p>
   * IR evaluation methods for retrieving highly relevant documents. K. Jarvelin and J. Kekalainen
   * <p>
   * @param k the position to compute the truncated ndcg, must be positive
   * @return the average ndcg at the first k ranking positions
   */
  public  double ndcgAt (int k) { throw new RuntimeException(); }
}
