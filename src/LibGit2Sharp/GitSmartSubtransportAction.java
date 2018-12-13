package LibGit2Sharp;

public enum GitSmartSubtransportAction {
  UploadPackList(1L),
  UploadPack(2L),
  ReceivePackList(3L),
  ReceivePack(4L),
  ;
  private long numVal;

  GitSmartSubtransportAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
