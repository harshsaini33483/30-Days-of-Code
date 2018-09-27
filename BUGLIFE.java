import java.io.*;
import java.util.*;
class Solution{
	static int color[]; 
	static boolean visited[];
	public static void main(String[] args)throws Exception {
		Reader sc=new Reader ();
		int t=sc.nextInt();
		int scenario=1;
		while(--t>=0)
		{
			int n=sc.nextInt();
			int edge=sc.nextInt();
			ArrayList<Integer>arr[]=new ArrayList[n+1];
			for(int i=0;i<=n;i++)
			{
				arr[i]=new ArrayList<Integer>();
			}
			for(int i=0;i<edge;i++)
			{
				int st=sc.nextInt();
				int en=sc.nextInt();
				arr[st].add(en);
				arr[en].add(st);

			}
			visited=new boolean[n+1];
			Arrays.fill(visited,false);
			color=new int[n+1];
			Arrays.fill(color,0);
			



			System.out.println("Scenario #"+scenario+":");
			boolean str=false;
			for(int i=1;i<=n;i++){if(!visited[i])str=dfsnoCycle(arr,n,i);
				if(str){break;}}
			++scenario;
			if(str)
			{System.out.println("Suspicious bugs found!");}
			else
			{System.out.println("No suspicious bugs found!");}
		}

	}
	public static boolean dfsnoCycle(ArrayList<Integer>arr[],int n,int k)
	{
		Stack <Integer>stack=new Stack<Integer>();
		boolean found=false;
		
		stack.push(k);
		if(color[k]==0){color[k]=1;}
		visited[k]=true;
		while(!stack.isEmpty())
		{
			int num=stack.pop();
			for(int i:arr[num])
			{

				if(!visited[i])
				{	
					stack.push(i);
					visited[i]=true;
					if(color[i]==color[num] && color[i]!=0)
					{
						color[num]=color[num]==1 ? 2:1;
					}
					else
					{
						color[i]=color[num]==1 ?2:1;
					}
				}
				else if(visited[i] &&color[num]==color[i])
				{
					found=true;
					break;
				}
			}
		}
		//System.out.println(found);

		return found;
}
	
	static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

}