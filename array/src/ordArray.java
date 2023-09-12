public class ordArray {
    private long[] arr; // Ссылка на массив a
    private int elements;

    public ordArray(int max) {
        this.arr = arr;
        this.elements = 0;
    }

    public int Size(){
        return elements;
    }
    public void insert(long value) // Вставка элемента в массив
    {
        int j;

        for(j=0; j<elements; j++) // Определение позиции вставки
            if(arr[j] > value)
                break;

        for(int k=elements; k>j; k--) // Перемещение последующих элементов
            arr[k] = arr[k-1];
        arr[j] = value;
        elements++;
    }
    public void Print()
    {
        for (int i = 0; i < elements; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean binarySearch(long value)
    {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex < lastIndex)
        {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if(arr[middleIndex] == value)
                return true;
            else if (arr[middleIndex] < value)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex] > value)
                lastIndex = middleIndex -1;
        }
        return false;
    }
}
