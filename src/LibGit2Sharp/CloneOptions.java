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

public class CloneOptions extends FetchOptionsBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setIsBare(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsBare", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsBare() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsBare");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setCheckout(java.lang.Boolean value) {
    try {
      javonetHandle.set("Checkout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCheckout() {
    try {
      java.lang.Boolean res = javonetHandle.get("Checkout");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBranchName(java.lang.String value) {
    try {
      javonetHandle.set("BranchName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBranchName() {
    try {
      java.lang.String res = javonetHandle.get("BranchName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setRecurseSubmodules(java.lang.Boolean value) {
    try {
      javonetHandle.set("RecurseSubmodules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getRecurseSubmodules() {
    try {
      java.lang.Boolean res = javonetHandle.get("RecurseSubmodules");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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

  public CloneOptions() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.CloneOptions");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CloneOptions(NObject handle) {
    super(handle);
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
