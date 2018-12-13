package LibGit2Sharp;

public enum SubmoduleRecurse {
  No(0L),
  Yes(1L),
  OnDemand(2L),
  Reset(-1L),
  ;
  private long numVal;

  SubmoduleRecurse(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
