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

public class Commands {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static MergeResult Pull(Repository repository, Signature merger, PullOptions options) {
    try {
      Object res = Javonet.getType("Commands").invoke("Pull", repository, merger, options);
      if (res == null) return null;
      return new MergeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Fetch(
      Repository repository,
      java.lang.String remote,
      IEnumerable<java.lang.String> refspecs,
      FetchOptions options,
      java.lang.String logMessage) {
    try {
      Javonet.getType("Commands")
          .invoke("Fetch", repository, remote, refspecs, options, logMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Stage(IRepository repository, java.lang.String path) {
    try {
      Javonet.getType("Commands").invoke("Stage", repository, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Stage(
      IRepository repository, java.lang.String path, StageOptions stageOptions) {
    try {
      Javonet.getType("Commands").invoke("Stage", repository, path, stageOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Stage(IRepository repository, IEnumerable<java.lang.String> paths) {
    try {
      Javonet.getType("Commands").invoke("Stage", repository, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Stage(
      IRepository repository, IEnumerable<java.lang.String> paths, StageOptions stageOptions) {
    try {
      Javonet.getType("Commands").invoke("Stage", repository, paths, stageOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Unstage(IRepository repository, java.lang.String path) {
    try {
      Javonet.getType("Commands").invoke("Unstage", repository, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Unstage(
      IRepository repository, java.lang.String path, ExplicitPathsOptions explicitPathsOptions) {
    try {
      Javonet.getType("Commands").invoke("Unstage", repository, path, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Unstage(IRepository repository, IEnumerable<java.lang.String> paths) {
    try {
      Javonet.getType("Commands").invoke("Unstage", repository, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Unstage(
      IRepository repository,
      IEnumerable<java.lang.String> paths,
      ExplicitPathsOptions explicitPathsOptions) {
    try {
      Javonet.getType("Commands").invoke("Unstage", repository, paths, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Move(
      IRepository repository, java.lang.String sourcePath, java.lang.String destinationPath) {
    try {
      Javonet.getType("Commands").invoke("Move", repository, sourcePath, destinationPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Move(
      IRepository repository,
      IEnumerable<java.lang.String> sourcePaths,
      IEnumerable<java.lang.String> destinationPaths) {
    try {
      Javonet.getType("Commands").invoke("Move", repository, sourcePaths, destinationPaths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(IRepository repository, java.lang.String path) {
    try {
      Javonet.getType("Commands").invoke("Remove", repository, path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(
      IRepository repository, java.lang.String path, java.lang.Boolean removeFromWorkingDirectory) {
    try {
      Javonet.getType("Commands").invoke("Remove", repository, path, removeFromWorkingDirectory);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(
      IRepository repository,
      java.lang.String path,
      java.lang.Boolean removeFromWorkingDirectory,
      ExplicitPathsOptions explicitPathsOptions) {
    try {
      Javonet.getType("Commands")
          .invoke("Remove", repository, path, removeFromWorkingDirectory, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(IRepository repository, IEnumerable<java.lang.String> paths) {
    try {
      Javonet.getType("Commands").invoke("Remove", repository, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Remove(
      IRepository repository,
      IEnumerable<java.lang.String> paths,
      java.lang.Boolean removeFromWorkingDirectory,
      ExplicitPathsOptions explicitPathsOptions) {
    try {
      Javonet.getType("Commands")
          .invoke("Remove", repository, paths, removeFromWorkingDirectory, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static Branch Checkout(IRepository repository, java.lang.String committishOrBranchSpec) {
    try {
      Object res =
          Javonet.getType("Commands").invoke("Checkout", repository, committishOrBranchSpec);
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
          Javonet.getType("Commands")
              .invoke("Checkout", repository, committishOrBranchSpec, options);
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
      Object res = Javonet.getType("Commands").invoke("Checkout", repository, branch);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Branch Checkout(IRepository repository, Branch branch, CheckoutOptions options) {
    try {
      Object res = Javonet.getType("Commands").invoke("Checkout", repository, branch, options);
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
      Object res = Javonet.getType("Commands").invoke("Checkout", repository, commit);
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
      Object res = Javonet.getType("Commands").invoke("Checkout", repository, commit, options);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Checkout(
      IRepository repository,
      Tree tree,
      CheckoutOptions checkoutOptions,
      java.lang.String refLogHeadSpec) {
    try {
      Javonet.getType("Commands")
          .invoke("Checkout", repository, tree, checkoutOptions, refLogHeadSpec);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
