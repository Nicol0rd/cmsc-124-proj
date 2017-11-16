
import java.io.*;
import java.util.*;
import src.Token;
import src.Parser;
import src.Lexeme;
/*
************************************************************************


************************************************************************
*/

public class Main {
	public static void main(String args[]){
		int line = 1; // count ng line
		Parser parser = new Parser();

		setRegex(parser);

		FileReader fr = null;
		BufferedReader br = null;
		String str = null;
		try{
			fr = new FileReader("sample.lol");
			br = new BufferedReader(fr);
			String currentline = br.readLine();

			while(currentline != null){
     			parser.lex(currentline, line);
     			line++;
     			currentline = br.readLine();
     		}

     		fr.close();
		 	br.close();

		 	parser.syntax_analyze();
		}catch(IOException e){
			e.printStackTrace();
		}

		for(Lexeme i : parser.getLexemes()){
			System.out.println(i.getRegex() + "     " + i.getlextype());
		}
		
		// for(Token i : parser.getTokens()){
		// 	System.out.println(i.regex.toString() + "       " + i.type);
		// }

	}


	public static void setRegex(Parser parser) {
		parser.addRegex("HAI", "Code Delimiter");
		parser.addRegex("KTHXBYE", "Code Delimiter");
		parser.addRegex("-?[0-9]+\\.[0-9]+", "Numbar Literal");
		parser.addRegex("-?[0-9]+", "Numbr Literal");
		parser.addRegex("\".+\"", "Yarn Literal");
		parser.addRegex("(WIN|FAIL)", "Troof Literal");
		parser.addRegex("(TROOF|NUMBR|NUMBAR|YARN|NOOB)", "Type Literal");
		parser.addRegex("BTW\\s.+", "Comments");
		parser.addRegex("OBTW\\s+.+\\s+TLDR", "Comments");
		// parser.addRegex("TLDR", "Comments");
		parser.addRegex("I\\sHAS\\sA", "Variable Declaration");
		parser.addRegex("ITZ", "Variable Assignment");
		parser.addRegex("R", "Assignment Operator");
		parser.addRegex("SUM\\sOF", "Arithmetic Operator");
		parser.addRegex("DIFF\\sOF", "Arithmetic Operator");
		parser.addRegex("PRODUKT\\sOF", "Arithmetic Operator");
		parser.addRegex("QUOSHUNT\\sOF","Arithmetic Operator");
		parser.addRegex("MOD\\sOF", "Arithmetic Operator");
		parser.addRegex("BIGGR\\sOF", "Arithmetic Operator");
		parser.addRegex("SMALLR\\sOF", "Arithmetic Operator");
		parser.addRegex("BOTH\\sOF", "Arithmetic Operator");
		parser.addRegex("EITHER\\sOF", "Boolean Operator");
		parser.addRegex("NOT", "Boolean Operator");
		parser.addRegex("ANY\\sOF", "Boolean Operator");
		parser.addRegex("ALL\\sOF", "Boolean Operator");
		parser.addRegex("BOTH\\sSAEM", "Comparison Operator");
		parser.addRegex("DIFFRINT", "Comparison Operator");
		parser.addRegex("SMOOSH", "Concatenation");
		parser.addRegex("MAEK", "Line Break");
		parser.addRegex("AN", "Keyword");
		parser.addRegex("IS\\sNOW\\sA", "Line Break");
		parser.addRegex("VISIBLE", "Output Keyword");
		parser.addRegex("GIMMEH", "Input Keyword");
		parser.addRegex("O\\sRLY\\?", "IF-THEN statement");
		parser.addRegex("YA\\sRLY", "IF-THEN statement");
		parser.addRegex("MEBBE", "IF-THEN statement");
		parser.addRegex("NO\\sWAI", "IF-THEN statement");
		parser.addRegex("OIC", "IF-THEN statement");
		parser.addRegex("WTF\\?", "SWITCH-CASE statement");
		parser.addRegex("OMG", "SWITCH-CASE statement");
		parser.addRegex("OMGWTF", "SWITCH-CASE statement");
		parser.addRegex("IM\\sIN\\sYR", "Loop");
		parser.addRegex("UPPIN", "increment");
		parser.addRegex("NERFIN", "decrement");
		parser.addRegex("YR", "Loop");
		parser.addRegex("TIL", "Loop");
		parser.addRegex("WILE", "Loop");
		parser.addRegex("IM\\sOUTTA\\sYR", "Loop");
		parser.addRegex("[a-zA-Z&&[^IR]][a-zA-Z0-9_]*", "Variable Identifier");
		parser.addRegex("[a-zA-Z&&[^I]](\\s?[A_Z])*", "Function Identifier");


	}
}
