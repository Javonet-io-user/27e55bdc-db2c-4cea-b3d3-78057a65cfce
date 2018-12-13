package LibGit2Sharp;

public enum MergeTreeStatus {
  Succeeded(0L),
  Conflicts(1L),
  ;
  private long numVal;

  MergeTreeStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
