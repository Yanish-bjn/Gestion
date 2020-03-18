import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Supprimer {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supprimer window = new Supprimer();
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
	public Supprimer() {
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
		
		JLabel lblSupprimerUnEtudiant = new JLabel("Supprimer un etudiant");
		lblSupprimerUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSupprimerUnEtudiant.setBounds(10, 30, 175, 22);
		frame.getContentPane().add(lblSupprimerUnEtudiant);
		
		JLabel Nom = new JLabel("Nom :");
		Nom.setBounds(10, 61, 46, 14);
		frame.getContentPane().add(Nom);
		
		textField = new JTextField();
		textField.setBounds(46, 58, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Prenom = new JLabel("Prenom :");
		Prenom.setBounds(10, 86, 56, 14);
		frame.getContentPane().add(Prenom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 83, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(124, 114, 109, 23);
		frame.getContentPane().add(btnSupprimer);
	}

}
