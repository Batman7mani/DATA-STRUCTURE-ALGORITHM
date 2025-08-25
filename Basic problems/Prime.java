import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("The number "+num+" is a prime number");
        }
        else{
            System.out.println("The number "+num+" is not a prime number");
        }
        sc.close();
    }
    static boolean isPrime(int num){
        if(num<=1) return false;
        if(num<=3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i++) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
