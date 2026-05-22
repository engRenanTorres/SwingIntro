import javax.swing.*;

public class FrameVertical {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem item = new JMenuItem("Sair");

        menu.add(item);
        barraMenu.add(menu);

        frame.setJMenuBar(barraMenu);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
