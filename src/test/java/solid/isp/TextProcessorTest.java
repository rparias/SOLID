package solid.isp;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TextProcessorTest {
    @Test
    void returnsTheSameInputString () {
        TextProcessor  processor = new TextProcessor();
        processor.add("Spelynk");
        processor.add("doesnt");
        processor.add("matter");

        String expectedString = "Spelynk doesnt matter";
        String result = processor.convertToText();

        assertThat(result).isEqualTo(expectedString);
    }

    @Test
    void returnsTrueIfTheSpellingIsCorrect() {
        TextProcessor  processor = new TextProcessor();
        processor.add("I");
        processor.add("am");
        processor.add("hungry");

        Boolean result = processor.checkIfSpellingIsCorrect(Language.EN);

        assertThat(result).isTrue();
    }

    @Test
    void returnsFalseIfTheSpellingIsIncorrect() {
        TextProcessor  processor = new TextProcessor();
        processor.add("I");
        processor.add("am");
        processor.add("ungry");

        Boolean result = processor.checkIfSpellingIsCorrect(Language.EN);

        assertThat(result).isFalse();
    }
}
