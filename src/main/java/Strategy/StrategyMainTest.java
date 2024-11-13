package Strategy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StrategyMainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlgorithmContext algorithmHandler = new AlgorithmContext(new SelectionSort());

        Random random = new Random();

        int[] smallRandomArray = new int[100];

        for (int i = 0; i < smallRandomArray.length; i++) {
            int randomNumber = random.nextInt(100);
            smallRandomArray[i] = randomNumber;
        }

        // Initialize the largeRandomArray with a value that cannot be a valid random number
        int[] largeRandomArray = new int[10000];
        Arrays.fill(largeRandomArray, Integer.MIN_VALUE); // Fill with a sentinel value

        int index = 0;
        while (index < largeRandomArray.length) {
            int randomNumber = random.nextInt(10000);
            if (IntStream.of(largeRandomArray).noneMatch(x -> x == randomNumber)) {
                largeRandomArray[index] = randomNumber;
                index++;
            }
        }

        int[] smallSelectionSortArray = algorithmHandler.runAlgorithm(smallRandomArray);
        int[] largeSelectionSortArray = algorithmHandler.runAlgorithm(largeRandomArray);
        double smallSelectionSortTime = algorithmHandler.timeAlgorithm(smallSelectionSortArray);
        double largeSelectionSortTime = algorithmHandler.timeAlgorithm(largeSelectionSortArray);


        System.out.println("[Selection Sort] \n");

        System.out.println("Small Selection Sort: " + Arrays.toString(smallSelectionSortArray));
        System.out.println("Large Selection Sort: " + Arrays.toString(largeSelectionSortArray) + "\n");

        System.out.println("[Selection Sort Time] \n" );

        System.out.println("Small Selection Sort time: " + String.format("%.6f", smallSelectionSortTime) + " seconds");
        System.out.println("Large Selection Sort time: " + String.format("%.6f", largeSelectionSortTime) + " seconds \n");

        System.out.println("------------------------- \n");


        algorithmHandler.setAlgorithmStrategy(new CombSort());

        int[] smallCombSortArray = algorithmHandler.runAlgorithm(smallRandomArray);
        int[] largeCombSortArray = algorithmHandler.runAlgorithm(largeRandomArray);

        double smallCombSortTime = algorithmHandler.timeAlgorithm(smallCombSortArray);
        double largeCombSortTime = algorithmHandler.timeAlgorithm(largeCombSortArray);

        System.out.println("[Comb Sort] \n");

        System.out.println("Small Comb Sort: " + Arrays.toString(smallCombSortArray));
        System.out.println("Large Comb Sort: " + Arrays.toString(largeCombSortArray) + "\n");

        System.out.println("[Comb Sort Time] \n" );

        System.out.println("Small Comb Sort time: " + String.format("%.6f", smallCombSortTime) + " seconds");
        System.out.println("Large Comb Sort time: " + String.format("%.6f", largeCombSortTime) + " seconds \n");

        System.out.println("------------------------- \n");


        algorithmHandler.setAlgorithmStrategy(new CountingSort());

        int[] smallCountingSortArray = algorithmHandler.runAlgorithm(smallRandomArray);
        int[] largeCountingSortArray = algorithmHandler.runAlgorithm(largeRandomArray);

        double smallCountingSortTime = algorithmHandler.timeAlgorithm(smallCountingSortArray);
        double largeCountingSortTime = algorithmHandler.timeAlgorithm(largeCountingSortArray);

        System.out.println("[Counting Sort] \n");

        System.out.println("Small Counting Sort: " + Arrays.toString(smallCountingSortArray));
        System.out.println("Large Counting Sort: " + Arrays.toString(largeCountingSortArray) + "\n");



        System.out.println("[Counting Sort Time] \n" );

        System.out.println("Small Counting Sort time: " + String.format("%.6f", smallCountingSortTime) + " seconds");
        System.out.println("Large Counting Sort time: " + String.format("%.6f", largeCountingSortTime) + " seconds");



    }
}
