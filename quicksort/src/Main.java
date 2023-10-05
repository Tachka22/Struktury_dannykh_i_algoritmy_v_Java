// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
    //разбиение по Lomuto
    public static int partitionLomuto(int[] arr, int start, int end)
    {
        //В качестве опорного выбираем крайний правый элемент.
        int pivot = arr[end];
        int pIndex = start;
        for (int i = start; i < end; i++){
            if (arr[i] < pivot){
                swap(arr,i, pIndex);
                pIndex++;
            }
        }
        swap(arr, end, pIndex);
        return pIndex;
    }
    public static void swap(int[] arr, int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void quicksort(int[] arr, int left, int right)
    {
        if (arr.length < 2) return;
        int pivot = partitionLomuto(arr, left, right);
        quicksort(arr, left, pivot -1);
        quicksort(arr,pivot + 1, right);
    }
}