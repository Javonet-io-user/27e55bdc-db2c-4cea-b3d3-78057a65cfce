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

public abstract class MergeOptionsBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setFindRenames(java.lang.Boolean value) {
    try {
      javonetHandle.set("FindRenames", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFindRenames() {
    try {
      java.lang.Boolean res = javonetHandle.get("FindRenames");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setFailOnConflict(java.lang.Boolean value) {
    try {
      javonetHandle.set("FailOnConflict", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFailOnConflict() {
    try {
      java.lang.Boolean res = javonetHandle.get("FailOnConflict");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setSkipReuc(java.lang.Boolean value) {
    try {
      javonetHandle.set("SkipReuc", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getSkipReuc() {
    try {
      java.lang.Boolean res = javonetHandle.get("SkipReuc");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setMergeFileFavor(MergeFileFavor value) {
    try {
      javonetHandle.set("MergeFileFavor", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public MergeFileFavor getMergeFileFavor() {
    try {
      Object res = javonetHandle.<NEnum>get("MergeFileFavor");
      if (res == null) return null;
      return MergeFileFavor.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public java.lang.Integer getRenameThreshold() {
    try {
      java.lang.Integer res = javonetHandle.get("RenameThreshold");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setRenameThreshold(java.lang.Integer param) {
    try {
      javonetHandle.set("RenameThreshold", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getTargetLimit() {
    try {
      java.lang.Integer res = javonetHandle.get("TargetLimit");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setTargetLimit(java.lang.Integer param) {
    try {
      javonetHandle.set("TargetLimit", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MergeOptionsBase(NObject handle) {
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
