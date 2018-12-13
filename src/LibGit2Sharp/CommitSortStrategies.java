package LibGit2Sharp;

public enum CommitSortStrategies {
  None(0L),
  Topological(1L),
  Time(2L),
  Reverse(4L),
  ;
  private long numVal;

  CommitSortStrategies(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
