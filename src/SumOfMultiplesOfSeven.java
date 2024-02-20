public class SumOfMultiplesOfSeven {
    public static int sumMultiplesOfSeven(int n1, int n2) {
        if (n1 > n2) {
            return 0; // If n1 exceeds n2, return 0
        } else {
            // Adds n1 to the sum if it is a multiple of 7, then recursively calls it with n1 + 1
            return (n1 % 7 == 0 ? n1 : 0) + sumMultiplesOfSeven(n1 + 1, n2);
        }
    }

    public static void main(String[] args) {
        int n1 = 69; // starting number
        int n2 = 666; // ending number
        int sum = sumMultiplesOfSeven(n1, n2);
        System.out.println("Sum of multiples of 7 between " + n1 + " and " + n2 + ": " + sum);
    }
}
