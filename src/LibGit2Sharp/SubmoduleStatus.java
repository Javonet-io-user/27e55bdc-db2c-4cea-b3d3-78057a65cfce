package LibGit2Sharp;

public enum SubmoduleStatus {
  Unmodified(0L),
  InHead(1L),
  InIndex(2L),
  InConfig(4L),
  InWorkDir(8L),
  IndexAdded(16L),
  IndexDeleted(32L),
  IndexModified(64L),
  WorkDirUninitialized(128L),
  WorkDirAdded(256L),
  WorkDirDeleted(512L),
  WorkDirModified(1024L),
  WorkDirFilesIndexDirty(2048L),
  WorkDirFilesModified(4096L),
  WorkDirFilesUntracked(8192L),
  ;
  private long numVal;

  SubmoduleStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
