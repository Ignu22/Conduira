import java.util.*;
public class Hash1
{
	public static void main(String[] args) {
		HashSet<Integer> hash =new HashSet();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
		    hash.add(sc.nextInt());
		}
		System.out.println(hash);
		
	}
}