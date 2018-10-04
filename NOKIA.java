import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			int max=(((n+1)*(n+2))/2)-1;
			int min=middle(0,n+1);
		//	System.out.println(max+"  "+min);


			if(min>m)
			{
				System.out.println(-1);
			}
			else if(min<=m && max<m)
			{
				System.out.println(m-max);
			}
			else
			{
				System.out.println(0);
			}

			
		}
	}



	public static int middle(int low,int high)
	{
		int mid=(low+high)/2;
		if(mid==0)
		{
			return 0;
		}
		return (low+high)+middle(0,mid)+middle(0,high-mid);
	}




}