/* This file was generated by SableCC ( http://sablecc.org ). */

package language_minilang;

class S_4
    extends FinalState {

  static final S_4 instance = new S_4();

  private S_4() {
  }

  Token getToken(Lexer lexer) {
    String text = lexer.accept(0);
    int line = lexer.getAcceptLine();
    int pos = lexer.getAcceptPos();

    return new N$2(text, line, pos);
  }
}
