package LibGit2Sharp;

public enum CurrentOperation {
  None(0L),
  Merge(1L),
  Revert(2L),
  RevertSequence(3L),
  CherryPick(4L),
  CherryPickSequence(5L),
  Bisect(6L),
  Rebase(7L),
  RebaseInteractive(8L),
  RebaseMerge(9L),
  ApplyMailbox(10L),
  ApplyMailboxOrRebase(11L),
  ;
  private long numVal;

  CurrentOperation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
