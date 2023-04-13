public class SelectionSort {
    public static void sort(int[] arr) {
        //starting with first element (idx=0) and find the min element in the elements on the right side
        //swap position of min elements on right side is smaller than current element
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            //swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    //test with sample arr
    public static void main(String[] args) {
        int[] arr = {54, 25, 55, 17, 8, 99, 111, 45, 100};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
        //result after running SelectionSort.main():
        // 8 17 25 45 54 55 99 100 111
}
