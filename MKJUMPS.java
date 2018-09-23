import java.io.*;
import java.util.*;
class Solution{
	static int ans=0;
	static int positionx[]={2,-2,2,-2,1,-1,1,-1};
	static int positiony[]={1,1,-1,-1,2,2,-2,-2};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		int array[][]=new int[10][10];
	
		int n=sc.nextInt();
		while(n!=0)
		{
			++c;
			ans=0;
			for(int i=0;i<10;i++)
			{
				Arrays.fill(array[i],0);
			}
			int off=11,total=0;
			for(int i=0;i<n;i++)
			{
				int row=sc.nextInt();
				int col=sc.nextInt();
				total+=col;
				if(i==0){off=row;}
				for(int j=0;j<col;j++)
				{
					array[i][j+row]=1;
				}
			}
			array[0][off]=0;
			backTrack(0,off,1,array);
			if((total-ans)==1){
			System.out.println("Case "+c+", "+(total-ans)+" square can not be reached.");
			}
			else{
				System.out.println("Case "+c+", "+(total-ans)+" squares can not be reached.");
			}




			n=sc.nextInt();

		}
	}


	public static void backTrack(int x,int y,int count,int array[][])
	{
		ans=Math.max(ans,count);
		int c=ans;

		for(int i=0;i<8;i++)
		{
			int xpoi=x+positionx[i];
			int ypoi=y+positiony[i];
			if(xpoi>=0 && xpoi<10 && ypoi>=0 && ypoi<10 && array[xpoi][ypoi]==1)
			{
				//		System.out.println(ans);

				array[xpoi][ypoi]=0;
				backTrack(xpoi,ypoi,count+1,array);
				array[xpoi][ypoi]=1;
			}
		}
	}
}