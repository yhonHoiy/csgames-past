/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

public class NStmt_Print
    extends NStmt {

  private final int line;
  private final int pos;
  private final N$0 e$0;
  private final NExpr eExpr;

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
    walker.inStmt_Print(this);
    walker.caseStmt_Print(this);
    walker.outStmt_Print(this);
  }

  @Override
  public void applyOnChildren(Walker walker) {
    this.e$0.apply(walker);
    this.eExpr.apply(walker);
  }

  NStmt_Print(int line, int pos, N$0 p$0, NExpr pExpr) {
    this.line = line;
    this.pos = pos;
    this.e$0 = p$0;
    this.eExpr = pExpr;
  }

  @Override
  public Type getType() {
    return Type.T_Stmt_Print;
  }

  @Override
  public ProductionType getProductionType() {
    return ProductionType.T_Stmt;
  }

  @Override
  InternalType getInternalType() {
    return InternalType.T_Stmt_Print;
  }

  public NExpr get_Expr() {
    return this.eExpr;
  }

  N$0 internalGet$0() {
    return this.e$0;
  }

  NExpr internalGetExpr() {
    return this.eExpr;
  }
}
