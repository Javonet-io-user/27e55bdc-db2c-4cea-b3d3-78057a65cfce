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

public class StashCollection
    implements jio.System.Collections.Generic.IEnumerable<Stash>,
        jio.System.Collections.IEnumerable,
        Iterable<Stash> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Stash> iterator() {
    return (Iterator<Stash>) this.GetEnumerator();
  }
  /** GetProperty */

  public Stash get_Item(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new Stash((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public StashCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Stash> GetEnumerator() {
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

  public Stash Add(Signature stasher) {
    try {
      Object res = javonetHandle.invoke("Add", stasher);
      if (res == null) return null;
      return new Stash((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Stash Add(Signature stasher, StashModifiers options) {
    try {
      Object res = javonetHandle.invoke("Add", stasher, NEnum.fromJavaEnum(options));
      if (res == null) return null;
      return new Stash((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Stash Add(Signature stasher, java.lang.String message) {
    try {
      Object res = javonetHandle.invoke("Add", stasher, message);
      if (res == null) return null;
      return new Stash((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Stash Add(Signature stasher, java.lang.String message, StashModifiers options) {
    try {
      Object res = javonetHandle.invoke("Add", stasher, message, NEnum.fromJavaEnum(options));
      if (res == null) return null;
      return new Stash((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StashApplyStatus Apply(java.lang.Integer index, StashApplyOptions options) {
    try {
      Object res = javonetHandle.invoke("Apply", index, options);
      if (res == null) return null;
      return StashApplyStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StashApplyStatus Apply(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("Apply", index);
      if (res == null) return null;
      return StashApplyStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StashApplyStatus Pop(java.lang.Integer index, StashApplyOptions options) {
    try {
      Object res = javonetHandle.invoke("Pop", index, options);
      if (res == null) return null;
      return StashApplyStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public StashApplyStatus Pop(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("Pop", index);
      if (res == null) return null;
      return StashApplyStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Remove(java.lang.Integer index) {
    try {
      javonetHandle.invoke("Remove", index);
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
