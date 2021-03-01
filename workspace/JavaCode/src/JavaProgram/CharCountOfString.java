package JavaProgram;

public class CharCountOfString {

	public static void main(String[] args) {
		//3.How will you display the character count in a string” 
		//Steve Jobs” by ignoring space in between?
		String s="Steve Jobs";
	String s1[]=s.split(" ");
	System.out.println(s1.length);
	System.out.println(s1[0].length()+s1[1].length());


	}

}
