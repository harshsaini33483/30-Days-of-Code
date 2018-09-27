import java.io.*;
import java.util.*;
class Solution{
	static Long mod=1000000007L;
	public static void main(String[] args) {
		int array[]=new int[50001];
		Arrays.fill(array,0);
		array[0]=1;array[1]=1;
		Scanner sc=new Scanner(System.in);
		for(int i=2;i<Math.sqrt(50000);i++)
		{
			if(array[i]==0)
			{
				for(int j=2*i;j<array.length;j+=i)
				{
					array[j]=1;
				}
			}
		}
		int t=sc.nextInt();
		while(--t>=0)
		{
			Long count=1L;int i=2;
			int n=sc.nextInt();
			if(n==1 ||n==0)
			{
				System.out.println(1);
			}else{
			while(i<=n)
			{
				int num=n;
				int cost=0;
				if(array[i]==0)
				{
					while(num>0)
					{
						num=num/i;
						cost+=num;

					}
					//aSystem.out.println(count+"   "+cost);

					count=((count%mod)*((cost+1)%mod))%mod;
				}
				++i;
			}
			System.out.println(count);
		}
	}


	}
}