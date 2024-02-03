package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String chars, String word) {
        List<String> charsList = getCharFromLists(chars);
        List<String> wordsList = getCharFromLists(word);

        for (String s : wordsList) {
            if (charsList.contains(s)) {
                charsList.remove(s);
            } else {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<String> getCharFromLists(String text) {
        return new ArrayList<>(Arrays.asList(text.toLowerCase().split(" ")));
    }
}
//END
