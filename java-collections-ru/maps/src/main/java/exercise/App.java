package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isEmpty()) { return new HashMap<>(); }

        String[] splitSentence = sentence.split(" ");
        Map<String, Integer> wordsCount = new LinkedHashMap<>();
        for (String s : splitSentence) {
            wordsCount.put(s, (wordsCount.getOrDefault(s, 0) + 1));
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> hashMap) {
        StringBuilder result = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> newHashMap : hashMap.entrySet()) {
            result.append(" ").append(newHashMap.getKey()).append(": ").append(newHashMap.getValue()).append("\n");
        }
        result.append("}");
        return result.toString();
    }

}
