import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void countingValues(int[] values) {
        Map<Integer, Integer> convert = new HashMap<>();
        for (int value : values) {
            if (convert.containsKey(value)) {
                convert.put(value, convert.get(value) +1);
            } else {
                convert.put(value, 1);
            }
        }
        System.out.println(convert);
    }

    public static void main(String[] args) {
        System.out.println("Введите количество значений массива");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];

        int counter = 1;
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Введите значениe " + counter);
            array[i] = scanner.nextInt();
            counter++;
        }
            countingValues(array);

    }

}