package Lab7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NextFitStrategy implements PackingStrategy {

       @Override
    public Set<Bin> pack(int capacity, List<Integer> values) {
        Set<Bin> bins = new HashSet<>();
        Bin current = null;
        for (Integer value : values) {
            
            if (current == null || value > current.getSpace()) {
                Bin newBin = new Bin(capacity);
                bins.add(newBin);
                current= newBin;
            }
            current.store(value);
        }
        return bins;
    }
}
