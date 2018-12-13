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

public class CommitLog
    implements IQueryableCommitLog,
        ICommitLog,
        jio.System.Collections.Generic.IEnumerable<Commit>,
        jio.System.Collections.IEnumerable,
        Iterable<Commit> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Commit> iterator() {
    return (Iterator<Commit>) this.GetEnumerator();
  }
  /** GetProperty */

  public CommitSortStrategies getSortedBy() {
    try {
      Object res =
          javonetHandle.explicitInterface("LibGit2Sharp.ICommitLog").invoke("get_SortedBy");
      if (res == null) return null;
      return CommitSortStrategies.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CommitLog(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public ICommitLog QueryBy(CommitFilter filter) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IQueryableCommitLog")
              .invoke("QueryBy", filter);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<LogEntry> QueryBy(java.lang.String path) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IQueryableCommitLog")
              .invoke("QueryBy", path);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<LogEntry> QueryBy(
      java.lang.String path, FollowFilter filter) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IQueryableCommitLog")
              .invoke("QueryBy", path, filter);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<LogEntry> QueryBy(
      java.lang.String path, CommitFilter filter) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.IQueryableCommitLog")
              .invoke("QueryBy", path, filter);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Commit> GetEnumerator() {
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
