package LibGit2Sharp;

public enum BuiltInFeatures {
  None(0L),
  Threads(1L),
  Https(2L),
  Ssh(4L),
  ;
  private long numVal;

  BuiltInFeatures(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
