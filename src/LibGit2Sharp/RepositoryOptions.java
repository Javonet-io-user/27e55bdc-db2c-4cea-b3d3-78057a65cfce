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

public class RepositoryOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setWorkingDirectoryPath(java.lang.String value) {
    try {
      javonetHandle.set("WorkingDirectoryPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getWorkingDirectoryPath() {
    try {
      java.lang.String res = javonetHandle.get("WorkingDirectoryPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIndexPath(java.lang.String value) {
    try {
      javonetHandle.set("IndexPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIndexPath() {
    try {
      java.lang.String res = javonetHandle.get("IndexPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setGlobalConfigurationLocation(java.lang.String value) {
    try {
      javonetHandle.set("GlobalConfigurationLocation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getGlobalConfigurationLocation() {
    try {
      java.lang.String res = javonetHandle.get("GlobalConfigurationLocation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setXdgConfigurationLocation(java.lang.String value) {
    try {
      javonetHandle.set("XdgConfigurationLocation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getXdgConfigurationLocation() {
    try {
      java.lang.String res = javonetHandle.get("XdgConfigurationLocation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSystemConfigurationLocation(java.lang.String value) {
    try {
      javonetHandle.set("SystemConfigurationLocation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSystemConfigurationLocation() {
    try {
      java.lang.String res = javonetHandle.get("SystemConfigurationLocation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIdentity(Identity value) {
    try {
      javonetHandle.set("Identity", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Identity getIdentity() {
    try {
      Object res = javonetHandle.<NObject>get("Identity");
      if (res == null) return null;
      return new Identity((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RepositoryOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.RepositoryOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RepositoryOptions(NObject handle) {
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
