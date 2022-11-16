import java.util.*;
public class NumbersList {
    public static List<Integer> list = new ArrayList<>();
    public static void inputList() {
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            int number = random.nextInt(-1000,1000);
            list.add(number);
        }
    }
    public static void viewList()
    {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Списки:\n".toUpperCase());
        inputList();
        System.out.println("Вхідний список:");
        viewList();
        int result;
        int i;
        result = i = 0;
        while(i < list.size() - result)
        {
            if(list.get(i) < 0)
            {
                list.add(list.get(i));
                list.remove(list.get(i));
                result++;
            }
            else
                i++;
        }
        System.out.println("\nВихідний список:");
        viewList();
        System.out.println();
    }
}