package solid.ocp;

import java.util.Comparator;

public class PrimeNumberGeneratorNaturalOrder extends PrimeNumberGenerator {
    @Override
    Comparator<Integer> order() {
        return (a, b) -> a > b ? 1 : -1;
    }
}