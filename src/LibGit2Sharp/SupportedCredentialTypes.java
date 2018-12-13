package LibGit2Sharp;

public enum SupportedCredentialTypes {
  UsernamePassword(1L),
  Default(2L),
  ;
  private long numVal;

  SupportedCredentialTypes(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
