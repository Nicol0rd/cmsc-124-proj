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
*  This file creates the symbol table panel for GUI.                                     *
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
public class SymbolTable extends JPanel {

	/**************
	*  Constants  *
	**************/
	private static final int MAXIMUM_PANEL_WIDTH = Interpreter.getPanelWidth()/2;
	private static final int MAXIMUM_PANEL_HEIGHT = Interpreter.getPanelHeight();


	/***************************
	*    Panel Constructors    *
	***************************/
	public SymbolTable() {
		super();
		this.setComponents();
	}

	/****************
	*    Methods    *
	****************/
	private void setComponents() {

		this.setPreferredSize(new Dimension(SymbolTable.MAXIMUM_PANEL_WIDTH, SymbolTable.MAXIMUM_PANEL_HEIGHT));
		this.setBackground(Color.YELLOW);
	}

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return SymbolTable.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return SymbolTable.MAXIMUM_PANEL_HEIGHT;}

}
