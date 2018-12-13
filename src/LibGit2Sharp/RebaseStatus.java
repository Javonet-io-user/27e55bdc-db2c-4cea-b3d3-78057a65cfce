package LibGit2Sharp;

public enum RebaseStatus {
  Complete(0L),
  Conflicts(1L),
  Stop(2L),
  ;
  private long numVal;

  RebaseStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
