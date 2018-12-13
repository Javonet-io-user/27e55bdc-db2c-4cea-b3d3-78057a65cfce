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

public class Network {
  protected NObject javonetHandle;
  /** GetProperty */
  public RemoteCollection getRemotes() {
    try {
      Object res = javonetHandle.<NObject>get("Remotes");
      if (res == null) return null;
      return new RemoteCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Network(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IEnumerable<Reference> ListReferences(Remote remote) {
    try {
      Object res = javonetHandle.invoke("ListReferences", remote);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IEnumerable<Reference> ListReferences(
      Remote remote, CredentialsHandler credentialsProvider) {
    try {
      Object res = javonetHandle.invoke("ListReferences", remote, credentialsProvider);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IEnumerable<Reference> ListReferences(java.lang.String url) {
    try {
      Object res = javonetHandle.invoke("ListReferences", url);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IEnumerable<Reference> ListReferences(
      java.lang.String url, CredentialsHandler credentialsProvider) {
    try {
      Object res = javonetHandle.invoke("ListReferences", url, credentialsProvider);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Fetch(Remote remote) {
    try {
      javonetHandle.invoke("Fetch", remote);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(Remote remote, FetchOptions options) {
    try {
      javonetHandle.invoke("Fetch", remote, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(Remote remote, java.lang.String logMessage) {
    try {
      javonetHandle.invoke("Fetch", remote, logMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(Remote remote, FetchOptions options, java.lang.String logMessage) {
    try {
      javonetHandle.invoke("Fetch", remote, options, logMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(Remote remote, IEnumerable<java.lang.String> refspecs) {
    try {
      javonetHandle.invoke("Fetch", remote, refspecs);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(Remote remote, IEnumerable<java.lang.String> refspecs, FetchOptions options) {
    try {
      javonetHandle.invoke("Fetch", remote, refspecs, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(
      Remote remote, IEnumerable<java.lang.String> refspecs, java.lang.String logMessage) {
    try {
      javonetHandle.invoke("Fetch", remote, refspecs, logMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(
      Remote remote,
      IEnumerable<java.lang.String> refspecs,
      FetchOptions options,
      java.lang.String logMessage) {
    try {
      javonetHandle.invoke("Fetch", remote, refspecs, options, logMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(java.lang.String url, IEnumerable<java.lang.String> refspecs) {
    try {
      javonetHandle.invoke("Fetch", url, refspecs);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(
      java.lang.String url, IEnumerable<java.lang.String> refspecs, FetchOptions options) {
    try {
      javonetHandle.invoke("Fetch", url, refspecs, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(
      java.lang.String url, IEnumerable<java.lang.String> refspecs, java.lang.String logMessage) {
    try {
      javonetHandle.invoke("Fetch", url, refspecs, logMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fetch(
      java.lang.String url,
      IEnumerable<java.lang.String> refspecs,
      FetchOptions options,
      java.lang.String logMessage) {
    try {
      javonetHandle.invoke("Fetch", url, refspecs, options, logMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(Branch branch) {
    try {
      javonetHandle.invoke("Push", branch);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(Branch branch, PushOptions pushOptions) {
    try {
      javonetHandle.invoke("Push", branch, pushOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(IEnumerable<Branch> branches) {
    try {
      javonetHandle.invoke("Push", branches);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(IEnumerable<Branch> branches, PushOptions pushOptions) {
    try {
      javonetHandle.invoke("Push", branches, pushOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(Remote remote, java.lang.String objectish, java.lang.String destinationSpec) {
    try {
      javonetHandle.invoke("Push", remote, objectish, destinationSpec);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(
      Remote remote,
      java.lang.String objectish,
      java.lang.String destinationSpec,
      PushOptions pushOptions) {
    try {
      javonetHandle.invoke("Push", remote, objectish, destinationSpec, pushOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(Remote remote, java.lang.String pushRefSpec) {
    try {
      javonetHandle.invoke("Push", remote, pushRefSpec);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(Remote remote, java.lang.String pushRefSpec, PushOptions pushOptions) {
    try {
      javonetHandle.invoke("Push", remote, pushRefSpec, pushOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(Remote remote, IEnumerable<java.lang.String> pushRefSpecs) {
    try {
      javonetHandle.invoke("Push", remote, pushRefSpecs);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Push(
      Remote remote, IEnumerable<java.lang.String> pushRefSpecs, PushOptions pushOptions) {
    try {
      javonetHandle.invoke("Push", remote, pushRefSpecs, pushOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public MergeResult Pull(Signature merger, PullOptions options) {
    try {
      Object res = javonetHandle.invoke("Pull", merger, options);
      if (res == null) return null;
      return new MergeResult((NObject) res);
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
