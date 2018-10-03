import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.*;
class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
		BigInteger b1;
		BigInteger b2=new BigInteger("1");
		BigInteger b3=new BigInteger("2");
		
		String str=in.readLine();
		while(str!=(null))
		{
			if(str.equals("1"))
			{
				System.out.println(1);
			}
			else{
			b1=new BigInteger(str);
			System.out.println(b3.multiply(b1.subtract(b2)));
		}
			str=in.readLine();
		
	}
	}
}