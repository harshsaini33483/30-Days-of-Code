import java.io.*;
import java.util.*;
//2 1 3 4 6 5
//3 1 2 4
public class SortTheArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int newarray[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            newarray[i]=array[i];
        }
        boolean ok=true;
        boolean done=false;
        int start=0;
        int end=0;
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(newarray);
        for(int i=0;i<n;i++){
            if(array[i]!=newarray[i] && !done){
                start=i;
                for(int j=i;j<n;j++){
                    if(array[j]==newarray[i]){
                        end=j;
                        int inc=0;
                        for(int k=j;k>=i && k>=0;k--){
                            if(newarray[i+inc]!=array[k]){
                                ok=false;
                                break;
                            }else{
                                arr.add(array[k]);
                            }
                            ++inc;
                        }
                        j=n;
                    }
                    done=true;
                }
                for(int j=0;j<arr.size();j++){
                    array[j+start]=arr.get(j);
                }
            }else if(array[i]!=newarray[i] && done){
                ok=false;
                break;
            }
        }
        if(ok){
            System.out.println("yes");
            if(!done){
                System.out.println(1+" "+1);
            }else{
                System.out.println((start+1)+" "+(end+1));
            }
        }else{
            System.out.println("no");
        }
    }
}