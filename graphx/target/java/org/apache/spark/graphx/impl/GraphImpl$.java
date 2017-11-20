package org.apache.spark.graphx.impl;
// no position
public  class GraphImpl$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GraphImpl$ MODULE$ = null;
  public   GraphImpl$ () { throw new RuntimeException(); }
  /** Create a graph from edges, setting referenced vertices to `defaultVertexAttr`. */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$14, scala.reflect.ClassTag<ED> evidence$15) { throw new RuntimeException(); }
  /** Create a graph from EdgePartitions, setting referenced vertices to `defaultVertexAttr`. */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromEdgePartitions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> edgePartitions, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$16, scala.reflect.ClassTag<ED> evidence$17) { throw new RuntimeException(); }
  /** Create a graph from vertices and edges, setting missing vertices to `defaultVertexAttr`. */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, VD>> vertices, org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$18, scala.reflect.ClassTag<ED> evidence$19) { throw new RuntimeException(); }
  /**
   * Create a graph from a VertexRDD and an EdgeRDD with arbitrary replicated vertices. The
   * VertexRDD must already be set up for efficient joins with the EdgeRDD by calling
   * <code>VertexRDD.withEdges</code> or an appropriate VertexRDD constructor.
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> apply (org.apache.spark.graphx.VertexRDD<VD> vertices, org.apache.spark.graphx.EdgeRDD<ED> edges, scala.reflect.ClassTag<VD> evidence$20, scala.reflect.ClassTag<ED> evidence$21) { throw new RuntimeException(); }
  /**
   * Create a graph from a VertexRDD and an EdgeRDD with the same replicated vertex type as the
   * vertices. The VertexRDD must already be set up for efficient joins with the EdgeRDD by calling
   * <code>VertexRDD.withEdges</code> or an appropriate VertexRDD constructor.
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromExistingRDDs (org.apache.spark.graphx.VertexRDD<VD> vertices, org.apache.spark.graphx.EdgeRDD<ED> edges, scala.reflect.ClassTag<VD> evidence$22, scala.reflect.ClassTag<ED> evidence$23) { throw new RuntimeException(); }
  /**
   * Create a graph from an EdgeRDD with the correct vertex type, setting missing vertices to
   * <code>defaultVertexAttr</code>. The vertices will have the same number of partitions as the EdgeRDD.
   */
  private <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.impl.GraphImpl<VD, ED> fromEdgeRDD (org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> edges, VD defaultVertexAttr, org.apache.spark.storage.StorageLevel edgeStorageLevel, org.apache.spark.storage.StorageLevel vertexStorageLevel, scala.reflect.ClassTag<VD> evidence$24, scala.reflect.ClassTag<ED> evidence$25) { throw new RuntimeException(); }
}
