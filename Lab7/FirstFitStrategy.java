package Lab7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// public class FirstFitStrategy implements PackingStrategy {
//         @Override
//     public Set<Bin> pack(int capacity, List<Integer> values) {
//         Set<Bin> bins = new HashSet<>();

//         for (Integer v : values) {
//             Bin first = null;
//             for (Bin bin : bins) {
//                 if (v <= bin.getSpace()) {
//                     first = bin;
//                     break;
//                 }
//                 if (first == null) {
//                     first = new Bin(capacity);
//                     bins.add(first);
//                 }
//                 first.store(v);
//             }

//         }
//         return bins;
//     }

// }
public class FirstFitStrategy implements PackingStrategy {
    @Override
    public Set<Bin> pack(int capacity, List<Integer> values) {
        Set<Bin> bins = new HashSet<>();
        for (int value : values) {
            Bin firstBin = null;
            for (Bin bin : bins) {
                if (value <= bin.getSpace()) {
                    firstBin = bin;
                    break;
                }
            }
            if (firstBin == null) {
                firstBin = new Bin(capacity);
                bins.add(firstBin);
            }
            firstBin.store(value);
        }
        return bins;
    }
}