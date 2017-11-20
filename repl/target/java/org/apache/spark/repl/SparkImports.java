package org.apache.spark.repl;
public  interface SparkImports {
  public  boolean isNoImports () ;
  public  boolean isNoPredef () ;
  /** Synthetic import handlers for the language defined imports. */
  public  org.apache.spark.repl.SparkMemberHandlers.ImportHandler makeWildcardImportHandler (scala.reflect.internal.Symbols.Symbol sym) ;
  /** Symbols whose contents are language-defined to be imported. */
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> languageWildcardSyms () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Types.Type> languageWildcards () ;
  public  scala.collection.immutable.List<org.apache.spark.repl.SparkMemberHandlers.ImportHandler> languageWildcardHandlers () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> allImportedNames () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Names.TermName> importedTerms () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Names.TypeName> importedTypes () ;
  /** Types which have been wildcard imported, such as:
   *    val x = "abc" ; import x._  // type java.lang.String
   *    import java.lang.String._   // object java.lang.String
   * <p>
   *  Used by tab completion.
   * <p>
   *  XXX right now this gets import x._ and import java.lang.String._,
   *  but doesn't figure out import String._.  There's a lot of ad hoc
   *  scope twiddling which should be swept away in favor of digging
   *  into the compiler scopes.
   */
  public  scala.collection.immutable.List<scala.reflect.internal.Types.Type> sessionWildcards () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Types.Type> wildcardTypes () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> languageSymbols () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> sessionImportedSymbols () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> importedSymbols () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.TermSymbol> importedTermSymbols () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.TypeSymbol> importedTypeSymbols () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> implicitSymbols () ;
  public  scala.reflect.internal.Symbols.Symbol importedTermNamed (java.lang.String name) ;
  /** Tuples of (source, imported symbols) in the order they were imported.
   */
  public  scala.collection.immutable.List<scala.Tuple2<scala.reflect.internal.Symbols.Symbol, scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol>>> importedSymbolsBySource () ;
  public  scala.collection.immutable.List<scala.Tuple2<scala.reflect.internal.Symbols.Symbol, scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol>>> implicitSymbolsBySource () ;
  /** Compute imports that allow definitions from previous
   *  requests to be visible in a new request.  Returns
   *  three pieces of related code:
   * <p>
   *  1. An initial code fragment that should go before
   *  the code of the new request.
   * <p>
   *  2. A code fragment that should go after the code
   *  of the new request.
   * <p>
   *  3. An access path which can be traversed to access
   *  any bindings inside code wrapped by #1 and #2 .
   * <p>
   * The argument is a set of Names that need to be imported.
   * <p>
   * Limitations: This method is not as precise as it could be.
   * (1) It does not process wildcard imports to see what exactly
   * they import.
   * (2) If it imports any names from a request, it imports all
   * of them, which is not really necessary.
   * (3) It imports multiple same-named implicits, but only the
   * last one imported is actually usable.
   */
  public  class SparkComputedImports implements scala.Product, scala.Serializable {
    public  java.lang.String prepend () { throw new RuntimeException(); }
    public  java.lang.String append () { throw new RuntimeException(); }
    public  java.lang.String access () { throw new RuntimeException(); }
    // not preceding
    public   SparkComputedImports (java.lang.String prepend, java.lang.String append, java.lang.String access) { throw new RuntimeException(); }
  }
  // no position
  public  class SparkComputedImports extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.repl.SparkImports.SparkComputedImports> implements scala.Serializable {
    public   SparkComputedImports () { throw new RuntimeException(); }
  }
  public  boolean fallback () ;
  public  org.apache.spark.repl.SparkImports.SparkComputedImports importsCode (scala.collection.immutable.Set<scala.reflect.internal.Names.Name> wanted, boolean definedClass) ;
  public  scala.collection.immutable.List<scala.Tuple2<org.apache.spark.repl.SparkIMain.Request, org.apache.spark.repl.SparkMemberHandlers.MemberHandler>> allReqAndHandlers () ;
  public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> membersAtPickler (scala.reflect.internal.Symbols.Symbol sym) ;
  public  int curValId () ;
  public  int newValId () ;
}
