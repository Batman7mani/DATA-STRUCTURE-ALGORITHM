import java.util.*;

public class divisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int[] divisors = getDivisors(num);

        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }

    static int[] getDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i) {
                    divisors.add(num / i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }
}
