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

public class TreeDefinition {
  protected NObject javonetHandle;
  /** GetProperty */
  public TreeEntryDefinition get_Item(java.lang.String treeEntryPath) {
    try {
      Object res = javonetHandle.invoke("get_Item", treeEntryPath);
      if (res == null) return null;
      return new TreeEntryDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TreeDefinition() {
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.TreeDefinition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeDefinition(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static TreeDefinition From(Tree tree) {
    try {
      Object res = Javonet.getType("TreeDefinition").invoke("From", tree);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static TreeDefinition From(Commit commit) {
    try {
      Object res = Javonet.getType("TreeDefinition").invoke("From", commit);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Remove(IEnumerable<java.lang.String> treeEntryPaths) {
    try {
      Object res = javonetHandle.invoke("Remove", treeEntryPaths);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Remove(java.lang.String treeEntryPath) {
    try {
      Object res = javonetHandle.invoke("Remove", treeEntryPath);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Add(
      java.lang.String targetTreeEntryPath, TreeEntryDefinition treeEntryDefinition) {
    try {
      Object res = javonetHandle.invoke("Add", targetTreeEntryPath, treeEntryDefinition);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Add(java.lang.String targetTreeEntryPath, TreeEntry treeEntry) {
    try {
      Object res = javonetHandle.invoke("Add", targetTreeEntryPath, treeEntry);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Add(java.lang.String targetTreeEntryPath, Blob blob, Mode mode) {
    try {
      Object res = javonetHandle.invoke("Add", targetTreeEntryPath, blob, NEnum.fromJavaEnum(mode));
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Add(
      java.lang.String targetTreeEntryPath, java.lang.String filePath, Mode mode) {
    try {
      Object res =
          javonetHandle.invoke("Add", targetTreeEntryPath, filePath, NEnum.fromJavaEnum(mode));
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Add(java.lang.String targetTreeEntryPath, Tree tree) {
    try {
      Object res = javonetHandle.invoke("Add", targetTreeEntryPath, tree);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition Add(Submodule submodule) {
    try {
      Object res = javonetHandle.invoke("Add", submodule);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TreeDefinition AddGitLink(java.lang.String targetTreeEntryPath, ObjectId objectId) {
    try {
      Object res = javonetHandle.invoke("AddGitLink", targetTreeEntryPath, objectId);
      if (res == null) return null;
      return new TreeDefinition((NObject) res);
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
