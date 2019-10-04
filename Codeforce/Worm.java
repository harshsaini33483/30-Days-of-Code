import java.io.*;
import java.util.*;

public class Worm{
   static class Pile{
        int up;
        int down;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        Pile pileArr[]=new Pile[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            pileArr[i]=new Pile();
            if(i==0){
                pileArr[i].down=1;
                pileArr[i].up=arr[i];
            }else{
                pileArr[i].down=pileArr[i-1].up+1;
                pileArr[i].up=pileArr[i-1].up+arr[i];
            }
        }

        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int q=sc.nextInt();
            int low=0;
            int mid=0;
            int high=n;
            while(low<=high){
                mid=(low+high)/2;
                Pile tempPile=pileArr[mid];
                if(q>=tempPile.down && q<=tempPile.up){
                    break;
                }else if(q>tempPile.up){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            System.out.println(mid+1);
        }


    }

}