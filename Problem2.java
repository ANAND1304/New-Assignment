import java.util.*;
import java.util.Scanner;
public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();

        System.out.print("input a = " + a + ", then output : ");

        int num = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(num);
            if (i < a - 1) System.out.print(", ");
            num += 2;
        }
    }
}
