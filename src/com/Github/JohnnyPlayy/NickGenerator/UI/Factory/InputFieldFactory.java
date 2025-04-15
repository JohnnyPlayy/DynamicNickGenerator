package com.Github.JohnnyPlayy.NickGenerator.UI.Factory;

import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import com.Github.JohnnyPlayy.NickGenerator.Gender.Gender;
import com.Github.JohnnyPlayy.NickGenerator.Language.Language;
import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;
import com.Github.JohnnyPlayy.NickGenerator.Options.CaseOption;
import com.Github.JohnnyPlayy.NickGenerator.UI.StyleUI;

public class InputFieldFactory {
	
    public static void addInputFields(JPanel mainPanel, GridBagConstraints gbc, Color textColor, Color borderColor, Color backgroundColor, JComboBox<LanguageType.Language> languageComboBox, JComboBox<CaseOption.Option> caseComboBox, JComboBox<Gender> genderComboBox, JTextField customCharsField, JSpinner nickCountSpinner) {
        
    	JLabel languageLabel = new JLabel(Language.LANGUAGE_LABEL);
        
        languageLabel.setForeground(textColor);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        mainPanel.add(languageLabel, gbc);

        StyleUI.styleComboBox(languageComboBox);
        
        gbc.gridx = 1;
        
        mainPanel.add(languageComboBox, gbc);

        JLabel caseLabel = new JLabel(Language.CASE_LABEL);
        
        caseLabel.setForeground(textColor);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        
        mainPanel.add(caseLabel, gbc);

        StyleUI.styleComboBox(caseComboBox);
        
        gbc.gridx = 1;
        
        mainPanel.add(caseComboBox, gbc);

        JLabel genderLabel = new JLabel(Language.GENDER_LABEL);
        
        genderLabel.setForeground(textColor);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        
        mainPanel.add(genderLabel, gbc);

        StyleUI.styleComboBox(genderComboBox);
        
        gbc.gridx = 1;
        
        mainPanel.add(genderComboBox, gbc);
        
        JLabel nickCountLabel = new JLabel(Language.NICK_COUNT_LABEL);
        
        nickCountLabel.setForeground(textColor);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        
        mainPanel.add(nickCountLabel, gbc);

        StyleUI.styleSpinner(nickCountSpinner);
        
        gbc.gridx = 1;
        
        mainPanel.add(nickCountSpinner, gbc);

        JLabel customCharsLabel = new JLabel(Language.CUSTOM_CHARS_LABEL);
        
        customCharsLabel.setForeground(textColor);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        
        mainPanel.add(customCharsLabel, gbc);

        StyleUI.styleTextField(customCharsField);
        
        gbc.gridx = 1;
        
        mainPanel.add(customCharsField, gbc);
    }
}
