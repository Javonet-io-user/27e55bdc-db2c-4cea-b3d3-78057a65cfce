package LibGit2Sharp;

public enum StatusShowOption {
  IndexAndWorkDir(0L),
  IndexOnly(1L),
  WorkDirOnly(2L),
  ;
  private long numVal;

  StatusShowOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
