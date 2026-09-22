public class Day01_Challenge_Find_Second_Largest_Distinct_element {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 20, 3};
        if (numbers.length < 2) {
            System.out.println("There is no second largest distinct element in the array.");
            return;
        }
        int largest = numbers[0];
        int secondLargest = 0;
        boolean hasSecondLargest = false;
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            if (current > largest) {
                secondLargest = largest;
                largest = current;
                hasSecondLargest = true;
            } else if (current < largest && (!hasSecondLargest || current > secondLargest)) {
                secondLargest = current;
                hasSecondLargest = true;
            }
        }
        if (hasSecondLargest) {
            System.out.println("Second largest distinct element: " + secondLargest);
        } else {
            System.out.println("There is no second largest distinct element in the array.");
        }
    }
}
