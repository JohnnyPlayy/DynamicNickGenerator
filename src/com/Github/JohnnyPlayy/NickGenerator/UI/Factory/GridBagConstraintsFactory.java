package com.Github.JohnnyPlayy.NickGenerator.UI.Factory;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridBagConstraintsFactory {

    public static GridBagConstraints createGridBagConstraints() {
    	
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.anchor = GridBagConstraints.WEST;
        
        return gbc;
    }
}