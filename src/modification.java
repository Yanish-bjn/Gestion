import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class modification {
	public static void modifier(String nom, String prenom, String cantine, String jour, String classe, String regime, String id) {
		// TODO Auto-generated method stub
		
		
	
		
String url="jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password ="";




try {
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
       ResultSet rs;    
       stmt.executeUpdate("UPDATE etudiant SET Nom = '"+ nom +"', Prenom = '" + prenom + "', Cantine = '" + cantine + "', Jour = '" + jour + "', Classe = '" + classe + "', Regime = '" + regime + "' WHERE id = '" + id + "'");
       
       
       System.out.println("modification reussie !");
           
           cnx.close();
}catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion a la base de données");
e.printStackTrace();

}
}

}