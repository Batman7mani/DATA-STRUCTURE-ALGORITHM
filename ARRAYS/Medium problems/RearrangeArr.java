import java.util.*;

public class RearrangeArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=rearrange(arr);
        for(int i:res) {
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static int[] rearrange(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        int pos=0,neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                res[neg]=arr[i];
                neg+=2;
            }
            else{
                res[pos]=arr[i];
                pos+=2;
            }
        }
        return res;
    }
}