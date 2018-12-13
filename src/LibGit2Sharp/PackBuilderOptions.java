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

public class PackBuilderOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setPackDirectoryPath(java.lang.String value) {
    try {
      javonetHandle.set("PackDirectoryPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPackDirectoryPath() {
    try {
      java.lang.String res = javonetHandle.get("PackDirectoryPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMaximumNumberOfThreads(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumNumberOfThreads", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaximumNumberOfThreads() {
    try {
      java.lang.Integer res = javonetHandle.get("MaximumNumberOfThreads");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public PackBuilderOptions(java.lang.String packDirectory) {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.PackBuilderOptions", packDirectory);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PackBuilderOptions(NObject handle) {
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
