package solid.ocp;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberGeneratorTest {

    @Test
    void returnsAListOfPrimeNumbersInAscendantOrderUntilTheInsertedNumber() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
        List<Integer> expected = Arrays.asList(2,3,5,7,11,13);

        List<Integer> generatedNumbers = primeNumberGenerator.generateNumbersUntil(15);

        assertThat(generatedNumbers).isEqualTo(expected);
    }

    @Test
    void returnsAListOfPrimeNumbersInDescendantOrderSinceTheInsertedNumberUntil2() {
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
        List<Integer> expected = Arrays.asList(13,11,7,5,3,2);

        List<Integer> generatedNumbers = primeNumberGenerator.generateNumbersUntil(15);

        assertThat(generatedNumbers).isEqualTo(expected);
    }
}