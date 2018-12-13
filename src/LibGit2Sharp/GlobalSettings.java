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
import jio.System.Collections.Generic.*;

public class GlobalSettings {
  protected NObject javonetHandle;
  /** GetProperty */
  public static Version getVersion() {
    try {
      Object res = Javonet.getType("GlobalSettings").<NObject>get("Version");
      if (res == null) return null;
      return new Version((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public static void setLogConfiguration(LogConfiguration value) {
    try {
      Javonet.getType("GlobalSettings").set("LogConfiguration", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public static LogConfiguration getLogConfiguration() {
    try {
      Object res = Javonet.getType("GlobalSettings").<NObject>get("LogConfiguration");
      if (res == null) return null;
      return new LogConfiguration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public static void setNativeLibraryPath(java.lang.String value) {
    try {
      Javonet.getType("GlobalSettings").set("NativeLibraryPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public static java.lang.String getNativeLibraryPath() {
    try {
      java.lang.String res = Javonet.getType("GlobalSettings").get("NativeLibraryPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static <T> SmartSubtransportRegistration<T> RegisterSmartSubtransport(
      java.lang.String scheme) {
    try {
      Object res = Javonet.getType("GlobalSettings").invoke("RegisterSmartSubtransport", scheme);
      if (res == null) return null;
      return new SmartSubtransportRegistration<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static <T> void UnregisterSmartSubtransport(
      SmartSubtransportRegistration<T> registration) {
    try {
      Javonet.getType("GlobalSettings").invoke("UnregisterSmartSubtransport", registration);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static IEnumerable<FilterRegistration> GetRegisteredFilters() {
    try {
      Object res = Javonet.getType("GlobalSettings").invoke("GetRegisteredFilters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static FilterRegistration RegisterFilter(Filter filter) {
    try {
      Object res = Javonet.getType("GlobalSettings").invoke("RegisterFilter", filter);
      if (res == null) return null;
      return new FilterRegistration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static FilterRegistration RegisterFilter(Filter filter, java.lang.Integer priority) {
    try {
      Object res = Javonet.getType("GlobalSettings").invoke("RegisterFilter", filter, priority);
      if (res == null) return null;
      return new FilterRegistration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void DeregisterFilter(FilterRegistration registration) {
    try {
      Javonet.getType("GlobalSettings").invoke("DeregisterFilter", registration);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static IEnumerable<java.lang.String> GetConfigSearchPaths(ConfigurationLevel level) {
    try {
      Object res =
          Javonet.getType("GlobalSettings")
              .invoke("GetConfigSearchPaths", NEnum.fromJavaEnum(level));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void SetConfigSearchPaths(ConfigurationLevel level, java.lang.String[] paths) {
    try {
      Javonet.getType("GlobalSettings")
          .invoke("SetConfigSearchPaths", NEnum.fromJavaEnum(level), new Object[] {paths});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void SetStrictHashVerification(java.lang.Boolean enabled) {
    try {
      Javonet.getType("GlobalSettings").invoke("SetStrictHashVerification", enabled);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
