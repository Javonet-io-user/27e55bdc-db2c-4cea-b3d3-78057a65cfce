package LibGit2Sharp;

public enum CheckoutModifiers {
  None(0L),
  Force(1L),
  ;
  private long numVal;

  CheckoutModifiers(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
