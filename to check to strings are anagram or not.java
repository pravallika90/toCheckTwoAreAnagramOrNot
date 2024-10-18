import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    char[] c1=s1.toLowerCase().toCharArray();
	    char[] c2=s2.toLowerCase().toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    System.out.println(c1);
	    System.out.println(c2);
	    if(Arrays.equals(c1,c2))
	    System.out.println("given two strings are anagram");
	}
}