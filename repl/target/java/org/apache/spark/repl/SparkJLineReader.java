package org.apache.spark.repl;
/**
 *  Reads from the console using JLine.
 */
public  class SparkJLineReader implements scala.tools.nsc.interpreter.InteractiveReader {
  public   SparkJLineReader (scala.Function0<scala.tools.nsc.interpreter.Completion> _completion) { throw new RuntimeException(); }
  public  boolean interactive () { throw new RuntimeException(); }
  public  org.apache.spark.repl.SparkJLineReader.JLineConsoleReader consoleReader () { throw new RuntimeException(); }
  public  scala.tools.nsc.interpreter.Completion completion () { throw new RuntimeException(); }
  public  scala.tools.nsc.interpreter.session.JLineHistory history () { throw new RuntimeException(); }
  private  scala.tools.jline.Terminal term () { throw new RuntimeException(); }
  public  void reset () { throw new RuntimeException(); }
  public  void init () { throw new RuntimeException(); }
  public  scala.tools.jline.console.completer.Completer scalaToJline (scala.tools.nsc.interpreter.Completion.ScalaCompleter tc) { throw new RuntimeException(); }
  public  class JLineConsoleReader extends scala.tools.jline.console.ConsoleReader implements scala.tools.nsc.interpreter.ConsoleReaderHelper {
    public   JLineConsoleReader () { throw new RuntimeException(); }
    public  void goBack (int num) { throw new RuntimeException(); }
    public  int readOneKey (java.lang.String prompt) { throw new RuntimeException(); }
    public  void eraseLine () { throw new RuntimeException(); }
    public  void redrawLineAndFlush () { throw new RuntimeException(); }
    public  void postInit () { throw new RuntimeException(); }
  }
  public  java.lang.String currentLine () { throw new RuntimeException(); }
  public  void redrawLine () { throw new RuntimeException(); }
  public  void eraseLine () { throw new RuntimeException(); }
  public  java.lang.String readOneLine (java.lang.String prompt) { throw new RuntimeException(); }
  public  int readOneKey (java.lang.String prompt) { throw new RuntimeException(); }
}
