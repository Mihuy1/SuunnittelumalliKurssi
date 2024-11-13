package Strategy;

import java.util.ArrayList;

public class AlgorithmContext {

    private AlgorithmStrategy strategy;

    public AlgorithmContext(AlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public void setAlgorithmStrategy(AlgorithmStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] runAlgorithm(int[] list) {
        return strategy.runAlgorithm(list);
    }

    public double timeAlgorithm(int[] list) {
        long startTime = System.nanoTime();
        strategy.runAlgorithm(list);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        return elapsedTime / 1_000_000_000.0;
    }
}
