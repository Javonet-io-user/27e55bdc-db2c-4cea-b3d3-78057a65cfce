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
import jio.System.*;

public interface IRepository extends IDisposable {
  public Branch Checkout(Branch branch, CheckoutOptions options);

  public Branch Checkout(java.lang.String committishOrBranchSpec, CheckoutOptions options);

  public Branch Checkout(Commit commit, CheckoutOptions options);

  public void Checkout(Tree tree, IEnumerable<java.lang.String> paths, CheckoutOptions opts);

  public void CheckoutPaths(
      java.lang.String committishOrBranchSpec,
      IEnumerable<java.lang.String> paths,
      CheckoutOptions checkoutOptions);

  public GitObject Lookup(ObjectId id);

  public GitObject Lookup(java.lang.String objectish);

  public GitObject Lookup(ObjectId id, ObjectType type);

  public GitObject Lookup(java.lang.String objectish, ObjectType type);

  public Commit Commit(
      java.lang.String message, Signature author, Signature committer, CommitOptions options);

  public void Reset(ResetMode resetMode, Commit commit);

  public void Reset(ResetMode resetMode, Commit commit, CheckoutOptions options);

  public void RemoveUntrackedFiles();

  public RevertResult Revert(Commit commit, Signature reverter, RevertOptions options);

  public MergeResult Merge(Commit commit, Signature merger, MergeOptions options);

  public MergeResult Merge(Branch branch, Signature merger, MergeOptions options);

  public MergeResult Merge(java.lang.String committish, Signature merger, MergeOptions options);

  public MergeResult MergeFetchedRefs(Signature merger, MergeOptions options);

  public CherryPickResult CherryPick(Commit commit, Signature committer, CherryPickOptions options);

  public BlameHunkCollection Blame(java.lang.String path, BlameOptions options);

  public void Stage(java.lang.String path, StageOptions stageOptions);

  public void Stage(IEnumerable<java.lang.String> paths, StageOptions stageOptions);

  public void Unstage(java.lang.String path, ExplicitPathsOptions explicitPathsOptions);

  public void Unstage(
      IEnumerable<java.lang.String> paths, ExplicitPathsOptions explicitPathsOptions);

  public void Move(java.lang.String sourcePath, java.lang.String destinationPath);

  public void Move(
      IEnumerable<java.lang.String> sourcePaths, IEnumerable<java.lang.String> destinationPaths);

  public void Remove(
      java.lang.String path,
      java.lang.Boolean removeFromWorkingDirectory,
      ExplicitPathsOptions explicitPathsOptions);

  public void Remove(
      IEnumerable<java.lang.String> paths,
      java.lang.Boolean removeFromWorkingDirectory,
      ExplicitPathsOptions explicitPathsOptions);

  public FileStatus RetrieveStatus(java.lang.String filePath);

  public RepositoryStatus RetrieveStatus(StatusOptions options);

  public java.lang.String Describe(Commit commit, DescribeOptions options);

  public void RevParse(java.lang.String revision, Reference reference, GitObject obj);
}
