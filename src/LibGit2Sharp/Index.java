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

public class Index
    implements jio.System.Collections.Generic.IEnumerable<IndexEntry>,
        jio.System.Collections.IEnumerable,
        Iterable<IndexEntry> {
  protected NObject javonetHandle;

  @Override
  public Iterator<IndexEntry> iterator() {
    return (Iterator<IndexEntry>) this.GetEnumerator();
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.get("Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsFullyMerged() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsFullyMerged");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public IndexEntry get_Item(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("get_Item", path);
      if (res == null) return null;
      return new IndexEntry((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ConflictCollection getConflicts() {
    try {
      Object res = javonetHandle.<NObject>get("Conflicts");
      if (res == null) return null;
      return new ConflictCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Index(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<IndexEntry> GetEnumerator() {
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

  public void Replace(Tree source) {
    try {
      javonetHandle.invoke("Replace", source);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(java.lang.String indexEntryPath) {
    try {
      javonetHandle.invoke("Remove", indexEntryPath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Add(java.lang.String pathInTheWorkdir) {
    try {
      javonetHandle.invoke("Add", pathInTheWorkdir);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Add(Blob blob, java.lang.String indexEntryPath, Mode indexEntryMode) {
    try {
      javonetHandle.invoke("Add", blob, indexEntryPath, NEnum.fromJavaEnum(indexEntryMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(Commit commit) {
    try {
      javonetHandle.invoke("Replace", commit);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(
      Commit commit, jio.System.Collections.Generic.IEnumerable<java.lang.String> paths) {
    try {
      javonetHandle.invoke("Replace", commit, paths);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(
      Commit commit,
      jio.System.Collections.Generic.IEnumerable<java.lang.String> paths,
      ExplicitPathsOptions explicitPathsOptions) {
    try {
      javonetHandle.invoke("Replace", commit, paths, explicitPathsOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Write() {
    try {
      javonetHandle.invoke("Write");
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
