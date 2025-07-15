package exercisesForms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormFactura extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCliente;
	private JTextField txtProducto1;
	private JTextField txtValorU_1;
	private JTextField txtCantidad1;
	private JTextField txtValorT1;
	private JTextField txtProducto2;
	private JTextField txtValorU_2;
	private JTextField txtProducto3;
	private JTextField txtValorU_3;
	private JTextField txtCantidad2;
	private JTextField txtValorT2;
	private JTextField txtCantidad3;
	private JTextField txtValorT3;
	private JLabel lblNewLabel_1_1_1_3;
	private JTextField txtTotalCompra;
	private JLabel lblResultado;
	private JButton btnSalir;

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
		lblNewLabel.setBounds(18, 11, 448, 45);
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
		
		txtCliente = new JTextField();
		txtCliente.setBounds(106, 113, 130, 18);
		panel.add(txtCliente);
		txtCliente.setColumns(10);
		
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
		
		txtProducto1 = new JTextField();
		txtProducto1.setBounds(28, 203, 76, 18);
		panel.add(txtProducto1);
		txtProducto1.setColumns(10);
		
		txtValorU_1 = new JTextField();
		txtValorU_1.setBounds(152, 203, 120, 18);
		panel.add(txtValorU_1);
		txtValorU_1.setColumns(10);
		
		txtCantidad1 = new JTextField();
		txtCantidad1.setBounds(353, 203, 76, 18);
		panel.add(txtCantidad1);
		txtCantidad1.setColumns(10);
		
		txtValorT1 = new JTextField();
		txtValorT1.setBounds(451, 203, 86, 18);
		panel.add(txtValorT1);
		txtValorT1.setColumns(10);
		
		txtProducto2 = new JTextField();
		txtProducto2.setColumns(10);
		txtProducto2.setBounds(28, 231, 76, 18);
		panel.add(txtProducto2);
		
		txtValorU_2 = new JTextField();
		txtValorU_2.setColumns(10);
		txtValorU_2.setBounds(152, 231, 120, 18);
		panel.add(txtValorU_2);
		
		txtProducto3 = new JTextField();
		txtProducto3.setColumns(10);
		txtProducto3.setBounds(28, 259, 76, 18);
		panel.add(txtProducto3);
		
		txtValorU_3 = new JTextField();
		txtValorU_3.setColumns(10);
		txtValorU_3.setBounds(152, 259, 120, 18);
		panel.add(txtValorU_3);
		
		txtCantidad2 = new JTextField();
		txtCantidad2.setColumns(10);
		txtCantidad2.setBounds(353, 231, 76, 18);
		panel.add(txtCantidad2);
		
		txtValorT2 = new JTextField();
		txtValorT2.setColumns(10);
		txtValorT2.setBounds(451, 231, 86, 18);
		panel.add(txtValorT2);
		
		txtCantidad3 = new JTextField();
		txtCantidad3.setColumns(10);
		txtCantidad3.setBounds(353, 259, 76, 18);
		panel.add(txtCantidad3);
		
		txtValorT3 = new JTextField();
		txtValorT3.setColumns(10);
		txtValorT3.setBounds(451, 259, 86, 18);
		panel.add(txtValorT3);
		
		lblNewLabel_1_1_1_3 = new JLabel("TOTAL COMPRA:");
		lblNewLabel_1_1_1_3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_3.setBounds(323, 287, 120, 45);
		panel.add(lblNewLabel_1_1_1_3);
		
		txtTotalCompra = new JTextField();
		txtTotalCompra.setColumns(10);
		txtTotalCompra.setBounds(451, 301, 86, 18);
		panel.add(txtTotalCompra);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblResultado.setBounds(28, 402, 76, 45);
		panel.add(lblResultado);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cliente;
				double valor1, valor2, valor3;
				int cant1, cant2, cant3;
				int subTotal1, subTotal2, subTotal3;
				if(txtCantidad1.getText().isEmpty() || txtValorU_1.getText().isEmpty() || txtProducto1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos del producto 1", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtCantidad2.getText().isEmpty() || txtValorU_2.getText().isEmpty() || txtProducto2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos del producto 2", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtCantidad3.getText().isEmpty() || txtValorU_3.getText().isEmpty() || txtProducto3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos del producto 3", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtCliente.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del cliente", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
					JOptionPane.showMessageDialog(null, "Datos ingresados correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
				}
				valor1 = Double.parseDouble(txtValorU_1.getText());
				valor2 = Double.parseDouble(txtValorU_2.getText());
				valor3 = Double.parseDouble(txtValorU_3.getText());
				
				
			}
		});
		btnCalcular.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
		btnCalcular.setBounds(334, 342, 122, 25);
		panel.add(btnCalcular);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exit = JOptionPane.showConfirmDialog(null, "Desea salir de la app?", "Salir", JOptionPane.YES_NO_OPTION);
				if(exit == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSalir.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 15));
		btnSalir.setBounds(464, 11, 86, 29);
		panel.add(btnSalir);

	}
}
