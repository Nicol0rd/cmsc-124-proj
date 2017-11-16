/*****************************************************************************************
*                                                                                        *
*  Project in Computer Science 124 (Design and Implementation of Programming Languages)  *
*  Second Semester School Year 2016-2017                                                 *
*                                                                                        *
*  LOLCODE Interpreter                                                                   *
*  Project Version 1.0 11/10/2017                                                        *
*                                                                                        *
*  Authors: Cobolords                                                                    *
*    Andric Quinn S. Baticos                                                             *
*    Kyle Matthew B. Reblora                                                             *
*    Nicolo Jireh D. Unson                                                               *
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

//	--------------------------------------------------	[CLASS SPECIFICATION]
public class Editor extends JPanel {

	/**************
	*  Constants  *
	**************/
	private static final int MAXIMUM_PANEL_WIDTH = 400;
	private static final int MAXIMUM_PANEL_HEIGHT = MainPanel.getPanelHeight();
	private static final int TEXT_AREA_WIDTH = 17;
	private static final int TEXT_AREA_HEIGHT = 33;

	/***************
	*  Attributes  *
	***************/

	// Panel Components
	private JButton fileChooser;
	private JTextArea fileName;
	private JTextArea textArea;
	private JScrollPane textScroll;

	// Panel - Dividers	
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JPanel rightPanel;
	private JPanel leftPanel;

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

		// set panel size
		this.setPreferredSize(new Dimension(Editor.MAXIMUM_PANEL_WIDTH, Editor.MAXIMUM_PANEL_HEIGHT));
		this.setBackground(Color.GRAY);
		this.setLayout(new BorderLayout());

		// creating components
		this.topPanel = new JPanel();
		this.bottomPanel = new JPanel();
		this.leftPanel = new JPanel();
		this.rightPanel = new JPanel();
		
		// top: creating the file choosing area
		this.fileName = new JTextArea("demo.lol", 1, 29);
		this.fileName.setEditable(false);
		this.fileChooser = new JButton("File");

		// bottom: creating text area with scrollbar
		this.textArea = new JTextArea(Editor.TEXT_AREA_WIDTH, Editor.TEXT_AREA_HEIGHT);
        this.textArea.setEditable(true);
        this.textScroll = new JScrollPane(this.textArea);
        this.textScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		// modifying components size & color
		this.topPanel.setLayout(new BorderLayout());
		this.topPanel.setPreferredSize(new Dimension(Editor.MAXIMUM_PANEL_WIDTH, Editor.MAXIMUM_PANEL_HEIGHT-265));
		this.bottomPanel.setPreferredSize(new Dimension(Editor.MAXIMUM_PANEL_WIDTH, Editor.MAXIMUM_PANEL_HEIGHT-35));
		this.topPanel.setBackground(Color.PINK);
		this.bottomPanel.setBackground(Color.GRAY);
		
		// set components - top panel
		this.leftPanel.add(this.fileName, BorderLayout.CENTER);
		this.rightPanel.add(this.fileChooser, BorderLayout.CENTER);
		this.topPanel.add(this.leftPanel, BorderLayout.CENTER);
		this.topPanel.add(this.rightPanel, BorderLayout.EAST);

		// set components position - editor
		this.bottomPanel.add(this.textScroll, BorderLayout.CENTER);
		this.add(this.topPanel, BorderLayout.NORTH);
		this.add(this.bottomPanel, BorderLayout.SOUTH);
	}	

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return Editor.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return Editor.MAXIMUM_PANEL_HEIGHT;}

}
