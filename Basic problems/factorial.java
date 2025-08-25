import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=factorial(num);
        System.out.printf("%d ",fact);
        sc.close();
    }
    static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}