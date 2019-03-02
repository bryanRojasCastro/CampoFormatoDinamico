package brayan.rojas.logica;

import java.util.Locale;
import javax.swing.JTextField;
import brayan.rojas.utils.Formateador;


public class DynamicField extends JTextField{
	
	/** 
	 * @author brayan.rojas
	 * @since 02/03/2019
	 * @comment clase encargada de decirle a un campo de texto que debera ser dinamico para
	 * ingreso de solo precios.
	 * cuando en una vista se declara un campo tipo DynamicField, este  en su constructor 
	 * agregara un keyListener a quien? a el mismo es decir al componente que yo definí
	 * como DynamicField.
	 *
	 */

	public DynamicField() {
		setDefaultLocale(Locale.ENGLISH);
		addKeyListener(new Formateador(this));
	}
	
}
