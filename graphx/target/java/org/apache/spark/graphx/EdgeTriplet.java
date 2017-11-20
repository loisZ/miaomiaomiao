package org.apache.spark.graphx;
/**
 * An edge triplet represents an edge along with the vertex attributes of its neighboring vertices.
 * <p>
 * @tparam VD the type of the vertex attribute.
 * @tparam ED the type of the edge attribute
 */
public  class EdgeTriplet<VD extends java.lang.Object, ED extends java.lang.Object> extends org.apache.spark.graphx.Edge<ED> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   EdgeTriplet () { throw new RuntimeException(); }
  /**
   * The source vertex attribute
   */
  public  VD srcAttr () { throw new RuntimeException(); }
  /**
   * The destination vertex attribute
   */
  public  VD dstAttr () { throw new RuntimeException(); }
  /**
   * Set the edge properties of this triplet.
   */
  protected  org.apache.spark.graphx.EdgeTriplet<VD, ED> set (org.apache.spark.graphx.Edge<ED> other) { throw new RuntimeException(); }
  /**
   * Given one vertex in the edge return the other vertex.
   * <p>
   * @param vid the id one of the two vertices on the edge
   * @return the attribute for the other vertex on the edge
   */
  public  VD otherVertexAttr (long vid) { throw new RuntimeException(); }
  /**
   * Get the vertex object for the given vertex in the edge.
   * <p>
   * @param vid the id of one of the two vertices on the edge
   * @return the attr for the vertex with that id
   */
  public  VD vertexAttr (long vid) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  scala.Tuple3<scala.Tuple2<java.lang.Object, VD>, scala.Tuple2<java.lang.Object, VD>, ED> toTuple () { throw new RuntimeException(); }
}
