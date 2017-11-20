package org.apache.spark.sql.catalyst.util;
/**
 * Builder for {@link Metadata}. If there is a key collision, the latter will overwrite the former.
 */
public  class MetadataBuilder {
  public   MetadataBuilder () { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<java.lang.String, java.lang.Object> map () { throw new RuntimeException(); }
  /** Returns the immutable version of this map.  Used for java interop. */
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getMap () { throw new RuntimeException(); }
  /** Include the content of an existing {@link Metadata} instance. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder withMetadata (org.apache.spark.sql.catalyst.util.Metadata metadata) { throw new RuntimeException(); }
  /** Puts a Long. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putLong (java.lang.String key, long value) { throw new RuntimeException(); }
  /** Puts a Double. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putDouble (java.lang.String key, double value) { throw new RuntimeException(); }
  /** Puts a Boolean. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putBoolean (java.lang.String key, boolean value) { throw new RuntimeException(); }
  /** Puts a String. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putString (java.lang.String key, java.lang.String value) { throw new RuntimeException(); }
  /** Puts a {@link Metadata}. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putMetadata (java.lang.String key, org.apache.spark.sql.catalyst.util.Metadata value) { throw new RuntimeException(); }
  /** Puts a Long array. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putLongArray (java.lang.String key, long[] value) { throw new RuntimeException(); }
  /** Puts a Double array. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putDoubleArray (java.lang.String key, double[] value) { throw new RuntimeException(); }
  /** Puts a Boolean array. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putBooleanArray (java.lang.String key, boolean[] value) { throw new RuntimeException(); }
  /** Puts a String array. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putStringArray (java.lang.String key, java.lang.String[] value) { throw new RuntimeException(); }
  /** Puts a {@link Metadata} array. */
  public  org.apache.spark.sql.catalyst.util.MetadataBuilder putMetadataArray (java.lang.String key, org.apache.spark.sql.catalyst.util.Metadata[] value) { throw new RuntimeException(); }
  /** Builds the {@link Metadata} instance. */
  public  org.apache.spark.sql.catalyst.util.Metadata build () { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.util.MetadataBuilder put (java.lang.String key, Object value) { throw new RuntimeException(); }
}
