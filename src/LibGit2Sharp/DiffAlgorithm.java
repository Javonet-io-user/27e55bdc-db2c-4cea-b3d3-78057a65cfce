package LibGit2Sharp;

public enum DiffAlgorithm {
  Myers(0L),
  Minimal(1L),
  Patience(2L),
  ;
  private long numVal;

  DiffAlgorithm(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
