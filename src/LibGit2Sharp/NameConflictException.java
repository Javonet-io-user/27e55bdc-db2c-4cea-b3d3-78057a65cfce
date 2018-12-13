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
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class NameConflictException extends LibGit2SharpException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public NameConflictException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.NameConflictException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameConflictException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.NameConflictException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameConflictException(java.lang.String format, Object[] args) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("LibGit2Sharp.NameConflictException", format, new Object[] {args});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameConflictException(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.NameConflictException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameConflictException(NObject handle) {
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
