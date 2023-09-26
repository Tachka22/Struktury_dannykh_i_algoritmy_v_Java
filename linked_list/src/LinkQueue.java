public class LinkQueue<T> {
    private DoublyLinkedList doublyLinkedList;

    public LinkQueue() {
        doublyLinkedList = new DoublyLinkedList();
    }

    /**
     * /Проверка на пустоту
     */
    public boolean isEmpty() {
        return doublyLinkedList.isEmpty();
    }
    /**
     * Добавить в конец
     */
    public void insert(T value) {
        doublyLinkedList.addEnd(value);
    }
    /**
     * Удалить из начала
     */
    public T remove(){
       return (T) doublyLinkedList.deleteFirst();
    }
}