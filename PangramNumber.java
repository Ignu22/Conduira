import java.util.*;
public class PangramNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		boolean value = Pangram(s);
		System.out.println(value);
	}
	public static boolean Pangram(String N){
	   
	    char[] arr =N.toCharArray();
	    
	    HashSet<Character> setnum = new HashSet<Character>();
	    for(char ch : arr){
	        setnum.add(ch);
	    }
	    if(setnum.size()==10)
	         return true;
	    else
	         return false;
	}
	
}