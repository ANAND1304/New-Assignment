import java.util.*;

public class Problem3 {


         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;  // if even -> a-1, if odd -> a

        for (int i = 1; i <= count * 2 - 1; i += 2) {
            System.out.print(i + " ");
        }
    }
}