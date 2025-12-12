import java.util.*;

public class Largest_arr {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int g=largest(arr,n);
        System.out.println(g);
        sc.close();
    }
    static int largest(int[] arr,int n){
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        return l;
    }
}
