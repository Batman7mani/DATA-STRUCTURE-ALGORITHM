import java.util.*;

public class Insertion_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertion(arr);
        sc.close();
    }
    static void insertion(int[] arr){
        int l=arr.length;
        for(int i=1;i<l;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
