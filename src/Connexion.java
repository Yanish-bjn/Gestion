

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;





public class Connexion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblConnexion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion window = new Connexion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Connexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIdentifiant = new JLabel("Identifiant :");
		lblIdentifiant.setBounds(10, 83, 65, 14);
		frame.getContentPane().add(lblIdentifiant);
		
		textField = new JTextField();
		textField.setBounds(72, 80, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 107, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setBounds(10, 110, 88, 14);
		frame.getContentPane().add(lblMotDePasse);
		
		lblConnexion = new JLabel("Connexion :");
		lblConnexion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblConnexion.setBounds(41, 38, 99, 14);
		frame.getContentPane().add(lblConnexion);
		
		JButton btnConnexion = new JButton("Connexion");			
		btnConnexion.setBounds(102, 137, 89, 23);
		frame.getContentPane().add(btnConnexion);
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if (textField.getText().contentEquals("Test") == true && textField_1.getText().contentEquals("Test") == true ) {
						Menu window = new Menu();
						window.frame.setVisible(true);
			}
			}
		});

	}

	
}
		
