/*****************************************************************************************
*                                                                                        *
*  Project in Computer Science 124 (Design and Implementation of Programming Languages)  *
*  Second Semester School Year 2016-2017                                                 *
*                                                                                        *
*  LOLCODE Interpreter                                                                   *
*  Project Version 1.0 11/04/2017                                                        *
*                                                                                        *
*  Authors: Cobolords                                                                    *
*    Andric Quinn S. Baticos                                                             *
*    Kyle Matthew B. Reblora															 *
*	 Nicolo Jireh D. Unson																 *
*                                                                                        *
*  File Description:                                                                     *
*  This file creates the division panel for GUI.                                           *
*                                                                                        *
*  (c) ALL RIGHTS RESERVED 2017                                                          *
*                                                                                        *
*****************************************************************************************/
//  --------------------------------------------------  [PACKAGE DECLARATION]
	package gui;

//	--------------------------------------------------	[JAVA IMPORTS]	
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;
	import javax.swing.JPanel;
	import gui.*;

//	--------------------------------------------------	[CLASS SPECIFICATION]
public class MainPanel extends JPanel {

	/***************
	*   Constants  *
	***************/
		private static final int MAXIMUM_WINDOW_HEIGHT = MyFrame.getFrameHeight()/2;
		private static final int MAXIMUM_WINDOW_WIDTH = MyFrame.getFrameWidth();

	/***************
	*  Attributes  *
	***************/
		
	// Main Panels
		private Editor editor;
		private Interpreter interpreter;
		private Terminal terminal;

	// Panel - Dividers
		private JPanel topPanel;
		private JPanel bottomPanel;
		private JPanel leftPanel;
		private JPanel rightPanel;

	/***************************
	*    Panel Constructors    *
	***************************/
	public MainPanel() {
		this.setLayout(new BorderLayout());
		this.setComponents();
	}
	
	/****************
	*    Methods    *
	****************/
	private void setComponents() {

		// creating components
		this.editor = new Editor();
		this.interpreter = new Interpreter();
		this.terminal = new Terminal();

		this.topPanel = new JPanel(); this.bottomPanel = new JPanel();
		this.leftPanel = new JPanel(); this.rightPanel = new JPanel();
		
		// set panel size - vertical
		this.topPanel.setLayout(new BorderLayout());
		this.topPanel.setPreferredSize(new Dimension(MainPanel.MAXIMUM_WINDOW_WIDTH, MainPanel.MAXIMUM_WINDOW_HEIGHT));
		this.bottomPanel.setPreferredSize(new Dimension(MainPanel.MAXIMUM_WINDOW_WIDTH, MainPanel.MAXIMUM_WINDOW_HEIGHT));

		// set panel size - horizontal		
		this.leftPanel.setPreferredSize(new Dimension(Editor.getPanelWidth(), Editor.getPanelHeight()));
		this.rightPanel.setPreferredSize(new Dimension(Interpreter.getPanelWidth(), Interpreter.getPanelHeight()));
		
		this.leftPanel.setBackground(Color.GRAY); 
		this.rightPanel.setBackground(Color.GRAY);
		this.bottomPanel.setBackground(Color.GRAY);

		// set component position - top
		this.leftPanel.add(editor);
		this.rightPanel.add(interpreter);

		// set component position - top
		this.topPanel.add(leftPanel, BorderLayout.WEST);
		this.topPanel.add(rightPanel, BorderLayout.EAST);

		// set component position - bottom
		this.bottomPanel.add(terminal);

		// set component position - window
		this.add(topPanel,BorderLayout.NORTH);
		this.add(bottomPanel,BorderLayout.SOUTH);

	}

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return MainPanel.MAXIMUM_WINDOW_WIDTH;}
	public static int getPanelHeight(){return MainPanel.MAXIMUM_WINDOW_HEIGHT;}

}
