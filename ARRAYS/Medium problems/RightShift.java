import java.util.*;

public class RightShift{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        d=d%n;
        reverse(arr,d,n-1);
        reverse(arr,0,d-1);
        reverse(arr,0,n-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static void reverse(int[] arr,int st,int en){
        while(st<en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
    }
}