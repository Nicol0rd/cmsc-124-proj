package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Token {
	public Pattern regex;
	public String type;

	public Token(Pattern regex, String tokentype) {
		this.regex = regex;
		this.type = tokentype;
	}
}