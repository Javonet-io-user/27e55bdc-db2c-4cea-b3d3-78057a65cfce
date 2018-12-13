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

public class Diff {
  protected NObject javonetHandle;

  public Diff(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public ContentChanges Compare(Blob oldBlob, Blob newBlob) {
    try {
      Object res = javonetHandle.invoke("Compare", oldBlob, newBlob);
      if (res == null) return null;
      return new ContentChanges((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ContentChanges Compare(Blob oldBlob, Blob newBlob, CompareOptions compareOptions) {
    try {
      Object res = javonetHandle.invoke("Compare", oldBlob, newBlob, compareOptions);
      if (res == null) return null;
      return new ContentChanges((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(Tree oldTree, Tree newTree, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, newTree);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree, Tree newTree, IEnumerable<java.lang.String> paths, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, newTree, paths);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree,
      Tree newTree,
      IEnumerable<java.lang.String> paths,
      ExplicitPathsOptions explicitPathsOptions,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, newTree, paths, explicitPathsOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree,
      Tree newTree,
      IEnumerable<java.lang.String> paths,
      CompareOptions compareOptions,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, newTree, paths, compareOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree, Tree newTree, CompareOptions compareOptions, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, newTree, compareOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree,
      Tree newTree,
      IEnumerable<java.lang.String> paths,
      ExplicitPathsOptions explicitPathsOptions,
      CompareOptions compareOptions,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, newTree, paths, explicitPathsOptions, compareOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(Tree oldTree, DiffTargets diffTargets, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, NEnum.fromJavaEnum(diffTargets));
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree,
      DiffTargets diffTargets,
      IEnumerable<java.lang.String> paths,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", oldTree, NEnum.fromJavaEnum(diffTargets), paths);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree,
      DiffTargets diffTargets,
      IEnumerable<java.lang.String> paths,
      ExplicitPathsOptions explicitPathsOptions,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke(
                  "Compare", oldTree, NEnum.fromJavaEnum(diffTargets), paths, explicitPathsOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      Tree oldTree,
      DiffTargets diffTargets,
      IEnumerable<java.lang.String> paths,
      ExplicitPathsOptions explicitPathsOptions,
      CompareOptions compareOptions,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke(
                  "Compare",
                  oldTree,
                  NEnum.fromJavaEnum(diffTargets),
                  paths,
                  explicitPathsOptions,
                  compareOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(Class<?> returnType) {
    try {
      Object res = javonetHandle.generic(getReturnObjectName(returnType)).invoke("Compare");
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(IEnumerable<java.lang.String> paths, Class<?> returnType) {
    try {
      Object res = javonetHandle.generic(getReturnObjectName(returnType)).invoke("Compare", paths);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      IEnumerable<java.lang.String> paths,
      java.lang.Boolean includeUntracked,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", paths, includeUntracked);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      IEnumerable<java.lang.String> paths,
      java.lang.Boolean includeUntracked,
      ExplicitPathsOptions explicitPathsOptions,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", paths, includeUntracked, explicitPathsOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T Compare(
      IEnumerable<java.lang.String> paths,
      java.lang.Boolean includeUntracked,
      ExplicitPathsOptions explicitPathsOptions,
      CompareOptions compareOptions,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("Compare", paths, includeUntracked, explicitPathsOptions, compareOptions);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
