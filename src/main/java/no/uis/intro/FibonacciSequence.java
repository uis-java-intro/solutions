package main.java.no.uis.intro;

public class FibonacciSequence extends AbstractSequence {

  public int slow_getElement(int n) {
    if (n <= 1)
      return n;
    else
      return getElement(n-1) + getElement(n-2);
  }

  @Override
  public int getElement(int n) {
    checkN(n+1);
    if (n > 46)
      throw new IllegalArgumentException("n > 46 cannot be computed with this algorithm.");
    int prev1 = 0, prev2 = 1;
    for (int i = 0, tmpPrev1 = 0; i<n; i++) {
      tmpPrev1 = prev1;
      prev1 = prev2;
      prev2 += tmpPrev1;
    }
    return prev1;
  }

}
