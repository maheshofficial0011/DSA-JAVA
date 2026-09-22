public class Day01_Problem01_FindMinimum {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 2};
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) minimum = numbers[i];
        }
        System.out.println("The minimum number is: " + minimum);
    }
}
