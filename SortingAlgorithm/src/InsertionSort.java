public class InsertionSort {
    public static void sort(int[] arr) {
//        starting with second element and compared with previous elements
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >=0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;

        }
    }

    //test with sample arr

    public static void main(String[] args) {
        int[] arr = {34,25,55,17, 8, 99, 11, 45, 100};
        sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        //result after running InsertionSort.main():
        // 8 11 17 25 34 45 55 99 100

    }





}
