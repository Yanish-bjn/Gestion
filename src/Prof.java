import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;

public class Prof {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prof window = new Prof();
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
	public Prof() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Gestion des erreurs //
		try { 
			// Récupération du resultat de la connexion a la BDD //
			Connection cnx = connecterDB();
			Statement st;
			ResultSet rst;
			//Execution de la requette //
			st = cnx.createStatement();
			rst = st.executeQuery("SELECT * from prof"); 
			
			while(rst.next()) { //Récupération de l'ensemble des données //
				System.out.print(rst.getInt("id")+"\t");
				System.out.print(rst.getString("Nom")+"\t");
				System.out.print(rst.getString("Cantine")+"\t");
				System.out.print(rst.getInt("Jour")+"\t");
				System.out.print(rst.getString("Choix")+"\t");
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
		    System.out.println("Voici la liste des professeurs" );
			Connection cnx = DriverManager.getConnection(url,user,password); // Verfiacation de l'identifaint et du mot de passe de la BDD //
			return cnx;
		}
		catch(Exception es) {
			System.out.println("Une erreur est survenue lors de la connexion a la base de données"); // Si la connexion a échoué alors on affiche un message //
			es.printStackTrace();
			return null;

		}
	}


	}


