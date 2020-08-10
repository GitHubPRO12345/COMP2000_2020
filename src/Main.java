import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class Main extends JFrame implements Runnable {

    private class Canvas extends JPanel{

        Grid grid;

        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
        }

        @Override
        public void paint(final Graphics g) {
            grid.paint(g);
        }
    }

    public static void main(String[] args) {
        Main window = new Main();
        window.run();
    }

    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new Canvas());
        this.pack();
        this.setVisible(true);
    }

    
}
