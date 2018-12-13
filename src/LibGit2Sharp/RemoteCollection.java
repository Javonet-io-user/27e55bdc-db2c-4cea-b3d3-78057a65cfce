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
import LibGit2Sharp.Handlers.*;
import jio.System.Collections.*;

public class RemoteCollection
    implements jio.System.Collections.Generic.IEnumerable<Remote>,
        jio.System.Collections.IEnumerable,
        Iterable<Remote> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Remote> iterator() {
    return (Iterator<Remote>) this.GetEnumerator();
  }
  /** GetProperty */

  public Remote get_Item(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("get_Item", name);
      if (res == null) return null;
      return new Remote((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RemoteCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Remote> GetEnumerator() {
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

  public Remote Update(Remote remote, ActionT[] actions) {
    try {
      Object res = javonetHandle.invoke("Update", remote, new Object[] {actions});
      if (res == null) return null;
      return new Remote((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Update(java.lang.String remote, ActionT[] actions) {
    try {
      javonetHandle.invoke("Update", remote, new Object[] {actions});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Remote Add(java.lang.String name, java.lang.String url) {
    try {
      Object res = javonetHandle.invoke("Add", name, url);
      if (res == null) return null;
      return new Remote((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Remote Add(java.lang.String name, java.lang.String url, java.lang.String fetchRefSpec) {
    try {
      Object res = javonetHandle.invoke("Add", name, url, fetchRefSpec);
      if (res == null) return null;
      return new Remote((NObject) res);
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

  public Remote Rename(java.lang.String name, java.lang.String newName) {
    try {
      Object res = javonetHandle.invoke("Rename", name, newName);
      if (res == null) return null;
      return new Remote((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Remote Rename(
      java.lang.String name, java.lang.String newName, RemoteRenameFailureHandler callback) {
    try {
      Object res = javonetHandle.invoke("Rename", name, newName, callback);
      if (res == null) return null;
      return new Remote((NObject) res);
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
