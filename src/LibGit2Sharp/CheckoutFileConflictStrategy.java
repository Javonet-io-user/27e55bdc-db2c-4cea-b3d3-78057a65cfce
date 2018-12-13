package LibGit2Sharp;

public enum CheckoutFileConflictStrategy {
  Normal(0L),
  Ours(1L),
  Theirs(2L),
  Merge(3L),
  Diff3(4L),
  ;
  private long numVal;

  CheckoutFileConflictStrategy(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
