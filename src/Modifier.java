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

		JLabel Nom = new JLabel("Nom :");
		Nom.setBounds(10, 54, 46, 14);
		frame.getContentPane().add(Nom);

		JLabel Prenom = new JLabel("Prenom : ");
		Prenom.setBounds(10, 79, 46, 14);
		frame.getContentPane().add(Prenom);

		textField = new JTextField();
		textField.setBounds(42, 51, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(62, 76, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel Cantine = new JLabel("Cantine : ");
		Cantine.setBounds(10, 106, 52, 14);
		frame.getContentPane().add(Cantine);

		JComboBox choix = new JComboBox();
		choix.setModel(new DefaultComboBoxModel(new String[] { "Demi-pensionaires", "Externe" }));
		choix.setBounds(72, 103, 112, 20);
		frame.getContentPane().add(choix);

		JLabel lblJour = new JLabel("Jour :");
		lblJour.setBounds(10, 131, 46, 14);
		frame.getContentPane().add(lblJour);

		JCheckBox Lundi = new JCheckBox("Lundi");
		Lundi.setBounds(42, 127, 58, 23);
		frame.getContentPane().add(Lundi);

		JCheckBox Mardi = new JCheckBox("Mardi");
		Mardi.setBounds(97, 127, 62, 23);
		frame.getContentPane().add(Mardi);

		JCheckBox Mercredi = new JCheckBox("Mercredi");
		Mercredi.setBounds(157, 127, 77, 23);
		frame.getContentPane().add(Mercredi);

		JCheckBox Jeudi = new JCheckBox("Jeudi");
		Jeudi.setBounds(236, 127, 62, 23);
		frame.getContentPane().add(Jeudi);

		JCheckBox Vendredi = new JCheckBox("Vendredi");
		Vendredi.setBounds(296, 127, 77, 23);
		frame.getContentPane().add(Vendredi);

		JCheckBox chckbxAucunJour = new JCheckBox("Aucun jour");
		chckbxAucunJour.setBounds(373, 127, 110, 23);
		frame.getContentPane().add(chckbxAucunJour);

		JLabel lblClasse = new JLabel("Classe : ");
		lblClasse.setBounds(10, 156, 46, 14);
		frame.getContentPane().add(lblClasse);

		JComboBox classe = new JComboBox();
		classe.setModel(new DefaultComboBoxModel(new String[] { "STI2D", "S", "ES", "L", "BAC PRO SN" }));
		classe.setBounds(62, 153, 111, 20);
		frame.getContentPane().add(classe);

		JLabel regime = new JLabel("Regime particulier :");
		regime.setBounds(10, 181, 104, 14);
		frame.getContentPane().add(regime);

		JRadioButton Oui = new JRadioButton("Oui");
		Oui.setBounds(113, 177, 46, 23);
		frame.getContentPane().add(Oui);

		JRadioButton Non = new JRadioButton("Non");
		Non.setBounds(167, 177, 109, 23);
		frame.getContentPane().add(Non);

		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(123, 206, 89, 23);
		frame.getContentPane().add(btnModifier);
	}

}
