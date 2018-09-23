import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int coin=sc.nextInt();
			int combo[]=new int[coin];
			for(int j=0;j<coin;j++)
			{
				combo[j]=sc.nextInt();
			}
			System.out.println(solveProblem(combo,n,0));
		}
	}

	public static int solveProblem(int combo[],int coin,int sum)
	{
		if(sum==coin)
		{
			//System.out.println(sum);
			return 1;

		}
		else if(sum>coin)
		{
			return 0;
		}
		int combined=0;
		for(int i=0;i<combo.length;i++)
		{
			combined+=solveProblem(combo,coin,combo[i]+sum);
		}
		return combined;
	}
}