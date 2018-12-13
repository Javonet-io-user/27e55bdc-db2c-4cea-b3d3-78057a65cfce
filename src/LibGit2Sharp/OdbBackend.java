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
import jio.System.IO.*;

public abstract class OdbBackend {
  protected NObject javonetHandle;

  public OdbBackend(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer Read(ObjectId id, UnmanagedMemoryStream data, ObjectType objectType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("Read", id, data, NEnum.fromJavaEnum(objectType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer ReadPrefix(
      java.lang.String shortSha, ObjectId oid, UnmanagedMemoryStream data, ObjectType objectType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("ReadPrefix", shortSha, oid, data, NEnum.fromJavaEnum(objectType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer ReadHeader(
      ObjectId id, AtomicReference<java.lang.Integer> length, ObjectType objectType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "ReadHeader",
              id,
              new NOut(length, Helper.JavaToDotnetType.get(java.lang.Integer.class)),
              NEnum.fromJavaEnum(objectType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer Write(
      ObjectId id, Stream dataStream, java.lang.Long length, ObjectType objectType) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("Write", id, dataStream, length, NEnum.fromJavaEnum(objectType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer ReadStream(ObjectId id, OdbBackendStream stream) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ReadStream", id, stream);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer WriteStream(
      java.lang.Long length, ObjectType objectType, OdbBackendStream stream) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("WriteStream", length, NEnum.fromJavaEnum(objectType), stream);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean Exists(ObjectId id) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Exists", id);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer ExistsPrefix(java.lang.String shortSha, ObjectId found) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ExistsPrefix", shortSha, found);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer ForEach(OdbBackend.ForEachCallback callback) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ForEach", callback);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public interface ForEachCallback {
    public java.lang.Integer Invoke(ObjectId oid);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
