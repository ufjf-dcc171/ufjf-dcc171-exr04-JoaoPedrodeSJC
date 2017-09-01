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
    int chance = 5;
    public Exercicio4b() throws HeadlessException
    {
        super("Forca");
        String palavra = "?";
        for (int i = 1; i < frase.getText().length(); i++) {
            palavra = palavra + '?';
        }
        setLayout(new FlowLayout());
        saida1 = new JLabel(palavra);
        entrada1 = new JTextField(15);
        botao = new JButton("enviar");
        add(entrada1);
        add(botao);
        add(saida1);
        botao.addActionListener(new teste());
    }

    private class teste implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            if(chance >0)
            {
                char letra = entrada1.getText().toCharArray()[0];
                String password = "";
                boolean errou = true;
                for (int i = 0; i < frase.getPassword().length; i++) {

                    if(frase.getPassword()[i] == letra)
                    {
                        password = password + letra;
                        errou = false;
                    }
                    else
                    {
                        password = password + saida1.getText().toCharArray()[i];
                    }

                }
                if(errou)
                {
                    chance--;
                }
                saida1.setText(password);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Você não possui mais chances","Game Over",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

