package LibGit2Sharp;

public enum MergeStatus {
  UpToDate(0L),
  FastForward(1L),
  NonFastForward(2L),
  Conflicts(3L),
  ;
  private long numVal;

  MergeStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
