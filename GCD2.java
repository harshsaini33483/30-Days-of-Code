import java.io.*;
import java.util.*;
import java.math.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		BigInteger b1,b2,b3;
		while(--t>=0)
		{
			String st1=sc.next();
			String st2=sc.next();
			b1=new BigInteger(st1);
			b2=new BigInteger(st2);
			b3=b1.gcd(b2);
			System.out.println(b3);
		}
		
	}
}