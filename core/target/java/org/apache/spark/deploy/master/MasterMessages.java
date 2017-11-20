package org.apache.spark.deploy.master;
public  interface MasterMessages extends scala.Serializable {
  // no position
  static public  class ElectedLeader$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ElectedLeader$ MODULE$ = null;
    public   ElectedLeader$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class RevokedLeadership$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RevokedLeadership$ MODULE$ = null;
    public   RevokedLeadership$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class CheckForWorkerTimeOut$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckForWorkerTimeOut$ MODULE$ = null;
    public   CheckForWorkerTimeOut$ () { throw new RuntimeException(); }
  }
  static public  class BeginRecovery implements scala.Product, scala.Serializable {
    public  scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo> storedApps () { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo> storedWorkers () { throw new RuntimeException(); }
    // not preceding
    public   BeginRecovery (scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo> storedApps, scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo> storedWorkers) { throw new RuntimeException(); }
  }
  // no position
  // not preceding
  static public  class BeginRecovery$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo>, scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo>, org.apache.spark.deploy.master.MasterMessages.BeginRecovery> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BeginRecovery$ MODULE$ = null;
    public   BeginRecovery$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class CompleteRecovery$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CompleteRecovery$ MODULE$ = null;
    public   CompleteRecovery$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class RequestWebUIPort$ implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RequestWebUIPort$ MODULE$ = null;
    public   RequestWebUIPort$ () { throw new RuntimeException(); }
  }
  static public  class WebUIPortResponse implements scala.Product, scala.Serializable {
    public  int webUIBoundPort () { throw new RuntimeException(); }
    // not preceding
    public   WebUIPortResponse (int webUIBoundPort) { throw new RuntimeException(); }
  }
  // no position
  static public  class WebUIPortResponse$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.deploy.master.MasterMessages.WebUIPortResponse> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WebUIPortResponse$ MODULE$ = null;
    public   WebUIPortResponse$ () { throw new RuntimeException(); }
  }
}
