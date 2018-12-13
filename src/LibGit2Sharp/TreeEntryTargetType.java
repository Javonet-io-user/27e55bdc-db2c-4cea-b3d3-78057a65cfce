package LibGit2Sharp;

public enum TreeEntryTargetType {
  Blob(0L),
  Tree(1L),
  GitLink(2L),
  ;
  private long numVal;

  TreeEntryTargetType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
