import java.io.*;
import java.util.*;
public class KefaandCompany{
    static class Friends{
        int respect;
        int money;
    }
    static class RespectSort implements Comparator<Friends>{
        public int compare(Friends a, Friends b){
            return a.money-b.money;
        }
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int diff=sc.nextInt();
        Friends friends[]=new Friends[n];
        for(int i=0;i<n;i++){
            friends[i]=new Friends();
            friends[i].money=sc.nextInt();
            friends[i].respect=sc.nextInt();
        }   

        Arrays.sort(friends,new RespectSort());
        int i=0,j=1;
        Long maxRespect=(long)friends[0].respect;
        Long tempRespect=maxRespect;
        while(i<n && j<n){
            if(friends[j].money-friends[i].money<diff){
                tempRespect=tempRespect+friends[j].respect;
                if(maxRespect<tempRespect){
                    maxRespect=tempRespect;
                }
                ++j;
            }else{
                tempRespect=tempRespect-friends[i].respect;
                ++i;
            }
        }
        System.out.println(maxRespect);
    }
}