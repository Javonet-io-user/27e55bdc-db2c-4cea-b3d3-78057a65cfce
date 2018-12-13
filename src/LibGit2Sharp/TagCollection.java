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
import jio.System.Collections.*;

public class TagCollection
    implements jio.System.Collections.Generic.IEnumerable<Tag>,
        jio.System.Collections.IEnumerable,
        Iterable<Tag> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Tag> iterator() {
    return (Iterator<Tag>) this.GetEnumerator();
  }
  /** GetProperty */

  public Tag get_Item(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("get_Item", name);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TagCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<Tag> GetEnumerator() {
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

  public Tag Add(
      java.lang.String name,
      java.lang.String objectish,
      Signature tagger,
      java.lang.String message) {
    try {
      Object res = javonetHandle.invoke("Add", name, objectish, tagger, message);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tag Add(
      java.lang.String name,
      java.lang.String objectish,
      Signature tagger,
      java.lang.String message,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, objectish, tagger, message, allowOverwrite);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tag Add(java.lang.String name, java.lang.String objectish) {
    try {
      Object res = javonetHandle.invoke("Add", name, objectish);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tag Add(
      java.lang.String name, java.lang.String objectish, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, objectish, allowOverwrite);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tag Add(
      java.lang.String name, GitObject target, Signature tagger, java.lang.String message) {
    try {
      Object res = javonetHandle.invoke("Add", name, target, tagger, message);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tag Add(
      java.lang.String name,
      GitObject target,
      Signature tagger,
      java.lang.String message,
      java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, target, tagger, message, allowOverwrite);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tag Add(java.lang.String name, GitObject target) {
    try {
      Object res = javonetHandle.invoke("Add", name, target);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tag Add(java.lang.String name, GitObject target, java.lang.Boolean allowOverwrite) {
    try {
      Object res = javonetHandle.invoke("Add", name, target, allowOverwrite);
      if (res == null) return null;
      return new Tag((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Remove(java.lang.String name) {
    try {
      javonetHandle.invoke("Remove", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(Tag tag) {
    try {
      javonetHandle.invoke("Remove", tag);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
