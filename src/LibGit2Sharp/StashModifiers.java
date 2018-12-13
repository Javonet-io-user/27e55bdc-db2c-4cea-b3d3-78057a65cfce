package LibGit2Sharp;

public enum StashModifiers {
  Default(0L),
  KeepIndex(1L),
  IncludeUntracked(2L),
  IncludeIgnored(4L),
  ;
  private long numVal;

  StashModifiers(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
