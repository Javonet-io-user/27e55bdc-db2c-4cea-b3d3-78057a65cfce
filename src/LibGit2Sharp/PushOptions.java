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

public class PushOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCredentialsProvider(CredentialsHandler value) {
    try {
      javonetHandle.set("CredentialsProvider", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CredentialsHandler getCredentialsProvider() {
    try {
      Object res = javonetHandle.<NObject>get("CredentialsProvider");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCertificateCheck(CertificateCheckHandler value) {
    try {
      javonetHandle.set("CertificateCheck", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CertificateCheckHandler getCertificateCheck() {
    try {
      Object res = javonetHandle.<NObject>get("CertificateCheck");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setPackbuilderDegreeOfParallelism(java.lang.Integer value) {
    try {
      javonetHandle.set("PackbuilderDegreeOfParallelism", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getPackbuilderDegreeOfParallelism() {
    try {
      java.lang.Integer res = javonetHandle.get("PackbuilderDegreeOfParallelism");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setOnPushStatusError(PushStatusErrorHandler value) {
    try {
      javonetHandle.set("OnPushStatusError", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public PushStatusErrorHandler getOnPushStatusError() {
    try {
      Object res = javonetHandle.<NObject>get("OnPushStatusError");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnPushTransferProgress(PushTransferProgressHandler value) {
    try {
      javonetHandle.set("OnPushTransferProgress", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public PushTransferProgressHandler getOnPushTransferProgress() {
    try {
      Object res = javonetHandle.<NObject>get("OnPushTransferProgress");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnPackBuilderProgress(PackBuilderProgressHandler value) {
    try {
      javonetHandle.set("OnPackBuilderProgress", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public PackBuilderProgressHandler getOnPackBuilderProgress() {
    try {
      Object res = javonetHandle.<NObject>get("OnPackBuilderProgress");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnNegotiationCompletedBeforePush(PrePushHandler value) {
    try {
      javonetHandle.set("OnNegotiationCompletedBeforePush", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public PrePushHandler getOnNegotiationCompletedBeforePush() {
    try {
      Object res = javonetHandle.<NObject>get("OnNegotiationCompletedBeforePush");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PushOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.PushOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PushOptions(NObject handle) {
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
