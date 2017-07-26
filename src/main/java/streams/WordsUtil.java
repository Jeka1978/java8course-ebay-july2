package streams;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 20/04/2016.
 */
public class WordsUtil {
    public static Stream<String> getWords(String text) {
        List<String> words = new ArrayList<>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(text);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
                words.add(text.substring(firstIndex, lastIndex));
            }
        }

        return words.stream();
    }
}
