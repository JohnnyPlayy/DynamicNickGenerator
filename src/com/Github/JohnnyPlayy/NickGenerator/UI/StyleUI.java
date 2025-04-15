package com.Github.JohnnyPlayy.NickGenerator.UI;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicArrowButton;

public class StyleUI {

	public static final Color BACKGROUND_COLOR = new Color(43, 43, 43);
	
	public static final Color TEXT_COLOR = new Color(187, 187, 187);
	
	public static final Color BORDER_COLOR = new Color(60, 63, 65);
	
	public static final Color BUTTON_COLOR = new Color(30, 31, 34);
	
	public static final Color BUTTON_TEXT_COLOR = new Color(255, 255, 255);
	
	public static final Color ARROW_COLOR = new Color(60, 63, 65);

	public static final Dimension FIELD_DIMENSION = new Dimension(150, 25);
	
	public static final Border DEFAULT_BORDER = BorderFactory.createLineBorder(BORDER_COLOR);

	public static void styleComboBox(JComboBox<?> comboBox) {

		comboBox.setBackground(BORDER_COLOR);
		comboBox.setForeground(TEXT_COLOR);
		comboBox.setPreferredSize(FIELD_DIMENSION);
	}

	public static void styleTextField(JTextField textField) {

		textField.setBackground(BORDER_COLOR);
		textField.setForeground(TEXT_COLOR);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setPreferredSize(FIELD_DIMENSION);
	}

	public static void styleSpinner(JSpinner spinner) {

		JFormattedTextField textField = ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField();

		textField.setBackground(BACKGROUND_COLOR);
		textField.setForeground(TEXT_COLOR);
		textField.setCaretColor(TEXT_COLOR);
		textField.setBorder(DEFAULT_BORDER);
		textField.setHorizontalAlignment(JTextField.CENTER);

		spinner.setPreferredSize(FIELD_DIMENSION);

		for (var component : spinner.getComponents()) {

			if (component instanceof JButton) {

				JButton button = (JButton) component;

				button.setBackground(BACKGROUND_COLOR);
				button.setForeground(TEXT_COLOR);
				button.setBorder(DEFAULT_BORDER);
				button.setFocusPainted(false);
				button.setRolloverEnabled(false);

				if (button instanceof BasicArrowButton) {

					BasicArrowButton arrowButton = (BasicArrowButton) button;

					arrowButton.setDirection(((BasicArrowButton) button).getDirection());
					arrowButton.setBorder(BorderFactory.createEmptyBorder());
				}
			}
		}
	}

	public static void styleTextArea(JTextArea textArea) {

		textArea.setEditable(false);
		textArea.setMargin(new java.awt.Insets(5, 5, 5, 5));
		textArea.setBorder(DEFAULT_BORDER);
		textArea.setBackground(BACKGROUND_COLOR);
		textArea.setForeground(TEXT_COLOR);
	}

	public static void styleButton(JButton button) {

		button.setBackground(BUTTON_COLOR);
		button.setForeground(BUTTON_TEXT_COLOR);
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
	}
	
    public static void styleOptionPane() {
    	
        UIManager.put("OptionPane.background", BACKGROUND_COLOR);
        UIManager.put("OptionPane.messageForeground", TEXT_COLOR);
        UIManager.put("Panel.background", BACKGROUND_COLOR);
        UIManager.put("Button.background", BORDER_COLOR);
        UIManager.put("Button.foreground", BUTTON_TEXT_COLOR);
        UIManager.put("Button.border", DEFAULT_BORDER);
    }
}