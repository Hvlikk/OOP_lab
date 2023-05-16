import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

public class CalculateRoots {
    public static List<Double> calculate_roots(double a, double b, double c) {
        List<Double> results = new ArrayList<>();
        if (a == 0)
        {
            if (b == 0)
            {
                if (c == 0)
                    results.add(Double.POSITIVE_INFINITY);
                else {
                    return results;
                }
            }
            else
            {
                results.add(-1.0 * c/b);
            }
        }
        else
        {
            double delta = (b * b) - (4.0 * a * c);

            if (delta < 0)
                return results;
            else if (delta == 0)
            {
                double x = -1.0 * b / (2.0 * a);
                results.add(x);
            }
            else
            {
                double x1 = (-1.0 * b + sqrt(delta))/(2.0*a);
                double x2 = (-1.0 * b - sqrt(delta))/(2.0*a);

                results.add(x1);
                results.add(x2);
            }
        }
        return results;
    }

    public static void main(String[] args) {

    }
}

