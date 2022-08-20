import java.util.*;
public class Array
{
	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
		    arr.add(sc.nextInt());
		}
		System.out.println(arr);
		
	}
}