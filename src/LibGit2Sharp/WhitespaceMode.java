package LibGit2Sharp;

public enum WhitespaceMode {
  IgnoreLeadingWhitespace(0L),
  IgnoreAllWhitespace(1L),
  DontIgnoreWhitespace(2L),
  ;
  private long numVal;

  WhitespaceMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
