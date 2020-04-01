import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Ajouter {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajouter window = new Ajouter();
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
	public Ajouter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(49, 50, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel nom = new JLabel("Nom :");
		nom.setBounds(10, 53, 77, 14);
		frame.getContentPane().add(nom);

		JComboBox choix = new JComboBox();
		choix.setModel(new DefaultComboBoxModel(new String[] { "Demi-pensionaires", "Externe" }));
		choix.setMaximumRowCount(2);
		choix.setBounds(66, 100, 115, 20);
		frame.getContentPane().add(choix);

		JLabel Cantine = new JLabel("Cantine :");
		Cantine.setBounds(10, 103, 57, 14);
		frame.getContentPane().add(Cantine);

		JCheckBox lundi = new JCheckBox("Lundi");
		lundi.setBounds(49, 124, 57, 23);
		frame.getContentPane().add(lundi);

		JLabel lblJour = new JLabel("Jour :");
		lblJour.setBounds(10, 128, 46, 14);
		frame.getContentPane().add(lblJour);

		JCheckBox Mardi = new JCheckBox("Mardi");
		Mardi.setBounds(113, 124, 57, 23);
		frame.getContentPane().add(Mardi);

		JCheckBox Mercredi = new JCheckBox("Mercredi");
		Mercredi.setBounds(166, 124, 84, 23);
		frame.getContentPane().add(Mercredi);

		JCheckBox Jeudi = new JCheckBox("Jeudi");
		Jeudi.setBounds(252, 124, 57, 23);
		frame.getContentPane().add(Jeudi);

		JCheckBox Vendredi = new JCheckBox("Vendredi");
		Vendredi.setBounds(311, 124, 77, 23);
		frame.getContentPane().add(Vendredi);

		JCheckBox AucunJour = new JCheckBox("Aucun jour");
		AucunJour.setBounds(390, 124, 105, 23);
		frame.getContentPane().add(AucunJour);

		JComboBox classe = new JComboBox();
		classe.setModel(new DefaultComboBoxModel(new String[] { "STI2D", "S", "ES", "L", "BAC PRO SN" }));
		classe.setBounds(59, 150, 76, 20);
		frame.getContentPane().add(classe);

		JLabel lblClasse = new JLabel("Classe :");
		lblClasse.setBounds(10, 153, 46, 14);
		frame.getContentPane().add(lblClasse);

		JLabel lblAjouterUnEtudiant = new JLabel("Ajouter un etudiant :");
		lblAjouterUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAjouterUnEtudiant.setBounds(10, 11, 154, 31);
		frame.getContentPane().add(lblAjouterUnEtudiant);

		JLabel regime = new JLabel("Régime particulier :");
		regime.setBounds(10, 178, 96, 14);
		frame.getContentPane().add(regime);

		JRadioButton Oui = new JRadioButton("Oui");
		Oui.setBounds(105, 174, 46, 23);
		frame.getContentPane().add(Oui);

		JRadioButton Non = new JRadioButton("Non");
		Non.setBounds(147, 174, 55, 23);
		frame.getContentPane().add(Non);

		JLabel prenom = new JLabel("Pr\u00E9nom :");
		prenom.setBounds(10, 78, 57, 14);
		frame.getContentPane().add(prenom);

		textField_1 = new JTextField();
		textField_1.setBounds(68, 75, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(113, 204, 89, 23);
		frame.getContentPane().add(btnAjouter);
	}




}
