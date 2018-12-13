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

public class StashApplyOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setApplyModifiers(StashApplyModifiers value) {
    try {
      javonetHandle.set("ApplyModifiers", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public StashApplyModifiers getApplyModifiers() {
    try {
      Object res = javonetHandle.<NEnum>get("ApplyModifiers");
      if (res == null) return null;
      return StashApplyModifiers.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCheckoutOptions(CheckoutOptions value) {
    try {
      javonetHandle.set("CheckoutOptions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CheckoutOptions getCheckoutOptions() {
    try {
      Object res = javonetHandle.<NObject>get("CheckoutOptions");
      if (res == null) return null;
      return new CheckoutOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setProgressHandler(StashApplyProgressHandler value) {
    try {
      javonetHandle.set("ProgressHandler", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public StashApplyProgressHandler getProgressHandler() {
    try {
      Object res = javonetHandle.<NObject>get("ProgressHandler");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public StashApplyOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.StashApplyOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StashApplyOptions(NObject handle) {
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
