

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
	//Création des variables //
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
		
		JLabel lblIdentifiant = new JLabel("Identifiant :"); //création d'un label présenant la zone de texte //
		lblIdentifiant.setBounds(10, 83, 65, 14); // Placement sur la page //
		frame.getContentPane().add(lblIdentifiant);
		
		textField = new JTextField(); // Création d'une zone de texte //
		textField.setBounds(72, 80, 86, 20); // Placement sur la page //
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :"); //Label présentant la zone de texte //
		lblMotDePasse.setBounds(10, 110, 88, 14); // placement sur la page //
		frame.getContentPane().add(lblMotDePasse);
		
		textField_1 = new JTextField(); // Création d'une autre zone de texte //
		textField_1.setBounds(92, 107, 86, 20); //Placement sur la page //
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblConnexion = new JLabel("Connexion :"); //Mise en place d'un bouton //
		lblConnexion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13)); // Police, taille, style du bouton //
		lblConnexion.setBounds(41, 38, 99, 14); //Placement sur la page //
		frame.getContentPane().add(lblConnexion);
		
		JButton btnConnexion = new JButton("Connexion"); // Mise en place d'un bouton connexion // 	
		btnConnexion.setBounds(102, 137, 89, 23); // Placement sur la page // 
		frame.getContentPane().add(btnConnexion);
		btnConnexion.addActionListener(new ActionListener() { // Mise en place de l'action du bouton // 
			public void actionPerformed(ActionEvent e) {
					if (textField.getText().contentEquals("Test") == true && textField_1.getText().contentEquals("Test") == true ) { // Si le premier texte correspond a Test ainsi que le mot de passe  alors //
						Menu window = new Menu(); // Redirection vers une autre page //
						window.frame.setVisible(true);
			}//fin du si //
			}
		});

	}

	
}
		
