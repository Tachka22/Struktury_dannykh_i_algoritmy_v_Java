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
           for (int j = 1; j < elements -i; j++){
               if (arr[j] < arr[j - 1]){
                   long temp = arr[j - 1];
                   arr[j - 1] = arr[j];
                   arr[j] = temp;
               }
           }
       }
    }

    public void selectSort()
    {
        for (int i = 0; i < elements -1; i++) {
            int min = i;
            for (int j = i + 1; j < elements; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            long temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

     public void insertSort()
     {
         for (int i = 1; i< elements - 1 ;i++){
             long element = arr[i];
             int j = i;
             while (j > 0 && arr[j - 1] > element){
                 arr[j] = arr[j - 1];
                 j--;
             }
             arr[j] = element;
         }
     }


}
