import java.io.*;
import java.util.*;
public class  KillEmAll{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int n=sc.nextInt();
            Long k=sc.nextLong();
            ArrayList<Integer> array=new ArrayList<>();
            HashSet<Integer>hm=new HashSet<>();
            for(int j=0;j<n;j++){
                int temp=sc.nextInt();
                if(!hm.contains(temp)){
                    hm.add(temp);
                    array.add(temp);
                }
            }
            if(array.size()==1){
                out.println(1);
                continue;   
            }
            Collections.sort(array);
    
            Long freq=0L;
            int count=0;
           for(int j=array.size()-1;j>=0;j--){
                if(array.get(j)-freq>0){
                    freq+=k;
                    ++count;
                }else{
                    break;
                }
            }
            out.println(count);
        }
        out.flush();
    	out.close();
    }
}