import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "hello", "world", "program", "or", "examples");
		long num = list.stream().filter(x->x.length()>3).count();
		System.out.println(num);
	}
}