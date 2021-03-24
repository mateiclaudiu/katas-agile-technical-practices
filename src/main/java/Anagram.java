import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagram {
    public List<String> get(String input) {
        List<String> letters = IntStream.range(0, input.length()).mapToObj(i -> input.substring(i, i + 1)).collect(Collectors.toList());


        List<String> anograms = new ArrayList<>();

        for (int i = 0; i < letters.size(); ) {
            String firstLetter = letters.get(i);
            var nextLetters = "";
            int j;
            for (j = 0; j < letters.size(); j++) {
                if (i != j) {
                    nextLetters += letters.get(j);
                }
            }
            anograms.add(firstLetter + nextLetters);
        }

        return anograms;
    }
}
