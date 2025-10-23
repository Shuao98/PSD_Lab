package Lab7;

import java.util.ArrayList;
import java.util.List;

public class Bin {
    public int capacity;
    public List<Integer> weights;

    public Bin(int c) {
        this.capacity = c;
        this.weights = new ArrayList<>();
    }

    public void store(int weight) throws IllegalArgumentException {
        if (weight > getSpace()) {
            throw new IllegalArgumentException("No space: space "
                    + getSpace() + ", size " + weight);
        } else {
            weights.add(weight);
        }
    }

    // public int getSpace() {
    // int sum = 0;
    // for (int w : weights) {
    // sum += w;
    // }
    // return this.capacity * weights.size() - sum;
    // }
    public int getSpace() {
        return capacity - weights.stream().mapToInt(s -> s).sum();
    }

    @Override
    public String toString() {
        return weights.toString();
    }

}
