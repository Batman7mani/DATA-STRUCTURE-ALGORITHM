import java.util.Scanner;

public class Niven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(niven(num)){
            System.out.println("The number "+num+" is a niven number");
        }
        else{
            System.out.println("The number "+num+" is not a niven number");
        }
        sc.close();
    }
    static boolean niven(int num){
        int b=num,r,sum=0;
        while(b>0){
            sum+=b%10;
            b/=10;
        }
        return num%sum==0;
    }
}