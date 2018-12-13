package LibGit2Sharp;

public enum ChangeKind {
  Unmodified(0L),
  Added(1L),
  Deleted(2L),
  Modified(3L),
  Renamed(4L),
  Copied(5L),
  Ignored(6L),
  Untracked(7L),
  TypeChanged(8L),
  Unreadable(9L),
  Conflicted(10L),
  ;
  private long numVal;

  ChangeKind(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
