package org.apache.spark.graphx.lib;
// no position
/** Connected components algorithm. */
public  class ConnectedComponents {
  /**
   * Compute the connected component membership of each vertex and return a graph with the vertex
   * value containing the lowest vertex id in the connected component containing that vertex.
   * <p>
   * @tparam VD the vertex attribute type (discarded in the computation)
   * @tparam ED the edge attribute type (preserved in the computation)
   * <p>
   * @param graph the graph for which to compute the connected components
   * <p>
   * @return a graph with vertex attributes containing the smallest vertex in each
   *         connected component
   */
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, ED> run (org.apache.spark.graphx.Graph<VD, ED> graph, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2) { throw new RuntimeException(); }
}
