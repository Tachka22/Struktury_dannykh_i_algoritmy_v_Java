public class QueueX {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nElems;

    public QueueX(int s)//Конструктор.
    {
        maxSize = s;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    public void insert(long value)
    {
        if (rear == maxSize - 1)
            rear = -1;
        queueArray[++rear] = value;
        nElems++;
    }
    public long remove()
    {
        long temp = queueArray[front++];
        if (front == maxSize)
            front = 0;
        nElems--;
        return temp;
    }
    public long peekFront() // Чтение элемента
    {
        return queueArray[front];
    }
    public boolean isEmpty() // true, если очередь пуста
    {
        return (nElems==0);
    }
    public boolean isFull() // true, если очередь заполнена
    {
        return (nElems == maxSize);
    }

}
