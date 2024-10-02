package Strategy;

public class CountingSort implements AlgorithmStrategy {

    @Override
    public int[] runAlgorithm(int[] array) {
        int N = array.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, array[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[array[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[array[i]] - 1] = array[i];
            countArray[array[i]]--;
        }

        return outputArray;
    }
}
