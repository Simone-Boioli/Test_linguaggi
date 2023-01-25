import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Diagram extends JPanel {
 static final int SCALEFACTOR = 200;
 int cycles;
 int points;
 double[] sines;
 int[] pts;
 Diagram() {
 
  }
  public  void setCycles(int newCycles) {
  cycles = newCycles;
  points = SCALEFACTOR * cycles * 2;
  sines = new double[points];
  for (int i = 0; i < points; i++) {
  double radians = (Math.PI / SCALEFACTOR) * i;
  sines[i] = Math.sin(radians);
  }
  repaint();
  }
  public void paintComponent(Graphics g) {
  super.paintComponent(g);
  int maxWidth = getWidth();
  double hstep = (double) maxWidth / (double) points;
  int maxHeight = getHeight();
  pts = new int[points];
  for (int i = 0; i < points; i++)
  pts[i] = (int) (sines[i] * maxHeight / 2 * .95 + maxHeight / 2);
  g.setColor(Color.BLUE);
  for (int i = 1; i < points; i++) {
  int x1 = (int) ((i - 1) * hstep);
  int x2 = (int) (i * hstep);
  int y1 = pts[i - 1];
  int y2 = pts[i];
  g.drawLine(x1, y1, x2, y2);
  }
  }
}
public class SineWave {
 public static void main(String[] args) {
 JFrame frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 200);
  Diagram sines = new Diagram();
  sines.setCycles(5);
  frame.getContentPane().add(sines);
  frame.setVisible(true);
  }
} 