import java.util.Scanner;

public class strong_number{
    static int[] fact=new int[10];

    static{
        fact[0]=1;
        for(int i=1;i<=9;i++){
            fact[i]=fact[i-1]*i;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int b=num,sum=0,r;
        while(b>0){
            r=b%10;
            sum+=fact[r];
            b/=10;
        }
        if(sum==num){
            System.out.println("The number "+num+" is a Strong Number");
        }
        else{
            System.out.println("The number "+num+" is not a Strong Number");
        }
        sc.close();
    }
}