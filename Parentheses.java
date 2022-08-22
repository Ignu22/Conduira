import java.util.*;
public class Parentheses
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		long value = score(s);
		System.out.println(value);
	}
	public static int score(String N){
	    
	    Stack<Integer> st = new Stack<>();
	    Stack<Integer> st1 = new Stack<>();
	    for(int i=0;i<N.length();i++){
	        char ch=N.charAt(i);
	        if(ch=='('){
	            st.push(-1);
	        }else{
	            st1.push(1);
	        }
	    }
	    if(st.size()==st1.size()){
	        return st1.size();
	    }else{
	        return -1;
	    }
	}
	
}