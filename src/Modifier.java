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

		JLabel lblModifierUnEtudiant = new JLabel("Modifier un etudiant");
		lblModifierUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblModifierUnEtudiant.setBounds(10, 22, 163, 21);
		frame.getContentPane().add(lblModifierUnEtudiant);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(10, 54, 46, 14);
		frame.getContentPane().add(lblNom);

		JLabel lblPrenom = new JLabel("Prenom : ");
		lblPrenom.setBounds(10, 79, 46, 14);
		frame.getContentPane().add(lblPrenom);

		nom = new JTextField();
		nom.setBounds(42, 51, 86, 20);
		frame.getContentPane().add(nom);
		
		

		prenom = new JTextField();
		prenom.setBounds(62, 76, 86, 20);
		frame.getContentPane().add(prenom);
	
		

		
		JLabel lblCantine = new JLabel("Cantine : ");
		lblCantine.setBounds(10, 106, 52, 14);
		frame.getContentPane().add(lblCantine);

		JComboBox cantine = new JComboBox();
		cantine.setModel(new DefaultComboBoxModel(new String[] { "Demi-pensionaires", "Externe" }));
		cantine.setBounds(72, 103, 112, 20);
		frame.getContentPane().add(cantine);
		Cantine = cantine.getSelectedItem().toString();

		
		JLabel lblJour = new JLabel("Jour :");
		lblJour.setBounds(10, 131, 46, 14);
		frame.getContentPane().add(lblJour);
		
		jour = new JTextField();
		jour.setBounds(42, 125, 86, 20);
		frame.getContentPane().add(jour);
		jour.setColumns(10);

		
		JLabel lblClasse = new JLabel("Classe : ");
		lblClasse.setBounds(10, 156, 46, 14);
		frame.getContentPane().add(lblClasse);

		JComboBox classe = new JComboBox();
		classe.setModel(new DefaultComboBoxModel(new String[] { "STI2D", "S", "ES", "L", "BAC PRO SN" }));
		classe.setBounds(62, 153, 111, 20);
		frame.getContentPane().add(classe);
		Classe = classe.getSelectedItem().toString();
		
		
		JLabel lblregime = new JLabel("Regime particulier :");
		lblregime.setBounds(10, 181, 104, 14);
		frame.getContentPane().add(lblregime);
		
		JComboBox regime = new JComboBox();
		regime.setModel(new DefaultComboBoxModel(new String[] {"Oui", "Non"}));
		regime.setBounds(112, 178, 61, 20);
		frame.getContentPane().add(regime);
		Regime = regime.getSelectedItem().toString();
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(10, 206, 46, 14);
		frame.getContentPane().add(lblId);
		
		id = new JTextField();
		id.setBounds(31, 203, 86, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modification.modifier(nom.getText(), prenom.getText(), Cantine, jour.getText(), Classe, Regime, id.getText());
			}
		});
		btnModifier.setBounds(125, 227, 89, 23);
		frame.getContentPane().add(btnModifier);
	}
	
	public static Connection  connecterDB() {
		try {
			String url = "jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String user="root";
			String password ="";
		    System.out.println("Connexion Etablit");
			Connection cnx = DriverManager.getConnection(url,user,password);
			return cnx;
		}
		catch(Exception es) {
			System.out.println("Une erreur est survenue lors de la connexion a la base de données");
			es.printStackTrace();
			return null;

		}
	}
		protected void modifier(String Nom, String Prenom, String Cantine, Object Jour, Object classe, Object regime, String id) {
		try {
			String query = "UPDATE etudiant SET Nom='"+Nom
	                + ", Prenom="+Prenom
	                + ", cantine="+Cantine
	                + ", Jour="+Jour
	                + ", Classe="+classe
	                + ", Regime='"+regime
	                + "WHERE id="+id;
			Connection cnx = connecterDB();
			Statement st = cnx.createStatement();
			st.executeUpdate(query);
			System.out.println("etudiant modifier");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		}
}
