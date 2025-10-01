import java.util.*;

public class Bubble_sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr);
        sc.close();
    }
    static void bubble(int[] arr){
        int l=arr.length;
        boolean swap;
        for(int i=0;i<l-1;i++){
            swap=false;
            for(int j=0;j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap) break;
        }
        for(int i=0;i<l;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}