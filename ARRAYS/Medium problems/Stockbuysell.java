import java.util.*;

public class Stockbuysell {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int profit=stockbuysell(arr);
        System.out.println(profit);
        sc.close();
    }
    public static int stockbuysell(int[] arr){
        if(arr.length==0) return 0;

        int min=Integer.MAX_VALUE,max=0;

        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            max=Math.max(max,arr[i]-min);
        }
        return max;
    }
}