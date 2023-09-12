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


}
