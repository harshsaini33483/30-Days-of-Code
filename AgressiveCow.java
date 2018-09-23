import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(--t>=0){
		int n=sc.nextInt();
		int cow=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)	
		{
			array[i]=sc.nextInt();

		}

		Arrays.sort(array);
		int maxdist=0;
		int l=0,h=array[array.length-1];
		while(l<=h)
		{
			int mid=(l+h)/2;
			int distance=0;
			int count=cow-1;
			for(int i=1;i<n;i++)
			{

				distance+=array[i]-array[i-1];
				if(distance>=mid)
				{
					--count;
					distance=0;
					//System.out.print(i+" i ");

				}
			//	System.out.print(distance+" di ");
				if(count==0)
				{
					if(mid>maxdist)
					{
						maxdist=mid;
					}
					break;
				}

			}
		//	System.out.println(mid+" mid ");

			if(count==0)
			{
				
				l=mid+1;
			}
			else
			{
				h=mid-1;
			}

		//	System.out.println("\n"+l+" li "+h);
		}

		System.out.println(maxdist);
	}
}}