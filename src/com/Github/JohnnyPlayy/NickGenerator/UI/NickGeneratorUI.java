package com.Github.JohnnyPlayy.NickGenerator.UI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import com.Github.JohnnyPlayy.NickGenerator.Gender.Gender;
import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;
import com.Github.JohnnyPlayy.NickGenerator.Options.CaseOption;
import com.Github.JohnnyPlayy.NickGenerator.UI.Factory.ButtonFactory;
import com.Github.JohnnyPlayy.NickGenerator.UI.Factory.FrameFactory;
import com.Github.JohnnyPlayy.NickGenerator.UI.Factory.GridBagConstraintsFactory;
import com.Github.JohnnyPlayy.NickGenerator.UI.Factory.InputFieldFactory;
import com.Github.JohnnyPlayy.NickGenerator.UI.Factory.PanelFactory;

public class NickGeneratorUI {

    private static final GridBagConstraints GBC = GridBagConstraintsFactory.createGridBagConstraints();

    private static final JComboBox<LanguageType.Language> LANGUAGE_COMBO_BOX = new JComboBox<>(LanguageType.Language.values());

    private static final JComboBox<CaseOption.Option> CASE_COMBO_BOX = new JComboBox<>(CaseOption.Option.values());

    private static final JComboBox<Gender> GENDER_COMBO_BOX = new JComboBox<>(Gender.values());

    private static final JTextField CUSTOM_CHARS_FIELD = new JTextField();

    private static final JSpinner NICK_COUNT_SPINNER = new JSpinner(new SpinnerNumberModel(10, 1, 1000, 1));

    private static final JTextArea RESULT_AREA = new JTextArea();

    public static void main(String[] args) {
    	
        JFrame frame = FrameFactory.createMainFrame();

        JPanel mainPanel = PanelFactory.createMainPanel();
        
        frame.add(mainPanel, BorderLayout.CENTER);

        InputFieldFactory.addInputFields(
        		
                mainPanel, 
                
                GBC, 
                
                StyleUI.TEXT_COLOR, 
                StyleUI.BORDER_COLOR, 
                StyleUI.ARROW_COLOR, 
                
                LANGUAGE_COMBO_BOX, 
                CASE_COMBO_BOX, 
                GENDER_COMBO_BOX, 
                CUSTOM_CHARS_FIELD, 
                NICK_COUNT_SPINNER
        );

        ButtonFactory.createGenerateButton(
        		
                mainPanel, 
                
                GBC, 
                
                StyleUI.BUTTON_COLOR, 
                StyleUI.BUTTON_TEXT_COLOR, 
                StyleUI.TEXT_COLOR, 
                StyleUI.BORDER_COLOR, 
                
                frame, 
                
                LANGUAGE_COMBO_BOX, 
                CASE_COMBO_BOX, 
                GENDER_COMBO_BOX, 
                CUSTOM_CHARS_FIELD, 
                NICK_COUNT_SPINNER, 
                RESULT_AREA
        );

        ButtonFactory.createAboutButton(
        		
                mainPanel, 
                
                GBC, 
                
                StyleUI.BUTTON_COLOR, 
                StyleUI.BUTTON_TEXT_COLOR, 
                
                frame
        );

        JPanel resultPanel = PanelFactory.createResultPanel(
        		
                StyleUI.BACKGROUND_COLOR, 
                StyleUI.BORDER_COLOR, 
                StyleUI.TEXT_COLOR, 
                
                RESULT_AREA
        );
        
        frame.add(resultPanel, BorderLayout.EAST);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}