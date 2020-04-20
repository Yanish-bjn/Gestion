import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JSpinner;
import javax.swing.JTextField;

public class suppresion {
	
	
	
	public static void supprimer(String id) {

String url="jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password ="";




try {
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
       ResultSet rs;    
       stmt.executeUpdate("DELETE FROM etudiant WHERE id = '" + id + "'");
       
       
       System.out.println("Suppresion reussie !");
           
           cnx.close();
}
catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion a la base de données");
e.printStackTrace();

}
}



}
