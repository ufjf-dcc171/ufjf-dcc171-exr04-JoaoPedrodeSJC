package pkg2017.aula03.exercicio4;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Exercicio4b extends JFrame{
    
    private final JLabel saida1;
    private final JTextField entrada1;
    private final JButton botao;
    private JPasswordField frase = new JPasswordField("abacate");
    public Exercicio4b() throws HeadlessException
    {
        super("Forca");
        setLayout(new FlowLayout());
        saida1 = new JLabel("");
        entrada1 = new JTextField(15);
        botao = new JButton("enviar");
        add(entrada1);
        add(botao);
        add(saida1);
    }

    private class operacao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            
        }
    }
}
