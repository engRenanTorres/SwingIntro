import javax.swing.*;
import java.awt.*;

public class PanelPadrao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");

        JPanel topo = new JPanel();
        topo.add(new Label("Topo"));
        topo.add(new JTextField(10));

        JPanel centro = new JPanel();
        centro.setLayout(new GridLayout(2,2));
        centro.add(new JLabel("Opção 1"));
        centro.add(new JCheckBox());
        centro.add(new JLabel("Opção 2"));
        centro.add(new JCheckBox());

        JPanel baixo =  new JPanel();
        baixo.add(new JButton("Ok"));
        baixo.add(new JButton("Sair!"));

        frame.setLayout(new BorderLayout());
        frame.add(topo,BorderLayout.NORTH);
        frame.add(centro, BorderLayout.CENTER);
        frame.add(baixo, BorderLayout.SOUTH);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
