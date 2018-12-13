package LibGit2Sharp;

public enum FilterMode {
  Smudge(0L),
  Clean(1L),
  ;
  private long numVal;

  FilterMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
