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
*    Kyle Matthew B. Reblora								 *
*    Nicolo Jireh D. Unson								 *
*                                                                                        *
*  File Description:                                                                     *
*  This file creates the lexeme table panel for GUI.                                     *
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
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import gui.*;

//	--------------------------------------------------	[CLASS SPECIFICATION]
public class LexemeTable extends JPanel {

	/**************
	*  Constants  *
	**************/
	private static final int MAXIMUM_PANEL_WIDTH = Interpreter.getPanelWidth()/2;
	private static final int MAXIMUM_PANEL_HEIGHT = Interpreter.getPanelHeight();

	
	/***************
	*  Attributes  *
	***************/

	

	// Panel - Dividers
	private JLabel titlebar;
	private JPanel tablePanel;

	/***************************
	*    Panel Constructors    *
	***************************/
	public LexemeTable() {
		super();
		this.setComponents();
	}

	/****************
	*    Methods    *
	****************/
	private void setComponents() {

		this.setPreferredSize(new Dimension(LexemeTable.MAXIMUM_PANEL_WIDTH, LexemeTable.MAXIMUM_PANEL_HEIGHT));
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);

		// Initialization of Panels
		this.titlebar = new JLabel("Lexeme");
		this.tablePanel = new JPanel();

		this.tablePanel.setPreferredSize(new Dimension(LexemeTable.MAXIMUM_PANEL_WIDTH,LexemeTable.MAXIMUM_PANEL_HEIGHT-100));
		this.titlebar.setBackground(Color.RED);		
		this.tablePanel.setBackground(Color.GREEN);

		this.add(this.titlebar, BorderLayout.NORTH);
		this.add(this.tablePanel, BorderLayout.CENTER);
	}

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return LexemeTable.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return LexemeTable.MAXIMUM_PANEL_HEIGHT;}

}
