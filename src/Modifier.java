import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

// ensembles des imports //
public class Modifier {

	JFrame frame;
	private JTextField nom;
	private JTextField prenom;
	public String Jour;
	public String Cantine;
	public String Classe;
	public String Regime;
	private JTextField id;
	private JTextField jour;
	// Déclaration des variables //
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modifier window = new Modifier();
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
	public Modifier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 499, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblModifierUnEtudiant = new JLabel("Modifier un etudiant"); // Nom de la page //
		lblModifierUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13)); // style, Police, Taille //
		lblModifierUnEtudiant.setBounds(10, 22, 163, 21); // placement sur la page //
		frame.getContentPane().add(lblModifierUnEtudiant);

		JLabel lblNom = new JLabel("Nom :");  // Création d'un label permettant de présenter une zone de texte  //
		lblNom.setBounds(10, 54, 46, 14); // Placement sur la page //
		frame.getContentPane().add(lblNom);

		JLabel lblPrenom = new JLabel("Prenom : "); // Création d'un label permettant de présenter une zone de texte  //
		lblPrenom.setBounds(10, 79, 46, 14); // Placement sur la page //
		frame.getContentPane().add(lblPrenom);

		nom = new JTextField(); // Création d'une zone de texte permettat de saisir le nom //
		nom.setBounds(42, 51, 86, 20); // Placement sur la page //
		frame.getContentPane().add(nom);
		
		
		prenom = new JTextField(); // Création d'une zone de texte permettat de saisir le prenom //
		prenom.setBounds(62, 76, 86, 20); // Placement sur la page //
		frame.getContentPane().add(prenom);
	
		
		JLabel lblCantine = new JLabel("Cantine : "); // Création d'un label permettant de présenter une liste déroulante  //
		lblCantine.setBounds(10, 106, 52, 14); // Placement sur la page //
		frame.getContentPane().add(lblCantine);

		JComboBox cantine = new JComboBox(); // Création d'une liste déroulante permettant de choisir la cantine  //
		cantine.setModel(new DefaultComboBoxModel(new String[] { "Demi-pensionaires", "Externe" })); // Voici les choix pour la liste deroulante //
		cantine.setBounds(72, 103, 112, 20); // Placement sur la page //
		frame.getContentPane().add(cantine);
		

		
		JLabel lblJour = new JLabel("Jour :");// Création d'un label permettant de présenter une liste déroulante  //
		lblJour.setBounds(10, 131, 46, 14); // Placement sur la page //
		frame.getContentPane().add(lblJour);
		
		jour = new JTextField(); // Création d'une liste déroulante permettant de choisir les jours  //
		jour.setBounds(42, 125, 86, 20); // Placement sur la page //
		frame.getContentPane().add(jour);
		jour.setColumns(10);

		
		JLabel lblClasse = new JLabel("Classe : "); // Création d'un label permettant de présenter une liste déroulante  //
		lblClasse.setBounds(10, 156, 46, 14); // Placement sur la page //
		frame.getContentPane().add(lblClasse);

		JComboBox classe = new JComboBox(); // Création d'une liste déroulante permettant de choisir la classe  //
		classe.setModel(new DefaultComboBoxModel(new String[] { "STI2D", "S", "ES", "L", "BAC PRO SN" })); // Voici les choix pour la liste deroulante //
		classe.setBounds(62, 153, 111, 20); // Placement sur la page //
		frame.getContentPane().add(classe);
		
		
		
		JLabel lblregime = new JLabel("Regime particulier :"); // Création d'un label permettant de présenter une liste déroulante  //
		lblregime.setBounds(10, 181, 104, 14); // Placement sur la page //
		frame.getContentPane().add(lblregime);
		
		JComboBox regime = new JComboBox(); // Création d'une liste déroulante permettant de choisir le regime //
		regime.setModel(new DefaultComboBoxModel(new String[] {"Oui", "Non"})); // Voici les choix pour la liste deroulante //
		regime.setBounds(112, 178, 61, 20); // Placement sur la page //
		frame.getContentPane().add(regime);
	
		
		JLabel lblId = new JLabel("ID :"); // Création d'un label permettant de présenter une zone de texte  //
		lblId.setBounds(10, 206, 46, 14);  // Placement sur la page //
		frame.getContentPane().add(lblId);
		
		id = new JTextField(); // Création d'une zone de texte permettant de saisir l'id//
		id.setBounds(31, 203, 86, 20); // Placement sur la page //
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		
		JButton btnModifier = new JButton("Modifier"); // Création d'un bouton permetant d'envoyer le resultat du formulaire vers le traitement //
		btnModifier.addActionListener(new ActionListener() { // Mise en place de l'action du bouton //
			public void actionPerformed(ActionEvent e) {
				modification.modifier(nom.getText(), prenom.getText(), cantine.getSelectedItem().toString(), jour.getText(), classe.getSelectedItem().toString(), regime.getSelectedItem().toString(), id.getText());
			}
		});
		btnModifier.setBounds(125, 227, 89, 23);
		frame.getContentPane().add(btnModifier);
	}
	
	
		}

