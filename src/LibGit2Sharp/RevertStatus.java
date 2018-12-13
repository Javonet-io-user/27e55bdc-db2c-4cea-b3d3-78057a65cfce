package LibGit2Sharp;

public enum RevertStatus {
  Reverted(0L),
  Conflicts(1L),
  NothingToRevert(2L),
  ;
  private long numVal;

  RevertStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
