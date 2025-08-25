import java.util.Scanner;

public class gcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd=common_divisor(num1,num2);
        System.out.println(gcd);
        sc.close();
    }
    static int common_divisor(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}