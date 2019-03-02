package brayan.rojas.utils;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import brayan.rojas.logica.DynamicField;

public class Formateador implements KeyListener {
	
	/** 
	 * @author brayan.rojas
	 * @since 02/03/2019
	 * @comment Clase utilidad para formateo dinamico en un campo (ejemplo formateo de un costo-precio-valor)
	 *
	 */
	
	//DynamicField extends JTextField
	private JTextField objDynamicField;

	public Formateador( DynamicField objDynamicField ) {
		//System.out.println("trazabilidad");
		this.objDynamicField = objDynamicField;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {

		String texto = objDynamicField.getText();
		System.out.println(getobjDynamicField().getText());
		NumberFormat formato = NumberFormat.getIntegerInstance(Locale.ENGLISH);
		double val = 0;

		if (!texto.trim().equals("")) {
			boolean isValorCorrecto = true;
			try {
				val = formato.parse(texto).doubleValue();
				if (val > 2147483647) {
					throw new Exception("Error, excedio el monto");
				}

			} catch (ParseException pe) {
				pe.printStackTrace();
			} catch (Exception ex) {
				isValorCorrecto = false;
				JOptionPane.showMessageDialog(null, ex.getMessage(), "Error - Excedio Valor",
						JOptionPane.ERROR_MESSAGE);
			}
			String tex = formato.format(val);

			if (!isValorCorrecto) {

				tex = "0";
			}

			objDynamicField.setText(tex);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
	private JTextField  getobjDynamicField() {
		if (objDynamicField == null) {
			objDynamicField = new DynamicField();
		}
		return objDynamicField;
	}

}
