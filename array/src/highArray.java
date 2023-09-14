public class highArray {
    private long[] arr;//Ссылка на массив arr
    private int elements;//Элементы в массиве

    public highArray(int max){
        this.arr =new long[max];
        elements = 0;
    }

    public void Insert(long value){
        arr[elements] = value;
        elements++;
    }

    public boolean Find(long value){
        int i;
        for (i = 0; i <elements; i++)
            if (arr[i] == value)
                break;
        if (i == elements)
            return false;
        else
            return true;
    }
    public boolean Delete(long value){
        int i;
        for (i = 0; i <elements; i++)
            if (arr[i] == value)
                break;
        if (i == elements)
            return false;
        else
            for (int j = i; j < elements; j++)
                arr[j] = arr[j+1];
            elements--;
            return true;
    }
    public void Print()
    {
        for (int i = 0; i < elements; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort()
    {
        for (int i = 0; i < elements; i++){
            for (int j = 1;j < elements - i; j++){
                if (arr[j] < arr[j-1]){
                    long temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
