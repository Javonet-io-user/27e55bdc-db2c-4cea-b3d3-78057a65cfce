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
import jio.System.IO.*;
import jio.System.*;
import jio.System.Collections.*;

public class ObjectDatabase
    implements jio.System.Collections.Generic.IEnumerable<GitObject>,
        jio.System.Collections.IEnumerable,
        Iterable<GitObject> {
  protected NObject javonetHandle;

  @Override
  public Iterator<GitObject> iterator() {
    return (Iterator<GitObject>) this.GetEnumerator();
  }

  public ObjectDatabase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public jio.System.Collections.Generic.IEnumerator<GitObject> GetEnumerator() {
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

  public java.lang.Boolean Contains(ObjectId objectId) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", objectId);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public GitObjectMetadata RetrieveObjectMetadata(ObjectId objectId) {
    try {
      Object res = javonetHandle.invoke("RetrieveObjectMetadata", objectId);
      if (res == null) return null;
      return new GitObjectMetadata((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Blob CreateBlob(java.lang.String path) {
    try {
      Object res = javonetHandle.invoke("CreateBlob", path);
      if (res == null) return null;
      return new Blob((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void AddBackend(OdbBackend backend, java.lang.Integer priority) {
    try {
      javonetHandle.invoke("AddBackend", backend, priority);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public <T> ObjectId Write(java.lang.Byte[] data) {
    try {
      Object res = javonetHandle.invoke("Write", new Object[] {data});
      if (res == null) return null;
      return new ObjectId((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Blob CreateBlob(Stream stream) {
    try {
      Object res = javonetHandle.invoke("CreateBlob", stream);
      if (res == null) return null;
      return new Blob((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Blob CreateBlob(Stream stream, java.lang.String hintpath) {
    try {
      Object res = javonetHandle.invoke("CreateBlob", stream, hintpath);
      if (res == null) return null;
      return new Blob((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Blob CreateBlob(
      Stream stream, java.lang.String hintpath, java.lang.Long numberOfBytesToConsume) {
    try {
      Object res = javonetHandle.invoke("CreateBlob", stream, hintpath, numberOfBytesToConsume);
      if (res == null) return null;
      return new Blob((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Blob CreateBlob(Stream stream, java.lang.Long numberOfBytesToConsume) {
    try {
      Object res = javonetHandle.invoke("CreateBlob", stream, numberOfBytesToConsume);
      if (res == null) return null;
      return new Blob((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tree CreateTree(TreeDefinition treeDefinition) {
    try {
      Object res = javonetHandle.invoke("CreateTree", treeDefinition);
      if (res == null) return null;
      return new Tree((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Tree CreateTree(Index index) {
    try {
      Object res = javonetHandle.invoke("CreateTree", index);
      if (res == null) return null;
      return new Tree((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Commit CreateCommit(
      Signature author,
      Signature committer,
      java.lang.String message,
      Tree tree,
      jio.System.Collections.Generic.IEnumerable<Commit> parents,
      java.lang.Boolean prettifyMessage) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateCommit", author, committer, message, tree, parents, prettifyMessage);
      if (res == null) return null;
      return new Commit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Commit CreateCommit(
      Signature author,
      Signature committer,
      java.lang.String message,
      Tree tree,
      jio.System.Collections.Generic.IEnumerable<Commit> parents,
      java.lang.Boolean prettifyMessage,
      Nullable<java.lang.Character> commentChar) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateCommit",
              author,
              committer,
              message,
              tree,
              parents,
              prettifyMessage,
              commentChar);
      if (res == null) return null;
      return new Commit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ObjectId CreateCommitWithSignature(
      java.lang.String commitContent, java.lang.String signature, java.lang.String field) {
    try {
      Object res =
          javonetHandle.invoke("CreateCommitWithSignature", commitContent, signature, field);
      if (res == null) return null;
      return new ObjectId((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ObjectId CreateCommitWithSignature(
      java.lang.String commitContent, java.lang.String signature) {
    try {
      Object res = javonetHandle.invoke("CreateCommitWithSignature", commitContent, signature);
      if (res == null) return null;
      return new ObjectId((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public TagAnnotation CreateTagAnnotation(
      java.lang.String name, GitObject target, Signature tagger, java.lang.String message) {
    try {
      Object res = javonetHandle.invoke("CreateTagAnnotation", name, target, tagger, message);
      if (res == null) return null;
      return new TagAnnotation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Archive(Tree tree, java.lang.String archivePath) {
    try {
      javonetHandle.invoke("Archive", tree, archivePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Archive(Commit commit, java.lang.String archivePath) {
    try {
      javonetHandle.invoke("Archive", commit, archivePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Archive(Commit commit, ArchiverBase archiver) {
    try {
      javonetHandle.invoke("Archive", commit, archiver);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Archive(Tree tree, ArchiverBase archiver) {
    try {
      javonetHandle.invoke("Archive", tree, archiver);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public HistoryDivergence CalculateHistoryDivergence(Commit one, Commit another) {
    try {
      Object res = javonetHandle.invoke("CalculateHistoryDivergence", one, another);
      if (res == null) return null;
      return new HistoryDivergence((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public MergeTreeResult CherryPickCommit(
      Commit cherryPickCommit,
      Commit cherryPickOnto,
      java.lang.Integer mainline,
      MergeTreeOptions options) {
    try {
      Object res =
          javonetHandle.invoke(
              "CherryPickCommit", cherryPickCommit, cherryPickOnto, mainline, options);
      if (res == null) return null;
      return new MergeTreeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ShortenObjectId(GitObject gitObject) {
    try {
      java.lang.String res = javonetHandle.invoke("ShortenObjectId", gitObject);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ShortenObjectId(GitObject gitObject, java.lang.Integer minLength) {
    try {
      java.lang.String res = javonetHandle.invoke("ShortenObjectId", gitObject, minLength);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Boolean CanMergeWithoutConflict(Commit one, Commit another) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("CanMergeWithoutConflict", one, another);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public Commit FindMergeBase(Commit first, Commit second) {
    try {
      Object res = javonetHandle.invoke("FindMergeBase", first, second);
      if (res == null) return null;
      return new Commit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Commit FindMergeBase(
      jio.System.Collections.Generic.IEnumerable<Commit> commits,
      MergeBaseFindingStrategy strategy) {
    try {
      Object res = javonetHandle.invoke("FindMergeBase", commits, NEnum.fromJavaEnum(strategy));
      if (res == null) return null;
      return new Commit((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public MergeTreeResult MergeCommits(Commit ours, Commit theirs, MergeTreeOptions options) {
    try {
      Object res = javonetHandle.invoke("MergeCommits", ours, theirs, options);
      if (res == null) return null;
      return new MergeTreeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public PackBuilderResults Pack(PackBuilderOptions options) {
    try {
      Object res = javonetHandle.invoke("Pack", options);
      if (res == null) return null;
      return new PackBuilderResults((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public PackBuilderResults Pack(PackBuilderOptions options, ActionT<PackBuilder> packDelegate) {
    try {
      Object res = javonetHandle.invoke("Pack", options, packDelegate);
      if (res == null) return null;
      return new PackBuilderResults((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public MergeTreeResult RevertCommit(
      Commit revertCommit,
      Commit revertOnto,
      java.lang.Integer mainline,
      MergeTreeOptions options) {
    try {
      Object res =
          javonetHandle.invoke("RevertCommit", revertCommit, revertOnto, mainline, options);
      if (res == null) return null;
      return new MergeTreeResult((NObject) res);
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
