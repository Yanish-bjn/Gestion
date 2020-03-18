import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Ajouter {

	private JFrame frame;
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
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setBounds(10, 53, 77, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Demi-pensionaires", "Externe"}));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(66, 100, 115, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Cantine :");
		lblNewLabel_1.setBounds(10, 103, 57, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Lundi");
		chckbxNewCheckBox.setBounds(49, 124, 57, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblJour = new JLabel("Jour :");
		lblJour.setBounds(10, 128, 46, 14);
		frame.getContentPane().add(lblJour);
		
		JCheckBox chckbxMardi = new JCheckBox("Mardi");
		chckbxMardi.setBounds(113, 124, 57, 23);
		frame.getContentPane().add(chckbxMardi);
		
		JCheckBox chckbxMercredi = new JCheckBox("Mercredi");
		chckbxMercredi.setBounds(166, 124, 84, 23);
		frame.getContentPane().add(chckbxMercredi);
		
		JCheckBox chckbxJeudi = new JCheckBox("Jeudi");
		chckbxJeudi.setBounds(252, 124, 57, 23);
		frame.getContentPane().add(chckbxJeudi);
		
		JCheckBox chckbxVendredi = new JCheckBox("Vendredi");
		chckbxVendredi.setBounds(311, 124, 77, 23);
		frame.getContentPane().add(chckbxVendredi);
		
		JCheckBox chckbxAucunJour = new JCheckBox("Aucun jour");
		chckbxAucunJour.setBounds(390, 124, 105, 23);
		frame.getContentPane().add(chckbxAucunJour);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"STI2D", "S", "ES", "L", "BAC PRO SN"}));
		comboBox_1.setBounds(59, 150, 76, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblClasse = new JLabel("Classe :");
		lblClasse.setBounds(10, 153, 46, 14);
		frame.getContentPane().add(lblClasse);
		
		JLabel lblAjouterUnEtudiant = new JLabel("Ajouter un etudiant :");
		lblAjouterUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAjouterUnEtudiant.setBounds(10, 11, 154, 31);
		frame.getContentPane().add(lblAjouterUnEtudiant);
		
		JLabel lblNewLabel_2 = new JLabel("Régime particulier :");
		lblNewLabel_2.setBounds(10, 178, 96, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(105, 174, 46, 23);
		frame.getContentPane().add(rdbtnOui);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(147, 174, 55, 23);
		frame.getContentPane().add(rdbtnNon);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom :");
		lblPrnom.setBounds(10, 78, 57, 14);
		frame.getContentPane().add(lblPrnom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 75, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(113, 204, 89, 23);
		frame.getContentPane().add(btnAjouter);
	}
}
