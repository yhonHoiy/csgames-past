/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NC_Par
    extends NC {

  private final int line;
  private final int pos;
  private final N$4 e$4;
  private final NC eC;
  private final N$5 e$5;

  @Override
  public int getLine() {
    return this.line;
  }

  @Override
  public int getPos() {
    return this.pos;
  }

  @Override
  public String getText() {
    return null;
  }

  @Override
  public void apply(Walker walker) {
    walker.inC_Par(this);
    walker.caseC_Par(this);
    walker.outC_Par(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$4.apply(walker);
    this.eC.apply(walker);
    this.e$5.apply(walker);
  }

  NC_Par(int line, int pos, N$4 p$4, NC pC, N$5 p$5) {
    this.line = line;
    this.pos = pos;
    this.e$4 = p$4;
    this.eC = pC;
    this.e$5 = p$5;
  }

  @Override
  public Type getType() {
    return Type.T_C_Par;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_C;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_C_Par;
  }

  public NC get_C() {
    return this.eC;
  }

  N$4 internalGet$4() {
    return this.e$4;
  }

  NC internalGetC() {
    return this.eC;
  }

  N$5 internalGet$5() {
    return this.e$5;
  }
}
