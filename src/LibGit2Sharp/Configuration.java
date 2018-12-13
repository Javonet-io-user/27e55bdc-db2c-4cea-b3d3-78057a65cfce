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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class Configuration
    implements IDisposable,
        jio.System.Collections.Generic.IEnumerable<ConfigurationEntry<java.lang.String>>,
        jio.System.Collections.IEnumerable,
        Iterable<ConfigurationEntry<java.lang.String>> {
  protected NObject javonetHandle;

  @Override
  public Iterator<ConfigurationEntry<java.lang.String>> iterator() {
    return (Iterator<ConfigurationEntry<java.lang.String>>) this.GetEnumerator();
  }

  public Configuration(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static Configuration BuildFrom(java.lang.String repositoryConfigurationFileLocation) {
    try {
      Object res =
          Javonet.getType("Configuration").invoke("BuildFrom", repositoryConfigurationFileLocation);
      if (res == null) return null;
      return new Configuration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Configuration BuildFrom(
      java.lang.String repositoryConfigurationFileLocation,
      java.lang.String globalConfigurationFileLocation) {
    try {
      Object res =
          Javonet.getType("Configuration")
              .invoke(
                  "BuildFrom",
                  repositoryConfigurationFileLocation,
                  globalConfigurationFileLocation);
      if (res == null) return null;
      return new Configuration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Configuration BuildFrom(
      java.lang.String repositoryConfigurationFileLocation,
      java.lang.String globalConfigurationFileLocation,
      java.lang.String xdgConfigurationFileLocation) {
    try {
      Object res =
          Javonet.getType("Configuration")
              .invoke(
                  "BuildFrom",
                  repositoryConfigurationFileLocation,
                  globalConfigurationFileLocation,
                  xdgConfigurationFileLocation);
      if (res == null) return null;
      return new Configuration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Configuration BuildFrom(
      java.lang.String repositoryConfigurationFileLocation,
      java.lang.String globalConfigurationFileLocation,
      java.lang.String xdgConfigurationFileLocation,
      java.lang.String systemConfigurationFileLocation) {
    try {
      Object res =
          Javonet.getType("Configuration")
              .invoke(
                  "BuildFrom",
                  repositoryConfigurationFileLocation,
                  globalConfigurationFileLocation,
                  xdgConfigurationFileLocation,
                  systemConfigurationFileLocation);
      if (res == null) return null;
      return new Configuration((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean HasConfig(ConfigurationLevel level) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("HasConfig", NEnum.fromJavaEnum(level));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Unset(java.lang.String key) {
    try {
      javonetHandle.invoke("Unset", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Unset(java.lang.String key, ConfigurationLevel level) {
    try {
      javonetHandle.invoke("Unset", key, NEnum.fromJavaEnum(level));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T> ConfigurationEntry<T> Get(java.lang.String[] keyParts) {
    try {
      Object res = javonetHandle.invoke("Get", new Object[] {keyParts});
      if (res == null) return null;
      return new ConfigurationEntry<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> ConfigurationEntry<T> Get(
      java.lang.String firstKeyPart,
      java.lang.String secondKeyPart,
      java.lang.String thirdKeyPart) {
    try {
      Object res = javonetHandle.invoke("Get", firstKeyPart, secondKeyPart, thirdKeyPart);
      if (res == null) return null;
      return new ConfigurationEntry<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> ConfigurationEntry<T> Get(java.lang.String key) {
    try {
      Object res = javonetHandle.invoke("Get", key);
      if (res == null) return null;
      return new ConfigurationEntry<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> ConfigurationEntry<T> Get(java.lang.String key, ConfigurationLevel level) {
    try {
      Object res = javonetHandle.invoke("Get", key, NEnum.fromJavaEnum(level));
      if (res == null) return null;
      return new ConfigurationEntry<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(java.lang.String key, Class<?> returnType) {
    try {
      Object res =
          javonetHandle.generic(getReturnObjectName(returnType)).invoke("GetValueOrDefault", key);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(java.lang.String key, T defaultValue, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(defaultValue), getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", key, defaultValue);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(
      java.lang.String key, ConfigurationLevel level, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", key, NEnum.fromJavaEnum(level));
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(
      java.lang.String key, ConfigurationLevel level, T defaultValue, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(defaultValue), getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", key, NEnum.fromJavaEnum(level), defaultValue);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(java.lang.String[] keyParts, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", new Object[] {keyParts});
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(java.lang.String[] keyParts, T defaultValue, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(defaultValue), getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", new Object[] {keyParts}, defaultValue);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(
      java.lang.String firstKeyPart,
      java.lang.String secondKeyPart,
      java.lang.String thirdKeyPart,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", firstKeyPart, secondKeyPart, thirdKeyPart);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(
      java.lang.String firstKeyPart,
      java.lang.String secondKeyPart,
      java.lang.String thirdKeyPart,
      T defaultValue,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getGetObjectName(defaultValue), getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", firstKeyPart, secondKeyPart, thirdKeyPart, defaultValue);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(
      java.lang.String key,
      ConfigurationLevel level,
      FuncTResult<T> defaultValueSelector,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", key, NEnum.fromJavaEnum(level), defaultValueSelector);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetValueOrDefault(
      java.lang.String firstKeyPart,
      java.lang.String secondKeyPart,
      java.lang.String thirdKeyPart,
      FuncTResult<T> defaultValueSelector,
      Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke(
                  "GetValueOrDefault",
                  firstKeyPart,
                  secondKeyPart,
                  thirdKeyPart,
                  defaultValueSelector);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> void Set(java.lang.String key, T value) {
    try {
      javonetHandle.generic(getGetObjectName(value)).invoke("Set", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T> void Set(java.lang.String key, T value, ConfigurationLevel level) {
    try {
      javonetHandle
          .generic(getGetObjectName(value))
          .invoke("Set", key, value, NEnum.fromJavaEnum(level));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<ConfigurationEntry<java.lang.String>> Find(
      java.lang.String regexp) {
    try {
      Object res = javonetHandle.invoke("Find", regexp);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerable<ConfigurationEntry<java.lang.String>> Find(
      java.lang.String regexp, ConfigurationLevel level) {
    try {
      Object res = javonetHandle.invoke("Find", regexp, NEnum.fromJavaEnum(level));
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<ConfigurationEntry<java.lang.String>>
      GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Signature BuildSignature(DateTimeOffset now) {
    try {
      Object res = javonetHandle.invoke("BuildSignature", now);
      if (res == null) return null;
      return new Signature((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void WithinTransaction(Action action) {
    try {
      javonetHandle.invoke("WithinTransaction", action);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T, A> T GetValueOrDefault(
      java.lang.String key, FuncTResult<A> defaultValueSelector, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .invoke("GetValueOrDefault", key, defaultValueSelector);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
