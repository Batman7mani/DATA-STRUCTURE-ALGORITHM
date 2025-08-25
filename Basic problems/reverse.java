import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=reverse_num(num);
        System.out.println("The reverse of the number "+num+" is "+rev);
        sc.close();
    }
    static int reverse_num(int n){
        int r,rev=0;
        while(n>0){
            r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        return rev;
    }
}