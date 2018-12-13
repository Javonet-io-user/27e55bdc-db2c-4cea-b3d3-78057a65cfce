package LibGit2Sharp;

public enum StageLevel {
  Staged(0L),
  Ancestor(1L),
  Ours(2L),
  Theirs(3L),
  ;
  private long numVal;

  StageLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
