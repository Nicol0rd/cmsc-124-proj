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
	import java.awt.BorderLayout;	
	import java.awt.Color;	
	import java.awt.Dimension;
	import javax.swing.*;
	import javax.swing.border.*;
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
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JTextArea textArea;
	private JTextField textField;
	private JScrollPane textScroll;

	/***************************
	*    Panel Constructors    *
	***************************/
	public Editor() {
		this.setComponents();
	}

	/****************
	*    Methods    *
	****************/
	private void setComponents() {
		this.setPreferredSize(new Dimension(Editor.MAXIMUM_PANEL_WIDTH, Editor.MAXIMUM_PANEL_HEIGHT));
		this.setBackground(Color.GRAY);
		this.setLayout(new BorderLayout());

		this.topPanel = new JPanel();
		this.bottomPanel = new JPanel();
		
		// text area creation
		this.textArea = new JTextArea(18, 33);
        this.textArea.setEditable(true);
        //this.textArea.setScrollable(true);
		//this.textArea.setLineWrap(true);
        this.textScroll = new JScrollPane(this.textArea);
        this.textScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		this.topPanel.setPreferredSize(new Dimension(Editor.MAXIMUM_PANEL_WIDTH, Editor.MAXIMUM_PANEL_HEIGHT-280));
		this.bottomPanel.setPreferredSize(new Dimension(Editor.MAXIMUM_PANEL_WIDTH, Editor.MAXIMUM_PANEL_HEIGHT-20));
			
		this.topPanel.setBackground(Color.PINK);
		this.bottomPanel.setBackground(Color.GRAY);
		
		this.bottomPanel.add(this.textScroll);

		this.add(this.topPanel, BorderLayout.NORTH);
		this.add(this.bottomPanel, BorderLayout.SOUTH);
	}	

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return Editor.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return Editor.MAXIMUM_PANEL_HEIGHT;}

}
