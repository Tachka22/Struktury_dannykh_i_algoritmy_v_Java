public class StackX {
    private int maxSize; // Размер массива.
    private long[] stackArray;
    private int top; //Вершина стека.

    public StackX(int s) { //Конструктор.
        maxSize = s; //Определение размера стека.
        stackArray = new long[maxSize];//Создание массива.
        top = -1;//Пока нет ни одного элемента.
    }
    public void push(long value)//Размещение элементов на вершине стека.
    {
        if(isFull()) System.out.println("Stack is full");
        else stackArray[++top] = value; //Увеличение top вставка элемента.
    }
    public long pop()// Извлечение элемента с вершины стека.
    {
        return stackArray[top--];//Извлечение элемента уменьшение top.
    }
    public long peek()//Чтение вершины стека.
    {
        return stackArray[top];
    }
    public boolean isEmpty()//true если стек пуст.
    {
        return (top == -1);
    }
    public boolean isFull()//true если стек полон.
    {
        return (top == maxSize - 1);
    }
}
