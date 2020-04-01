
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import java.sql.Statement;

	
	public class Insertion {
	
		public void ajout(char nom,  char prenom, char cantine, char jour, char classe, boolean regime) {
			
	String url="jdbc:mysql://localhost/cinéma?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String user="root";
	String password ="";

	


	try {
	Connection cnx = DriverManager.getConnection(url,user,password);
	Statement stmt = cnx.createStatement();
	       ResultSet rs;    
	       stmt.executeUpdate("INSERT INTO etudiant (ID , nom, prenom , cantine, jour, classe, regime)" + "VALUES (NULL, "+ nom + ", "+ prenom + ", "+ cantine + ", " + jour + ", " + classe + ", "+ regime + ")");
	       
	       
	       System.out.println("insertion reussie !");
	           
	           cnx.close();
	}catch (SQLException e) {
	System.out.println("Une erreur est survenue lors de la connexion a la base de données");
	e.printStackTrace();

	}
	}
	
	

	}

