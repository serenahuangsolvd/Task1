public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

//    recursively partitions the array around a pivot element,
//    placing all elements less than the pivot to its left and all elements greater than the pivot to its right.
    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    //test with sample arr
    public static void main(String[] args) {
        int[] arr = {54, 125, 55,22,7, 17, 88, 99, 111, 45, 100};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //result after running QuickSort.main():
    // 7 17 22 45 54 55 88 99 100 111 125
}
