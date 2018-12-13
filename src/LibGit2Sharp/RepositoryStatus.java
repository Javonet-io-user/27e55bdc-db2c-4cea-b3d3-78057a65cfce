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

public class RepositoryStatus
    implements jio.System.Collections.Generic.IEnumerable<StatusEntry>,
        jio.System.Collections.IEnumerable,
        Iterable<StatusEntry> {
  protected NObject javonetHandle;

  @Override
  public Iterator<StatusEntry> iterator() {
    return (Iterator<StatusEntry>) this.GetEnumerator();
  }
  /** GetProperty */

  public StatusEntry get_Item(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("get_Item", path);
      if (res == null) return null;
      return new StatusEntry((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getAdded() {
    try {
      Object res = javonetHandle.<NObject>get("Added");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getStaged() {
    try {
      Object res = javonetHandle.<NObject>get("Staged");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getRemoved() {
    try {
      Object res = javonetHandle.<NObject>get("Removed");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getMissing() {
    try {
      Object res = javonetHandle.<NObject>get("Missing");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getModified() {
    try {
      Object res = javonetHandle.<NObject>get("Modified");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getUntracked() {
    try {
      Object res = javonetHandle.<NObject>get("Untracked");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getIgnored() {
    try {
      Object res = javonetHandle.<NObject>get("Ignored");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getRenamedInIndex() {
    try {
      Object res = javonetHandle.<NObject>get("RenamedInIndex");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getRenamedInWorkDir() {
    try {
      Object res = javonetHandle.<NObject>get("RenamedInWorkDir");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEnumerable<StatusEntry> getUnaltered() {
    try {
      Object res = javonetHandle.<NObject>get("Unaltered");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsDirty() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsDirty");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public RepositoryStatus(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<StatusEntry> GetEnumerator() {
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
