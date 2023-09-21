import java.util.ArrayList;

public class QueueList<T>{
    private final ArrayList<T> _queue = new ArrayList<T>();

    public void Enqueue(T value)
    {
        _queue.add(value);
    }
    public T Dequeue()
    {
        if (_queue.isEmpty()) throw new NullPointerException("Queue is empty");
        else {
            var temp = _queue.get(0);
            _queue.remove(temp);
            return temp;
        }
    }
    public T Top(){
        if (_queue.isEmpty()) throw new NullPointerException("Queue is empty");
        else return _queue.get(0);
    }
}
