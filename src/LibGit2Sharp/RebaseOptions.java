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
import LibGit2Sharp.Handlers.*;

public class RebaseOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setRebaseStepStarting(RebaseStepStartingHandler value) {
    try {
      javonetHandle.set("RebaseStepStarting", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RebaseStepStartingHandler getRebaseStepStarting() {
    try {
      Object res = javonetHandle.<NObject>get("RebaseStepStarting");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRebaseStepCompleted(RebaseStepCompletedHandler value) {
    try {
      javonetHandle.set("RebaseStepCompleted", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RebaseStepCompletedHandler getRebaseStepCompleted() {
    try {
      Object res = javonetHandle.<NObject>get("RebaseStepCompleted");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCheckoutNotifyFlags(CheckoutNotifyFlags value) {
    try {
      javonetHandle.set("CheckoutNotifyFlags", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CheckoutNotifyFlags getCheckoutNotifyFlags() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("LibGit2Sharp.Core.IConvertableToGitCheckoutOpts")
              .invoke("get_CheckoutNotifyFlags");
      if (res == null) return null;
      return CheckoutNotifyFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnCheckoutProgress(CheckoutProgressHandler value) {
    try {
      javonetHandle.set("OnCheckoutProgress", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CheckoutProgressHandler getOnCheckoutProgress() {
    try {
      Object res = javonetHandle.<NObject>get("OnCheckoutProgress");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnCheckoutNotify(CheckoutNotifyHandler value) {
    try {
      javonetHandle.set("OnCheckoutNotify", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CheckoutNotifyHandler getOnCheckoutNotify() {
    try {
      Object res = javonetHandle.<NObject>get("OnCheckoutNotify");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFileConflictStrategy(CheckoutFileConflictStrategy value) {
    try {
      javonetHandle.set("FileConflictStrategy", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CheckoutFileConflictStrategy getFileConflictStrategy() {
    try {
      Object res = javonetHandle.<NEnum>get("FileConflictStrategy");
      if (res == null) return null;
      return CheckoutFileConflictStrategy.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RebaseOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.RebaseOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RebaseOptions(NObject handle) {
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
