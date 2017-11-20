package org.apache.spark.mllib.tree.configuration;
// no position
/**
 * Enum to select ensemble combining strategy for base learners
 */
public  class EnsembleCombiningStrategy extends scala.Enumeration {
  static public  scala.Enumeration.Value Average () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value Sum () { throw new RuntimeException(); }
  static public  scala.Enumeration.Value Vote () { throw new RuntimeException(); }
}
