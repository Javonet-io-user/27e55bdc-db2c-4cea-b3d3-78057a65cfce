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

public class Branch extends ReferenceWrapper<Commit>
    implements IEquatable<ReferenceWrapper<Commit>>, IBelongToARepository {
  protected NObject javonetHandle;
  /** GetProperty */
  public TreeEntry get_Item(java.lang.String relativePath) {
    try {
      Object res = javonetHandle.invoke("get_Item", relativePath);
      if (res == null) return null;
      return new TreeEntry((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsRemote() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsRemote");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Branch getTrackedBranch() {
    try {
      Object res = javonetHandle.<NObject>get("TrackedBranch");
      if (res == null) return null;
      return new Branch((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsTracking() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsTracking");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public BranchTrackingDetails getTrackingDetails() {
    try {
      Object res = javonetHandle.<NObject>get("TrackingDetails");
      if (res == null) return null;
      return new BranchTrackingDetails((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsCurrentRepositoryHead() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsCurrentRepositoryHead");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Commit getTip() {
    try {
      Object res = javonetHandle.<NObject>get("Tip");
      if (res == null) return null;
      return new Commit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ICommitLog getCommits() {
    try {
      Object res = javonetHandle.<NObject>get("Commits");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getUpstreamBranchCanonicalName() {
    try {
      java.lang.String res = javonetHandle.get("UpstreamBranchCanonicalName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getRemoteName() {
    try {
      java.lang.String res = javonetHandle.get("RemoteName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public Remote getRemote() {
    try {
      Object res = javonetHandle.<NObject>get("Remote");
      if (res == null) return null;
      return new Remote((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Branch(NObject handle) {
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
