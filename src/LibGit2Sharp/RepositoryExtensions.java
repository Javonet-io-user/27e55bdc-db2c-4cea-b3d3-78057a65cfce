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

public class RepositoryExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static <T> T Lookup(
      IRepository repository, java.lang.String objectish, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .generic(getReturnObjectName(returnType))
              .invoke("Lookup", repository, objectish);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static <T> T Lookup(IRepository repository, ObjectId id, Class<?> returnType) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .generic(getReturnObjectName(returnType))
              .invoke("Lookup", repository, id);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Tag ApplyTag(IRepository repository, java.lang.String tagName) {
    try {
      Object res = Javonet.getType("RepositoryExtensions").invoke("ApplyTag", repository, tagName);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Tag ApplyTag(
      IRepository repository, java.lang.String tagName, java.lang.String objectish) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("ApplyTag", repository, tagName, objectish);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Tag ApplyTag(
      IRepository repository,
      java.lang.String tagName,
      Signature tagger,
      java.lang.String message) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("ApplyTag", repository, tagName, tagger, message);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Tag ApplyTag(
      IRepository repository,
      java.lang.String tagName,
      java.lang.String objectish,
      Signature tagger,
      java.lang.String message) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("ApplyTag", repository, tagName, objectish, tagger, message);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch CreateBranch(IRepository repository, java.lang.String branchName) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions").invoke("CreateBranch", repository, branchName);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch CreateBranch(
      IRepository repository, java.lang.String branchName, Commit target) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("CreateBranch", repository, branchName, target);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch CreateBranch(
      IRepository repository, java.lang.String branchName, java.lang.String committish) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("CreateBranch", repository, branchName, committish);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Reset(IRepository repository, ResetMode resetMode) {
    try {
      Javonet.getType("RepositoryExtensions")
          .invoke("Reset", repository, NEnum.fromJavaEnum(resetMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Reset(
      IRepository repository, ResetMode resetMode, java.lang.String committish) {
    try {
      Javonet.getType("RepositoryExtensions")
          .invoke("Reset", repository, NEnum.fromJavaEnum(resetMode), committish);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static Commit Commit(
      IRepository repository, java.lang.String message, Signature author, Signature committer) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("Commit", repository, message, author, committer);
      if (res == null) return null;
      return new Commit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Fetch(IRepository repository, java.lang.String remoteName) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Fetch", repository, remoteName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Fetch(
      IRepository repository, java.lang.String remoteName, FetchOptions options) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Fetch", repository, remoteName, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static Branch Checkout(IRepository repository, java.lang.String commitOrBranchSpec) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("Checkout", repository, commitOrBranchSpec);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch Checkout(IRepository repository, Branch branch) {
    try {
      Object res = Javonet.getType("RepositoryExtensions").invoke("Checkout", repository, branch);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch Checkout(IRepository repository, Commit commit) {
    try {
      Object res = Javonet.getType("RepositoryExtensions").invoke("Checkout", repository, commit);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static MergeResult Merge(IRepository repository, Branch branch, Signature merger) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions").invoke("Merge", repository, branch, merger);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static MergeResult Merge(
      IRepository repository, java.lang.String committish, Signature merger) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions").invoke("Merge", repository, committish, merger);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch Checkout(IRepository repository, Branch branch, CheckoutOptions options) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions").invoke("Checkout", repository, branch, options);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch Checkout(IRepository repository, Commit commit, CheckoutOptions options) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions").invoke("Checkout", repository, commit, options);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch Checkout(
      IRepository repository, java.lang.String committishOrBranchSpec, CheckoutOptions options) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("Checkout", repository, committishOrBranchSpec, options);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void CheckoutPaths(
      IRepository repository,
      java.lang.String committishOrBranchSpec,
      IEnumerable<java.lang.String> paths) {
    try {
      Javonet.getType("RepositoryExtensions")
          .invoke("CheckoutPaths", repository, committishOrBranchSpec, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Reset(IRepository repository, ResetMode resetMode, Commit commit) {
    try {
      Javonet.getType("RepositoryExtensions")
          .invoke("Reset", repository, NEnum.fromJavaEnum(resetMode), commit);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static BlameHunkCollection Blame(IRepository repository, java.lang.String path) {
    try {
      Object res = Javonet.getType("RepositoryExtensions").invoke("Blame", repository, path);
      if (res == null) return null;
      return new BlameHunkCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static CherryPickResult CherryPick(
      IRepository repository, Commit commit, Signature committer) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions")
              .invoke("CherryPick", repository, commit, committer);
      if (res == null) return null;
      return new CherryPickResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static MergeResult Merge(IRepository repository, Commit commit, Signature merger) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions").invoke("Merge", repository, commit, merger);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static RevertResult Revert(IRepository repository, Commit commit, Signature reverter) {
    try {
      Object res =
          Javonet.getType("RepositoryExtensions").invoke("Revert", repository, commit, reverter);
      if (res == null) return null;
      return new RevertResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Stage(IRepository repository, java.lang.String path) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Stage", repository, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Stage(IRepository repository, IEnumerable<java.lang.String> paths) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Stage", repository, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Unstage(IRepository repository, java.lang.String path) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Unstage", repository, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Unstage(IRepository repository, IEnumerable<java.lang.String> paths) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Unstage", repository, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(IRepository repository, java.lang.String path) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Remove", repository, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(
      IRepository repository, java.lang.String path, java.lang.Boolean removeFromWorkingDirectory) {
    try {
      Javonet.getType("RepositoryExtensions")
          .invoke("Remove", repository, path, removeFromWorkingDirectory);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(IRepository repository, IEnumerable<java.lang.String> paths) {
    try {
      Javonet.getType("RepositoryExtensions").invoke("Remove", repository, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(
      IRepository repository,
      IEnumerable<java.lang.String> paths,
      java.lang.Boolean removeFromWorkingDirectory) {
    try {
      Javonet.getType("RepositoryExtensions")
          .invoke("Remove", repository, paths, removeFromWorkingDirectory);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static RepositoryStatus RetrieveStatus(IRepository repository) {
    try {
      Object res = Javonet.getType("RepositoryExtensions").invoke("RetrieveStatus", repository);
      if (res == null) return null;
      return new RepositoryStatus((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.String Describe(IRepository repository, Commit commit) {
    try {
      java.lang.String res =
          Javonet.getType("RepositoryExtensions").invoke("Describe", repository, commit);
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
