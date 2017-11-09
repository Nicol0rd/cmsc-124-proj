package src;

public class Lexeme{
	private String regex;
	private String lextype;

	public Lexeme(String regex, String lextype){
		this.regex = regex;
		this.lextype = lextype;
	}

	public String getRegex(){
		return this.regex;
	}

	public String getlextype(){
		return this.lextype;
	}
}