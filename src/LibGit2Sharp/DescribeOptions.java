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

public class DescribeOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setStrategy(DescribeStrategy value) {
    try {
      javonetHandle.set("Strategy", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DescribeStrategy getStrategy() {
    try {
      Object res = javonetHandle.<NEnum>get("Strategy");
      if (res == null) return null;
      return DescribeStrategy.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUseCommitIdAsFallback(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseCommitIdAsFallback", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getUseCommitIdAsFallback() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseCommitIdAsFallback");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setMinimumCommitIdAbbreviatedSize(java.lang.Integer value) {
    try {
      javonetHandle.set("MinimumCommitIdAbbreviatedSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMinimumCommitIdAbbreviatedSize() {
    try {
      java.lang.Integer res = javonetHandle.get("MinimumCommitIdAbbreviatedSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setAlwaysRenderLongFormat(java.lang.Boolean value) {
    try {
      javonetHandle.set("AlwaysRenderLongFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAlwaysRenderLongFormat() {
    try {
      java.lang.Boolean res = javonetHandle.get("AlwaysRenderLongFormat");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOnlyFollowFirstParent(java.lang.Boolean value) {
    try {
      javonetHandle.set("OnlyFollowFirstParent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOnlyFollowFirstParent() {
    try {
      java.lang.Boolean res = javonetHandle.get("OnlyFollowFirstParent");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public DescribeOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.DescribeOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DescribeOptions(NObject handle) {
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
