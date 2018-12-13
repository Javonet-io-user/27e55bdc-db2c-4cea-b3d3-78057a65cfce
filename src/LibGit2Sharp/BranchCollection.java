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
import jio.System.Collections.*;

public class BranchCollection
    implements jio.System.Collections.Generic.IEnumerable<Branch>,
        jio.System.Collections.IEnumerable,
        Iterable<Branch> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Branch> iterator() {
    return (Iterator<Branch>) this.GetEnumerator();
  }
  /** GetProperty */

  public Branch get_Item(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("get_Item", name);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BranchCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Branch> GetEnumerator() {
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

  public Branch Add(java.lang.String name, java.lang.String committish) {
    try {
      Object res = javonetHandle.invoke("Add", name, committish);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Add(java.lang.String name, Commit commit) {
    try {
      Object res = javonetHandle.invoke("Add", name, commit);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Add(java.lang.String name, Commit commit, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, commit, allowOverwrite);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Add(
      java.lang.String name, java.lang.String committish, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, committish, allowOverwrite);
      if (res == null) return null;
      return new Branch((NObject) res);
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

  public void Remove(java.lang.String name, java.lang.Boolean isRemote) {
    try {
      javonetHandle.invoke("Remove", name, isRemote);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(Branch branch) {
    try {
      javonetHandle.invoke("Remove", branch);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Branch Rename(java.lang.String currentName, java.lang.String newName) {
    try {
      Object res = javonetHandle.invoke("Rename", currentName, newName);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Rename(
      java.lang.String currentName, java.lang.String newName, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Rename", currentName, newName, allowOverwrite);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Rename(Branch branch, java.lang.String newName) {
    try {
      Object res = javonetHandle.invoke("Rename", branch, newName);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Rename(Branch branch, java.lang.String newName, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Rename", branch, newName, allowOverwrite);
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Branch Update(Branch branch, ActionT[] actions) {
    try {
      Object res = javonetHandle.invoke("Update", branch, new Object[] {actions});
      if (res == null) return null;
      return new Branch((NObject) res);
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
