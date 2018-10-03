import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Long d=sc.nextLong();
		Long array[]=new Long[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextLong();
		}
		Arrays.sort(array);
		Long count=0L;
		for(int i=1;i<n;i++)
		{
			if(array[i]-array[i-1]<=d)
			{
				++count;
				++i;
			}
		}
		System.out.println(count);
	}
}