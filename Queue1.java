import java.util.*;
public class Queue1
{
	public static void main(String[] args) {
		Queue<Integer> qt =new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
		    qt.add(sc.nextInt());
		}
		System.out.println(qt);
		System.out.println(qt.remove());
		System.out.println(qt.remove());
		System.out.println(qt);
		
	}
}