import java.util.*;
public class Problem4 {

    public static void main(String[] args) {
         int[] arr = {1,2,8,9,12,46,76,82,15,20,30};

        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int n : arr) {
            for (int j = 1; j <= 9; j++) {
                if (n % j == 0) {
                    result.put(j, result.get(j) + 1);
                }
            }
        }

        System.out.println(result);
    }
    
}
