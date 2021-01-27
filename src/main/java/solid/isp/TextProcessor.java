package solid.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextProcessor {

    private List<String> text = new ArrayList<>();

    public void add (String word) {
        text.add(word);
    }

    public String convertToText () {
        return text.stream().collect(Collectors.joining(" "));
    }

    public boolean checkIfSpellingIsCorrect (Language language) {
        for (String word: text) {
            if (! language.dictionary.contains(word.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
