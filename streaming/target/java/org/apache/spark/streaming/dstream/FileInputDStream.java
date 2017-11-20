package org.apache.spark.streaming.dstream;
/**
 * This class represents an input stream that monitors a Hadoop-compatible filesystem for new
 * files and creates a stream out of them. The way it works as follows.
 * <p>
 * At each batch interval, the file system is queried for files in the given directory and
 * detected new files are selected for that batch. In this case "new" means files that
 * became visible to readers during that time period. Some extra care is needed to deal
 * with the fact that files may become visible after they are created. For this purpose, this
 * class remembers the information about the files selected in past batches for
 * a certain duration (say, "remember window") as shown in the figure below.
 * <p>
 *                      |<----- remember window ----->|
 * ignore threshold --->|                             |<--- current batch time
 *                      |____.____.____.____.____.____|
 *                      |    |    |    |    |    |    |
 * ---------------------|----|----|----|----|----|----|-----------------------> Time
 *                      |____|____|____|____|____|____|
 *                             remembered batches
 * <p>
 * The trailing end of the window is the "ignore threshold" and all files whose mod times
 * are less than this threshold are assumed to have already been selected and are therefore
 * ignored. Files whose mod times are within the "remember window" are checked against files
 * that have already been selected. At a high level, this is how new files are identified in
 * each batch - files whose mod times are greater than the ignore threshold and
 * have not been considered within the remember window. See the documentation on the method
 * <code>isNewFile</code> for more details.
 * <p>
 * This makes some assumptions from the underlying file system that the system is monitoring.
 * - The clock of the file system is assumed to synchronized with the clock of the machine running
 *   the streaming app.
 * - If a file is to be visible in the directory listings, it must be visible within a certain
 *   duration of the mod time of the file. This duration is the "remember window", which is set to
 *   1 minute (see <code>FileInputDStream.MIN_REMEMBER_DURATION</code>). Otherwise, the file will never be
 *   selected as the mod time will be less than the ignore threshold when it becomes visible.
 * - Once a file is visible, the mod time cannot change. If it does due to appends, then the
 *   processing semantics are undefined.
 */
public  class FileInputDStream<K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> extends org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> {
  /**
   * A custom version of the DStreamCheckpointData that stores names of
   * Hadoop files as checkpoint data.
   */
  public  class FileInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<scala.Tuple2<K, V>> {
    public   FileInputDStreamCheckpointData () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> hadoopFiles () { throw new RuntimeException(); }
    public  void update (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
    public  void cleanup (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
    public  void restore () { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  /**
   * Minimum duration of remembering the information of selected files. Files with mod times
   * older than this "window" of remembering will be ignored. So if new files are visible
   * within this window, then the file will get selected in the next batch.
   */
  static private  org.apache.spark.streaming.Duration MIN_REMEMBER_DURATION () { throw new RuntimeException(); }
  static public  boolean defaultFilter (org.apache.hadoop.fs.Path path) { throw new RuntimeException(); }
  /**
   * Calculate the number of last batches to remember, such that all the files selected in
   * at least last MIN_REMEMBER_DURATION duration can be remembered.
   */
  static public  int calculateNumBatchesToRemember (org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Ident(org), org.apache), org.apache.hadoop), org.apache.hadoop.mapreduce), [org.apache.hadoop.mapreduce.InputFormat aka newTypeName("NewInputFormat")]), List(TypeTree().setOriginal(Ident(newTypeName("K"))), TypeTree().setOriginal(Ident(newTypeName("V"))))))))
  public   FileInputDStream (org.apache.spark.streaming.StreamingContext ssc_, java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<F> evidence$3) { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.dstream.FileInputDStream<K, V, F>.FileInputDStreamCheckpointData checkpointData () { throw new RuntimeException(); }
  private  long initialModTimeIgnoreThreshold () { throw new RuntimeException(); }
  private  int numBatchesToRemember () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.Duration durationToRemember () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> batchTimeToSelectedFiles () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> recentlySelectedFiles () { throw new RuntimeException(); }
  private  org.apache.spark.util.TimeStampedHashMap<java.lang.String, java.lang.Object> fileToModTime () { throw new RuntimeException(); }
  private  long lastNewFileFindingTime () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path path_ () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs_ () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  /**
   * Finds the files that were modified since the last time this method was called and makes
   * a union RDD out of them. Note that this maintains the list of files that were processed
   * in the latest modification time in the previous call to this method. This is because the
   * modification time returned by the FileStatus API seems to return times only at the
   * granularity of seconds. And new files may have the same modification time as the
   * latest modification time in the previous call to this method yet was not reported in
   * the previous call.
   */
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, V>>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
  /** Clear the old time-to-files mappings along with old RDDs */
  protected  void clearMetadata (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /**
   * Find new files for the batch of <code>currentTime</code>. This is done by first calculating the
   * ignore threshold for file mod times, and then getting a list of files filtered based on
   * the current batch time and the ignore threshold. The ignore threshold is the max of
   * initial ignore threshold and the trailing end of the remember window (that is, which ever
   * is later in time).
   */
  private  java.lang.String[] findNewFiles (long currentTime) { throw new RuntimeException(); }
  /**
   * Identify whether the given <code>path</code> is a new file for the batch of <code>currentTime</code>. For it to be
   * accepted, it has to pass the following criteria.
   * - It must pass the user-provided file filter.
   * - It must be newer than the ignore threshold. It is assumed that files older than the ignore
   *   threshold have already been considered or are existing files before start
   *   (when newFileOnly = true).
   * - It must not be present in the recently selected files that this class remembers.
   * - It must not be newer than the time of the batch (i.e. <code>currentTime</code> for which this
   *   file is being tested. This can occur if the driver was recovered, and the missing batches
   *   (during downtime) are being generated. In that case, a batch of time T may be generated
   *   at time T+x. Say x = 5. If that batch T contains file of mod time T+5, then bad things can
   *   happen. Let's say the selected files are remembered for 60 seconds.  At time t+61,
   *   the batch of time t is forgotten, and the ignore threshold is still T+1.
   *   The files with mod time T+5 are not remembered and cannot be ignored (since, t+5 > t+1).
   *   Hence they can get selected as new files again. To prevent this, files whose mod time is more
   *   than current batch time are not considered.
   */
  private  boolean isNewFile (org.apache.hadoop.fs.Path path, long currentTime, long modTimeIgnoreThreshold) { throw new RuntimeException(); }
  /** Generate one RDD from an array of files */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> filesToRDD (scala.collection.Seq<java.lang.String> files) { throw new RuntimeException(); }
  /** Get file mod time from cache or fetch it from the file system */
  private  long getFileModTime (org.apache.hadoop.fs.Path path) { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path directoryPath () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs () { throw new RuntimeException(); }
  private  void reset () { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream ois) { throw new RuntimeException(); }
}
