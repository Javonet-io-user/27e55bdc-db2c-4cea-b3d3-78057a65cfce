package LibGit2Sharp;

public enum BlameStrategy {
  Default(0L),
  ;
  private long numVal;

  BlameStrategy(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
