import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		int total[]=new int[n+1];
		total[0]=0;
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			total[i+1]=array[i]+total[i];
		}
		int t=sc.nextInt();
		Arrays.sort(array);
		for(int i=0;i<n;i++)
		{
			total[i+1]=array[i]+total[i];
		}
		
		while(--t>=0)
		{int power=sc.nextInt();
		int index=binarySearch(power,array);
		
			System.out.println(index+1+" "+total[index+1]);	
		
		
	}
}


	public static int binarySearch(int power,int array[])
	{
		int l=0,r=array.length;
		int mid=0;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(mid>=array.length)
			{
				return mid-1;
			}
			else if(array[mid]==power )
			{
				int result=mid;
				l=mid+1;
				while(l<=r)
				{
					mid=(l+r)/2;
					if(mid>=array.length)
					{
						return result;
					}
					else if(array[mid]==power)
					{
						result=mid;
						l=mid+1;
					}
					else
						{break;}
					

				}
				return result;
			}
			else if(array[mid]<power)
			{
				l=mid+1;

			}
			else if(array[mid]>power)
			{
				r=mid-1;
			}
		}
		return mid;	
	}
}