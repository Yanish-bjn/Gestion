import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JTextField;



import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.Object;
import java.awt.SystemColor;
// ensemble des imports //




public class Ajouter {
// Décalration des variables //
	JFrame frame;
	public String Cantine;
	public String Jour;
	public String Classe;
	public String Regime;
	public  JTextField nom;
	public  JTextField prenom;
	public  String Texte3;
	private JTextField jour;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajouter window = new Ajouter();
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
	public Ajouter() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAjouterUnEtudiant = new JLabel("Ajouter un etudiant :"); // Nom de la page // 
		lblAjouterUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13)); //Style, police, style //
		lblAjouterUnEtudiant.setBounds(10, 11, 154, 31); // Place sur la page //
		frame.getContentPane().add(lblAjouterUnEtudiant);
		
		JLabel nom1 = new JLabel("Nom :"); // Création d'un label permettant de présenter une zone de texte  //
		nom1.setBounds(10, 53, 77, 14);//Place sur la page //
		frame.getContentPane().add(nom1);
		
		nom = new JTextField(); // Création d'une zone de texte permettant de saisir le nom//
		nom.setBounds(49, 50, 86, 20); // Place sur la page //
		frame.getContentPane().add(nom);
		
		
		JLabel prenom1 = new JLabel("Prenom:"); // Crétation d'un label permettant de présenter une zone de texte permettant de saisir le prenom //
		prenom1.setBounds(10, 78, 57, 14); // Place sur la page //
		frame.getContentPane().add(prenom1); 

		prenom = new JTextField(); //Création d'une zone de texte pour la saisie du prenom //
		prenom.setBounds(68, 75, 96, 20); //Place sur la page //
		frame.getContentPane().add(prenom);
		
		
		JLabel lblCantine = new JLabel("Cantine :"); // Création d'un label permettant de présenter une liste déroulante //
		lblCantine.setBounds(10, 103, 57, 14); // Place sur la page //
		frame.getContentPane().add(lblCantine);
		
		JComboBox cantine = new JComboBox(); // Création d'une liste dérouante pour la saisie de la cantine //
		cantine.setModel(new DefaultComboBoxModel(new String[] {"Externe", "Demi-pensionnaire"})); // Voici les choix pour la liste deroulante //
		cantine.setBounds(59, 100, 105, 20);// Place sur la page //
		frame.getContentPane().add(cantine);
	

		JLabel lblJour = new JLabel("Jour :"); // Création d'un label permettant de présenter une zone de texte  //
		lblJour.setBounds(10, 128, 46, 14); //Place sur la page //
		frame.getContentPane().add(lblJour);
		
		jour = new JTextField(); // Création d'une liste dérouante pour la saisie du nombre de jour  //
		jour.setBounds(49, 125, 86, 20); // Place sur la page //
		frame.getContentPane().add(jour);
		jour.setColumns(10);
		
			
		JLabel lblClasse = new JLabel("Classe :"); // Création d'un label permettant de présenter une liste déroulante //
		lblClasse.setBounds(10, 153, 46, 14); // PLace sur la page //
		frame.getContentPane().add(lblClasse);
		
		JComboBox<?> classe = new JComboBox(); // Création d'une liste dérouante pour la saisie de la classe //
		classe.setModel(new DefaultComboBoxModel(new String[] {"S", "ES", "L", "Bac pro SN", "STI2D"})); // Voici les choix pour la liste deroulante //
		classe.setBounds(59, 150, 76, 20); // Place sur la page //
		frame.getContentPane().add(classe);


		JLabel lblregime = new JLabel("Régime particulier :"); // Création d'un label permettant de présenter une liste déroulante //
		lblregime.setBounds(10, 178, 96, 14); // PLace sur la page //
		frame.getContentPane().add(lblregime);

		JComboBox<?> regime = new JComboBox(); // Création d'une liste dérouante pour la saisie du regime //
		regime.setToolTipText("");
		regime.setModel(new DefaultComboBoxModel(new String[] {"Oui", "Non"})); // Voici les choix pour la liste deroulante //
		regime.setMaximumRowCount(2);
		regime.setBounds(113, 175, 51, 20); // Place sur la page //
		frame.getContentPane().add(regime);
		
		
		
		JButton btnAjouter = new JButton("Ajouter"); // Création d'un bouton ajouter permmetant l'envoie des données //
		btnAjouter.addActionListener(new ActionListener() { // Création de l'action du bouton //
			public void actionPerformed(ActionEvent arg0) {
				insertion.ajouter(nom.getText(), prenom.getText(), cantine.getSelectedItem().toString(), jour.getText(), classe.getSelectedItem().toString(), regime.getSelectedItem().toString());
			}
		});
		btnAjouter.setBounds(113, 204, 89, 23);
		frame.getContentPane().add(btnAjouter);	
		
		JButton btnPrix = new JButton("Prix"); // Création d'un bouton prix permetant d'avoir un apercu du prix a payer au bout de chaque mois //
		btnPrix.addActionListener(new ActionListener() {// Mise en place de l'action du bouton //
			public void actionPerformed(ActionEvent e) {
			String prix = jour.getText(); // Transformation du resulat en int //
			int total = Integer.parseInt(prix)*4;
			Label label_4 = new Label(); // affichage du prix a payer //
			label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
			label_4.setForeground(SystemColor.desktop);
			label_4.setBounds(110, 212, 89, 14);
			label_4.setText(String.valueOf(total)+"€ / Mois");
			}
		});
		btnPrix.setBounds(145, 124, 89, 23);
		frame.getContentPane().add(btnPrix);
		
	}	
}
