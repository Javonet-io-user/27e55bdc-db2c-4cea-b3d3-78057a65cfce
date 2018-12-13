package LibGit2Sharp;

public enum FastForwardStrategy {
  Default(0L),
  NoFastForward(1L),
  FastForwardOnly(2L),
  ;
  private long numVal;

  FastForwardStrategy(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
