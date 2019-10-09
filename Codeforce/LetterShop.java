import java.io.*;
import java.util.*;
public class LetterShop{
    static class NumberStore{
        HashMap<Integer,Integer>hMap;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        NumberStore numberStore[]=new NumberStore[26];
        for(int i=0;i<26;i++){
            numberStore[i]=new NumberStore();
        }
        int ar[]=new int[26];
        Arrays.fill(ar,0);
        for(int i=0;i<n;i++){
           if(numberStore[str.charAt(i)-97].hMap==null){
            numberStore[str.charAt(i)-97].hMap=new HashMap<>();
            ++ar[str.charAt(i)-97];
            numberStore[str.charAt(i)-97].hMap.put(ar[str.charAt(i)-97],i);
           }else{
               ++ar[str.charAt(i)-97];
               numberStore[str.charAt(i)-97].hMap.put(ar[str.charAt(i)-97],i);
           }

        }

        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String findString=sc.next();
            int findLen=findString.length();
            int arr[]=new int[26];
            Arrays.fill(arr,0);
            for(int j=0;j<findString.length();j++){
                ++arr[findString.charAt(j)-97];
            }
            int max=0;
            for(int j=0;j<26;j++){
                if(arr[j]!=0){
                    max=Math.max(max,numberStore[j].hMap.get(arr[j]));
                }
            }
            System.out.println(max+1);
        }
    }
}