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
import jio.System.*;

public class CommitFilter {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSortBy(CommitSortStrategies value) {
    try {
      javonetHandle.set("SortBy", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CommitSortStrategies getSortBy() {
    try {
      Object res = javonetHandle.<NEnum>get("SortBy");
      if (res == null) return null;
      return CommitSortStrategies.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIncludeReachableFrom(Object value) {
    try {
      javonetHandle.set("IncludeReachableFrom", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getIncludeReachableFrom() {
    try {
      Object res = javonetHandle.<NObject>get("IncludeReachableFrom");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setExcludeReachableFrom(Object value) {
    try {
      javonetHandle.set("ExcludeReachableFrom", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getExcludeReachableFrom() {
    try {
      Object res = javonetHandle.<NObject>get("ExcludeReachableFrom");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFirstParentOnly(java.lang.Boolean value) {
    try {
      javonetHandle.set("FirstParentOnly", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFirstParentOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("FirstParentOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public CommitFilter() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.CommitFilter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommitFilter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
