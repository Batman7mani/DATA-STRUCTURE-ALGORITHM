import java.util.*;

public class Selection_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selection(arr);
        sc.close();
    }
    static void selection(int[] arr){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<l;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}