/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NEa_Cha
    extends NEa {

  private final int line;
  private final int pos;
  private final NChar eChar;

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
    walker.inEa_Cha(this);
    walker.caseEa_Cha(this);
    walker.outEa_Cha(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.eChar.apply(walker);
  }

  public NEa_Cha(int line, int pos, NChar pChar) {
    this.line = line;
    this.pos = pos;
    this.eChar = pChar;
  }

  @Override
  public Type getType() {
    return Type.T_Ea_Cha;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Ea;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Ea_Cha;
  }

  public NChar get_Char() {
    return this.eChar;
  }

  NChar internalGetChar() {
    return this.eChar;
  }
}