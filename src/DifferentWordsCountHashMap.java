import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.IOException;
public class DifferentWordsCountHashMap {
    static void printDifferentWords(String str) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        String[] words = str.split("\\W");
        for (String word : words) {
            if (map.containsKey(word.toLowerCase())) {
                map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
            }
            else
                map.put(word.toLowerCase(), 1);
        }
        System.out.println("Різні слова: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
        System.out.println("Всі слова і частота їх зустрічей: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + (float) entry.getValue() / 582);
        }
    }
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("D:\\random text.txt");
        String str = Files.readString(filePath);
        printDifferentWords(str);
    }
}