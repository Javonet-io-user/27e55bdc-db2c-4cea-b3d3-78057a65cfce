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

public class PushUpdate {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.String getSourceRefName() {
    try {
      java.lang.String res = javonetHandle.get("SourceRefName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setSourceRefName(java.lang.String param) {
    try {
      javonetHandle.set("SourceRefName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getDestinationRefName() {
    try {
      java.lang.String res = javonetHandle.get("DestinationRefName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setDestinationRefName(java.lang.String param) {
    try {
      javonetHandle.set("DestinationRefName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ObjectId getSourceObjectId() {
    try {
      Object res = javonetHandle.<NObject>get("SourceObjectId");
      if (res == null) return null;
      return new ObjectId((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setSourceObjectId(ObjectId param) {
    try {
      javonetHandle.set("SourceObjectId", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ObjectId getDestinationObjectId() {
    try {
      Object res = javonetHandle.<NObject>get("DestinationObjectId");
      if (res == null) return null;
      return new ObjectId((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setDestinationObjectId(ObjectId param) {
    try {
      javonetHandle.set("DestinationObjectId", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PushUpdate(NObject handle) {
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
