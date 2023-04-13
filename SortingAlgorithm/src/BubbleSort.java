public class BubbleSort {
    public static void sort(int[] arr) {
        //compare adjacent elements and make swap if left element > right element
        //repeat the process till no swap can be made.
        for (int i = 0; i < arr.length - 1; i ++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }

    //test with sample arr
    public static void main(String[] args) {
        int[] arr = {54, 125, 55, 17, 88, 99, 111, 45, 100};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //result after running BubbleSort.main():
    // 17 45 54 55 88 99 100 111 125

}
