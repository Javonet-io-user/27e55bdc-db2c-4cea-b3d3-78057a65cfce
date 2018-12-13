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

public class SimilarityOptions {
  protected NObject javonetHandle;
  /** GetProperty */
  public static SimilarityOptions getNone() {
    try {
      Object res = Javonet.getType("SimilarityOptions").<NObject>get("None");
      if (res == null) return null;
      return new SimilarityOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public static SimilarityOptions getRenames() {
    try {
      Object res = Javonet.getType("SimilarityOptions").<NObject>get("Renames");
      if (res == null) return null;
      return new SimilarityOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public static SimilarityOptions getExact() {
    try {
      Object res = Javonet.getType("SimilarityOptions").<NObject>get("Exact");
      if (res == null) return null;
      return new SimilarityOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public static SimilarityOptions getCopies() {
    try {
      Object res = Javonet.getType("SimilarityOptions").<NObject>get("Copies");
      if (res == null) return null;
      return new SimilarityOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public static SimilarityOptions getCopiesHarder() {
    try {
      Object res = Javonet.getType("SimilarityOptions").<NObject>get("CopiesHarder");
      if (res == null) return null;
      return new SimilarityOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public static SimilarityOptions getDefault() {
    try {
      Object res = Javonet.getType("SimilarityOptions").<NObject>get("Default");
      if (res == null) return null;
      return new SimilarityOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRenameDetectionMode(RenameDetectionMode value) {
    try {
      javonetHandle.set("RenameDetectionMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RenameDetectionMode getRenameDetectionMode() {
    try {
      Object res = javonetHandle.<NEnum>get("RenameDetectionMode");
      if (res == null) return null;
      return RenameDetectionMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setWhitespaceMode(WhitespaceMode value) {
    try {
      javonetHandle.set("WhitespaceMode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public WhitespaceMode getWhitespaceMode() {
    try {
      Object res = javonetHandle.<NEnum>get("WhitespaceMode");
      if (res == null) return null;
      return WhitespaceMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRenameThreshold(java.lang.Integer value) {
    try {
      javonetHandle.set("RenameThreshold", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getRenameThreshold() {
    try {
      java.lang.Integer res = javonetHandle.get("RenameThreshold");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setRenameFromRewriteThreshold(java.lang.Integer value) {
    try {
      javonetHandle.set("RenameFromRewriteThreshold", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getRenameFromRewriteThreshold() {
    try {
      java.lang.Integer res = javonetHandle.get("RenameFromRewriteThreshold");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setCopyThreshold(java.lang.Integer value) {
    try {
      javonetHandle.set("CopyThreshold", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCopyThreshold() {
    try {
      java.lang.Integer res = javonetHandle.get("CopyThreshold");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setBreakRewriteThreshold(java.lang.Integer value) {
    try {
      javonetHandle.set("BreakRewriteThreshold", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getBreakRewriteThreshold() {
    try {
      java.lang.Integer res = javonetHandle.get("BreakRewriteThreshold");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setRenameLimit(java.lang.Integer value) {
    try {
      javonetHandle.set("RenameLimit", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getRenameLimit() {
    try {
      java.lang.Integer res = javonetHandle.get("RenameLimit");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public SimilarityOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.SimilarityOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SimilarityOptions(NObject handle) {
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
