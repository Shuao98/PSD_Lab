package Lab7;

import java.util.Arrays;
import java.util.Set;

public class BinTest {
    public static void main(String[] args) {
        Bin b1 = new Bin(100);
        System.out.println(b1.getSpace());

        Bin b2 = new Bin(100);
        b2.store(30);
        System.out.println(b2.getSpace());

        Bin b3 = new Bin(100);
        b3.store(60);
        // b3.store(60);
        System.out.println(b3.getSpace()); //will exceed space

        Set<Bin> bins1 = new BestFit().pack(100, Arrays.asList(75, 50, 20, 60, 40, 50));
        int totalSpace = 0;
        for (Bin b : bins1) {
            int space = b.getSpace();
            totalSpace += space;
            System.out.println(space);
        }
        System.out.println(totalSpace);
        System.out.println(bins1);

        Set<Bin> bins2 = new FirstFitStrategy().pack(100, Arrays.asList(75, 50, 20, 60, 40, 50));
        int totalSpace2 = 0;
        for (Bin b : bins2) {
            int space = b.getSpace();
            totalSpace += space;
            System.out.println(space);
        }
        System.out.println(totalSpace2);
        System.out.println(bins2);

        Set<Bin> bins3 = new NextFitStrategy().pack(100, Arrays.asList(75, 50, 20, 60, 40, 50));
        int totalSpace3 = 0;
        for (Bin b : bins3) {
            int space = b.getSpace();
            totalSpace += space;
            System.out.println(space);
        }
        System.out.println(totalSpace3);
        System.out.println(bins3);
        

    }
}
