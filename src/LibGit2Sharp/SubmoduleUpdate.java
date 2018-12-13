package LibGit2Sharp;

public enum SubmoduleUpdate {
  Unspecified(0L),
  Checkout(1L),
  Rebase(2L),
  Merge(3L),
  None(4L),
  Reset(-1L),
  ;
  private long numVal;

  SubmoduleUpdate(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
