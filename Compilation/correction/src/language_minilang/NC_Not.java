/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NC_Not
    extends NC {

  private final int line;
  private final int pos;
  private final N$14 e$14;
  private final NC eC;

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
    walker.inC_Not(this);
    walker.caseC_Not(this);
    walker.outC_Not(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$14.apply(walker);
    this.eC.apply(walker);
  }

  NC_Not(int line, int pos, N$14 p$14, NC pC) {
    this.line = line;
    this.pos = pos;
    this.e$14 = p$14;
    this.eC = pC;
  }

  @Override
  public Type getType() {
    return Type.T_C_Not;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_C;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_C_Not;
  }

  public NC get_C() {
    return this.eC;
  }

  N$14 internalGet$14() {
    return this.e$14;
  }

  NC internalGetC() {
    return this.eC;
  }
}