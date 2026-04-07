import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adding information to the container");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello Swing");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}