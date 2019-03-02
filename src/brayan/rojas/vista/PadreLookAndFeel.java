package brayan.rojas.vista;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;


public class PadreLookAndFeel {
	
	public void setLookAndFeel() {
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame.setDefaultLookAndFeelDecorated(true);
		Toolkit.getDefaultToolkit().setDynamicLayout(true);
		System.setProperty("sun.awt.noerasebackground", "true");

		UIManager.put("TextField.disabledForeground", Color.BLACK);
		UIManager.put("ComboBox.disabledForeground", Color.BLACK);
		UIManager.put("TextArea.disabledForeground", Color.BLACK);
		UIManager.put("ComboBox.disabledBackground", Color.WHITE);
		UIManager.put("MenuBar.background", Color.WHITE);
		UIManager.put("Menu.background", Color.WHITE);
		UIManager.put("MenuItem.background", Color.WHITE);
		UIManager.put("Button.background", Color.WHITE);
		UIManager.put("ToggleButton.background", Color.WHITE);
		UIManager.put("ComboBox.background", Color.WHITE);
		UIManager.put("CheckBoxMenuItem.background", Color.WHITE);
		UIManager.put("Panel", new Color(90, 133, 249));
		UIManager.put("MenuItem.selectionBackground", Color.WHITE);
		UIManager.put("Menu.selectionBackground", Color.WHITE);
		UIManager.put("CheckBoxMenuItem.selectionBackground", Color.WHITE);
		UIManager.put("RadioButtonMenuItem.selectionBackground", Color.WHITE);
		UIManager.put("ComboBox.selectionBackground", Color.WHITE);
		UIManager.put("Menu.useMenuBarBackgroundForTopLevel", false);
		UIManager.put("menuPressedItemB", Color.BLUE);
		UIManager.put("menuPressedItemF", Color.BLUE);
		UIManager.put("ToolBar.background", Color.WHITE);
		UIManager.put("Button.selectionBackground", Color.BLACK);
		UIManager.put("InternalFrame.border", new CompoundBorder(
				new SoftBevelBorder(SoftBevelBorder.LOWERED), new LineBorder(
						Color.BLACK)));
		UIManager.put("Button.light", Color.BLACK);
		UIManager.put("Button.shadow", Color.BLACK);
		UIManager.put("Button.darkShadow", Color.BLACK);
		UIManager.put("Button.highlight", Color.BLACK);
		UIManager.put("ProgressBar.background", Color.WHITE);
		UIManager.put("ProgressBar.foreground", new Color(64, 118, 201));
		UIManager.put("FormattedTextField.background", Color.WHITE);
		UIManager.put("FormattedTextField.foreground", Color.BLACK);
		UIManager.put("FormattedTextField.caretForeground", Color.WHITE);
		UIManager.put("FormattedTextField.selectionForeground", Color.WHITE);
		UIManager.put("ToolTip.foreground", Color.WHITE);
		UIManager.put("ToolTip.background", new Color(64, 118, 201));
		UIManager.put("DesktopIcon.foreground", Color.WHITE);
		UIManager.put("DesktopIcon.background", Color.WHITE);
	}
	


}
