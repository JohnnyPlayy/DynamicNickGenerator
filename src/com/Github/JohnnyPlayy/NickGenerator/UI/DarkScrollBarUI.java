package com.Github.JohnnyPlayy.NickGenerator.UI;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class DarkScrollBarUI extends BasicScrollBarUI {

    @Override
    protected void configureScrollBarColors() {
    	
        this.thumbColor = StyleUI.ARROW_COLOR;
        this.trackColor = StyleUI.BACKGROUND_COLOR;
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
    	
        return createCustomButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
    	
        return createCustomButton();
    }

    private JButton createCustomButton() {
    	
        JButton button = new JButton();
        
        button.setBackground(StyleUI.ARROW_COLOR);
        button.setForeground(StyleUI.BACKGROUND_COLOR);
        
        button.setBorder(BorderFactory.createLineBorder(StyleUI.ARROW_COLOR));
        return button;
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
    	
        g.setColor(StyleUI.ARROW_COLOR);
        
        g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
    	
        g.setColor(StyleUI.BACKGROUND_COLOR);
        
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }
}