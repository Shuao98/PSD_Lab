package Lab7;

// Some possible tests for bin-packing
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinMain {
    private List<Integer> ints;

    @Before
    public void setUp() throws Exception {
        ints = Arrays.asList(75, 50, 20, 60, 40, 50);
    }

    @After
    public void tearDown() throws Exception {
        ints = null;
    }

    @Test
    public void testGetSpaceReturnsCapacityWhenEmpty() {
        Bin b1 = new Bin(100);
        Assert.assertEquals("Bin.getSpace() should return capacitywhen empty", 100, b1.getSpace());
    }

    @Test
    public void testGetSpaceReturnsCorrectValueWhenNonEmpty() {
        Bin b1 = new Bin(100);
        b1.store(30);
        Assert.assertEquals("Bin.getSpace() should return correct remaining space after store()", 70, b1.getSpace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStoreShouldThrowExceptionIfCapacityExceeded() {
        Bin b1 = new Bin(100);
        b1.store(60);
        b1.store(60);
    }

    @Test
    public void testBestFitStrategyShouldReturnValidResult() {
        Set<Bin> bins = new BestFitStrategy().pack(100, ints);
        int totalSpace = 0;
        for (Bin b : bins) {
            int space = b.getSpace();
            totalSpace += space;
            Assert.assertTrue("Bins should have non-negative space left", space >= 0);
        }
        Assert.assertEquals("Total remaining space should be 5 on test set", 5, totalSpace);
    }

    @Test
    public void testFirstFitStrategyShouldReturnValidResult() {
        Set<Bin> bins = new FirstFitStrategy().pack(100, ints);
        int totalSpace = 0;
        for (Bin b : bins) {
            int space = b.getSpace();
            totalSpace += space;
            Assert.assertTrue("Bins should have non-negative space left", space >= 0);
        }
        Assert.assertEquals("Total remaining space should be 5 on test set", 105, totalSpace);
    }

    @Test
    public void testNextFitStrategyShouldReturnValidResult() {
        Set<Bin> bins = new NextFitStrategy().pack(100, ints);
        int totalSpace = 0;
        for (Bin b : bins) {
            int space = b.getSpace();
            totalSpace += space;
            Assert.assertTrue("Bins should have non-negative space left", space >= 0);
        }
        Assert.assertEquals("Total remaining space should be 5 on test set", 105, totalSpace);
    }
}
