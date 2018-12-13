package LibGit2Sharp.Handlers;

public enum PackBuilderStage {
  Counting(0L),
  Deltafying(1L),
  ;
  private long numVal;

  PackBuilderStage(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
