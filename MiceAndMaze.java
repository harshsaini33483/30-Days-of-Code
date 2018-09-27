import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		ArrayList<Structure>array[]=new ArrayList[n+1];
		for(int i=0;i<=n;i++)
		{
			array[i]=new ArrayList<Structure>();
		}

		int start=sc.nextInt();
		int time=sc.nextInt();
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			int s=sc.nextInt();
			int e=sc.nextInt();
			int w=sc.nextInt();
			Structure st=new Structure();
			st.weight=w;
			st.end=s;
			array[e].add(st);

		}
		System.out.println(bfs(array,start,time));

		

	}


	public static int bfs(ArrayList<Structure>arr[],int start,int time)
	{
		int size=arr.length;
		int weig[]=new int[size+1];
		int parent[]=new int[size+1];
		Arrays.fill(parent,0);
		Arrays.fill(weig,Integer.MAX_VALUE);
		boolean visited[]=new boolean[size+1];
		Arrays.fill(visited,false);
		LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(start);
		parent[start]=-1;
		weig[start]=0;
		while(!ll.isEmpty())
		{

			int num=ll.removeFirst();
			for(Structure i:arr[num])
			{
				int end=i.end;
				int weigh=i.weight;
//						System.out.println(num+" an  "+end+" "+"  "+parent[end]+"   "+" "+weig[end]+" "+(weig[num]+weigh));

				if(parent[end]!=parent[num] || weigh+weig[num]<weig[end])
				{

					if(weig[end]>weig[num]+weigh)
					{

						weig[end]=weig[num]+weigh;
						parent[end]=parent[num];
					}


					ll.addLast(end);
				}


			}
		}

		int count=1;
    /*     for(int i=1;i<=size;i++)
		{
		System.out.println(i+"   "+weig[i]);
			

		}
	*/	Arrays.sort(weig,1,size);

		for(int i=1;i<=size;i++)
		{
			//System.out.println(i+"   "+weig[i]);
			if(time>=weig[i] && weig[i]!=0)
			{
				++count;
			}

		}

		return count;
	}

}


class Structure{
		int end;
		int weight;
	}