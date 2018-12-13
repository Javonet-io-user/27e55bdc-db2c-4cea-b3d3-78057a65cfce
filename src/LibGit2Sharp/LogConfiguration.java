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
import LibGit2Sharp.Handlers.*;

public class LogConfiguration {
  protected NObject javonetHandle;
  /** GetFiled */
  public static LogConfiguration getNone() {
    try {
      Object res = Javonet.getType("LogConfiguration").<NObject>get("None");
      if (res == null) return null;
      return new LogConfiguration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setNone(LogConfiguration param) {
    try {
      Javonet.getType("LogConfiguration").set("None", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LogConfiguration(LogLevel level, LogHandler handler) {
    try {
      javonetHandle =
          Javonet.New("LibGit2Sharp.LogConfiguration", NEnum.fromJavaEnum(level), handler);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LogConfiguration(NObject handle) {
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
