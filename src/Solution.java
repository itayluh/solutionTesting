public class Solution {
    public static void multiples(int range) {
        int sum = 0;
        for (int i = 0; i < range; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        System.out.println("The sum of all 3 and 5 multiples below " + range + " is " + sum);
    }
}
