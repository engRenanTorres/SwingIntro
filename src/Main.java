import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface Java");

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem itemListar = new JMenuItem("Listar");
        JMenuItem item = new JMenuItem("Sair");

        menu.add(itemListar);
        menu.add(item);
        barraMenu.add(menu);

        frame.setJMenuBar(barraMenu);

        frame.setLayout(new GridLayout(2,2));

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);



        JButton botao1 = new JButton("Botao 1");
        JButton botao2 = new JButton("Botao 2");
        JButton botao3 = new JButton("Botao 3");
        JButton botao4 = new JButton("Botao 4");

        botao1.addActionListener(e->JOptionPane.
                showMessageDialog(frame, "Você clicou no botão 1"));
        botao2.addActionListener(e->JOptionPane.
                showMessageDialog(frame, "Você clicou no botão 2"));
        botao3.addActionListener(e->JOptionPane.
                showMessageDialog(frame, "Você clicou no botão 3"));
        botao4.addActionListener(e->JOptionPane.
                showMessageDialog(frame, "Você clicou no botão 4"));


        frame.add(botao1);
        frame.add(botao3);
        frame.add(botao2);
        frame.add(botao4);

        frame.setVisible(true);
    }
}