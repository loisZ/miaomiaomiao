package org.apache.spark.mllib.linalg;
/**
 * Represents a numeric vector, whose index type is Int and value type is Double.
 * <p>
 * Note: Users should not implement this interface.
 */
public  interface Vector extends scala.Serializable {
  /**
   * Size of the vector.
   */
  public  int size () ;
  /**
   * Converts the instance to a double array.
   */
  public  double[] toArray () ;
  public  boolean equals (Object other) ;
  public  int hashCode () ;
  /**
   * Converts the instance to a breeze vector.
   */
  public  breeze.linalg.Vector<java.lang.Object> toBreeze () ;
  /**
   * Gets the value of the ith element.
   * @param i index
   */
  public  double apply (int i) ;
  /**
   * Makes a deep copy of this vector.
   */
  public  org.apache.spark.mllib.linalg.Vector copy () ;
  /**
   * Applies a function <code>f</code> to all the active elements of dense and sparse vector.
   * <p>
   * @param f the function takes two parameters where the first parameter is the index of
   *          the vector with type <code>Int</code>, and the second parameter is the corresponding value
   *          with type <code>Double</code>.
   */
  public  void foreachActive (scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f) ;
}
