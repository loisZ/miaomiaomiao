package org.apache.spark.mllib.feature;
/**
 * :: Experimental ::
 * Word2Vec model
 */
public  class Word2VecModel implements scala.Serializable {
  private  scala.collection.immutable.Map<java.lang.String, float[]> model () { throw new RuntimeException(); }
  // not preceding
  public   Word2VecModel (scala.collection.immutable.Map<java.lang.String, float[]> model) { throw new RuntimeException(); }
  private  double cosineSimilarity (float[] v1, float[] v2) { throw new RuntimeException(); }
  /**
   * Transforms a word to its vector representation
   * @param word a word 
   * @return vector representation of word
   */
  public  org.apache.spark.mllib.linalg.Vector transform (java.lang.String word) { throw new RuntimeException(); }
  /**
   * Find synonyms of a word
   * @param word a word
   * @param num number of synonyms to find  
   * @return array of (word, cosineSimilarity)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonyms (java.lang.String word, int num) { throw new RuntimeException(); }
  /**
   * Find synonyms of the vector representation of a word
   * @param vector vector representation of a word
   * @param num number of synonyms to find  
   * @return array of (word, cosineSimilarity)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonyms (org.apache.spark.mllib.linalg.Vector vector, int num) { throw new RuntimeException(); }
  /**
   * Returns a map of words to their vector representations.
   */
  public  scala.collection.immutable.Map<java.lang.String, float[]> getVectors () { throw new RuntimeException(); }
}
