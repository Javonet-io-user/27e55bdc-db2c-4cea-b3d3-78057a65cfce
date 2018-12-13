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
import jio.System.*;

public class CommitOptions {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAmendPreviousCommit(java.lang.Boolean value) {
    try {
      javonetHandle.set("AmendPreviousCommit", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAmendPreviousCommit() {
    try {
      java.lang.Boolean res = javonetHandle.get("AmendPreviousCommit");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setAllowEmptyCommit(java.lang.Boolean value) {
    try {
      javonetHandle.set("AllowEmptyCommit", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAllowEmptyCommit() {
    try {
      java.lang.Boolean res = javonetHandle.get("AllowEmptyCommit");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setPrettifyMessage(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrettifyMessage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPrettifyMessage() {
    try {
      java.lang.Boolean res = javonetHandle.get("PrettifyMessage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setCommentaryChar(Nullable<java.lang.Character> value) {
    try {
      javonetHandle.set("CommentaryChar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Nullable<java.lang.Character> getCommentaryChar() {
    try {
      Object res = javonetHandle.<NObject>get("CommentaryChar");
      if (res == null) return null;
      return new Nullable<java.lang.Character>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CommitOptions() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.CommitOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommitOptions(NObject handle) {
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
