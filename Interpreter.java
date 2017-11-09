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
*    Kyle Matthew B. Reblora							 	 *
*    Nicolo Jireh D. Unson								 *
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
	import java.awt.BorderLayout;
	import java.awt.Color;	
	import java.awt.Dimension;
	import java.awt.Font;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
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
		private JLabel titlebar;
		private LexemeTable lexeme;
		private SymbolTable symboltable;

	// Panel - Dividers
		private JPanel topPanel;
		private JPanel bottomPanel;

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
		this.setLayout(new BorderLayout());

		// creating components
		this.topPanel = new JPanel(); this.bottomPanel = new JPanel();	
		this.bottomPanel.setLayout(new BorderLayout());
		this.topPanel.setLayout(new BorderLayout());

		this.titlebar = new JLabel("LOL CODE Interpreter");
		this.lexeme = new LexemeTable();
		this.symboltable = new SymbolTable();
		
		// interpreter title bar - setup		
		this.titlebar.setPreferredSize(new Dimension(Interpreter.MAXIMUM_PANEL_WIDTH, Interpreter.MAXIMUM_PANEL_HEIGHT-280));
		this.titlebar.setForeground(Color.WHITE);
		this.titlebar.setFont(new Font("Serif", Font.BOLD, 12));
		this.titlebar.setBorder(new EmptyBorder(0, 15, 10, 0));

		JPanel titlePanel = new JPanel(); titlePanel.setBackground(Color.BLACK);
		titlePanel.setPreferredSize(new Dimension(Interpreter.MAXIMUM_PANEL_WIDTH, Interpreter.MAXIMUM_PANEL_HEIGHT-280));
		titlePanel.add(this.titlebar);	

		this.bottomPanel.add(this.lexeme, BorderLayout.WEST);
		this.bottomPanel.add(this.symboltable, BorderLayout.EAST);
		this.topPanel.add(titlePanel, BorderLayout.CENTER);

		this.add(topPanel, BorderLayout.NORTH);
		this.add(bottomPanel, BorderLayout.SOUTH);
	}

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return Interpreter.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return Interpreter.MAXIMUM_PANEL_HEIGHT;}

}
