public class DoublyLinkedList<T> {
    private static class Node<T>{
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    /**
     * Вставка в начало списка
     */
    public void addFront(T value){
        Node<T> newNode = new Node<>(value);
        if (isEmpty()){
            head = null;
            tail = null;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    /**
     * Вставка в конец списка
     */
    public void addEnd(T value){
        Node<T> newNode = new Node<T>(value);
        if (tail == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }
    /**
     * Удалить первый элемент
     */
    public void removeFirst(T data){
        if (head == null) return;

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        Node<T> temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        size--;
    }
    /**
     * Удалить последний элемент
     */
    public void removeLast(){
        if (tail == null) return;

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        Node<T> temp =tail;
        tail = tail.prev;
        tail.next = null;
        tail.prev = null;

        size--;
    }
    /**
     * Вернуть размер массива
     */
    public int size(){
        return size;
    }
    /**
     * Проверка на пустоту списка
     */
    public boolean isEmpty(){
        return size == 0;
    }

    public T deleteFirst(){
        if (head == null) return null;

        if (head == tail){
            head = null;
            tail = null;
            return null;
        }

        Node<T> temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;

        size--;

        return temp.data;
    }
}
