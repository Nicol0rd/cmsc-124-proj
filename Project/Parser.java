package src;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import src.Token;
import src.Lexeme;
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


	public void lex(String str) {
		String s = str.trim();
		lexemes.clear();
		while(!s.equals("")){ //habang di pa siya nag eend
			for(Token i : tokens){
				Matcher m = i.regex.matcher(s);
				if(m.find()){
					String asd = m.group().trim();
          			s = m.replaceFirst("").trim();
					lexemes.add(new Lexeme(asd, i.type));
					break;
				}

			}
		}
	}

	public ArrayList<Lexeme> getLexemes(){
		return lexemes;
	}

	
}