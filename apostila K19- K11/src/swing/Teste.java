package swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Teste {

	public static void main(String[] args) {
		JFrame frame = new JFrame("K19 - K11");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("usuario: ");
		JTextField text = new JTextField(20);
		JLabel label2 = new JLabel("senha: ");
		
		JPasswordField password = new JPasswordField(20);
		
		JButton logar = new JButton("logar");
		
		panel.add(label);
		panel.add(text);
		panel.add(label2);
		panel.add(password);
		panel.add(logar);
		panel.setLayout(new GridLayout(3, 3));
		
		frame.setContentPane(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}









