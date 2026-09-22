public class Day01_Problem02_SumArray {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 2};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) sum += numbers[i];
        System.out.println("The sum of the array is: " + sum);
    }
}
