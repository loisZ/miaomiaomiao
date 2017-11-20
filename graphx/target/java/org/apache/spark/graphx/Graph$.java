package org.apache.spark.graphx;
// no position
/**
 * The Graph object contains a collection of routines used to construct graphs from RDDs.
 */
public  class Graph$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Graph$ MODULE$ = null;
  public   Graph$ () { throw new RuntimeException(); }
  /**
   * Construct a graph from a collection of edges encoded as vertex id pairs.
   * <p>
   * @param rawEdges a collection of edges in (src, dst) form
   * @param defaultValue the vertex attributes with which to create vertices referenced by the edges
   * @param uniqueEdges if multiple identical edges are found they are combined and the edge
   * attribute is set to the sum.  Otherwise duplicate edges are treated as separate. To enable
   * <code>uniqueEdges</code>, a {@link PartitionStrategy} must be provided.
   * @param edgeStorageLevel the desired storage level at which to cache the edges if necessary
   * @param vertexStorageLevel the desired storage level at which to cache the vertices if necessary
   * <p>
   * @return a graph with edge attributes containing either the count of duplicate edges or 1
   * (if <code>uniqueEdges</code> is <code>None</code>) and vertex attributes containing the total degree of each vertex.
   */
  public <VD extends java.lang.Object> org.apache.spark.graphx.Graph<VD, java.lang.Object> fromEdgeTuples (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rawEdges, VD defaultValue, scala.Option<org.apache.spark.graphx.PartitionStrategy> uniqueEdges, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$16) { throw new RuntimeException(); }
  /**
   * Construct a graph from a collection of edges.
   * <p>
   * @param edges the RDD containing the set of edges in the graph
   * @param defaultValue the default vertex attribute to use for each vertex
   * @param edgeStorageLevel the desired storage level at which to cache the edges if necessary
   * @param vertexStorageLevel the desired storage level at which to cache the vertices if necessary
   * <p>
   * @return a graph with edge attributes described by <code>edges</code> and vertices
   *         given by all vertices in <code>edges</code> with value <code>defaultValue</code>
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> fromEdges (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultValue, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$17, scala.reflect.ClassTag<ED> evidence$18) { throw new RuntimeException(); }
  /**
   * Construct a graph from a collection of vertices and
   * edges with attributes.  Duplicate vertices are picked arbitrarily and
   * vertices found in the edge collection but not in the input
   * vertices are assigned the default attribute.
   * <p>
   * @tparam VD the vertex attribute type
   * @tparam ED the edge attribute type
   * @param vertices the "set" of vertices and their attributes
   * @param edges the collection of edges in the graph
   * @param defaultVertexAttr the default vertex attribute to use for vertices that are
   *                          mentioned in edges but not in vertices
   * @param edgeStorageLevel the desired storage level at which to cache the edges if necessary
   * @param vertexStorageLevel the desired storage level at which to cache the vertices if necessary
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$19, scala.reflect.ClassTag<ED> evidence$20) { throw new RuntimeException(); }
  /**
   * Implicitly extracts the {@link GraphOps} member from a graph.
   * <p>
   * To improve modularity the Graph type only contains a small set of basic operations.
   * All the convenience operations are defined in the {@link GraphOps} class which may be
   * shared across multiple graph implementations.
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.GraphOps<VD, ED> graphToGraphOps (org.apache.spark.graphx.Graph<VD, ED> g, scala.reflect.ClassTag<VD> evidence$21, scala.reflect.ClassTag<ED> evidence$22) { throw new RuntimeException(); }
}
