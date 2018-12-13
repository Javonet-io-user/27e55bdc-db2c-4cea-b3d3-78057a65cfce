package LibGit2Sharp;

public enum TagFetchMode {
  FromConfigurationOrDefault(0L),
  Auto(1L),
  None(2L),
  All(3L),
  ;
  private long numVal;

  TagFetchMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
