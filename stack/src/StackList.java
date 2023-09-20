import com.sun.jdi.ArrayType;

import java.util.ArrayList;

public class StackList<T>{
    private final ArrayList<T> _stack = new ArrayList<T>();

    public void push(T data)
    {
        _stack.add(data);
    }
    public T pop()
    {
        if(_stack.isEmpty()) throw new NullPointerException("Stack is empty");
        else{
            var value = _stack.get(_stack.size() - 1);
            _stack.remove(value);
            return value;
        }
    }
    public T peek()
    {
        if (_stack.isEmpty()) throw new NullPointerException("Stack is empty");
        else return _stack.get(_stack.size() - 1);
    }

}
