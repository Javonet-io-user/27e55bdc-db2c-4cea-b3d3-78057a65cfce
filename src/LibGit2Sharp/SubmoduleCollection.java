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

public class SubmoduleCollection
    implements jio.System.Collections.Generic.IEnumerable<Submodule>,
        jio.System.Collections.IEnumerable,
        Iterable<Submodule> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Submodule> iterator() {
    return (Iterator<Submodule>) this.GetEnumerator();
  }
  /** GetProperty */

  public Submodule get_Item(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("get_Item", name);
      if (res == null) return null;
      return new Submodule((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SubmoduleCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Submodule> GetEnumerator() {
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

  public void Init(java.lang.String name, java.lang.Boolean overwrite) {
    try {
      javonetHandle.invoke("Init", name, overwrite);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Update(java.lang.String name, SubmoduleUpdateOptions options) {
    try {
      javonetHandle.invoke("Update", name, options);
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
