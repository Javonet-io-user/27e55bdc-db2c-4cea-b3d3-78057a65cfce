package LibGit2Sharp;

public enum Mode {
  Nonexistent(0L),
  Directory(16384L),
  NonExecutableFile(33188L),
  NonExecutableGroupWritableFile(33204L),
  ExecutableFile(33261L),
  SymbolicLink(40960L),
  GitLink(57344L),
  ;
  private long numVal;

  Mode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
