package lista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;

public class TelaDeContatos {

	private JFrame frmTelaDeCadastro;
	private JTextField tfEmail;
	private JTextField tfCelular;
	private javax.swing.JLabel lbTotal = new JLabel();
	private javax.swing.JLabel blTotal = new JLabel();
	Dados dados = new Dados();
	Contato c = new Contato();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeContatos window = new TelaDeContatos();
					window.frmTelaDeCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaDeContatos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeCadastro = new JFrame();
		frmTelaDeCadastro.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gusta\\OneDrive\\Imagens\\Saved Pictures\\1710.agenda-tarefas-blog.png"));
		frmTelaDeCadastro.setFont(new Font("Arial", Font.PLAIN, 12));
		frmTelaDeCadastro.setTitle("Tela de Cadastro");
		frmTelaDeCadastro.setBounds(100, 100, 411, 224);
		frmTelaDeCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		GroupLayout groupLayout = new GroupLayout(frmTelaDeCadastro.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(92, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(120, Short.MAX_VALUE)));

		JLabel lb = new JLabel("Nome:");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblNewLabel_2 = new JLabel("Celular:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JTextField tfNome = new JTextField();
		tfNome.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);

		tfCelular = new JTextField();
		tfCelular.setColumns(10);

		JButton btCadastrar = new JButton("Adicionar na Lista");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = tfNome.getText();
				String email = tfEmail.getText();
				String celular = tfCelular.getText();

				dados.cadastraContato(c);

				blTotal.setText(dados.numeroDeContatos());
				;

				tfNome.setText("");
				tfEmail.setText("");
				tfCelular.setText("");

				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

			}
		});

		JLabel lbTexto = new JLabel("Contatos Cadastrados");

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lb)
										.addComponent(lblNewLabel_1).addComponent(lblNewLabel_2,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false).addComponent(tfEmail)
										.addComponent(tfCelular, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
										.addComponent(tfNome)))
						.addGroup(gl_panel.createSequentialGroup().addComponent(blTotal)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lbTexto)
								.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
								.addComponent(btCadastrar)))
				.addGap(94)));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(22)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lb, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
										.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(tfCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
								.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
								.addGroup(
										gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(btCadastrar)
												.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
														.addComponent(blTotal).addComponent(lbTexto)))
								.addContainerGap()));
		panel.setLayout(gl_panel);
		frmTelaDeCadastro.getContentPane().setLayout(groupLayout);
	}
}
