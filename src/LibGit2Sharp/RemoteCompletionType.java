package LibGit2Sharp;

public enum RemoteCompletionType {
  Download(0L),
  Indexing(1L),
  Error(2L),
  ;
  private long numVal;

  RemoteCompletionType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
