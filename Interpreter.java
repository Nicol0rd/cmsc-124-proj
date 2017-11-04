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
*  This file creates the interpreter panel for GUI.                                      *
*                                                                                        *
*  (c) ALL RIGHTS RESERVED 2017                                                          *
*                                                                                        *
*****************************************************************************************/

//  --------------------------------------------------  [PACKAGE DECLARATION]
	package gui;

//	--------------------------------------------------	[JAVA IMPORTS]
	import java.awt.Color;	
	import java.awt.Dimension;
	import javax.swing.JPanel;
	import gui.*;

//	--------------------------------------------------	[CLASS SPECIFICATION]
public class Interpreter extends JPanel {

	/**************
	*  Constants  *
	**************/
	private static final int MAXIMUM_PANEL_WIDTH = 600;
	private static final int MAXIMUM_PANEL_HEIGHT = MainPanel.getPanelHeight();

	/***************
	*  Attributes  *
	***************/
	
	// Main Panels
		private JPanel titlebar;
		private JPanel lexeme;
		private JPanel symboltable;

	// Panel - Dividers
		private JPanel topPanel;
		private JPanel bottomPanel;
		private JPanel leftPanel;
		private JPanel rightPanel;		

	/***************************
	*    Panel Constructors    *
	***************************/
	public Interpreter() {
		super();
		this.setComponents();
	}

	/****************
	*    Methods    *
	****************/
	private void setComponents() {

		this.setPreferredSize(new Dimension(Interpreter.MAXIMUM_PANEL_WIDTH, Interpreter.MAXIMUM_PANEL_HEIGHT));

		// creation of panels
		this.titlebar = new JPanel();
		this.lexeme = new JPanel();
		this.symboltable = new JPanel();

		this.setBackground(Color.BLACK);
	}

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return Interpreter.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return Interpreter.MAXIMUM_PANEL_HEIGHT;}

}
