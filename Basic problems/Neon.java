import java.util.Scanner;

public class Neon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sq=(int)Math.pow(num,2);
        if(neon(sq,num)){
            System.out.println("The number "+num+" is a Neon number");
        }
        else{
            System.out.println("The number "+num+" is a not Neon number");
        }
        sc.close();
    }
    static boolean neon(int sq,int num){
        int b=sq,sum=0;
        while(b>0){
            sum+=b%10;
            b/=10;
        }
        return sum==num;
    }
}