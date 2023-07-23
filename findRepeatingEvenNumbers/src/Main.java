import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3,0, 7,2, 3,4, 3, 2, 9,18,4, 10, 21, 1, 33, 9,18, 1,0,72,72};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            int count = 0; // Her bir sayının kaç defa tekrar edildiğini saymak için

            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    count++;
                }
            }

            if (count >= 1 && list[i] % 2 == 0 && !isFind(duplicate, list[i])) {
                duplicate[startIndex++] = list[i];
            }
        }

        System.out.println("Tekrar eden çift sayılar:");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
