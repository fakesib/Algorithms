package sort.selection;

public class SelectionSort {

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int position = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = min;
        }
    }
}
