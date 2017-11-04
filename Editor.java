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
*  This file creates the editor panel for GUI.                                           *
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
public class Editor extends JPanel {

	/**************
	*  Constants  *
	**************/
	private static final int MAXIMUM_PANEL_WIDTH = 400;
	private static final int MAXIMUM_PANEL_HEIGHT = MainPanel.getPanelHeight();

	/***************
	*  Attributes  *
	***************/

	/***************************
	*    Panel Constructors    *
	***************************/
	public Editor() {
		super();
		this.setPreferredSize(new Dimension(Editor.MAXIMUM_PANEL_WIDTH, Editor.MAXIMUM_PANEL_HEIGHT));
		this.setBackground(Color.RED);
	}

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return Editor.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return Editor.MAXIMUM_PANEL_HEIGHT;}

}
