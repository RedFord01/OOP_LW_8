import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DifferentWordsTreeSet {

    public static void main(String[] args) {
        String [] wordsFromFile = new String[0];
        try(InputStream fileInputStream = new FileInputStream("D:\\random text.txt")) {
            wordsFromFile = getDifferentWords(fileInputStream);
        }catch (IOException e) {e.printStackTrace();}
        for (String tmp : wordsFromFile)
            System.out.println(tmp);
    }

    static String [] getDifferentWords(InputStream src) {
        Set<String> stringSet = new TreeSet<>();
        Scanner scanner = new Scanner(src);
        while (scanner.hasNext())
            stringSet.add(scanner.next().toLowerCase());

        String [] dist = new String[stringSet.size()];
        return stringSet.toArray(dist);
    }
}