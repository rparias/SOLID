package solid.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrimeNumberGenerator {

    public List<Integer> generateNumbersUntil(int number) {
        List<Integer> generatedNumbers = new ArrayList<>();
        for (int currentNumber = 2; currentNumber <= number; currentNumber++) {
            if (isPrime(currentNumber)) generatedNumbers.add(currentNumber);
        }
        Collections.sort(generatedNumbers, order());
        return generatedNumbers;
    }

    private Comparator<Integer> order() {
        return (a, b) -> a > b ? 1 : -1;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return number > 1;
    }
}