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

public class CommitRewriteInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAuthor(Signature value) {
    try {
      javonetHandle.set("Author", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Signature getAuthor() {
    try {
      Object res = javonetHandle.<NObject>get("Author");
      if (res == null) return null;
      return new Signature((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCommitter(Signature value) {
    try {
      javonetHandle.set("Committer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Signature getCommitter() {
    try {
      Object res = javonetHandle.<NObject>get("Committer");
      if (res == null) return null;
      return new Signature((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMessage(java.lang.String value) {
    try {
      javonetHandle.set("Message", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMessage() {
    try {
      java.lang.String res = javonetHandle.get("Message");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CommitRewriteInfo() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.CommitRewriteInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommitRewriteInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static CommitRewriteInfo From(Commit commit) {
    try {
      Object res = Javonet.getType("CommitRewriteInfo").invoke("From", commit);
      if (res == null) return null;
      return new CommitRewriteInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static CommitRewriteInfo From(Commit commit, Signature author) {
    try {
      Object res = Javonet.getType("CommitRewriteInfo").invoke("From", commit, author);
      if (res == null) return null;
      return new CommitRewriteInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static CommitRewriteInfo From(Commit commit, java.lang.String message) {
    try {
      Object res = Javonet.getType("CommitRewriteInfo").invoke("From", commit, message);
      if (res == null) return null;
      return new CommitRewriteInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static CommitRewriteInfo From(Commit commit, Signature author, Signature committer) {
    try {
      Object res = Javonet.getType("CommitRewriteInfo").invoke("From", commit, author, committer);
      if (res == null) return null;
      return new CommitRewriteInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static CommitRewriteInfo From(
      Commit commit, Signature author, Signature committer, java.lang.String message) {
    try {
      Object res =
          Javonet.getType("CommitRewriteInfo").invoke("From", commit, author, committer, message);
      if (res == null) return null;
      return new CommitRewriteInfo((NObject) res);
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
