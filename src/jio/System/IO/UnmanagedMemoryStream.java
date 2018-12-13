package jio.System.IO;

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
import jio.System.IO.*;
import jio.System.Runtime.InteropServices.*;
import jio.System.*;

public class UnmanagedMemoryStream extends Stream implements IDisposable {
  protected NObject javonetHandle;

  public UnmanagedMemoryStream(SafeBuffer buffer, java.lang.Long offset, java.lang.Long length) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.UnmanagedMemoryStream", buffer, offset, length);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnmanagedMemoryStream(
      SafeBuffer buffer, java.lang.Long offset, java.lang.Long length, FileAccess access) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.UnmanagedMemoryStream",
              buffer,
              offset,
              length,
              NEnum.fromJavaEnum(access));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnmanagedMemoryStream(java.lang.Byte pointer, java.lang.Long length) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.UnmanagedMemoryStream", pointer, length);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnmanagedMemoryStream(
      java.lang.Byte pointer, java.lang.Long length, java.lang.Long capacity, FileAccess access) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.UnmanagedMemoryStream",
              pointer,
              length,
              capacity,
              NEnum.fromJavaEnum(access));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnmanagedMemoryStream(NObject handle) {
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
