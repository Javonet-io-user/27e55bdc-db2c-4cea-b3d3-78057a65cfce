package LibGit2Sharp;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import LibGit2Sharp.*;
import jio.System.Collections.Generic.*;
import LibGit2Sharp.Handlers.*;
import jio.System.*;

public class Repository implements IRepository, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public Branch getHead() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Head");
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Configuration getConfig() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Config");
      if (res == null) return null;
      return new Configuration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Index getIndex() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Index");
      if (res == null) return null;
      return new Index((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Ignore getIgnore() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Ignore");
      if (res == null) return null;
      return new Ignore((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Network getNetwork() {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Network");
      if (res == null) return null;
      return new Network((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Rebase getRebase() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Rebase");
      if (res == null) return null;
      return new Rebase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ObjectDatabase getObjectDatabase() {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_ObjectDatabase");
      if (res == null) return null;
      return new ObjectDatabase((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ReferenceCollection getRefs() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Refs");
      if (res == null) return null;
      return new ReferenceCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IQueryableCommitLog getCommits() {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Commits");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public BranchCollection getBranches() {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Branches");
      if (res == null) return null;
      return new BranchCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public TagCollection getTags() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Tags");
      if (res == null) return null;
      return new TagCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public StashCollection getStashes() {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Stashes");
      if (res == null) return null;
      return new StashCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public RepositoryInformation getInfo() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Info");
      if (res == null) return null;
      return new RepositoryInformation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Diff getDiff() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Diff");
      if (res == null) return null;
      return new Diff((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public NoteCollection getNotes() {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Notes");
      if (res == null) return null;
      return new NoteCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public SubmoduleCollection getSubmodules() {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("get_Submodules");
      if (res == null) return null;
      return new SubmoduleCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Repository() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.Repository");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Repository(java.lang.String path) {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.Repository", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Repository(java.lang.String path, RepositoryOptions options) {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.Repository", path, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Repository(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Branch Checkout(Branch branch, CheckoutOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Checkout", branch, options);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Checkout(java.lang.String committishOrBranchSpec, CheckoutOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Checkout", committishOrBranchSpec, options);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Checkout(Commit commit, CheckoutOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Checkout", commit, options);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Checkout(Tree tree, IEnumerable<java.lang.String> paths, CheckoutOptions options) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Checkout", tree, paths, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CheckoutPaths(
      java.lang.String committishOrBranchSpec,
      IEnumerable<java.lang.String> paths,
      CheckoutOptions checkoutOptions) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("CheckoutPaths", committishOrBranchSpec, paths, checkoutOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public GitObject Lookup(ObjectId id) {
    try {
      Object res = javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("Lookup", id);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public GitObject Lookup(java.lang.String objectish) {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("Lookup", objectish);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public GitObject Lookup(ObjectId id, ObjectType type) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Lookup", id, NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public GitObject Lookup(java.lang.String objectish, ObjectType type) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Lookup", objectish, NEnum.fromJavaEnum(type));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Commit Commit(
      java.lang.String message, Signature author, Signature committer, CommitOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Commit", message, author, committer, options);
      if (res == null) return null;
      return new Commit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Reset(ResetMode resetMode, Commit commit) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Reset", NEnum.fromJavaEnum(resetMode), commit);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Reset(ResetMode resetMode, Commit commit, CheckoutOptions opts) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Reset", NEnum.fromJavaEnum(resetMode), commit, opts);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RemoveUntrackedFiles() {
    try {
      javonetHandle.explicitInterface("LibGit2Sharp.IRepository").invoke("RemoveUntrackedFiles");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public RevertResult Revert(Commit commit, Signature reverter, RevertOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Revert", commit, reverter, options);
      if (res == null) return null;
      return new RevertResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public MergeResult Merge(Commit commit, Signature merger, MergeOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Merge", commit, merger, options);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public MergeResult Merge(Branch branch, Signature merger, MergeOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Merge", branch, merger, options);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public MergeResult Merge(java.lang.String committish, Signature merger, MergeOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Merge", committish, merger, options);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public MergeResult MergeFetchedRefs(Signature merger, MergeOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("MergeFetchedRefs", merger, options);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public CherryPickResult CherryPick(
      Commit commit, Signature committer, CherryPickOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("CherryPick", commit, committer, options);
      if (res == null) return null;
      return new CherryPickResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public BlameHunkCollection Blame(java.lang.String path, BlameOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Blame", path, options);
      if (res == null) return null;
      return new BlameHunkCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Stage(java.lang.String path, StageOptions stageOptions) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Stage", path, stageOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Stage(IEnumerable<java.lang.String> paths, StageOptions stageOptions) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Stage", paths, stageOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Unstage(java.lang.String path, ExplicitPathsOptions explicitPathsOptions) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Unstage", path, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Unstage(
      IEnumerable<java.lang.String> paths, ExplicitPathsOptions explicitPathsOptions) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Unstage", paths, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Move(java.lang.String sourcePath, java.lang.String destinationPath) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Move", sourcePath, destinationPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Move(
      IEnumerable<java.lang.String> sourcePaths, IEnumerable<java.lang.String> destinationPaths) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Move", sourcePaths, destinationPaths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(
      java.lang.String path,
      java.lang.Boolean removeFromWorkingDirectory,
      ExplicitPathsOptions explicitPathsOptions) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Remove", path, removeFromWorkingDirectory, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(
      IEnumerable<java.lang.String> paths,
      java.lang.Boolean removeFromWorkingDirectory,
      ExplicitPathsOptions explicitPathsOptions) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("Remove", paths, removeFromWorkingDirectory, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public FileStatus RetrieveStatus(java.lang.String filePath) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("RetrieveStatus", filePath);
      if (res == null) return null;
      return FileStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public RepositoryStatus RetrieveStatus(StatusOptions options) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("RetrieveStatus", options);
      if (res == null) return null;
      return new RepositoryStatus((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String Describe(Commit commit, DescribeOptions options) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IRepository")
              .invoke("Describe", commit, options);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void RevParse(java.lang.String revision, Reference reference, GitObject obj) {
    try {
      javonetHandle
          .explicitInterface("LibGit2Sharp.IRepository")
          .invoke("RevParse", revision, reference, obj);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Boolean IsValid(java.lang.String path) {
    try {
      java.lang.Boolean res = Javonet.getType("Repository").invoke("IsValid", path);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static java.lang.String Init(java.lang.String path) {
    try {
      java.lang.String res = Javonet.getType("Repository").invoke("Init", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String Init(java.lang.String path, java.lang.Boolean isBare) {
    try {
      java.lang.String res = Javonet.getType("Repository").invoke("Init", path, isBare);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String Init(
      java.lang.String workingDirectoryPath, java.lang.String gitDirectoryPath) {
    try {
      java.lang.String res =
          Javonet.getType("Repository").invoke("Init", workingDirectoryPath, gitDirectoryPath);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static IEnumerable<Reference> ListRemoteReferences(java.lang.String url) {
    try {
      Object res = Javonet.getType("Repository").invoke("ListRemoteReferences", url);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static IEnumerable<Reference> ListRemoteReferences(
      java.lang.String url, CredentialsHandler credentialsProvider) {
    try {
      Object res =
          Javonet.getType("Repository").invoke("ListRemoteReferences", url, credentialsProvider);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.String Discover(java.lang.String startingPath) {
    try {
      java.lang.String res = Javonet.getType("Repository").invoke("Discover", startingPath);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String Clone(java.lang.String sourceUrl, java.lang.String workdirPath) {
    try {
      java.lang.String res = Javonet.getType("Repository").invoke("Clone", sourceUrl, workdirPath);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String Clone(
      java.lang.String sourceUrl, java.lang.String workdirPath, CloneOptions options) {
    try {
      java.lang.String res =
          Javonet.getType("Repository").invoke("Clone", sourceUrl, workdirPath, options);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
