package LibGit2Sharp;

public enum DescribeStrategy {
  Default(0L),
  Tags(1L),
  All(2L),
  ;
  private long numVal;

  DescribeStrategy(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
