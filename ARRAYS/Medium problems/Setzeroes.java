import java.util.*;

public class Setzeroes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        setzeroes(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        sc.close();
    }
    public static void setzeroes(int[][] arr){
        int n=arr.length,m=arr[0].length;
        boolean row=false,col=false;

        for(int i=0;i<m;i++){
            if(arr[0][m]==0){
                row=true;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i][0]==0){
                col=true;
                break;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;i<m;i++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;i<m;i++){
                if(arr[i][0]==0||arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        if(row){
            for(int i=0;i<m;i++){
                arr[0][i]=0;
            }
        }
        if(col){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }
    }
}