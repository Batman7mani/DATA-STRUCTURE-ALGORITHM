import java.util.Scanner;

public class Number_Triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //For Right-angled Triangle
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
        //for Inverse Right-angled Triangle
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
        sc.close();
    }
}
