import java.util.*;

public class Kadane {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=kadane(arr);
        System.out.println(l);
        sc.close();
    }
    public static int kadane(int[] arr){
        int cur=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];

            max=Math.max(max,cur);

            if(cur<0) cur=0;
        }
        return max;
    }
}