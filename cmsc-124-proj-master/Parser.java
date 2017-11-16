package src;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import src.Token;
import src.Lexeme;
import src.Analyzer;
/*
**************************************************************************************
guide: http://cogitolearning.co.uk/2013/04/writing-a-parser-in-java-the-tokenizer/

**************************************************************************************
*/
public class Parser {

	private ArrayList<Token> tokens;   //linked list for the tokens in lolcode
	private ArrayList<Lexeme> lexemes;  //linked list for the user input lexemes

	public Parser(){
		this.tokens = new ArrayList<Token>();
		this.lexemes = new ArrayList<Lexeme>();
	}

	public void addRegex(String regex, String tokentype){
		tokens.add(new Token(Pattern.compile("^(" + regex + ")"), tokentype));  //saving the regex as a token
	}


	public void lex(String str, int line) {
		String s = str.trim();
		// lexemes.clear();
		Boolean flag = false;
		while(!s.equals("")){ //habang di pa siya nag eend
			for(Token i : tokens){
				Matcher m = i.regex.matcher(s);
				if(m.find()){
					flag = true;
					String asd = m.group().trim();
          			s = m.replaceFirst("").trim();
					lexemes.add(new Lexeme(asd, i.type));
					break;
				}
			}
			if(flag == false){
				System.out.println("Syntax error: --- "+ "Line:" + line + ": " + s + ":" + "unknown syntax");
				//this.syntax_analyze();
				System.exit(0); //terminates the program pag nakakita ng syntax error
			
			}
		}

	}

	// public void syntax_analyze(){
	// 	/***************************************************************
	// 	** 			checking if the code delimiters are complete		
	// 	****************************************************************/
	// 	Boolean flag = false;
	// 	int count = 0;
	// 	for(int i = 0; i < this.lexemes.size(); i++){
	// 		if(lexemes.get(i).getlextype().equals("Code Delimiter") && lexemes.get(i).lexToString().equals("HAI")){
	// 			for(int j = i+1; j < this.lexemes.size(); j++){
	// 				if(lexemes.get(j).getlextype().equals("Code Delimiter")){ 
						
	// 					//&& lexemes.get(j).lexToString().equals("KTHXBYE")
	// 					if(lexemes.get(j).lexToString().equals("KTHXBYE")){
	// 						//System.out.println(lexemes.get(j).lexToString());
	// 						flag = true;
	// 						count = j;	
	// 					}else{
	// 						System.out.println("Syntax error: --- invalid Code Delimiter");
	// 						System.exit(0);
	// 					}
	// 				}
	// 			}
	// 			if(flag == true){
	// 				//check kung may mga statements pa after kthxbye
	// 				for(int k = count+1; k < this.lexemes.size(); k++){
	// 					if(!lexemes.get(k).getlextype().equals("Comments")){
	// 						System.out.println("Syntax error: --- One or multiple statements found after Code Delimiter");
	// 						System.exit(0);
	// 						break;
	// 					}
	// 				}

	// 			}else{ //kapag walang kthxbye or hai sa beginning ng file
	// 				System.out.println("Syntax error: --- Code Delimiter not found");
	// 				System.exit(0); //terminates the program pag nakakita ng syntax error
	// 			}
	// 		}else {
	// 			System.out.println("Syntax error: --- Code Delimiter Missing");
	// 				System.exit(0);
	// 		}
	// 	}
	// 	//******************************************************************
	// 	//******************************************************************
	// 	if (flag == true){

	// 	}	
	// }


	public ArrayList<Lexeme> getLexemes(){
		return lexemes;
	}

	
}
