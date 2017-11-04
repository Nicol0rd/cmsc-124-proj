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
*  This file creates the window panel for GUI.                                           *
*                                                                                        *
*  (c) ALL RIGHTS RESERVED 2017                                                          *
*                                                                                        *
*****************************************************************************************/

//  --------------------------------------------------  [PACKAGE DECLARATION]
	package gui;
	
//	--------------------------------------------------	[JAVA IMPORTS]
	import gui.*;
	import java.awt.*;
	import javax.swing.*;

//  --------------------------------------------------  [CLASS SPECIFICATION]
public class MyFrame extends JFrame {

	/**************
	*  Constants  *
	**************/
	private static final int MAXIMUM_WINDOW_WIDTH = 1000;
	private static final int MAXIMUM_WINDOW_HEIGHT = 600;


	/*************************
	*  MyFrame Constructors  *
	*************************/
	public MyFrame(){

		super("Ang Ganda ni Maam Kat LOLTERPRETER");										//	[title for window]
		this.setPreferredSize(new Dimension(MAXIMUM_WINDOW_WIDTH,MAXIMUM_WINDOW_HEIGHT));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		Container container = this.getContentPane();
		container.add(new MainPanel(),BorderLayout.CENTER);

		this.pack();
		this.setLocationRelativeTo(null); // centers the window
		this.setVisible(true);
	}


	/************
	*  Getters  *
	************/
	public static int getFrameWidth(){return MyFrame.MAXIMUM_WINDOW_WIDTH;}
	public static int getFrameHeight(){return MyFrame.MAXIMUM_WINDOW_HEIGHT;}
}

