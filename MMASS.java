import java.io.*;
import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<String>stack=new Stack<String>();
		
		for(int i=0;i<str.length();i++)
		{

			if(str.charAt(i)=='(')
			{
				stack.push("(");

			}
			else if(str.charAt(i)=='C' ||str.charAt(i)=='H' ||str.charAt(i)=='O')
			{
				if(str.charAt(i)=='C')
				{
					stack.push("12");
				}
				else if(str.charAt(i)=='H')
				{
					stack.push("1");
				}
				else
				{
					stack.push("16");
				}
			}
			else if(str.charAt(i)>'1' && str.charAt(i)<='9')
			{
				stack.push(Integer.toString(Integer.parseInt(stack.pop())*Integer.parseInt(""+str.charAt(i))));
			}
			else
			{
						//	System.out.println(stack+"k");

				int temp=0;
				while(!stack.isEmpty() && !stack.peek().equals("("))
				{
					temp+=Integer.parseInt(stack.pop());
				}

				stack.pop();
				stack.push(Integer.toString(temp));

			}
		}

		int temp=0;
		while(!stack.isEmpty())
		{
			temp+=Integer.parseInt(stack.pop());
		}
		System.out.println(temp);
	}
}