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

public abstract class FetchOptionsBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setOnProgress(ProgressHandler value) {
    try {
      javonetHandle.set("OnProgress", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ProgressHandler getOnProgress() {
    try {
      Object res = javonetHandle.<NObject>get("OnProgress");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnUpdateTips(UpdateTipsHandler value) {
    try {
      javonetHandle.set("OnUpdateTips", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public UpdateTipsHandler getOnUpdateTips() {
    try {
      Object res = javonetHandle.<NObject>get("OnUpdateTips");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOnTransferProgress(TransferProgressHandler value) {
    try {
      javonetHandle.set("OnTransferProgress", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TransferProgressHandler getOnTransferProgress() {
    try {
      Object res = javonetHandle.<NObject>get("OnTransferProgress");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
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

  public void setRepositoryOperationStarting(RepositoryOperationStarting value) {
    try {
      javonetHandle.set("RepositoryOperationStarting", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RepositoryOperationStarting getRepositoryOperationStarting() {
    try {
      Object res = javonetHandle.<NObject>get("RepositoryOperationStarting");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRepositoryOperationCompleted(RepositoryOperationCompleted value) {
    try {
      javonetHandle.set("RepositoryOperationCompleted", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RepositoryOperationCompleted getRepositoryOperationCompleted() {
    try {
      Object res = javonetHandle.<NObject>get("RepositoryOperationCompleted");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FetchOptionsBase(NObject handle) {
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
