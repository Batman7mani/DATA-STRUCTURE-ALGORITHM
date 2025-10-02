import java.util.*;

public class Quick_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quick(arr,0,n-1);

        for(int i:arr){
            System.out.printf("%d ",i);
        }
        sc.close();
    }
    static void quick(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quick(arr,low,pi-1);
            quick(arr,pi+1,high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }
}