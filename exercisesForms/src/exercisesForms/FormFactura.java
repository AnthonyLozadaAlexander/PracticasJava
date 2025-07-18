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
import javax.swing.JTextArea;

public class FormFactura extends JFrame {
	
	private String cliente;
	private int count = 0;
	private String Productos[] = new String[3];
	private JTextArea txtResultado;
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
	private JButton btnCliente;

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
		setBounds(100, 100, 627, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(8, 10, 603, 594);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura Deportivo ");
		lblNewLabel.setBounds(18, 11, 236, 45);
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
		lblNewLabel_1_1_1.setBounds(28, 171, 76, 36);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("VALOR UNITARIO");
		lblNewLabel_1_1_1_1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(152, 171, 130, 36);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("CANTIDAD");
		lblNewLabel_1_1_1_2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_2.setBounds(28, 305, 76, 25);
		panel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("VALOR TOTAL");
		lblNewLabel_1_1_1_1_1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(158, 305, 96, 25);
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
		txtCantidad1.setBounds(28, 333, 76, 18);
		panel.add(txtCantidad1);
		txtCantidad1.setColumns(10);
		
		txtValorT1 = new JTextField();
		txtValorT1.setBounds(158, 333, 86, 18);
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
		txtCantidad2.setBounds(28, 361, 76, 18);
		panel.add(txtCantidad2);
		
		txtValorT2 = new JTextField();
		txtValorT2.setColumns(10);
		txtValorT2.setBounds(158, 361, 86, 18);
		panel.add(txtValorT2);
		
		txtCantidad3 = new JTextField();
		txtCantidad3.setColumns(10);
		txtCantidad3.setBounds(28, 389, 76, 18);
		panel.add(txtCantidad3);
		
		txtValorT3 = new JTextField();
		txtValorT3.setColumns(10);
		txtValorT3.setBounds(158, 389, 86, 18);
		panel.add(txtValorT3);
		
		lblNewLabel_1_1_1_3 = new JLabel("TOTAL COMPRA:");
		lblNewLabel_1_1_1_3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblNewLabel_1_1_1_3.setBounds(18, 433, 124, 45);
		panel.add(lblNewLabel_1_1_1_3);
		
		txtTotalCompra = new JTextField();
		txtTotalCompra.setColumns(10);
		txtTotalCompra.setBounds(133, 447, 86, 18);
		panel.add(txtTotalCompra);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 15));
		lblResultado.setBounds(28, 402, 76, 45);
		panel.add(lblResultado);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder factura = new StringBuilder("Datos de la Factura:\n");
				double valor1, valor2, valor3;
				int cant1, cant2, cant3;
				double subTotal1, subTotal2, subTotal3, totalCompra;
				
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
				
				if(txtProducto1.getText().isEmpty() || txtProducto2.getText().isEmpty() || txtProducto3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de todos los productos", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				// Parseamos los valores ingresados
				
				count = 0;
				while(count<Productos.length) {
					if(count == 0) {
						Productos[count] = txtProducto1.getText();
					} else if(count == 1) {
						Productos[count] = txtProducto2.getText();
					} else if(count == 2) {
						Productos[count] = txtProducto3.getText();
					}
				count++;
				}
				
				try {
				valor1 = Double.parseDouble(txtValorU_1.getText());
				valor2 = Double.parseDouble(txtValorU_2.getText());
				valor3 = Double.parseDouble(txtValorU_3.getText());
				
				cant1 = Integer.parseInt(txtCantidad1.getText());
				cant2 = Integer.parseInt(txtCantidad2.getText());
				cant3 = Integer.parseInt(txtCantidad3.getText());
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Debe ingresar valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if(cant1 <= 0 || cant2 <= 0 || cant3 <= 0) {
					JOptionPane.showMessageDialog(null, "La cantidad de productos debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(cant1 >= 10 || cant2 >= 10 || cant3 >= 10) {
					JOptionPane.showMessageDialog(null, "Aplica Descuento del 10% por compras mayores a 10 unidades", "Descuento", JOptionPane.INFORMATION_MESSAGE);
					
					// Aplicamos el descuento del 10% si la cantidad es mayor a 10
					if(cant1 >= 10) {
						subTotal1 = (Double) (valor1 * cant1);
						subTotal1 = subTotal1 - (subTotal1 * 0.10);
						txtValorT1.setText(Double.toString(subTotal1));
					}
					// Si la cantidad es menor o igual a 10, no se aplica descuento
					else {
						subTotal1 = (Double) (valor1 * cant1);
						txtValorT1.setText(Double.toString(subTotal1));
					}
					
					if(cant2 >= 10) {
						subTotal2 = (Double) (valor2 * cant2);
						subTotal2 = subTotal2 - (subTotal2 * 0.10);
						txtValorT2.setText(Double.toString(subTotal2));
					} else {
						subTotal2 = (Double) (valor2 * cant2);
						txtValorT2.setText(Double.toString(subTotal2));
					}
					
					if(cant3 >= 10) {
						subTotal3 = (Double) (valor3 * cant3);
						subTotal3 = subTotal3 - (subTotal3 * 0.10);
						txtValorT3.setText(Double.toString(subTotal3));
					} else {
						subTotal3 = (Double) (valor3 * cant3);
						txtValorT3.setText(Double.toString(subTotal3));
					}
					totalCompra = subTotal1 + subTotal2 + subTotal3;
					txtTotalCompra.setText(Double.toString(totalCompra));
				}
				else {
				
				// Si las cantidades son menores o iguales a 10, no se aplica descuento
				subTotal1 = (Double) (valor1 * cant1);
				subTotal2 = (Double) (valor2 * cant2);
				subTotal3 = (Double) (valor3 * cant3);
				
				txtValorT1.setText(Double.toString(subTotal1));
				txtValorT2.setText(Double.toString(subTotal2));
				txtValorT3.setText(Double.toString(subTotal3));
				totalCompra = subTotal1 + subTotal2 + subTotal3;
				txtTotalCompra.setText(Double.toString(totalCompra));
				
				}
				
				
				factura.append("Cliente: ").append(cliente).append("\n");
				factura.append("Productos:\n");
				for(count = 0; count < Productos.length; count++) {
					factura.append("Producto["+count+"]: ").append(Productos[count].trim()).append("\n");
				}
				factura.append("\nCantidad Producto [1]: ").append(cant1).append("\n");
			factura.append("Valor Unitario Producto [1]: ").append(valor1).append("$ \n");
				factura.append("Subtotal Producto [1]: ").append(subTotal1).append("$ \n");
				
				factura.append("\nCantidad Producto [2]: ").append(cant2).append("\n");
				factura.append("Valor Unitario Producto [2]: ").append(valor2).append("$ \n");
				factura.append("Subtotal Producto [2]: ").append(subTotal2).append("$ \n");
				
				factura.append("\nCantidad Producto [3]: ").append(cant3).append("\n");
				factura.append("Valor Unitario Producto [3]: ").append(valor3).append("$ \n");
				factura.append("Subtotal Producto [3]: ").append(subTotal3).append("$ \n");
				
				txtResultado.setText(factura.toString());
			}
		});
		btnCalcular.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
		btnCalcular.setBounds(20, 476, 102, 25);
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
		
		btnCliente = new JButton("Ingresar");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliente = txtCliente.getText();
				if(cliente.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del cliente", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
					// Aquí podrías agregar más lógica para manejar el cliente, como guardarlo en una base de datos o procesarlo de alguna manera.
					JOptionPane.showMessageDialog(null, "Nombre ingresado correctamente: " + cliente + "      ", "Exito", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnCliente.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
		btnCliente.setBounds(244, 111, 102, 21);
		panel.add(btnCliente);
		
		txtResultado = new JTextArea(); // se necesita inicializar el JTextArea
		txtResultado.setEditable(false);
		txtResultado.setWrapStyleWord(true);
		txtResultado.setBounds(340, 178, 229, 348);
		panel.add(txtResultado);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCliente.setText("");
				txtProducto1.setText("");
				txtValorU_1.setText("");
				txtCantidad1.setText("");
				txtValorT1.setText("");
				txtProducto2.setText("");
				txtValorU_2.setText("");
				txtCantidad2.setText("");
				txtValorT2.setText("");
				txtProducto3.setText("");
				txtValorU_3.setText("");
				txtCantidad3.setText("");
				txtValorT3.setText("");
				txtTotalCompra.setText("");
				txtResultado.setText(""); // Limpiar el JTextArea
			}
		});
		btnLimpiar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 14));
		btnLimpiar.setBounds(18, 511, 104, 36);
		panel.add(btnLimpiar);

	}
}