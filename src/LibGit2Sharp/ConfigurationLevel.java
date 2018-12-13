package LibGit2Sharp;

public enum ConfigurationLevel {
  ProgramData(1L),
  System(2L),
  Xdg(3L),
  Global(4L),
  Local(5L),
  ;
  private long numVal;

  ConfigurationLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
