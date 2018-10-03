import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			int array[]=new int[n];
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			Stack<Integer>stack=new Stack<Integer>();
			ArrayList<Integer>arr=new ArrayList<Integer>();
			stack.push(array[0]);
			for(int i=1;i<n;i++)
			{
				if(array[i]<stack.peek())
				{
					stack.push(array[i]);
				}
				else if(array[i]>=stack.peek())
				{
					while(!stack.isEmpty() && array[i]>=stack.peek()){
					arr.add(stack.pop());}
					stack.push(array[i]);
				}
			}
			while(!stack.isEmpty())
			{
				arr.add(stack.pop());
			}
			boolean ok=true;
			
			for(int i=1;i<arr.size();i++)
			{
				if(arr.get(i)-arr.get(i-1)!=1)
				{
					ok=false;
					break;
				}
			}
			if(ok)
			{
				System.out.println("yes");

			}
			else
			{
				System.out.println("no");
			}
			n=sc.nextInt();
		}
	}
}