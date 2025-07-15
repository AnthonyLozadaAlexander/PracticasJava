package exercisesForms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormFactura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_1_1_1_3;
	private JTextField textField_13;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormFactura frame = new FormFactura();
					frame.setVisible(true);
					frame.setTitle("Factura Final");
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(8, 10, 571, 541);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura Deportivo Guayaquil");
		lblNewLabel.setBounds(8, 0, 448, 45);
		lblNewLabel.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 23));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ORDEN DE COMPRA");
		lblNewLabel_1.setBounds(18, 55, 448, 45);
		lblNewLabel_1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 18));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cliente:");
		lblNewLabel_1_1.setBounds(28, 99, 76, 45);
		lblNewLabel_1_1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(106, 113, 130, 18);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PRODUCTO");
		lblNewLabel_1_1_1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(28, 162, 76, 45);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("VALOR UNITARIO");
		lblNewLabel_1_1_1_1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(152, 162, 130, 45);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("CANTIDAD");
		lblNewLabel_1_1_1_2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_2.setBounds(353, 162, 76, 45);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("VALOR TOTAL");
		lblNewLabel_1_1_1_1_1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(441, 162, 96, 45);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 203, 76, 18);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(152, 203, 120, 18);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(353, 203, 76, 18);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(451, 203, 86, 18);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(28, 231, 76, 18);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(152, 231, 120, 18);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(28, 259, 76, 18);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(152, 259, 120, 18);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(353, 231, 76, 18);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(451, 231, 86, 18);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(353, 259, 76, 18);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(451, 259, 86, 18);
		panel.add(textField_12);
		
		lblNewLabel_1_1_1_3 = new JLabel("TOTAL COMPRA:");
		lblNewLabel_1_1_1_3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_3.setBounds(323, 287, 120, 45);
		panel.add(lblNewLabel_1_1_1_3);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(451, 301, 86, 18);
		panel.add(textField_13);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblResultado.setBounds(28, 402, 76, 45);
		panel.add(lblResultado);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCalcular.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
		btnCalcular.setBounds(334, 342, 95, 25);
		panel.add(btnCalcular);

	}
}
