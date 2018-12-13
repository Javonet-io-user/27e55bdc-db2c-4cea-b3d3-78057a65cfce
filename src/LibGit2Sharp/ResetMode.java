package LibGit2Sharp;

public enum ResetMode {
  Soft(1L),
  Mixed(2L),
  Hard(3L),
  ;
  private long numVal;

  ResetMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
