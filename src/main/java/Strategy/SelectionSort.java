package Strategy;

public class SelectionSort  implements AlgorithmStrategy  {

    @Override
    public int[] runAlgorithm(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[min_idx]) {

                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // If a new minimum is found,
            // swap it with the element at index i
            if (min_idx != i) {
                int temp = list[i];
                list[i] = list[min_idx];
                list[min_idx] = temp;
            }
        }

        return list;
    }
}
