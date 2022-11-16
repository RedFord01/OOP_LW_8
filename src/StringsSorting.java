import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class StringsSorting {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("D:\\random text.txt");
        String str = Files.readString(filePath);
        ArrayList<String> list = new ArrayList<>();
        for(String string : str.split("\\.")){
            list.add(string.strip() + ".");
        }
        Collections.sort(list);
        for(String string : list) {
            System.out.println(string);
        }
    }
}