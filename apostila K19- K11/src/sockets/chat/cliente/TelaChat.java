package sockets.chat.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaChat {
	
	private final ClienteEmissorDeMensagem emissor;
	private JFrame frame;
	private JPanel panel;
	private JTextArea textArea1;
	private JScrollPane scrollPane;
	private JLabel Label1;
	private JTextField textField;
	private JButton button;
	
	public TelaChat(ClienteEmissorDeMensagem emissor) {
		this.emissor = emissor;
		
		this.frame = new JFrame("Chat ");
		this.panel = new JPanel();
		this.textArea1 = new JTextArea(10, 60);
		this.textArea1.setEditable(false);
		this.scrollPane = new JScrollPane(textArea1);
		this.Label1 = new JLabel("Digite uma mensagem...");
		this.textField = new JTextField(60);
		this.button = new JButton("enviar");
		
		this.frame.setContentPane(panel);
		this.panel.add(this.scrollPane);
		this.panel.add(this.Label1);
		this.panel.add(this.textField);
		this.panel.add(button);

		class EnviaMensagemListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				emissor.envia(textField.getText());
				textField.setText("");
			}
			
			
		}
		button.addActionListener(new EnviaMensagemListener());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 300);
		frame.setResizable(false);
		
	}
	
	public void adicionaMensagem(String mensagem) {
		this.textArea1.append(mensagem + "\n");
	}
	
	

}









