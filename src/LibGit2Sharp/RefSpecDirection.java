package LibGit2Sharp;

public enum RefSpecDirection {
  Fetch(0L),
  Push(1L),
  ;
  private long numVal;

  RefSpecDirection(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
