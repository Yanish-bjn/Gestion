import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Modifier {

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
					Modifier window = new Modifier();
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
	public Modifier() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 499, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblModifierUnEtudiant = new JLabel("Modifier un etudiant");
		lblModifierUnEtudiant.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblModifierUnEtudiant.setBounds(10, 22, 163, 21);
		frame.getContentPane().add(lblModifierUnEtudiant);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(10, 54, 46, 14);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom : ");
		lblPrenom.setBounds(10, 79, 46, 14);
		frame.getContentPane().add(lblPrenom);
		
		textField = new JTextField();
		textField.setBounds(42, 51, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 76, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCantine = new JLabel("Cantine : ");
		lblCantine.setBounds(10, 106, 52, 14);
		frame.getContentPane().add(lblCantine);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Demi-pensionaires", "Externe"}));
		comboBox.setBounds(72, 103, 112, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblJour = new JLabel("Jour :");
		lblJour.setBounds(10, 131, 46, 14);
		frame.getContentPane().add(lblJour);
		
		JCheckBox chckbxLundi = new JCheckBox("Lundi");
		chckbxLundi.setBounds(42, 127, 58, 23);
		frame.getContentPane().add(chckbxLundi);
		
		JCheckBox chckbxMardi = new JCheckBox("Mardi");
		chckbxMardi.setBounds(97, 127, 62, 23);
		frame.getContentPane().add(chckbxMardi);
		
		JCheckBox chckbxMercredi = new JCheckBox("Mercredi");
		chckbxMercredi.setBounds(157, 127, 77, 23);
		frame.getContentPane().add(chckbxMercredi);
		
		JCheckBox chckbxJeudi = new JCheckBox("Jeudi");
		chckbxJeudi.setBounds(236, 127, 62, 23);
		frame.getContentPane().add(chckbxJeudi);
		
		JCheckBox chckbxVendredi = new JCheckBox("Vendredi");
		chckbxVendredi.setBounds(296, 127, 77, 23);
		frame.getContentPane().add(chckbxVendredi);
		
		JCheckBox chckbxAucunJour = new JCheckBox("Aucun jour");
		chckbxAucunJour.setBounds(373, 127, 110, 23);
		frame.getContentPane().add(chckbxAucunJour);
		
		JLabel lblClasse = new JLabel("Classe : ");
		lblClasse.setBounds(10, 156, 46, 14);
		frame.getContentPane().add(lblClasse);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"STI2D", "S", "ES", "L"}));
		comboBox_1.setBounds(62, 153, 111, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblRegimeParticulier = new JLabel("Regime particulier :");
		lblRegimeParticulier.setBounds(10, 181, 104, 14);
		frame.getContentPane().add(lblRegimeParticulier);
		
		JRadioButton rdbtnOui = new JRadioButton("Oui");
		rdbtnOui.setBounds(113, 177, 46, 23);
		frame.getContentPane().add(rdbtnOui);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(167, 177, 109, 23);
		frame.getContentPane().add(rdbtnNon);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(123, 206, 89, 23);
		frame.getContentPane().add(btnModifier);
	}

}
