import java.util.*;
public class SubStringProblem
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int value = longeststring(s);
		System.out.println(value);
	}
	public static int longeststring(String N){
	    
	    HashMap<Character, Integer> num = new HashMap<>();
	    int maxlen =0;
	    int start=0;
	    for(int i=0;i<N.length();i++){
	        if(num.containsKey(N.charAt(i))){
	            start= Math.max(start,num.get(N.charAt(i))+1);
	        }
	        num.put(N.charAt(i),i);
	        maxlen= Math.max(maxlen,i-start +1);
	    }
	    return maxlen;
	}
	
}