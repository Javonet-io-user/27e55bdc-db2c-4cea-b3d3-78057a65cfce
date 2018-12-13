package LibGit2Sharp;

public enum MergeBaseFindingStrategy {
  Standard(0L),
  Octopus(1L),
  ;
  private long numVal;

  MergeBaseFindingStrategy(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
