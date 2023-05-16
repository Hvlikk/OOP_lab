import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class CalculateRootsTests {

    @Test
    public void testNoRoots() {
        List<Double> results = CalculateRoots.calculate_roots(1, 2, 3);
        assertTrue(results.isEmpty());
    }

    @Test
    public void testOneRoot() {
        List<Double> results = CalculateRoots.calculate_roots(1, -4, 4);
        assertEquals(1, results.size());
        assertEquals(2.0, results.get(0), 0);
    }

    @Test
    public void testTwoRoots() {
        List<Double> results = CalculateRoots.calculate_roots(1, -5, 6);
        assertEquals(2, results.size());
        assertEquals(3.0, results.get(0), 0);
        assertEquals(2.0, results.get(1), 0);
    }

    @Test
    public void testWhenAEqualsZero() {
        List<Double> results = CalculateRoots.calculate_roots(0, 3, 6);
        assertEquals(1, results.size());
        assertEquals(-2.0, results.get(0), 0);
    }

    @Test
    public void testWhenBEqualsZero() {
        List<Double> results = CalculateRoots.calculate_roots(0, 0, 7);
        assertTrue(results.isEmpty());
    }

    @Test
    public void testInfinity() {
        List<Double> results = CalculateRoots.calculate_roots(0, 0, 0);
        assertEquals(1, results.size());
        assertEquals(Double.POSITIVE_INFINITY, results.get(0), 0);
    }
}