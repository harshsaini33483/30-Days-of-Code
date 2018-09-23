import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		java.text.DecimalFormat dec = new java.text.DecimalFormat("#0.0000");
		int t=sc.nextInt();
		while(--t>=0)
		{
			int n=sc.nextInt();
			int f=sc.nextInt();
			++f;
			double array[]=new double[n];
			for(int i=0;i<n;i++)
			{
				int temp=sc.nextInt();
				double temp1=Math.PI*temp*temp;
				array[i]=temp1;
			}

			Arrays.sort(array);
			double low=0d;
			double high=array[array.length-1];
			double result=0;
			while(low<=high)
			{
				int index=0;
				double temp=array[0];
				int count=f;
				int counter=0;
				double mid=(low+high)/2;
						//		System.out.println(low+" low "+high+" high"+"  "+mid);

				if(mid<0d){break;}
				while(true)
				{
					
					if(temp-mid>=0)
					{	
						

						--count;
						temp=temp-mid;
					}
					else{
						++counter;
						if(counter==array.length)
						{
							break;
						}
						else
						{
							temp=array[counter];
						}
					}

					if(count==0 && mid>result)
					{
					//	System.out.println(mid+" mid");
						result=mid;
						break;
					}
				}
				if(count==0)
				{
					low=mid+.00001;
				}
				else 
				{
					high=mid-.000001;
				}
			}
			System.out.println(dec.format(result));

		}
	}
}