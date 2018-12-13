package LibGit2Sharp;

public enum RenameDetectionMode {
  Default(0L),
  None(1L),
  Exact(2L),
  Renames(3L),
  Copies(4L),
  CopiesHarder(5L),
  ;
  private long numVal;

  RenameDetectionMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
