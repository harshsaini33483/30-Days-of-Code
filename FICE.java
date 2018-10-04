import java.io.*;
import java.util.*;
class Solution{
	static int co,opti[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0)
		{
			int n=sc.nextInt();
			int mod=sc.nextInt();
			int array[]=new int[n/2];
			opti=new int[n+1];
			Arrays.fill(opti,-1); 
			int l=-1;
			for(int i=0;i<n/2;i++)
			{
				array[i]=l+2;
				l=l+2;
			}
			Long count=0L;

			for(int i=0;i<array.length;i++)
			{
				co=0;
				count=((count%mod)+(fibonaci(array,array[i],n)%mod))%mod;
				//System.out.println(count);
			}
			System.out.println((count*2)%mod);

		}
	}



	static public int fibonaci(int array[],int s,int num)
	{
		int count=0;
		if(s==num)
		{
			++co;
			return 0;
		}
		if(opti[s]!=-1)
		{
			return opti[s];
		}
		for(int i=0;i<array.length;i++)
		{
			if(s+array[i]<=num)
			{
				fibonaci(array,s+array[i],num);
			}
		}
	
		return co;
	}
}