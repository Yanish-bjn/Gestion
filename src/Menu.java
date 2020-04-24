import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
// Ensempble des imports //

public class Menu extends JFrame implements ActionListener{

	JFrame frame;
	private JTable table;

	/**
	* Launch the application.
	*/
	/**
	* Create the application.
	*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnAjouterEtudiant = new JButton("Ajouter");//Création d'un bouton ajouter //
		btnAjouterEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11)); //Style, Police, taille //
		btnAjouterEtudiant.addActionListener(new ActionListener() { // Mise en place de l'action du bouton //
			public void actionPerformed(ActionEvent Ajouter) {
				Ajouter window = new Ajouter();
				window.frame.setVisible(true);
			}
		});

		JButton btnModifier = new JButton("Modifier"); // Création d'un bouton modifier //
		btnModifier.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11)); // Style, Police, taille //
		btnModifier.addActionListener(new ActionListener() { // Mise en place de l'action du bouton //
			public void actionPerformed(ActionEvent e) {
				Modifier window = new Modifier();
				window.frame.setVisible(true);
			}
		});

		JButton btnSupprimer = new JButton("Supprimer"); // Création d'un bouton Supprimer // 
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11)); //Style, police, taille //
		btnSupprimer.addActionListener(new ActionListener() { // Mise en place de l'action du bouton //
			public void actionPerformed(ActionEvent e) {
				Supprimer window = new Supprimer();
				window.frame.setVisible(true);
			}
		});

		JLabel lblMenu = new JLabel("Menu"); // Nom de la page //
		lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15)); //Style, Police, taille //

		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnProfeseur = new JButton("Professeur");
		btnProfeseur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnProfeseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Prof window = new Prof();
				window.frame.setVisible(true);
			}
		});
		// Mise en place d'un tableau //
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(63)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAjouterEtudiant, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addGap(40)
							.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(37, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(196)
					.addComponent(lblMenu, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
					.addGap(177))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(177, Short.MAX_VALUE)
					.addComponent(btnProfeseur, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(151))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSupprimer)
						.addComponent(btnAjouterEtudiant)
						.addComponent(btnModifier))
					.addGap(29)
					.addComponent(btnProfeseur)
					.addContainerGap(44, Short.MAX_VALUE))
		);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "Nom", "Prenom", "Cantine", "Jour", "Classe", "Regime" }));
		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
	
//Gestion des erreurs //
	try {
		// Récupération du résultat de la connexion //
		Connection cnx = connecterDB(); 
		Statement st;
		ResultSet rst;
		
		st = cnx.createStatement();
		rst = st.executeQuery("SELECT * from etudiant ORDER BY Nom"); //Execution de la requette //
		
		while(rst.next()) { // Récupération de l'ensemble des résultats //
			System.out.print(rst.getInt("id")+"\t");
			System.out.print(rst.getString("Nom")+"\t");
			System.out.print(rst.getString("Prenom")+"\t");
			System.out.print(rst.getString("Cantine")+"\t");
			System.out.print(rst.getInt("Jour")+"\t");
			System.out.print(rst.getString("Classe")+"\t");
			System.out.print(rst.getString("Regime")+"\t");
			System.out.println();
	}
}
	catch(Exception ex){
		ex.printStackTrace();
	}
}

	public Connection  connecterDB() {
		// Gestion des erreurs //
	try {
		//Connexion a la BDD //
		String url = "jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user="root";
		String password ="";
	    System.out.println("Voici la liste des etudiants :"); //Affiche un message //
		Connection cnx = DriverManager.getConnection(url,user,password);//Vérification de l'identifiant et mot de passe pour la connexion a la BDD //
		return cnx;
	}
	catch(Exception es) {
		System.out.println("Une erreur est survenue lors de la connexion a la base de données"); // Si la cnnexion à échoué alors on affiche un autre message //
		es.printStackTrace();
		return null;

	}
}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
