
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
		Parser parser = new Parser();

		setRegex(parser);

		try{
			System.out.println("Enter statement: ");
			Scanner sc = new Scanner(System.in);
     		String s = sc.nextLine();
     		parser.lex(s);

		}catch(Exception e){
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
		parser.addRegex("[a-zA-Z][a-zA-Z0-9_]*", "Identifier");
	}
}