import javax.swing.*;
import java.awt.*;

public class Listas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cidades");

        String[] options = {"Rio de Janeiro-RJ","Niterói-RJ","Cabo Frio-RJ"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        JLabel label = new JLabel("Selecione uma cidade");

        comboBox.addActionListener(e-> label
                .setText("Cidade: " + comboBox.getSelectedItem()));

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(comboBox);


        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
