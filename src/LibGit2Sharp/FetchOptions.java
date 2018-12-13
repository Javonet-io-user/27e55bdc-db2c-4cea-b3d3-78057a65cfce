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

public class FetchOptions extends FetchOptionsBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTagFetchMode(Nullable<TagFetchMode> value) {
    try {
      javonetHandle.set("TagFetchMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Nullable<TagFetchMode> getTagFetchMode() {
    try {
      Object res = javonetHandle.<NObject>get("TagFetchMode");
      if (res == null) return null;
      return new Nullable<TagFetchMode>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setPrune(Nullable<java.lang.Boolean> value) {
    try {
      javonetHandle.set("Prune", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Nullable<java.lang.Boolean> getPrune() {
    try {
      Object res = javonetHandle.<NObject>get("Prune");
      if (res == null) return null;
      return new Nullable<java.lang.Boolean>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FetchOptions() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("LibGit2Sharp.FetchOptions");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FetchOptions(NObject handle) {
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
