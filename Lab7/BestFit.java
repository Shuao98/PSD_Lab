package Lab7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BestFit implements PackingStrategy {

    @Override
    public Set<Bin> pack(int capacity, List<Integer> values) {
        Set<Bin> bins = new HashSet<>();

        for (Integer v : values) {
            int bestFit = Integer.MAX_VALUE;
            Bin bestBin = null;
            for (Bin bin : bins) {
                int space = bin.getSpace();
                if (v <= space && (space - v) < bestFit) {
                    bestFit = bin.getSpace() - v;
                    bestBin = bin;
                }
            }
            if (bestBin == null) {
                bestBin = new Bin(capacity);
                bins.add(bestBin);
            }
            bestBin.store(v);
        }

        return bins;
    }

}
