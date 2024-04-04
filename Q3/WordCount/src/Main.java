import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world! This is a sample string with multiple words.";


        Map<String, Integer> wordCountMap = new HashMap<>();


        String[] words = str.split(" ");

        // Iterate through the words and count occurrences
        for (String word : words) {
            // Remove any punctuation marks
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update word count in the map
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Print the word count map
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Total number of words
        int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total number of words: " + totalWords);
    }
}