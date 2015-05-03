package main.java.no.uis.intro;

// Oppg. f)
public abstract class AbstractSequence implements SearchableSequence {

  private static final int DEFAULT_SEQ_LEN = 10;

  protected void checkN(int n) {  // Oppg. j)
    if (n < 1)
      throw new IllegalArgumentException("Require n > 0");
  }

  @Override
  public String toString() {  // Oppg. d)
    StringBuilder b = new StringBuilder();
    for (int i = 1; i <= DEFAULT_SEQ_LEN; i++)
      b.append(getElement(i)).append(", ");
    b.append("...");
    return b.toString();
  }

  @Override
  public int product(int n) { // Oppg. f)
    checkN(n);
    int product = 1;
    for (int i = 1; i <= n; i++)
      product *= getElement(i);
    return product;
  }

  @Override
  public int sum(int n) { // Oppg. c)
    checkN(n);
    int sum = 0;
    for (int i = 1; i <= n; i++)
      sum += getElement(i);
    return sum;
  }

  /**
   * Check if element <i>k</i> is in the sequence, bounded by <i>max</i>.
   */
  @Override
  public int findElementIn(int k, int max) { // Oppg. k)
    checkN(max); // Check that n>0
    int midVal = getElement(max);
    if (midVal < k) {
      return -1; // Not in sequence
    }
    int min=0, mid=0;
    boolean found = false;

    while (!found && min <= max) {
      mid = (min+max) / 2;
      midVal = getElement(mid);
      if (midVal == k) {
        found = true;
      } else {
        if (midVal > k) {
          max = mid-1;
        } else {
          min = mid+1;
        }
      }
    }
    return found ? mid : -1;
  }
}
