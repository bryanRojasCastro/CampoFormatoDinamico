package brayan.rojas.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import brayan.rojas.logica.DynamicField;


public class IngresoValor extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JDialog ventanaPrincipal;
	private static IngresoValor VDIALOGOPRINCIPAL;
	private DynamicField campoValor;
	private JButton btnIngresarValor;
	
	private IngresoValor(){
		PadreLookAndFeel pdLF = new PadreLookAndFeel();
		pdLF.setLookAndFeel();
		initComponents();
	}
	
	public static IngresoValor getInstance() {
		
		if (VDIALOGOPRINCIPAL == null) {
			VDIALOGOPRINCIPAL = new IngresoValor();
			
		}
		return VDIALOGOPRINCIPAL;
		
	}

	private void initComponents() {
		
		// or can say super.@method.._s()
		ventanaPrincipal = new JDialog();
		ventanaPrincipal.getContentPane().setLayout(null);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setBounds(100, 100, 450, 300);
		ventanaPrincipal.setTitle("FormatoDinamico");	
		
		btnIngresarValor = new JButton();
		btnIngresarValor.setBounds(140, 150, 150, 25);
		btnIngresarValor.setText("Ingresar");
		btnIngresarValor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//obtencion datos del formulario
				System.out.println("Elva lor ingresado fue:" + campoValor.getText());
			}
		});
			
		ventanaPrincipal.add(getCampoValor());
		ventanaPrincipal.add(btnIngresarValor);
		ventanaPrincipal.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setVisible(true);
		
	}
	
	private DynamicField getCampoValor() {
		
		this.campoValor = new DynamicField();
		//@params:  x,y, high, width
		this.campoValor.setBounds(140, 100, 150, 25);
		this.campoValor.setBackground(Color.cyan);
		//this.campoValor.addFocusListener(this);
		//this.campoValor.addKeyListener(new Formateador(this.campoValor));
		
		return this.campoValor;
	}

}
