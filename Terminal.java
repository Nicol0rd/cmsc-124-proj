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
*  This file creates the terminal panel for GUI.                                         *
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
	import javax.swing.JButton;	
	import javax.swing.JPanel;
	import gui.*;

//	--------------------------------------------------	[CLASS SPECIFICATION]
public class Terminal extends JPanel {

	/**************
	*  Constants  *
	**************/
	private static final int MAXIMUM_PANEL_WIDTH = MainPanel.getPanelWidth();
	private static final int MAXIMUM_PANEL_HEIGHT = MainPanel.getPanelHeight();


	/***************
	*  Attributes  *
	***************/
		private JButton executeButton;
		private JPanel textPanel;

	/***************************
	*    Panel Constructors    *
	***************************/
	public Terminal() {
		
		super();
		this.setLayout(new BorderLayout());
		this.setComponents();
	}

	/****************
	*    Methods    *
	****************/
	private void setComponents() {
		
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(Terminal.MAXIMUM_PANEL_WIDTH, Terminal.MAXIMUM_PANEL_HEIGHT));
		
		this.executeButton = new JButton("EXECUTE");

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.setBackground(Color.GRAY);

		this.textPanel = new JPanel();
		this.textPanel.setBackground(Color.WHITE);

		this.executeButton.setPreferredSize(new Dimension(Terminal.getPanelWidth(),Terminal.getPanelHeight()-280));
		buttonPanel.setPreferredSize(new Dimension(Terminal.getPanelWidth(),Terminal.getPanelHeight()-280));
		this.textPanel.setPreferredSize(new Dimension(Terminal.getPanelWidth(),Terminal.getPanelHeight()-25));
		
		buttonPanel.add(this.executeButton, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.NORTH);
		this.add(this.textPanel, BorderLayout.SOUTH);
	}

	/****************
	*    Getters    *
	****************/
	public static int getPanelWidth(){return Terminal.MAXIMUM_PANEL_WIDTH;}
	public static int getPanelHeight(){return Terminal.MAXIMUM_PANEL_HEIGHT;}

}
