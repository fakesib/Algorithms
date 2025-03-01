package sort.selection;

public class Main {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }
    }
}