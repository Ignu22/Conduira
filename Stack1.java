import java.util.*;
public class Stack1
{
	public static void main(String[] args) {
		Stack<Integer> st =new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
		    st.push(sc.nextInt());
		}
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st);
		
	}
}