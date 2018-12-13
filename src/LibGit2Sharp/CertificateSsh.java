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

public class CertificateSsh extends Certificate {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.Byte[] getHashMD5(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("HashMD5");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setHashMD5(java.lang.Byte[] param) {
    try {
      javonetHandle.set("HashMD5", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Byte[] getHashSHA1(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("HashSHA1");
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setHashSHA1(java.lang.Byte[] param) {
    try {
      javonetHandle.set("HashSHA1", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getHasMD5() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasMD5");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setHasMD5(java.lang.Boolean param) {
    try {
      javonetHandle.set("HasMD5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getHasSHA1() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasSHA1");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setHasSHA1(java.lang.Boolean param) {
    try {
      javonetHandle.set("HasSHA1", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CertificateSsh(NObject handle) {
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
