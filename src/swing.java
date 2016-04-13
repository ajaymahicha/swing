import javax.swing.*;

public class swing {
    public static  void main(String args[])
    { SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            Main frame =new Main("hello world swing");
            frame.setSize(500, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        }
    });

    }
}
