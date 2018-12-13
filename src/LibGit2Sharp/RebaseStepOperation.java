package LibGit2Sharp;

public enum RebaseStepOperation {
  Pick(0L),
  Reword(1L),
  Edit(2L),
  Squash(3L),
  Fixup(4L),
  ;
  private long numVal;

  RebaseStepOperation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
