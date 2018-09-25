import java.util.*;
import java.math.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0)
		{
			String first=sc.next();
			String second=sc.next();
			int l=second.length();
			int x=Integer.parseInt(first.charAt(first.length()-2)+""+first.charAt(first.length()-1))%10;
			int y=Integer.parseInt(second.charAt(second.length()-2)+""+second.charAt(second.length()-1))%10;
			System.out.println(Math.pow(x,y)%10);
		}
	}
}