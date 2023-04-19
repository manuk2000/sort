import java.util.Random;

public class ShellSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        // System.out.println("Before:");
        printArray(numbers);

        shellSort(numbers);

        // System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void shellSort(int[] a) {
        int bag = a.length / 2;
        while (bag > 0) {
            for (int i = bag; i < a.length; i++) {
                for (int j = i - bag; j >= 0; j -= bag) {
                    if (a[j] > a[j + bag]) {
                        int tmp = a[j];
                        a[j] = a[j + bag];
                        a[j + bag] = tmp;
                    }
                }
            }
            bag /= 2;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
