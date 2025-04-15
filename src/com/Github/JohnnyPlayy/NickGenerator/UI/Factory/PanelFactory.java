package com.Github.JohnnyPlayy.NickGenerator.UI.Factory;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.Github.JohnnyPlayy.NickGenerator.Language.Language;
import com.Github.JohnnyPlayy.NickGenerator.UI.DarkScrollBarUI;
import com.Github.JohnnyPlayy.NickGenerator.UI.StyleUI;

public class PanelFactory {

    public static JPanel createMainPanel() {
    	
        JPanel mainPanel = new JPanel(new GridBagLayout());
        
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(StyleUI.BACKGROUND_COLOR);
        
        return mainPanel;
    }
    
	public static JPanel createResultPanel(Color backgroundColor, Color borderColor, Color textColor, JTextArea resultArea) {

	    JPanel resultPanel = new JPanel(new BorderLayout());

	    resultPanel.setPreferredSize(new Dimension(200, 0));
		resultPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(borderColor), Language.RESULT_PANEL_TITLE, 0, 0, null, textColor));
	    resultPanel.setBackground(backgroundColor);

	    resultArea.setEditable(false);
	    resultArea.setMargin(new Insets(5, 5, 5, 5));
	    resultArea.setBorder(BorderFactory.createLineBorder(borderColor));
	    resultArea.setBackground(backgroundColor);
	    resultArea.setForeground(textColor);

	    JScrollPane scrollPane = new JScrollPane(resultArea);

	    scrollPane.setPreferredSize(new Dimension(200, 150));
	    scrollPane.setBorder(BorderFactory.createLineBorder(borderColor));
	    
	    scrollPane.getViewport().setBackground(backgroundColor);

        scrollPane.getVerticalScrollBar().setUI(new DarkScrollBarUI());
        scrollPane.getHorizontalScrollBar().setUI(new DarkScrollBarUI());
        
        JPanel corner = new JPanel();
        
        corner.setBackground(backgroundColor);
        
        scrollPane.setCorner(JScrollPane.LOWER_RIGHT_CORNER, corner);

	    resultPanel.add(scrollPane, BorderLayout.CENTER);
	    
	    return resultPanel;
	}
}