package LibGit2Sharp;

public enum FileStatus {
  Unaltered(0L),
  NewInIndex(1L),
  ModifiedInIndex(2L),
  DeletedFromIndex(4L),
  RenamedInIndex(8L),
  TypeChangeInIndex(16L),
  NewInWorkdir(128L),
  ModifiedInWorkdir(256L),
  DeletedFromWorkdir(512L),
  TypeChangeInWorkdir(1024L),
  RenamedInWorkdir(2048L),
  Unreadable(4096L),
  Ignored(16384L),
  Conflicted(32768L),
  Nonexistent(-2147483648L),
  ;
  private long numVal;

  FileStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
