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
import jio.System.*;
import jio.System.Collections.Generic.*;

public class RewriteHistoryOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setBackupRefsNamespace(java.lang.String value) {
    try {
      javonetHandle.set("BackupRefsNamespace", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBackupRefsNamespace() {
    try {
      java.lang.String res = javonetHandle.get("BackupRefsNamespace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommitHeaderRewriter(FuncTTResult<Commit, CommitRewriteInfo> value) {
    try {
      javonetHandle.set("CommitHeaderRewriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FuncTTResult<Commit, CommitRewriteInfo> getCommitHeaderRewriter() {
    try {
      Object res = javonetHandle.<NObject>get("CommitHeaderRewriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCommitParentsRewriter(FuncTTResult<Commit, IEnumerable<Commit>> value) {
    try {
      javonetHandle.set("CommitParentsRewriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FuncTTResult<Commit, IEnumerable<Commit>> getCommitParentsRewriter() {
    try {
      Object res = javonetHandle.<NObject>get("CommitParentsRewriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCommitTreeRewriter(FuncTTResult<Commit, TreeDefinition> value) {
    try {
      javonetHandle.set("CommitTreeRewriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FuncTTResult<Commit, TreeDefinition> getCommitTreeRewriter() {
    try {
      Object res = javonetHandle.<NObject>get("CommitTreeRewriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTagNameRewriter(
      FuncT1T2T3TResult<java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String>
          value) {
    try {
      javonetHandle.set("TagNameRewriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FuncT1T2T3TResult<java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String>
      getTagNameRewriter() {
    try {
      Object res = javonetHandle.<NObject>get("TagNameRewriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setPruneEmptyCommits(java.lang.Boolean value) {
    try {
      javonetHandle.set("PruneEmptyCommits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPruneEmptyCommits() {
    try {
      java.lang.Boolean res = javonetHandle.get("PruneEmptyCommits");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOnSucceeding(Action value) {
    try {
      javonetHandle.set("OnSucceeding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Action getOnSucceeding() {
    try {
      Object res = javonetHandle.<NObject>get("OnSucceeding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnError(ActionT<jio.System.Exception> value) {
    try {
      javonetHandle.set("OnError", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ActionT<jio.System.Exception> getOnError() {
    try {
      Object res = javonetHandle.<NObject>get("OnError");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setPrettifyMessages(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrettifyMessages", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPrettifyMessages() {
    try {
      java.lang.Boolean res = javonetHandle.get("PrettifyMessages");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public RewriteHistoryOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.RewriteHistoryOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteHistoryOptions(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
