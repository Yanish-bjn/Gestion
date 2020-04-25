import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Supprimer {

	JFrame frame;
	

	public static Connection cnx;
	private JTextField id;


	public int ID;
	/**
	 * Launch the application.
	 */
	
	public static class ConnexionJM {
		
	}
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

		JLabel lblSupprimerUnEtudiant = new JLabel("Supprimer un etudiant"); // Nom de la page //
		lblSupprimerUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13)); // Police, taille, style //
		lblSupprimerUnEtudiant.setBounds(10, 30, 175, 22); // Placement sur la page //
		frame.getContentPane().add(lblSupprimerUnEtudiant);

		JLabel lblid = new JLabel("ID :"); // Créattion d'un label présentant la zone de texte //
		lblid.setBounds(10, 61, 46, 14); // Placement sur la page //
		frame.getContentPane().add(lblid);
		
		id = new JTextField(); // Création d'une zone de texte  permettant de saisir l'id//
		id.setBounds(35, 58, 86, 20); // Placement sur la page //
		frame.getContentPane().add(id);
		id.setColumns(10);
		
				
		
		JButton btnSupprimer = new JButton("Supprimer"); // Mise en place d'un bouton //
		btnSupprimer.addActionListener(new ActionListener() { // Mise en place de l'action du bouton //
			public void actionPerformed(ActionEvent arg0) {
				suppresion.supprimer(id.getText()); // redirection des données vers la page de traitement //
			}

		
		});
		btnSupprimer.setBounds(124, 114, 109, 23);
		frame.getContentPane().add(btnSupprimer);
				
	}
	
}

