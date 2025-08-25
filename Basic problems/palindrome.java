import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=reverse_num(num);

        //for checking the logic of the number whether it is a palindrome
        if(num==rev){
            System.out.println("The number "+num+" is a palindrome");
        }
        else{
            System.out.println("The number "+num+" is not a palindrome");
        }
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