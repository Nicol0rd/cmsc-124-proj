package src;
import java.util.*;
import java.util.ArrayList;
import src.Token;
import src.Parser;
import src.Lexeme;




public class Analyzer{
	private boolean validState;
	private ArrayList<Lexeme> lexlist;
	private static int current = 0;			//ipapasa sa getNext() para malaman yung susunod na lexeme

	public Analyzer(ArrayList<Lexeme> lexlist){
		this.lexlist = lexlist;
		this.validState = false;
	}


	public boolean analyze(){
		Boolean flag = false;
		for(int i = 0; i < this.lexlist.size(); i++){
			if(lexlist.get(i).getlextype().equals("Code Delimiter") && lexlist.get(i).lexToString().equals("HAI")){
				
				current = i;
				System.out.println("HAI FOUND");
				break;
			}else if(lexlist.get(i).getlextype().equals("Comments")){
				/*
					kapag comments lang ang nababasa nya before HAI, continue lang
				*/
				continue;			
			}else{
				/*
					kapag di nya nahanap yung HAI
				*/
				System.out.println("Syntax error: --- HAI not found");
				System.exit(0);
			}
		}

		/*
			nakahanap na siya dito ng HAI
		*/
		flag = getNext(lexlist.get(++current), flag);

		if(flag){
			return true;
		}else{
			return false; // false if may syntax error
		}


	}

	boolean getNext(Lexeme lexeme, boolean flag){
		// System.out.println("Pumasok sa HAI");
		System.out.println(current);
		// boolean flag = flag;
		int adder = 0;
		if(lexeme.getlextype().equals("Code Delimiter")){	
			System.out.println("napasok dito");
			if(lexeme.getRegex().equals("KTHXBYE")){
				System.out.println("napasok dito ulit");
				flag = true;
				System.out.println(flag);
				return flag;
			}else if (lexeme.getRegex().equals("HAI")){
				System.out.println("Syntax error: --- Duplicate HAI");
				System.exit(0);
			}	
		}else if (lexeme.getlextype().equals("Comments")){
			System.out.println("Comment found");
			return getNext(lexlist.get(++current), flag);

		}else if (lexeme.getlextype().equals("Variable Declaration")){			// I HAS A
			int temp = current;
			if(lexlist.get(++temp).getlextype().equals("Variable Identifier")){ // I HAS A var
				current = temp;
				System.out.println("pumasok dito sa varident");
				if(lexlist.get(++temp).getlextype().equals("Variable Assignment")){		// kung may I HAS A var ITZ
					System.out.println("pumasok dito sa varident assignment");
					System.out.println("temp   "+temp);
					
					current = temp;
					current--;
					System.out.println("Current   "+current);
					if(lexlist.get(++temp).getlextype().equals("Numbar Literal")){ //I HAS A var ITZ <numbar>
						current = temp;
						System.out.println("Numbar");
						return getNext(lexlist.get(++current), flag);
					}else if(lexlist.get(temp++).getlextype().equals("Numbr Literal")){ // I HAS A var ITZ <numbr>
						current = temp;
						System.out.println("Numbr");
						return getNext(lexlist.get(current), flag);
						/*
							okay na yung numbr at numbar, di na kailangan galawin
						*/
					// }else if(lexlist.get(current).getlextype().equals("Yarn Literal")){ 				//YARN LITERAL WIP
					// 	// current++;
					// 	temp = current;
					// 	System.out.println("Yarn");
					// 	return getNext(lexlist.get(++current), flag);
					// }else if(lexlist.get(temp).getlextype().equals("Troof Literal")){
					// 	current = temp;
					// 	System.out.println("Troof");
					// 	return getNext(lexlist.get(current), flag);
					// }
				}else{
					// if(!(lexlist.get(++temp).getlextype().equals("Code Delimiter") || !(lexlist.get(++temp).getlextype().equals("Comments")))){
					// 	System.out.println("Syntax error --- wrong shit");
					// 	System.exit(0);
					// }
					// System.out.println("4.02");
					// System.out.println(lexlist.get(++current).getlextype());
					return getNext(lexlist.get(++current), flag);
				}
			}
		}
		System.out.println(flag);
		return flag;

		// else if (lexeme.getlextype() == "Numbar Literal"){}
		// else if (lexeme.getlextype() == "Numbar Literal"){}
		// else if (lexeme.getlextype() == "Numbar Literal"){}
		// else if (lexeme.getlextype() == "Numbar Literal"){}
	}
}