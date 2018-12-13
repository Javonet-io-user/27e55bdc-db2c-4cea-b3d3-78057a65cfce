package LibGit2Sharp;

public enum SubmoduleIgnore {
  None(1L),
  Untracked(2L),
  Dirty(3L),
  All(4L),
  Reset(-1L),
  ;
  private long numVal;

  SubmoduleIgnore(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
