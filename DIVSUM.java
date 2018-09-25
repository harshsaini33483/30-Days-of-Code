import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0)
		{
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println(0);
			}
			else
			{
				Long count=1L;
				int j=0;
				int sqr=(int)Math.ceil(Math.sqrt(n));
				if(sqr*sqr==n)
				{
					count+=sqr;
					j=sqr;
				//	System.out.println(count);
					
				}
				for(int i=2;i<sqr;i++)
				{
					//System.out.println(count+"  "+i);
					 if(n%i==0 && j!=i)
					{
						count+=n/i;
						count+=i;
					}
				}

				System.out.println(count);
			}
		}
	}
}