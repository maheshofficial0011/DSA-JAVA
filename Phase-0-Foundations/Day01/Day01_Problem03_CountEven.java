public class Day01_Problem03_CountEven {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 2};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) count++;
        }
        System.out.println("The number of even numbers in the array is: " + count);
    }
}
