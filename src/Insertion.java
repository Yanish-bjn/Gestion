import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class insertion {
	
	public static void ajouter(String nom, String prenom, String cantine, String jour, String classe, String regime) {
		// TODO Auto-generated method stub
		
	
		
String url="jdbc:mysql://localhost/gestion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
String user="root";
String password ="";




try {
Connection cnx = DriverManager.getConnection(url,user,password);
Statement stmt = cnx.createStatement();
       ResultSet rs;    
       stmt.executeUpdate("INSERT INTO etudiant (Nom, Prenom , Cantine, Jour, Classe, Regime)" + "VALUES ('" + nom + "', '"+ prenom + "', '" + cantine + "', '" + jour + "', '" + classe + "', '" + regime + "')");
       
       
       System.out.println("insertion reussie !");
           
           cnx.close();
}catch (SQLException e) {
System.out.println("Une erreur est survenue lors de la connexion a la base de donn�es");
e.printStackTrace();

}
}


}

