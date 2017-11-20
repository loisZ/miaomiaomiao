package org.apache.spark.repl;
public  class SparkJLineCompletion implements scala.tools.nsc.interpreter.Completion, scala.tools.nsc.interpreter.CompletionOutput, org.apache.spark.Logging {
  public  org.apache.spark.repl.SparkIMain intp () { throw new RuntimeException(); }
  // not preceding
  public   SparkJLineCompletion (org.apache.spark.repl.SparkIMain intp) { throw new RuntimeException(); }
  public  scala.tools.nsc.Global global () { throw new RuntimeException(); }
  private  int verbosity () { throw new RuntimeException(); }
  public  void resetVerbosity () { throw new RuntimeException(); }
  public  scala.reflect.internal.Symbols.Symbol getSymbol (java.lang.String name, boolean isModule) { throw new RuntimeException(); }
  public  scala.reflect.internal.Types.Type getType (java.lang.String name, boolean isModule) { throw new RuntimeException(); }
  public  scala.reflect.internal.Types.Type typeOf (java.lang.String name) { throw new RuntimeException(); }
  public  scala.reflect.internal.Types.Type moduleOf (java.lang.String name) { throw new RuntimeException(); }
  public  interface CompilerCompletion {
    public  scala.reflect.internal.Types.Type tp () ;
    public  scala.reflect.internal.Types.Type effectiveTp () ;
    public  scala.reflect.internal.Scopes.Scope anyMembers () ;
    public  scala.collection.immutable.Set<java.lang.String> anyRefMethodsToShow () ;
    public  java.lang.String tos (scala.reflect.internal.Symbols.Symbol sym) ;
    public  scala.reflect.internal.Symbols.Symbol memberNamed (java.lang.String s) ;
    public  boolean hasMethod (java.lang.String s) ;
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> members () ;
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> methods () ;
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> packages () ;
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> aliases () ;
    public  scala.collection.immutable.List<java.lang.String> memberNames () ;
    public  scala.collection.immutable.List<java.lang.String> methodNames () ;
    public  scala.collection.immutable.List<java.lang.String> packageNames () ;
    public  scala.collection.immutable.List<java.lang.String> aliasNames () ;
  }
  // no position
  public  class NoTypeCompletion extends org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion {
    public   NoTypeCompletion () { throw new RuntimeException(); }
    public  scala.reflect.internal.Symbols.NoSymbol memberNamed (java.lang.String s) { throw new RuntimeException(); }
    public  scala.collection.immutable.Nil$ members () { throw new RuntimeException(); }
    public  scala.None$ follow (java.lang.String s) { throw new RuntimeException(); }
    public  scala.collection.immutable.Nil$ alternativesFor (java.lang.String id) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.NoTypeCompletion$ NoTypeCompletion () { throw new RuntimeException(); }
  // no position
  public  class TypeMemberCompletion {
    public   TypeMemberCompletion () { throw new RuntimeException(); }
    public  org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion apply (scala.reflect.internal.Types.Type tp, scala.reflect.internal.Types.Type runtimeType, scala.tools.nsc.interpreter.NamedParam param) { throw new RuntimeException(); }
    public  org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion apply (scala.reflect.internal.Types.Type tp) { throw new RuntimeException(); }
    public  org.apache.spark.repl.SparkJLineCompletion.ImportCompletion imported (scala.reflect.internal.Types.Type tp) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion$ TypeMemberCompletion () { throw new RuntimeException(); }
  public  class TypeMemberCompletion implements scala.tools.nsc.interpreter.CompletionAware, org.apache.spark.repl.SparkJLineCompletion.CompilerCompletion {
    public  scala.reflect.internal.Types.Type tp () { throw new RuntimeException(); }
    // not preceding
    public   TypeMemberCompletion (scala.reflect.internal.Types.Type tp) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeEndsWith () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeStartsWith () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeNames () { throw new RuntimeException(); }
    public  java.lang.String methodSignatureString (scala.reflect.internal.Symbols.Symbol sym) { throw new RuntimeException(); }
    public  boolean exclude (java.lang.String name) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> filtered (scala.collection.immutable.List<java.lang.String> xs) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
    public  scala.Option<scala.tools.nsc.interpreter.CompletionAware> follow (java.lang.String s) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> alternativesFor (java.lang.String id) { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  public  class PackageCompletion extends org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion {
    public   PackageCompletion (scala.reflect.internal.Types.Type tp) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeNames () { throw new RuntimeException(); }
  }
  public  class LiteralCompletion extends org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion {
    public   LiteralCompletion (scala.reflect.internal.Trees.Literal lit) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
  }
  public  class ImportCompletion extends org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion {
    public   ImportCompletion (scala.reflect.internal.Types.Type tp) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
  }
  // no position
  public  class anyref extends org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion {
    public   anyref () { throw new RuntimeException(); }
  }
  public  org.apache.spark.repl.SparkJLineCompletion.anyref$ anyref () { throw new RuntimeException(); }
  // no position
  public  class ids implements scala.tools.nsc.interpreter.CompletionAware {
    public   ids () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
    public  scala.Option<scala.tools.nsc.interpreter.CompletionAware> follow (java.lang.String id) { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.ids$ ids () { throw new RuntimeException(); }
  private  scala.collection.immutable.List<org.apache.spark.repl.SparkJLineCompletion.ImportCompletion> imported () { throw new RuntimeException(); }
  // no position
  public  class literals implements scala.tools.nsc.interpreter.CompletionAware {
    public   literals () { throw new RuntimeException(); }
    public  scala.reflect.internal.Trees.Tree simpleParse (java.lang.String code) { throw new RuntimeException(); }
    public  scala.collection.immutable.Nil$ completions (int verbosity) { throw new RuntimeException(); }
    public  scala.Option<scala.tools.nsc.interpreter.CompletionAware> follow (java.lang.String id) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.literals$ literals () { throw new RuntimeException(); }
  // no position
  public  class rootClass extends org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion {
    public   rootClass () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
    public  scala.Option<scala.tools.nsc.interpreter.CompletionAware> follow (java.lang.String id) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.rootClass$ rootClass () { throw new RuntimeException(); }
  // no position
  public  class predef extends org.apache.spark.repl.SparkJLineCompletion.TypeMemberCompletion {
    public   predef () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeEndsWith () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeStartsWith () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeNames () { throw new RuntimeException(); }
    public  boolean exclude (java.lang.String name) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.predef$ predef () { throw new RuntimeException(); }
  // no position
  public  class scalalang extends org.apache.spark.repl.SparkJLineCompletion.PackageCompletion {
    public   scalalang () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> arityClasses () { throw new RuntimeException(); }
    public  boolean skipArity (java.lang.String name) { throw new RuntimeException(); }
    public  boolean exclude (java.lang.String name) { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.scalalang$ scalalang () { throw new RuntimeException(); }
  // no position
  public  class javalang extends org.apache.spark.repl.SparkJLineCompletion.PackageCompletion {
    public   javalang () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeEndsWith () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> excludeStartsWith () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.String> completions (int verbosity) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkJLineCompletion.javalang$ javalang () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.CompletionAware> topLevelBase () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.CompletionAware> topLevel () { throw new RuntimeException(); }
  public  int topLevelThreshold () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.String> topLevelFor (scala.tools.nsc.interpreter.Parsed parsed) { throw new RuntimeException(); }
  public  scala.tools.nsc.interpreter.CompletionAware lastResult () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.String> lastResultFor (scala.tools.nsc.interpreter.Parsed parsed) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.String> completions (java.lang.String buf) { throw new RuntimeException(); }
  public  scala.tools.nsc.interpreter.Completion.ScalaCompleter completer () { throw new RuntimeException(); }
  /** This gets a little bit hairy.  It's no small feat delegating everything
   *  and also keeping track of exactly where the cursor is and where it's supposed
   *  to end up.  The alternatives mechanism is a little hacky: if there is an empty
   *  string in the list of completions, that means we are expanding a unique
   *  completion, so don't update the "last" buffer because it'll be wrong.
   */
  public  class JLineTabCompletion implements scala.tools.nsc.interpreter.Completion.ScalaCompleter {
    public   JLineTabCompletion () { throw new RuntimeException(); }
    private  java.lang.String lastBuf () { throw new RuntimeException(); }
    private  int lastCursor () { throw new RuntimeException(); }
    public  boolean isConsecutiveTabs (java.lang.String buf, int cursor) { throw new RuntimeException(); }
    public  java.lang.String commonPrefix (scala.collection.immutable.List<java.lang.String> xs) { throw new RuntimeException(); }
    public  scala.tools.nsc.interpreter.Completion.Candidates complete (java.lang.String buf, int cursor) { throw new RuntimeException(); }
  }
}
