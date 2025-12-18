import java.util.*;

public class KadaneCircular {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=kadanecs(arr);
        System.out.println(l);
        sc.close();
    }
    public static int kadanecs(int[] arr){
        int tot=0,curmax=0,curmin=0;
        int max=arr[0],min=arr[0];

        for(int i:arr){
            tot+=i;

            curmax=Math.max(i,curmax+i);
            max=Math.max(max,curmax);

            curmin=Math.min(i,curmin+i);
            min=Math.min(min,curmin);

        }
        if(max<0){
            return max;
        }
        return Math.max(max,tot-min);
    }
}
