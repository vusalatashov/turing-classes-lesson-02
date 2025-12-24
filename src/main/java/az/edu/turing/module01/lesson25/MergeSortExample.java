package az.edu.turing.module01.lesson25;

public class MergeSortExample {

    public static void main(String[] args) {
        int[] arr = {38, 27};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        //left=0
        //right=1

        if (left < right) {
            int mid = (left + right) / 2;
            //mid=1

//            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        //n1=1
        int n2 = right - mid;
        //n2 =1

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;


    }
}
