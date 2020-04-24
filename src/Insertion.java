import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class insertion {
	//Récupération de l'ensemble des données //
	public static void ajouter(String nom, String prenom, String cantine, String jour, String classe, String regime) {
		// TODO Auto-generated method stub
		
	
		// Connexion a la BDD //
String url="jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password ="";



// Gestion d'erreur //
try {//Vérification de l'identifiant et du mot de passe de la bdd, execution de la requette //
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
       ResultSet rs;    
       stmt.executeUpdate("INSERT INTO etudiant (Nom, Prenom , Cantine, Jour, Classe, Regime)" + "VALUES ('" + nom + "', '"+ prenom + "', '" + cantine + "', '" + jour + "', '" + classe + "', '" + regime + "')");
       
       
       System.out.println("insertion reussie !");//Si la requette s'excute alors on affiche un message //
           
           cnx.close();
}catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion a la base de données"); // Si non on affiche un autre message //
e.printStackTrace();

}
}


}

