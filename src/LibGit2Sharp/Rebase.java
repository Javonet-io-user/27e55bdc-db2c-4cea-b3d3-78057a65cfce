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

public class Rebase {
  protected NObject javonetHandle;

  public Rebase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public RebaseResult Start(
      Branch branch, Branch upstream, Branch onto, Identity committer, RebaseOptions options) {
    try {
      Object res = javonetHandle.invoke("Start", branch, upstream, onto, committer, options);
      if (res == null) return null;
      return new RebaseResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public RebaseResult Continue(Identity committer, RebaseOptions options) {
    try {
      Object res = javonetHandle.invoke("Continue", committer, options);
      if (res == null) return null;
      return new RebaseResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Abort() {
    try {
      javonetHandle.invoke("Abort");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Abort(RebaseOptions options) {
    try {
      javonetHandle.invoke("Abort", options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public RebaseStepInfo GetCurrentStepInfo() {
    try {
      Object res = javonetHandle.invoke("GetCurrentStepInfo");
      if (res == null) return null;
      return new RebaseStepInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public RebaseStepInfo GetStepInfo(java.lang.Long stepIndex) {
    try {
      Object res = javonetHandle.invoke("GetStepInfo", stepIndex);
      if (res == null) return null;
      return new RebaseStepInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Long GetCurrentStepIndex() {
    try {
      java.lang.Long res = javonetHandle.invoke("GetCurrentStepIndex");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Long GetTotalStepCount() {
    try {
      java.lang.Long res = javonetHandle.invoke("GetTotalStepCount");
      if (res == null) return null;
      return res;
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
