package org.apache.spark.repl;
public  interface SparkMemberHandlers {
  public  org.apache.spark.repl.SparkIMain intp () ;
  public  java.lang.String codegenln (boolean leadingPlus, scala.collection.Seq<java.lang.String> xs) ;
  public  java.lang.String codegenln (scala.collection.Seq<java.lang.String> xs) ;
  public  java.lang.String codegen (scala.collection.Seq<java.lang.String> xs) ;
  public  java.lang.String codegen (boolean leadingPlus, scala.collection.Seq<java.lang.String> xs) ;
  public  java.lang.String name2string (scala.reflect.internal.Names.Name name) ;
  /** A traverser that finds all mentioned identifiers, i.e. things
   *  that need to be imported.  It might return extra names.
   */
  private  class ImportVarsTraverser extends scala.reflect.api.Trees.Traverser {
    public   ImportVarsTraverser () { throw new RuntimeException(); }
    public  scala.collection.mutable.HashSet<scala.reflect.internal.Names.Name> importVars () { throw new RuntimeException(); }
    public  void traverse (scala.reflect.internal.Trees.Tree ast) { throw new RuntimeException(); }
  }
  // no position
  private  class ImportVarsTraverser {
    public   ImportVarsTraverser () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> apply (scala.reflect.internal.Trees.Tree member) { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.repl.SparkMemberHandlers.ImportVarsTraverser$ ImportVarsTraverser () ;
  public  org.apache.spark.repl.SparkMemberHandlers.MemberHandler chooseHandler (scala.reflect.internal.Trees.Tree member) ;
  public abstract class MemberDefHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberHandler {
    public  scala.reflect.internal.Trees.MemberDef member () { throw new RuntimeException(); }
    // not preceding
    public   MemberDefHandler (scala.reflect.internal.Trees.MemberDef member) { throw new RuntimeException(); }
    public  scala.reflect.internal.Symbols.Symbol symbol () { throw new RuntimeException(); }
    public  scala.reflect.internal.Names.Name name () { throw new RuntimeException(); }
    public  scala.reflect.internal.Trees.Modifiers mods () { throw new RuntimeException(); }
    public  java.lang.String keyword () { throw new RuntimeException(); }
    public  java.lang.String prettyName () { throw new RuntimeException(); }
    public  boolean definesImplicit () { throw new RuntimeException(); }
    public  scala.Option<scala.reflect.internal.Names.TermName> definesTerm () { throw new RuntimeException(); }
    public  scala.Option<scala.reflect.internal.Names.TypeName> definesType () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> definedSymbols () { throw new RuntimeException(); }
  }
  /** Class to handle one member among all the members included
   *  in a single interpreter request.
   */
  public abstract class MemberHandler {
    public  scala.reflect.internal.Trees.Tree member () { throw new RuntimeException(); }
    // not preceding
    public   MemberHandler (scala.reflect.internal.Trees.Tree member) { throw new RuntimeException(); }
    public  boolean definesImplicit () { throw new RuntimeException(); }
    public  boolean definesValue () { throw new RuntimeException(); }
    public  boolean isLegalTopLevel () { throw new RuntimeException(); }
    public  scala.Option<scala.reflect.internal.Names.TermName> definesTerm () { throw new RuntimeException(); }
    public  scala.Option<scala.reflect.internal.Names.TypeName> definesType () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> referencedNames () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> importedNames () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> definedNames () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> definedOrImported () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> definedSymbols () { throw new RuntimeException(); }
    public  java.lang.String extraCodeToEvaluate (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
    private  java.lang.String shortName () { throw new RuntimeException(); }
    public  java.lang.String toString () { throw new RuntimeException(); }
  }
  public  class GenericHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberHandler {
    public   GenericHandler (scala.reflect.internal.Trees.Tree member) { throw new RuntimeException(); }
  }
  public  class ValHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberDefHandler {
    public   ValHandler (scala.reflect.internal.Trees.ValDef member) { throw new RuntimeException(); }
    public  int maxStringElements () { throw new RuntimeException(); }
    public  boolean definesValue () { throw new RuntimeException(); }
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  }
  public  class DefHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberDefHandler {
    public   DefHandler (scala.reflect.internal.Trees.DefDef member) { throw new RuntimeException(); }
    private  scala.collection.immutable.List<scala.collection.immutable.List<scala.reflect.internal.Trees.ValDef>> vparamss () { throw new RuntimeException(); }
    private  boolean isMacro () { throw new RuntimeException(); }
    public  boolean definesValue () { throw new RuntimeException(); }
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  }
  public  class AssignHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberHandler {
    public   AssignHandler (scala.reflect.internal.Trees.Assign member) { throw new RuntimeException(); }
    public  scala.reflect.internal.Trees.Tree lhs () { throw new RuntimeException(); }
    public  scala.reflect.internal.Trees.Tree rhs () { throw new RuntimeException(); }
    public  scala.reflect.internal.Names.TermName name () { throw new RuntimeException(); }
    public  scala.Some<scala.reflect.internal.Names.TermName> definesTerm () { throw new RuntimeException(); }
    public  boolean definesValue () { throw new RuntimeException(); }
    public  java.lang.String extraCodeToEvaluate (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
    /** Print out lhs instead of the generated varName */
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  }
  public  class ModuleHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberDefHandler {
    public   ModuleHandler (scala.reflect.internal.Trees.ModuleDef module) { throw new RuntimeException(); }
    public  scala.Some<scala.reflect.internal.Names.TermName> definesTerm () { throw new RuntimeException(); }
    public  boolean definesValue () { throw new RuntimeException(); }
    public  boolean isLegalTopLevel () { throw new RuntimeException(); }
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  }
  public  class ClassHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberDefHandler {
    public   ClassHandler (scala.reflect.internal.Trees.ClassDef member) { throw new RuntimeException(); }
    public  scala.Some<scala.reflect.internal.Names.TypeName> definesType () { throw new RuntimeException(); }
    public  scala.Option<scala.reflect.internal.Names.TermName> definesTerm () { throw new RuntimeException(); }
    public  boolean isLegalTopLevel () { throw new RuntimeException(); }
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  }
  public  class TypeAliasHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberDefHandler {
    public   TypeAliasHandler (scala.reflect.internal.Trees.TypeDef member) { throw new RuntimeException(); }
    private  boolean isAlias () { throw new RuntimeException(); }
    public  scala.Option<scala.reflect.internal.Names.TypeName> definesType () { throw new RuntimeException(); }
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  }
  public  class ImportHandler extends org.apache.spark.repl.SparkMemberHandlers.MemberHandler {
    public   ImportHandler (scala.reflect.internal.Trees.Import imp) { throw new RuntimeException(); }
    public  scala.reflect.internal.Trees.Tree expr () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Trees.ImportSelector> selectors () { throw new RuntimeException(); }
    public  scala.reflect.internal.Types.Type targetType () { throw new RuntimeException(); }
    public  boolean isLegalTopLevel () { throw new RuntimeException(); }
    public  java.lang.String createImportForName (scala.reflect.internal.Names.Name name) { throw new RuntimeException(); }
    public  boolean isPredefImport () { throw new RuntimeException(); }
    private  scala.collection.immutable.List<scala.reflect.internal.Trees.ImportSelector> selectorWild () { throw new RuntimeException(); }
    private  scala.collection.immutable.List<scala.reflect.internal.Names.Name> selectorRenames () { throw new RuntimeException(); }
    /** Whether this import includes a wildcard import */
    public  boolean importsWildcard () { throw new RuntimeException(); }
    /** Whether anything imported is implicit .*/
    public  boolean importsImplicit () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> implicitSymbols () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> importedSymbols () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> individualSymbols () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Symbols.Symbol> wildcardSymbols () { throw new RuntimeException(); }
    /** Complete list of names imported by a wildcard */
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> wildcardNames () { throw new RuntimeException(); }
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> individualNames () { throw new RuntimeException(); }
    /** The names imported by this statement */
    public  scala.collection.immutable.List<scala.reflect.internal.Names.Name> importedNames () { throw new RuntimeException(); }
    public  scala.collection.immutable.Set<java.lang.String> importsSymbolNamed () { throw new RuntimeException(); }
    public  java.lang.String importString () { throw new RuntimeException(); }
    public  java.lang.String resultExtractionCode (org.apache.spark.repl.SparkIMain.Request req) { throw new RuntimeException(); }
  }
}
