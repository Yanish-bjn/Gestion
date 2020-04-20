import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Supprimer {

	JFrame frame;
	

	public static Connection cnx;
	private JTextField id;


	public int ID;
	/**
	 * Launch the application.
	 */
	
	public static class ConnexionJM {
		static Connection cnx;
		static Statement st;
		static ResultSet rst;
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supprimer window = new Supprimer();
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
	public Supprimer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSupprimerUnEtudiant = new JLabel("Supprimer un etudiant");
		lblSupprimerUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSupprimerUnEtudiant.setBounds(10, 30, 175, 22);
		frame.getContentPane().add(lblSupprimerUnEtudiant);

		JLabel lblid = new JLabel("ID :");
		lblid.setBounds(10, 61, 46, 14);
		frame.getContentPane().add(lblid);
		
		id = new JTextField();
		id.setBounds(35, 58, 86, 20);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
				
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				suppresion.supprimer(id.getText());
			}

		
		});
		btnSupprimer.setBounds(124, 114, 109, 23);
		frame.getContentPane().add(btnSupprimer);
				
	}
	
}

