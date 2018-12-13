package jio.System;

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
import jio.System.*;
import jio.System.Globalization.*;
import jio.System.Runtime.Serialization.*;

public class DateTimeOffset extends ValueType
    implements IComparable,
        IFormattable,
        ISerializable,
        IDeserializationCallback,
        IComparableT<DateTimeOffset>,
        IEquatable<DateTimeOffset> {
  protected NObject javonetHandle;

  public DateTimeOffset(java.lang.Long ticks, TimeSpan offset) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTimeOffset", ticks, offset);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeOffset(DateTime dateTime) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTimeOffset", dateTime);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeOffset(DateTime dateTime, TimeSpan offset) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.DateTimeOffset", dateTime, offset);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeOffset(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      TimeSpan offset) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.DateTimeOffset", year, month, day, hour, minute, second, offset);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeOffset(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      java.lang.Integer millisecond,
      TimeSpan offset) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.DateTimeOffset", year, month, day, hour, minute, second, millisecond, offset);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeOffset(
      java.lang.Integer year,
      java.lang.Integer month,
      java.lang.Integer day,
      java.lang.Integer hour,
      java.lang.Integer minute,
      java.lang.Integer second,
      java.lang.Integer millisecond,
      Calendar calendar,
      TimeSpan offset) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.DateTimeOffset",
              year,
              month,
              day,
              hour,
              minute,
              second,
              millisecond,
              calendar,
              offset);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DateTimeOffset(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer CompareTo(Object obj) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IComparable").invoke("CompareTo", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDeserialization(Object sender) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.IDeserializationCallback")
          .invoke("OnDeserialization", sender);
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
