import javax.swing.*;
import java.awt.*;

public class PanelEstilizado {
    public static void main(String[] args) {
        JPanel panel = new JPanel(){
          protected void paintComponent(Graphics g){
              super.paintComponent(g);
              g.setColor(Color.BLUE);
              g.fillOval(50,90,50,100);
          }
        };
        JFrame frame = new JFrame("Menu");
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem item = new JMenuItem("Sair");

        frame.add(panel);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
