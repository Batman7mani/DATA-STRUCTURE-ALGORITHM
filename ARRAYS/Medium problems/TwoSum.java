import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();//target
        int[] res=twosum(arr,k);
        for(int i:res){
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static int[] twosum(int[] arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need=k-arr[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};//return default
    }
}