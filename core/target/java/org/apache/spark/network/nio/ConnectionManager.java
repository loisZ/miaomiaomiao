package org.apache.spark.network.nio;
public  class ConnectionManager implements org.apache.spark.Logging {
  /**
   * Used by sendMessageReliably to track messages being sent.
   * @param message the message that was sent
   * @param connectionManagerId the connection manager that sent this message
   * @param completionHandler callback that's invoked when the send has completed or failed
   */
  public  class MessageStatus {
    public  org.apache.spark.network.nio.Message message () { throw new RuntimeException(); }
    public  org.apache.spark.network.nio.ConnectionManagerId connectionManagerId () { throw new RuntimeException(); }
    // not preceding
    public   MessageStatus (org.apache.spark.network.nio.Message message, org.apache.spark.network.nio.ConnectionManagerId connectionManagerId, scala.Function1<scala.util.Try<org.apache.spark.network.nio.Message>, scala.runtime.BoxedUnit> completionHandler) { throw new RuntimeException(); }
    public  void success (org.apache.spark.network.nio.Message ackMessage) { throw new RuntimeException(); }
    public  void failWithoutAck () { throw new RuntimeException(); }
    public  void failure (java.lang.Throwable e) { throw new RuntimeException(); }
  }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static public  void testSequentialSending (org.apache.spark.network.nio.ConnectionManager manager) { throw new RuntimeException(); }
  static public  void testParallelSending (org.apache.spark.network.nio.ConnectionManager manager) { throw new RuntimeException(); }
  static public  void testParallelDecreasingSending (org.apache.spark.network.nio.ConnectionManager manager) { throw new RuntimeException(); }
  static public  void testContinuousSending (org.apache.spark.network.nio.ConnectionManager manager) { throw new RuntimeException(); }
  public   ConnectionManager (int port, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, java.lang.String name) { throw new RuntimeException(); }
  private  java.nio.channels.spi.AbstractSelector selector () { throw new RuntimeException(); }
  private  io.netty.util.HashedWheelTimer ackTimeoutMonitor () { throw new RuntimeException(); }
  private  int ackTimeout () { throw new RuntimeException(); }
  private  int handlerThreadCount () { throw new RuntimeException(); }
  private  int ioThreadCount () { throw new RuntimeException(); }
  private  int connectThreadCount () { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor handleMessageExecutor () { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor handleReadWriteExecutor () { throw new RuntimeException(); }
  private  java.util.concurrent.ThreadPoolExecutor handleConnectExecutor () { throw new RuntimeException(); }
  private  java.nio.channels.ServerSocketChannel serverChannel () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.network.nio.ConnectionId, org.apache.spark.network.nio.SendingConnection> connectionsAwaitingSasl () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.nio.channels.SelectionKey, org.apache.spark.network.nio.Connection> connectionsByKey () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.network.nio.ConnectionManagerId, org.apache.spark.network.nio.SendingConnection> connectionsById () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.network.nio.ConnectionManager.MessageStatus> messageStatuses () { throw new RuntimeException(); }
  private  scala.collection.mutable.SynchronizedQueue<scala.Tuple2<java.nio.channels.SelectionKey, java.lang.Object>> keyInterestChangeRequests () { throw new RuntimeException(); }
  private  scala.collection.mutable.SynchronizedQueue<org.apache.spark.network.nio.SendingConnection> registerRequests () { throw new RuntimeException(); }
  public  scala.concurrent.ExecutionContextExecutor futureExecContext () { throw new RuntimeException(); }
  private  scala.Function2<org.apache.spark.network.nio.BufferMessage, org.apache.spark.network.nio.ConnectionManagerId, scala.Option<org.apache.spark.network.nio.Message>> onReceiveCallback () { throw new RuntimeException(); }
  private  boolean authEnabled () { throw new RuntimeException(); }
  private  scala.Tuple2<java.nio.channels.ServerSocketChannel, java.lang.Object> startService (int port) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.ConnectionManagerId id () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger idCount () { throw new RuntimeException(); }
  private  java.lang.Thread selectorThread () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.nio.channels.SelectionKey> writeRunnableStarted () { throw new RuntimeException(); }
  private  void triggerWrite (java.nio.channels.SelectionKey key) { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.nio.channels.SelectionKey> readRunnableStarted () { throw new RuntimeException(); }
  private  void triggerRead (java.nio.channels.SelectionKey key) { throw new RuntimeException(); }
  private  void triggerConnect (java.nio.channels.SelectionKey key) { throw new RuntimeException(); }
  private  void triggerForceCloseByException (java.nio.channels.SelectionKey key, java.lang.Exception e) { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
  public  void acceptConnection (java.nio.channels.SelectionKey key) { throw new RuntimeException(); }
  private  void addListeners (org.apache.spark.network.nio.Connection connection) { throw new RuntimeException(); }
  public  void addConnection (org.apache.spark.network.nio.Connection connection) { throw new RuntimeException(); }
  public  void removeConnection (org.apache.spark.network.nio.Connection connection) { throw new RuntimeException(); }
  public  void handleConnectionError (org.apache.spark.network.nio.Connection connection, java.lang.Throwable e) { throw new RuntimeException(); }
  public  void changeConnectionKeyInterest (org.apache.spark.network.nio.Connection connection, int ops) { throw new RuntimeException(); }
  public  void receiveMessage (org.apache.spark.network.nio.Connection connection, org.apache.spark.network.nio.Message message) { throw new RuntimeException(); }
  private  void handleClientAuthentication (org.apache.spark.network.nio.SendingConnection waitingConn, org.apache.spark.network.nio.SecurityMessage securityMsg, org.apache.spark.network.nio.ConnectionId connectionId) { throw new RuntimeException(); }
  private  void handleServerAuthentication (org.apache.spark.network.nio.Connection connection, org.apache.spark.network.nio.SecurityMessage securityMsg, org.apache.spark.network.nio.ConnectionId connectionId) { throw new RuntimeException(); }
  private  boolean handleAuthentication (org.apache.spark.network.nio.Connection conn, org.apache.spark.network.nio.BufferMessage bufferMessage) { throw new RuntimeException(); }
  private  void handleMessage (org.apache.spark.network.nio.ConnectionManagerId connectionManagerId, org.apache.spark.network.nio.Message message, org.apache.spark.network.nio.Connection connection) { throw new RuntimeException(); }
  private  void checkSendAuthFirst (org.apache.spark.network.nio.ConnectionManagerId connManagerId, org.apache.spark.network.nio.SendingConnection conn) { throw new RuntimeException(); }
  private  void sendSecurityMessage (org.apache.spark.network.nio.ConnectionManagerId connManagerId, org.apache.spark.network.nio.Message message) { throw new RuntimeException(); }
  private  void sendMessage (org.apache.spark.network.nio.ConnectionManagerId connectionManagerId, org.apache.spark.network.nio.Message message) { throw new RuntimeException(); }
  private  void reportSendingMessageFailure (int messageId, java.lang.Throwable e) { throw new RuntimeException(); }
  private  void wakeupSelector () { throw new RuntimeException(); }
  /**
   * Send a message and block until an acknowledgment is received or an error occurs.
   * @param connectionManagerId the message's destination
   * @param message the message being sent
   * @return a Future that either returns the acknowledgment message or captures an exception.
   */
  public  scala.concurrent.Future<org.apache.spark.network.nio.Message> sendMessageReliably (org.apache.spark.network.nio.ConnectionManagerId connectionManagerId, org.apache.spark.network.nio.Message message) { throw new RuntimeException(); }
  public  void onReceiveMessage (scala.Function2<org.apache.spark.network.nio.Message, org.apache.spark.network.nio.ConnectionManagerId, scala.Option<org.apache.spark.network.nio.Message>> callback) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
}
