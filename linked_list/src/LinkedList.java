public class LinkedList<T> {
    private static class Node<T>{
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

    }
    private Node<T> head;

    public LinkedList(){
        head = null;
    }

    public LinkedList(T[] data){
        for (T item : data) add(item);
    }

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if (head == null) head = newNode;
        else{
            Node<T> curNode = head;
            while (curNode.next != null){
                curNode  = curNode.next;
            }
            curNode.next = newNode;
        }

    }

    public void Reverse(){
        Node<T> previousNode = null;
        Node<T> currentNode = head;
        Node<T> nextNode = null;
        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }

    public void Print(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println();
    }
    public void prepend(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }

    }
    public boolean search(T value){
        Node<T> currentNode = head;
        while (currentNode != null){
            if (currentNode.data == value){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    public T remove(){
        if (head == null) return null;
        var value = head.data;
        head = head.next;
        return value;
    }

}
