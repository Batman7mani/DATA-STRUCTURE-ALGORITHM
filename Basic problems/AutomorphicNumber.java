import java.util.Scanner;

public class AutomorphicNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();

        if(auto(num)){
            System.out.println("The number "+num+" is automorphic number.");
        }
        else{
            System.out.println("The number "+num+" is not a automorphic number.");
        }
    }
    static boolean auto(int num){
        int sq=(int)Math.pow(num,2);
        int temp=num;
        while(temp>0){
            if(temp%10!=sq%10){
                return false;
            }
            temp/=10;
            sq/=10;
        }
        return true;
    }
}