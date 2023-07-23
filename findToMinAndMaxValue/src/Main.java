public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        //min ve max değerleri vereceğiz
        int min = list[0]; //min < list[i] ? min = list[i] : `
         int max = list[0]; // max > list[i] ? = list[i] : ``
        for (int i:list) {
            if( i<min) {
                min= i;
            }
            if (i > max) {
                max = i;
            }

        }
        System.out.println("Minimum değer : " + min);
        System.out.println("Maximum değer : " + max);

    }
}