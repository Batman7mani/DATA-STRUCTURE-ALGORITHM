import java.util.*;

public class NextPermutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        permutation(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
    public static void permutation(int[] arr){
        int idx=-1;
        //Find the Breaking Point
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }

        if(idx==-1){
            reverse(arr,0,arr.length-1);
            return;
        }

        for(int i=arr.length-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                swap(arr,i,idx);
                break;
            }
        }
        reverse(arr,idx+1,arr.length-1);
    }
    public static void reverse(int[] arr,int s,int e){
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}