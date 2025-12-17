import java.util.*;

public class KDiff {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();//target
        int res=kdiff(arr,k);
        System.out.print(res);
        sc.close();
    }
    public static int kdiff(int[] arr,int k){
        int count=0;
        if(k<0) return 0;// 1. k=0
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i:map.keySet()){
            if(k==0){//2. k==0
                if(map.get(i)>=2){
                    count++;
                }
            }
            else{//3. k>0
                if(map.containsKey(i+k)){
                    count++;
                }
            }
        }
        return count;
    }
}