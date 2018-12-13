package LibGit2Sharp;

public enum DiffTargets {
  Index(1L),
  WorkingDirectory(2L),
  ;
  private long numVal;

  DiffTargets(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
