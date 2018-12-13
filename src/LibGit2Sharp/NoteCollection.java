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
import jio.System.Collections.*;

public class NoteCollection
    implements jio.System.Collections.Generic.IEnumerable<Note>,
        jio.System.Collections.IEnumerable,
        Iterable<Note> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Note> iterator() {
    return (Iterator<Note>) this.GetEnumerator();
  }
  /** GetProperty */

  public java.lang.String getDefaultNamespace() {
    try {
      java.lang.String res = javonetHandle.get("DefaultNamespace");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<java.lang.String> getNamespaces() {
    try {
      Object res = javonetHandle.<NObject>get("Namespaces");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<Note> get_Item(ObjectId id) {
    try {
      Object res = javonetHandle.invoke("get_Item", id);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<Note> get_Item(java.lang.String namespace) {
    try {
      Object res = javonetHandle.invoke("get_Item", namespace);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Note get_Item(java.lang.String namespace, ObjectId id) {
    try {
      Object res = javonetHandle.invoke("get_Item", namespace, id);
      if (res == null) return null;
      return new Note((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public NoteCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Note> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Note Add(
      ObjectId targetId,
      java.lang.String message,
      Signature author,
      Signature committer,
      java.lang.String namespace) {
    try {
      Object res = javonetHandle.invoke("Add", targetId, message, author, committer, namespace);
      if (res == null) return null;
      return new Note((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Remove(
      ObjectId targetId, Signature author, Signature committer, java.lang.String namespace) {
    try {
      javonetHandle.invoke("Remove", targetId, author, committer, namespace);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
