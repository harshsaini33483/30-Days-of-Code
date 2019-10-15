import java.util.*;
public class Shooting{
    static class ShotIndex{
        int index;
        int number;
    }

    static class NumberSort implements Comparator<ShotIndex>{
        public int compare(ShotIndex a, ShotIndex b){
            return a.number-b.number;
        }
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ShotIndex array[]=new ShotIndex[n];
        for(int i=0;i<n;i++){
            array[i]=new ShotIndex();
            int temp=sc.nextInt();
            array[i].number=temp;
            array[i].index=i;
        }

        Arrays.sort(array,new NumberSort());
        int sum=0,in=0;
        for(int i=n-1;i>=0;i--){
            ShotIndex shotIndex=array[i];
            sum+=((shotIndex.number*in)+1);
            ++in;
        }
        System.out.println(sum);
        for(int i=n-1;i>=0;i--){
            System.out.print((array[i].index+1)+" ");
        }
    }
}