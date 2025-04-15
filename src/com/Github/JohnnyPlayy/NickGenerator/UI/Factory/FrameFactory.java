package com.Github.JohnnyPlayy.NickGenerator.UI.Factory;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.Github.JohnnyPlayy.NickGenerator.Language.Language;

public class FrameFactory {
	
    public static JFrame createMainFrame() {
    	
        JFrame frame = new JFrame(Language.MAIN_FRAME_TITLE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout(10, 10));

        return frame;
    }

}
