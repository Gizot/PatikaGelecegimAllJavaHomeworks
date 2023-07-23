import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,3,3,3,7,7,7,7,7,7,7,7,8,8,8,8,4,5,1,4,1,5,5,16,5,5,5,5,55,10,16};

        // Frekansları hesaplamak için bir HashMap kullanmalıyız
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizi üzerinde gezinerek frekansları hesapla
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        System.out.println("Tekrar Sayıları");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }
    }
}
