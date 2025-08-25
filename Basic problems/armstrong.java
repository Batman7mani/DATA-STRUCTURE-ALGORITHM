import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int a_num=armstrong_num(num);
        if(a_num==num){
            System.out.println("The number "+num+" is an Armstrong number.");
        }
        else{
            System.out.println("The number "+num+" is not an Armstrong number.");
        }
        sc.close();
    }
    static int armstrong_num(int b){
        int r,an=0;
        int k=String.valueOf(b).length();
        while(b>0){
            r=b%10;
            an+=(int)Math.pow(r,k);
            b/=10;
        }
        return an;
    }
}
