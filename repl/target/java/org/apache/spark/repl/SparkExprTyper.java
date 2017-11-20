package org.apache.spark.repl;
public  interface SparkExprTyper extends org.apache.spark.Logging {
  public  org.apache.spark.repl.SparkIMain repl () ;
  // no position
  public  class codeParser implements scala.tools.nsc.interpreter.CodeHandlers<scala.reflect.internal.Trees.Tree> {
    public  scala.tools.nsc.Global global () { throw new RuntimeException(); }
    // not preceding
    public   codeParser () { throw new RuntimeException(); }
    public <T extends java.lang.Object> T applyRule (java.lang.String code, scala.Function1<scala.tools.nsc.ast.parser.Parsers.UnitParser, T> rule) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Trees.DefTree> defns (java.lang.String code) { throw new RuntimeException(); }
    public  scala.reflect.internal.Trees.Tree expr (java.lang.String code) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Trees.Tree> stmts (java.lang.String code) { throw new RuntimeException(); }
    public  scala.reflect.internal.Trees.Tree stmt (java.lang.String code) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkExprTyper.codeParser$ codeParser () ;
  /** Parse a line into a sequence of trees. Returns None if the input is incomplete. */
  public  scala.Option<scala.collection.immutable.List<scala.reflect.internal.Trees.Tree>> parse (java.lang.String line) ;
  public  scala.reflect.internal.Symbols.Symbol symbolOfLine (java.lang.String code) ;
  public  int typeOfExpressionDepth () ;
  public  scala.reflect.internal.Types.Type typeOfExpression (java.lang.String expr, boolean silent) ;
}
