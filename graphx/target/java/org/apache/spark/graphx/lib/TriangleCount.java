package org.apache.spark.graphx.lib;
// no position
/**
 * Compute the number of triangles passing through each vertex.
 * <p>
 * The algorithm is relatively straightforward and can be computed in three steps:
 * <p>
 * <ul>
 * <li>Compute the set of neighbors for each vertex
 * <li>For each edge compute the intersection of the sets and send the count to both vertices.
 * <li> Compute the sum at each vertex and divide by two since each triangle is counted twice.
 * </ul>
 * <p>
 * Note that the input graph should have its edges in canonical direction
 * (i.e. the <code>sourceId</code> less than <code>destId</code>). Also the graph must have been partitioned
 * using {@link org.apache.spark.graphx.Graph#partitionBy}.
 */
public  class TriangleCount {
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, ED> run (org.apache.spark.graphx.Graph<VD, ED> graph, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2) { throw new RuntimeException(); }
}
