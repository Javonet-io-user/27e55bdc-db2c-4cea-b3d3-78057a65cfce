package LibGit2Sharp;

public enum StashApplyProgress {
  None(0L),
  LoadingStash(1L),
  AnalyzeIndex(2L),
  AnalyzeModified(3L),
  AnalyzeUntracked(4L),
  CheckoutUntracked(5L),
  CheckoutModified(6L),
  Done(7L),
  ;
  private long numVal;

  StashApplyProgress(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
