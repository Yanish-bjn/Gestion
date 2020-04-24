import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JSpinner;
import javax.swing.JTextField;

public class suppresion {
	
	
	//Récupération de l'id // 
	public static void supprimer(String id) {
// Connexion a la BDD //
String url="jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password ="";



// Gestion des erreurs //
try { // execution de la requette, verification de l'identifiant et du mot de passe pour la connexion a la BDD //
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
       ResultSet rs;    
       stmt.executeUpdate("DELETE FROM etudiant WHERE id = '" + id + "'");
       
       
       System.out.println("Suppresion reussie !"); // si la requette s'execute alors afficher le message suivant //
           
           cnx.close();
}
catch (SQLException e) { // si la requette ne s'execute pas alors afficher le message suivant //
System.out.println("Une erreur est survenue lors de la connexion a la base de données"); 
e.printStackTrace();

}
}



}
