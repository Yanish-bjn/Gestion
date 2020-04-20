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

		JButton btnAjouterEtudiant = new JButton("Ajouter");
		btnAjouterEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Ajouter) {
				Ajouter window = new Ajouter();
				window.frame.setVisible(true);
			}
		});

		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modifier window = new Modifier();
				window.frame.setVisible(true);
			}
		});

		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supprimer window = new Supprimer();
				window.frame.setVisible(true);
			}
		});

		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnProfeseur = new JButton("Professeur");
		btnProfeseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Prof window = new Prof();
				window.frame.setVisible(true);
			}
		});
		
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
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnProfeseur, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(btnModifier, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
							.addGap(36)
							.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(37, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(196)
					.addComponent(lblMenu, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
					.addGap(177))
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
					.addGap(32)
					.addComponent(btnProfeseur)
					.addContainerGap(41, Short.MAX_VALUE))
		);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "Nom", "Prenom", "Cantine", "Jour", "Classe", "Regime" }));
		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
	

	try {
		Connection cnx = connecterDB();
		Statement st;
		ResultSet rst;
		
		st = cnx.createStatement();
		rst = st.executeQuery("SELECT * from etudiant ORDER BY Nom");
		
		while(rst.next()) {
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
	try {
		String url = "jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user="root";
		String password ="";
	    System.out.println("Voici la liste des etudiants :");
		Connection cnx = DriverManager.getConnection(url,user,password);
		return cnx;
	}
	catch(Exception es) {
		System.out.println("Une erreur est survenue lors de la connexion a la base de données");
		es.printStackTrace();
		return null;

	}
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
