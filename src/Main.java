import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main(String s){
        super(s);
        setLayout(new BorderLayout());
        final JTextArea text =new JTextArea();
        JButton btn =new JButton("click");
        Container c=getContentPane();
        c.add(text,BorderLayout.CENTER);
        c.add(btn,BorderLayout.SOUTH);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text.append("Hey yo!\n");
            }
        });
    }
}
