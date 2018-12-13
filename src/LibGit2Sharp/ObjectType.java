package LibGit2Sharp;

public enum ObjectType {
  Commit(1L),
  Tree(2L),
  Blob(3L),
  Tag(4L),
  ;
  private long numVal;

  ObjectType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
