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

public class ConflictCollection
    implements jio.System.Collections.Generic.IEnumerable<Conflict>,
        jio.System.Collections.IEnumerable,
        Iterable<Conflict> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Conflict> iterator() {
    return (Iterator<Conflict>) this.GetEnumerator();
  }
  /** GetProperty */

  public Conflict get_Item(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("get_Item", path);
      if (res == null) return null;
      return new Conflict((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IndexReucEntryCollection getResolvedConflicts() {
    try {
      Object res = javonetHandle.<NObject>get("ResolvedConflicts");
      if (res == null) return null;
      return new IndexReucEntryCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IndexNameEntryCollection getNames() {
    try {
      Object res = javonetHandle.<NObject>get("Names");
      if (res == null) return null;
      return new IndexNameEntryCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ConflictCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Conflict> GetEnumerator() {
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
