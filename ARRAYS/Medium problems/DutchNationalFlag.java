import java.util.*;

public class DutchNationalFlag {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        dnf(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void dnf(int[] arr){
        int l=0,m=0,h=arr.length;
        while(m<h){
            if(arr[m]==0){
                swap(arr,l,m);
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else{
                swap(arr,h,m);
                h--;
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}