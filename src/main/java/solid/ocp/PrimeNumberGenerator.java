package solid.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class PrimeNumberGenerator {

    abstract Comparator<Integer> order();

    public List<Integer> generateNumbersUntil(int number) {
        List<Integer> generatedNumbers = new ArrayList<>();
        for (int currentNumber = 2; currentNumber <= number; currentNumber++) {
            if (isPrime(currentNumber)) generatedNumbers.add(currentNumber);
        }
        Collections.sort(generatedNumbers, order());
        return generatedNumbers;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return number > 1;
    }
}