import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            String q=sc.next();
            int a[]=new int[27];
            int b[]=new int[27];
            Arrays.fill(a,0);
            Arrays.fill(b,0);
            for(int j=0;j<n;j++){
                ++a[s.charAt(j)-97];
                ++b[q.charAt(j)-97];
            }
            boolean ok=true;
            for(int j=0;j<26;j++){
                if(a[j]!=b[j]){
                    ok=false;
                    break;           
                }
            }
            if(!ok){System.out.println(-1);}
            else{System.out.println(resultComing(n,s,q));}    
        }
    }

    public static int resultComing(int n,String s,String q){
      int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            int k=i;
            for(int j=0;j<n;j++){
                if(k<n && s.charAt(j)==q.charAt(k)){++k;++count;}
                max=Math.max(max,count);
            }
        
        }
        return n-max;
    }

}
