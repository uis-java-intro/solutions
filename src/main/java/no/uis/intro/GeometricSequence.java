package main.java.no.uis.intro;

// Oppg. i)
public class GeometricSequence extends AbstractSequence {

  private int ratio, a;

  public GeometricSequence(int ratio, int a) {
    this.ratio = ratio;
    this.a = a;
  }
  
  @Override
  public int getElement(int n) {
    return (int) (a*Math.pow(ratio, n-1));
  }

  @Override
  public int sum(int n) {
    checkN(n);
    return (a*((int)Math.pow(ratio, n)-1))/(ratio-1);
  }

}
