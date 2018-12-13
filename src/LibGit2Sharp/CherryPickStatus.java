package LibGit2Sharp;

public enum CherryPickStatus {
  CherryPicked(0L),
  Conflicts(1L),
  ;
  private long numVal;

  CherryPickStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
