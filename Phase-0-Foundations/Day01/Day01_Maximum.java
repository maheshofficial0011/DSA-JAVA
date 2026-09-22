public class Day01_Maximum {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 2};
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) maximum = numbers[i];
        }
        System.out.println("The maximum number is: " + maximum);
    }
}
