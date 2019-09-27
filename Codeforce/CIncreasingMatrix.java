import java.io.*;
import java.util.*;
public class CIncreasingMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int array[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=sc.nextInt();
            }}
        System.out.println(maxSum(array,row,column));
       
    }
    public static int maxSum(int array[][],int row,int column){
        int sum=0;
        for(int i=row-1;i>=0;i--){
            for(int j=column-1;j>=0;j--){
                if(array[i][j]==0){
                    if(i!=row-1 && j!=column-1){
                        array[i][j]=Math.min(array[i][j+1],array[i+1][j])-1;
                    }
                    else if(i==row-1 && j!=column-1){
                        array[i][j]=array[i][j+1]-1;
                    }
                    else if(i!=row-1 && j==column-1){
                        array[i][j]=array[i+1][j]-1;
                    }
                }
                sum+=array[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i!=0 && array[i-1][j]>=array[i][j]){
                    return -1;
                }
                if(j!=0 && array[i][j-1]>=array[i][j]){
                    return -1;
                }
            }
        }
        return sum;
    }
}