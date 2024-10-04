package homework.homework13;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class FileAnalyzerMain {
    public static final String filePath = "C:\\Users\\hovha\\IdeaProjects\\JavaCore\\src\\homework\\homework13\\analyzing.txt";

      private static  final FileAnalyzer fileAnalyzer = new FileAnalyzer();
    public static void main(String[] args) {

        FileAnalyzer analyzer = new FileAnalyzer();

        try {
            int totalWords = analyzer.totalWordCount(filePath);
            System.out.println("Total words count " + totalWords);

            int uniqueWords = analyzer.uniqueWordCount(filePath);
            System.out.println("Count unique words " + uniqueWords);

            Map<String, Integer> topWords = analyzer.topFrequentWords(filePath, 3);

            topWords.forEach((word, count) -> System.out.println(word + ": " + count));

            String wordToCount = "example";
            int wordOccurrences = analyzer.countWordOccurrences(filePath, wordToCount);
        } catch (IOException e) {
            System.out.println("Cannot read!!! " + e.getMessage());
        }
    }
}
