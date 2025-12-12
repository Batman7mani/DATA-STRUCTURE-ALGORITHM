import java.util.*;

public class NumShift{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        numshift(arr,d);

        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static void numshift(int[] arr,int d){
        int n=arr.length;
        int id=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=d){
                arr[id++]=arr[i];
            }
        }

        while(id<n){
            arr[id++]=d;
        }
    }
}