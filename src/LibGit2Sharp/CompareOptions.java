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

public class CompareOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setContextLines(java.lang.Integer value) {
    try {
      javonetHandle.set("ContextLines", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getContextLines() {
    try {
      java.lang.Integer res = javonetHandle.get("ContextLines");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setInterhunkLines(java.lang.Integer value) {
    try {
      javonetHandle.set("InterhunkLines", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getInterhunkLines() {
    try {
      java.lang.Integer res = javonetHandle.get("InterhunkLines");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setSimilarity(SimilarityOptions value) {
    try {
      javonetHandle.set("Similarity", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SimilarityOptions getSimilarity() {
    try {
      Object res = javonetHandle.<NObject>get("Similarity");
      if (res == null) return null;
      return new SimilarityOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIncludeUnmodified(java.lang.Boolean value) {
    try {
      javonetHandle.set("IncludeUnmodified", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIncludeUnmodified() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeUnmodified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setAlgorithm(DiffAlgorithm value) {
    try {
      javonetHandle.set("Algorithm", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DiffAlgorithm getAlgorithm() {
    try {
      Object res = javonetHandle.<NEnum>get("Algorithm");
      if (res == null) return null;
      return DiffAlgorithm.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CompareOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.CompareOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CompareOptions(NObject handle) {
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
