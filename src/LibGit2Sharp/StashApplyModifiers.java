package LibGit2Sharp;

public enum StashApplyModifiers {
  Default(0L),
  ReinstateIndex(1L),
  ;
  private long numVal;

  StashApplyModifiers(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
