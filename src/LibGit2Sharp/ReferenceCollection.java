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

public class ReferenceCollection
    implements jio.System.Collections.Generic.IEnumerable<Reference>,
        jio.System.Collections.IEnumerable,
        Iterable<Reference> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Reference> iterator() {
    return (Iterator<Reference>) this.GetEnumerator();
  }
  /** GetProperty */

  public Reference get_Item(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("get_Item", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Reference getHead() {
    try {
      Object res = javonetHandle.<NObject>get("Head");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ReferenceCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Reference> GetEnumerator() {
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

  public Reference Add(
      java.lang.String name,
      java.lang.String canonicalRefNameOrObjectish,
      java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("Add", name, canonicalRefNameOrObjectish, logMessage);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Add(
      java.lang.String name,
      java.lang.String canonicalRefNameOrObjectish,
      java.lang.String logMessage,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res =
          javonetHandle.invoke(
              "Add", name, canonicalRefNameOrObjectish, logMessage, allowOverwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Add(java.lang.String name, java.lang.String canonicalRefNameOrObjectish) {
    try {
      Object res = javonetHandle.invoke("Add", name, canonicalRefNameOrObjectish);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Add(
      java.lang.String name,
      java.lang.String canonicalRefNameOrObjectish,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, canonicalRefNameOrObjectish, allowOverwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DirectReference Add(
      java.lang.String name, ObjectId targetId, java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetId, logMessage);
      if (res == null) return null;
      return new DirectReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DirectReference Add(
      java.lang.String name,
      ObjectId targetId,
      java.lang.String logMessage,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetId, logMessage, allowOverwrite);
      if (res == null) return null;
      return new DirectReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DirectReference Add(java.lang.String name, ObjectId targetId) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetId);
      if (res == null) return null;
      return new DirectReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DirectReference Add(
      java.lang.String name, ObjectId targetId, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetId, allowOverwrite);
      if (res == null) return null;
      return new DirectReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SymbolicReference Add(
      java.lang.String name, Reference targetRef, java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetRef, logMessage);
      if (res == null) return null;
      return new SymbolicReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SymbolicReference Add(
      java.lang.String name,
      Reference targetRef,
      java.lang.String logMessage,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetRef, logMessage, allowOverwrite);
      if (res == null) return null;
      return new SymbolicReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SymbolicReference Add(java.lang.String name, Reference targetRef) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetRef);
      if (res == null) return null;
      return new SymbolicReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public SymbolicReference Add(
      java.lang.String name, Reference targetRef, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, targetRef, allowOverwrite);
      if (res == null) return null;
      return new SymbolicReference((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Remove(java.lang.String name) {
    try {
      javonetHandle.invoke("Remove", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(Reference reference) {
    try {
      javonetHandle.invoke("Remove", reference);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Reference Rename(
      Reference reference, java.lang.String newName, java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("Rename", reference, newName, logMessage);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Rename(
      Reference reference,
      java.lang.String newName,
      java.lang.String logMessage,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Rename", reference, newName, logMessage, allowOverwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Rename(java.lang.String currentName, java.lang.String newName) {
    try {
      Object res = javonetHandle.invoke("Rename", currentName, newName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Rename(
      java.lang.String currentName, java.lang.String newName, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Rename", currentName, newName, allowOverwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Rename(
      java.lang.String currentName, java.lang.String newName, java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("Rename", currentName, newName, logMessage);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Rename(
      java.lang.String currentName,
      java.lang.String newName,
      java.lang.String logMessage,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Rename", currentName, newName, logMessage, allowOverwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Rename(Reference reference, java.lang.String newName) {
    try {
      Object res = javonetHandle.invoke("Rename", reference, newName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference Rename(
      Reference reference, java.lang.String newName, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Rename", reference, newName, allowOverwrite);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(
      Reference directRef, ObjectId targetId, java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("UpdateTarget", directRef, targetId, logMessage);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(
      Reference directRef, java.lang.String objectish, java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("UpdateTarget", directRef, objectish, logMessage);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(Reference directRef, java.lang.String objectish) {
    try {
      Object res = javonetHandle.invoke("UpdateTarget", directRef, objectish);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(
      java.lang.String name,
      java.lang.String canonicalRefNameOrObjectish,
      java.lang.String logMessage) {
    try {
      Object res =
          javonetHandle.invoke("UpdateTarget", name, canonicalRefNameOrObjectish, logMessage);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(
      java.lang.String name, java.lang.String canonicalRefNameOrObjectish) {
    try {
      Object res = javonetHandle.invoke("UpdateTarget", name, canonicalRefNameOrObjectish);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(Reference directRef, ObjectId targetId) {
    try {
      Object res = javonetHandle.invoke("UpdateTarget", directRef, targetId);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(
      Reference symbolicRef, Reference targetRef, java.lang.String logMessage) {
    try {
      Object res = javonetHandle.invoke("UpdateTarget", symbolicRef, targetRef, logMessage);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Reference UpdateTarget(Reference symbolicRef, Reference targetRef) {
    try {
      Object res = javonetHandle.invoke("UpdateTarget", symbolicRef, targetRef);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<Reference> FromGlob(java.lang.String pattern) {
    try {
      Object res = javonetHandle.invoke("FromGlob", pattern);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<Reference> ReachableFrom(
      jio.System.Collections.Generic.IEnumerable<Reference> refSubset,
      jio.System.Collections.Generic.IEnumerable<Commit> targets) {
    try {
      Object res = javonetHandle.invoke("ReachableFrom", refSubset, targets);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<Reference> ReachableFrom(
      jio.System.Collections.Generic.IEnumerable<Commit> targets) {
    try {
      Object res = javonetHandle.invoke("ReachableFrom", targets);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ReflogCollection Log(java.lang.String canonicalName) {
    try {
      Object res = javonetHandle.invoke("Log", canonicalName);
      if (res == null) return null;
      return new ReflogCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ReflogCollection Log(Reference reference) {
    try {
      Object res = javonetHandle.invoke("Log", reference);
      if (res == null) return null;
      return new ReflogCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void RewriteHistory(RewriteHistoryOptions options, Commit[] commitsToRewrite) {
    try {
      javonetHandle.invoke("RewriteHistory", options, new Object[] {commitsToRewrite});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RewriteHistory(
      RewriteHistoryOptions options,
      jio.System.Collections.Generic.IEnumerable<Commit> commitsToRewrite) {
    try {
      javonetHandle.invoke("RewriteHistory", options, commitsToRewrite);
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
