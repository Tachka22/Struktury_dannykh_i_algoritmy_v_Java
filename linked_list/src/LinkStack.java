public class LinkStack<T>{
    private LinkedList theList;
    public LinkStack(){
        theList = new LinkedList<T>();
    }
    public void push(T value){
        theList.prepend(value);
    }
    public T pop(){
        return (T) theList.deleteFirst();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }

}
