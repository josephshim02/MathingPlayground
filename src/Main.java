import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Graphics;
import java.awt.Dimension;



public class Main extends JFrame {
    public static void main(String[] args) {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      public Canvas() {
        setPreferredSize(new Dimension(1024, 720));
      }

      @Override
      public void paint(Graphics g) {

      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
      this.setLayout(null);
      JButton b=new JButton("click");//creating instance of JButton
      b.setBounds(130,100,100, 40);
      this.add(b);
    }

    public void run() {


    }
}
