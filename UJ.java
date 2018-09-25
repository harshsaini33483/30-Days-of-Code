import java.util.*;
import java.math.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{	int n=sc.nextInt();
			int x=sc.nextInt();
			if(n==0 && x==0)
			{break;}
			BigInteger b1=new BigInteger(String.valueOf(n));
			System.out.println(b1.pow(x));
		}
	}
}