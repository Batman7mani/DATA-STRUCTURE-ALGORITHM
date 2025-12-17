import java.util.*;

public class LongestSubArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int len=longsub(arr,k);
        sc.close();
    }
    public static int longsub(int[] arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0,maxlen=0;
        map.put(0,-1);

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                maxlen=Math.max(maxlen,i-map.get(sum-k));
            }
            map.putIfAbsent(sum,i);
        }
        return maxlen;
    }
}