import java.util.*;
class Solution{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int count=0;
			for(int i=0;i<n;i++)
			{
				int temp=sc.nextInt();
				if((temp+k)%7==0)
				{
					++count;
				}
			}
			System.out.println(count);
		}
	
	}
}