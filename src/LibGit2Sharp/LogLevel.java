package LibGit2Sharp;

public enum LogLevel {
  None(0L),
  Fatal(1L),
  Error(2L),
  Warning(3L),
  Info(4L),
  Debug(5L),
  Trace(6L),
  ;
  private long numVal;

  LogLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
