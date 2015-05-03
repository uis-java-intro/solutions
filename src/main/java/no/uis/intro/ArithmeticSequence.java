package main.java.no.uis.intro;

public class ArithmeticSequence // Oppg. a)
  extends AbstractSequence {

  private int d, a1;

  // Oppg. a)
  public ArithmeticSequence(int initialTerm, int commonDifference) {
    this.a1 = initialTerm;
    this.d = commonDifference;
  }

  @Override
  public int sum(int n) {
    checkN(n);
    return n*(a1+getElement(n))/2; // Oppg. h)
  }

  @Override
  public int getElement(int n) { // Oppg. b)
    return a1+(n-1)*d;
  }

}
