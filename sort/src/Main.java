// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 15, 67, 89, 45, 55, 99};
        mergeSort(array);
        System.out.println("Merge Sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void mergeSort(int[] arr){
        int elems = arr.length;
        if (elems == 1) return;

        int mid = elems / 2;
        int[] left = new int[mid];
        int[] right = new int[elems - mid];

        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < elems; i++)
            right[i - mid] = arr[i];

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
    private static void merge(int[] arr, int[] left, int[] right){
        int sizeL = left.length;
        int sizeR = right.length;
        int l = 0;
        int r = 0;
        int iX = 0;
        while (l < sizeL && r < sizeR){
            if (left[l] < right[r])
                arr[iX++] = left[l++];
            else
                arr[iX++] = right[r++];
        }
        for (int iL = l; iL < sizeL;iL++)
            arr[iX++] = left[iL];
        for (int iR = r; iR < sizeR; iR++)
            arr[iX++] = right[iR];
    }
}