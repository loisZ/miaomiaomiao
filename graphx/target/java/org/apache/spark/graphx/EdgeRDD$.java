package org.apache.spark.graphx;
// no position
public  class EdgeRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EdgeRDD$ MODULE$ = null;
  public   EdgeRDD$ () { throw new RuntimeException(); }
  /**
   * Creates an EdgeRDD from a set of edges.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   */
  public <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> fromEdges (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<ED>> edges, scala.reflect.ClassTag<ED> evidence$4, scala.reflect.ClassTag<VD> evidence$5) { throw new RuntimeException(); }
  /**
   * Creates an EdgeRDD from already-constructed edge partitions.
   * <p>
   * @tparam ED the edge attribute type
   * @tparam VD the type of the vertex attributes that may be joined with the returned EdgeRDD
   */
  public <ED extends java.lang.Object, VD extends java.lang.Object> org.apache.spark.graphx.impl.EdgeRDDImpl<ED, VD> fromEdgePartitions (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.graphx.impl.EdgePartition<ED, VD>>> edgePartitions, scala.reflect.ClassTag<ED> evidence$6, scala.reflect.ClassTag<VD> evidence$7) { throw new RuntimeException(); }
}
