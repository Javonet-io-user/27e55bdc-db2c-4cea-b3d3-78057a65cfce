package LibGit2Sharp;

public enum StashApplyStatus {
  Applied(0L),
  Conflicts(1L),
  NotFound(2L),
  UncommittedChanges(3L),
  ;
  private long numVal;

  StashApplyStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
