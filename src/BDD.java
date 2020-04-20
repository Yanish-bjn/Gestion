
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

public class BDD {

	public void ajouter(String string, String string2, String string3, Object jour, Object classe, Object regime) {
	String url = "jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String user="root";
	String password ="";

	try {
		Connection cnx = DriverManager.getConnection(url,user,password);
		Statement stmt = cnx.createStatement(); 
		stmt.executeUpdate("INSERT INTO etudiant (id, Nom, Prenom, Cantine, Jour, Classe, Regime)" + "VALUES (NULL, " + string + ", " + string2 + ", " + string3 + ", " + jour + ", " + classe + ", " + regime + ")");		       
		       
		       System.out.println("insertion reussie !");
		           
		           cnx.close();
	}
		catch (SQLException e) {
		System.out.println("Une erreur est survenue lors de la connexion a la base de données");
		e.printStackTrace();

		}
		}

}