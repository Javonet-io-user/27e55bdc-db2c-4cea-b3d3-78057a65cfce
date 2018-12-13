package LibGit2Sharp;

public enum MergeFileFavor {
  Normal(0L),
  Ours(1L),
  Theirs(2L),
  Union(3L),
  ;
  private long numVal;

  MergeFileFavor(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
