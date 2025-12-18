import java.util.*;

public class Majority {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=BMV(arr);
        System.out.println(a);
        sc.close();
    }
    public static int BMV(int[] arr){
        int cnt=0,ele=0; //intialize the candidate key
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                cnt=1;
                ele=arr[i];
            }
            else if(arr[i]==ele) cnt++;
            else cnt--; //Get the correct Candidate key
        }

        int cnt1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                cnt1++;//Verification of the Candidate key
            }
        }
        if(cnt1>(arr.length/2)) return ele;
        return -1;//Default return
    }
}