import java.util.Scanner;

public class Digit_count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=count_digit(num);
        System.out.println("THE COUNT OF TEH DIGIT IS: "+ count);
        sc.close();
    }
    static int count_digit(int b){
        int c=0,r;
        while(b>0){
            r=b%10;
            c++;
            b/=10;
        }
        return c;
    }
}