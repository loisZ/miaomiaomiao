package org.apache.spark.graphx;
/**
 * Represents an edge along with its neighboring vertices and allows sending messages along the
 * edge. Used in {@link Graph#aggregateMessages}.
 */
public abstract class EdgeContext<VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   EdgeContext () { throw new RuntimeException(); }
  /** The vertex id of the edge's source vertex. */
  public abstract  long srcId () ;
  /** The vertex id of the edge's destination vertex. */
  public abstract  long dstId () ;
  /** The vertex attribute of the edge's source vertex. */
  public abstract  VD srcAttr () ;
  /** The vertex attribute of the edge's destination vertex. */
  public abstract  VD dstAttr () ;
  /** The attribute associated with the edge. */
  public abstract  ED attr () ;
  /** Sends a message to the source vertex. */
  public abstract  void sendToSrc (A msg) ;
  /** Sends a message to the destination vertex. */
  public abstract  void sendToDst (A msg) ;
  /** Converts the edge and vertex properties into an {@link EdgeTriplet} for convenience. */
  public  org.apache.spark.graphx.EdgeTriplet<VD, ED> toEdgeTriplet () { throw new RuntimeException(); }
}
