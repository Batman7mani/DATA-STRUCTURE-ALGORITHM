import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> lis = spiralOrder(arr);

        for(int num : lis){
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int t = 0, b = matrix.length - 1, r = matrix[0].length - 1, l = 0;

        while(t <= b && l <= r){
            for(int i = l; i <= r; i++){
                res.add(matrix[t][i]);
            }
            t++;

            for(int i = t; i <= b; i++){
                res.add(matrix[i][r]);
            }
            r--;

            if(t <= b){
                for(int i = r; i >= l; i--){
                    res.add(matrix[b][i]);
                }
                b--;
            }

            if(l <= r){
                for(int i = b; i >= t; i--){
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }

        return res;
    }
}
