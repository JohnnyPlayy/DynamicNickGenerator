package com.Github.JohnnyPlayy.NickGenerator.UI.Factory;

import javax.swing.*;

import com.Github.JohnnyPlayy.NickGenerator.DynamicNickGenerator;
import com.Github.JohnnyPlayy.NickGenerator.Gender.Gender;
import com.Github.JohnnyPlayy.NickGenerator.Language.Language;
import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;
import com.Github.JohnnyPlayy.NickGenerator.Options.CaseOption;
import com.Github.JohnnyPlayy.NickGenerator.UI.StyleUI;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFactory {
    
    public static void createGenerateButton(JPanel mainPanel, GridBagConstraints gbc, Color buttonColor, Color buttonTextColor, Color textColor, Color borderColor, JFrame frame, JComboBox<LanguageType.Language> languageComboBox, JComboBox<CaseOption.Option> caseComboBox, JComboBox<Gender> genderComboBox, JTextField customCharsField, JSpinner nickCountSpinner, JTextArea resultArea) {
		
		JButton generateButton = new JButton(Language.GENERATE_BUTTON_TEXT);
		
		generateButton.setBackground(buttonColor);
		generateButton.setForeground(buttonTextColor);
		generateButton.setFocusPainted(false);
		
		generateButton.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

		gbc.gridx = 1;
		gbc.gridy = 5;
		
		gbc.anchor = GridBagConstraints.CENTER;
		
		mainPanel.add(generateButton, gbc);

	    generateButton.addActionListener(new ActionListener() {
	    	
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	            try {
	                
	                CaseOption.Option caseOption = (CaseOption.Option) caseComboBox.getSelectedItem();
	                
	                LanguageType.Language language = (LanguageType.Language) languageComboBox.getSelectedItem();
	                
	                String customChars = customCharsField.getText();
	                
	                int nickCount = (int) nickCountSpinner.getValue();
	                
	                Gender gender = (Gender) genderComboBox.getSelectedItem();

	                resultArea.setText("");

	                for (int i = 0; i < nickCount; i++) {
	                	
	                    String generatedName = DynamicNickGenerator.generateRandomName(caseOption, language, customChars.isEmpty() ? null : customChars, gender);
	                    
	                    resultArea.append((i + 1) + ". " + generatedName + "\n");
	                }
	                
	            } catch (Exception ex) {
	            	
	                JOptionPane.showMessageDialog(frame, Language.UNEXPECTED_ERROR + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    });
	}
    
    public static void createAboutButton(JPanel mainPanel, GridBagConstraints gbc, Color buttonColor, Color buttonTextColor, JFrame frame) {
    	
        JButton creditsButton = new JButton(Language.ABOUT_BUTTON_TEXT);
        
        creditsButton.setBackground(buttonColor);
        creditsButton.setForeground(buttonTextColor);
        creditsButton.setFocusPainted(false);
        
        creditsButton.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

        gbc.gridx = 0;
        gbc.gridy = 5;
        
        gbc.anchor = GridBagConstraints.WEST;
        
        mainPanel.add(creditsButton, gbc);
        
        creditsButton.addActionListener(new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	StyleUI.styleOptionPane();
            	
                JOptionPane.showMessageDialog(frame, Language.ABOUT_MESSAGE, Language.CREDITS_TITLE, JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
