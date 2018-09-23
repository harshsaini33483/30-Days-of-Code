import java.util.*;
class Solution{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int coin=sc.nextInt();
		int array[]=new int[coin];
		for(int i=0;i<coin;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println(solveProblem(array,n));
	}
	public static long solveProblem(int array[],int n)
	{
		int result=0;
		int arr[]=new int[n+1];
		Arrays.fill(arr,0);
		if(n==0)
		{
			return 1;

		}

		else{
			arr[0]=1;
			for(int i=0;i<array.length;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(array[i]<=j)
					{
						arr[j]=arr[j]+arr[j-array[i]];
					}
				}
				
		}
		result=arr[n];
		return result;
			}
	}
}