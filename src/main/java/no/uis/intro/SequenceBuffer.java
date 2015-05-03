package main.java.no.uis.intro;

// Oppg. l)
public class SequenceBuffer {

  private Sequence[] sequences = new Sequence[2];
  private int size = 0;

  public void addSequence(Sequence seq) {
    checkCapacity();
    sequences[size++] = seq;
  }

  private void checkCapacity() {
    if (size == sequences.length) {
      Sequence[] oldSeqs = sequences;
      sequences = new Sequence[size*2];
      for (int i = 0; i < oldSeqs.length; i++) {
        sequences[i] = oldSeqs[i];
      }
      System.out.println("Capacity doubled...");
    }
  }

  public void writeOutAll() {
    for (int i = 0; i < size; i++) {
      System.out.println(sequences[i]);
    }
  }

  public static void main(String[] args) {
    SequenceBuffer buf = new SequenceBuffer();
    buf.addSequence(new ArithmeticSequence(2,3));
    buf.addSequence(new ArithmeticSequence(2,2));
    buf.addSequence(new GeometricSequence(2,1));
    buf.addSequence(new GeometricSequence(2,3));
    buf.addSequence(new FibonacciSequence());
    buf.writeOutAll();
  }
}
