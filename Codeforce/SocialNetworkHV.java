import java.io.*;
import java.util.*;
public class SocialNetworkEV{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        Queue<Integer>list=new LinkedList<>();

        HashSet<Integer> hm=new HashSet<>();
        
        for(int i=0;i<n;i++){
        
            int temp=sc.nextInt();
        
            if(!hm.contains(temp)){
                hm.add(temp);
                list.add(temp);
                if(list.size()>k){
                   
                    hm.remove( list.poll());
                }
            }
        }

        out.println(list.size());
        int ar[]=new int[list.size()];
        int j=0;
        while(list.size()>0){
            ar[j]=list.poll();
            ++j;
        }
        for(int i=ar.length-1;i>=0;i--){
            out.print(ar[i]+" ");
        }
        out.close();
        outputStream.close();
    }
}