package LibGit2Sharp;

public enum CheckoutNotifyFlags {
  None(0L),
  Conflict(1L),
  Dirty(2L),
  Updated(4L),
  Untracked(8L),
  Ignored(16L),
  ;
  private long numVal;

  CheckoutNotifyFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
