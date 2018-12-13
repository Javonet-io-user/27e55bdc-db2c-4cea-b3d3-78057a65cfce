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

public class StatusOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setShow(StatusShowOption value) {
    try {
      javonetHandle.set("Show", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public StatusShowOption getShow() {
    try {
      Object res = javonetHandle.<NEnum>get("Show");
      if (res == null) return null;
      return StatusShowOption.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDetectRenamesInIndex(java.lang.Boolean value) {
    try {
      javonetHandle.set("DetectRenamesInIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getDetectRenamesInIndex() {
    try {
      java.lang.Boolean res = javonetHandle.get("DetectRenamesInIndex");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setDetectRenamesInWorkDir(java.lang.Boolean value) {
    try {
      javonetHandle.set("DetectRenamesInWorkDir", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getDetectRenamesInWorkDir() {
    try {
      java.lang.Boolean res = javonetHandle.get("DetectRenamesInWorkDir");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setExcludeSubmodules(java.lang.Boolean value) {
    try {
      javonetHandle.set("ExcludeSubmodules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getExcludeSubmodules() {
    try {
      java.lang.Boolean res = javonetHandle.get("ExcludeSubmodules");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setRecurseIgnoredDirs(java.lang.Boolean value) {
    try {
      javonetHandle.set("RecurseIgnoredDirs", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getRecurseIgnoredDirs() {
    try {
      java.lang.Boolean res = javonetHandle.get("RecurseIgnoredDirs");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setPathSpec(java.lang.String[] value) {
    try {
      javonetHandle.set("PathSpec", new Object[] {value});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String[] getPathSpec(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("PathSpec");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDisablePathSpecMatch(java.lang.Boolean value) {
    try {
      javonetHandle.set("DisablePathSpecMatch", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getDisablePathSpecMatch() {
    try {
      java.lang.Boolean res = javonetHandle.get("DisablePathSpecMatch");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setIncludeUnaltered(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeUnaltered", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIncludeUnaltered() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeUnaltered");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setIncludeIgnored(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeIgnored", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIncludeIgnored() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeIgnored");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public StatusOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.StatusOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StatusOptions(NObject handle) {
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
