import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n+1];
		array[0]=1;
		int a=0,b=0,c=0,mi=0,uglya=2,uglyb=3,uglyc=5;
		for(int i=1;i<=n;i++)
		{
			mi=Math.min(uglya,Math.min(uglyb,uglyc));
			array[i]=mi;
			if(mi==uglya)
				{++a;uglya=array[a]*2;}
			if(mi==uglyb)
				{++b;uglyb=array[b]*3;}
			
			if(mi==uglyc)
				{++c;uglyc=array[c]*5;}
			
			
		}
		
			System.out.println(array[n-1]);
	}
}