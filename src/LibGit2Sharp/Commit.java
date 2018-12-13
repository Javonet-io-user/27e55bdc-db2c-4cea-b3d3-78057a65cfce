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
import jio.System.*;

public class Commit extends GitObject implements IEquatable<GitObject>, IBelongToARepository {
  protected NObject javonetHandle;
  /** GetProperty */
  public TreeEntry get_Item(java.lang.String relativePath) {
    try {
      Object res = javonetHandle.invoke("get_Item", relativePath);
      if (res == null) return null;
      return new TreeEntry((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** GetProperty */

  public java.lang.String getMessageShort() {
    try {
      java.lang.String res = javonetHandle.get("MessageShort");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEncoding() {
    try {
      java.lang.String res = javonetHandle.get("Encoding");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  /** GetProperty */

  public Tree getTree() {
    try {
      Object res = javonetHandle.<NObject>get("Tree");
      if (res == null) return null;
      return new Tree((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IEnumerable<Commit> getParents() {
    try {
      Object res = javonetHandle.<NObject>get("Parents");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IEnumerable<Note> getNotes() {
    try {
      Object res = javonetHandle.<NObject>get("Notes");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Commit(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static java.lang.String PrettifyMessage(
      java.lang.String message, java.lang.Character commentChar) {
    try {
      java.lang.String res =
          Javonet.getType("Commit").invoke("PrettifyMessage", message, commentChar);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static SignatureInfo ExtractSignature(
      Repository repo, ObjectId id, java.lang.String field) {
    try {
      Object res = Javonet.getType("Commit").invoke("ExtractSignature", repo, id, field);
      if (res == null) return null;
      return new SignatureInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static SignatureInfo ExtractSignature(Repository repo, ObjectId id) {
    try {
      Object res = Javonet.getType("Commit").invoke("ExtractSignature", repo, id);
      if (res == null) return null;
      return new SignatureInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.String CreateBuffer(
      Signature author,
      Signature committer,
      java.lang.String message,
      Tree tree,
      IEnumerable<Commit> parents,
      java.lang.Boolean prettifyMessage,
      Nullable<java.lang.Character> commentChar) {
    try {
      java.lang.String res =
          Javonet.getType("Commit")
              .invoke(
                  "CreateBuffer",
                  author,
                  committer,
                  message,
                  tree,
                  parents,
                  prettifyMessage,
                  commentChar);
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
