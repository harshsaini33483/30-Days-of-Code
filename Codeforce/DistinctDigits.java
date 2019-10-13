import java.util.*;
public class DistinctDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(BruteForce(n,k));
    }
    public static String BruteForce(int n,int k){
        String array[]=new String[k-n+1];
        int j=0;
        for(int i=n;i<=k;i++){
            array[j]=Integer.toString(i);
            ++j;
        }
        for(int i=0;i<array.length;i++){
            int count[]=new int[10];
            boolean ok=true;
            for( j=0;j<array[i].length();j++){
                if(count[array[i].charAt(j)-'0']>0){
                    ok=false;
                    break;
                }else{
                    ++count[array[i].charAt(j)-'0'];
                }
            }
            if(ok){
                return array[i];
            }
        }
        return "-1";
    }
}