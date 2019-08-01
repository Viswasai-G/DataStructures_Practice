package Arrays_Strings;

import java.util.ArrayList;

public class Stack_Impl<T> implements Stack_Interface<T>{
    private ArrayList<T> Stack;
    private T head = null;

    public Stack_Impl() {
        Stack = new ArrayList();
    }

    @Override
    public T getHead() {
        return head;
    }

    @Override
    public T pop() {
        T temp = head;
        head = Stack.get(Stack.size()-2);
        Stack.remove(Stack.size()-1);
        return temp;
    }

    @Override
    public int getLength() {
        return Stack.size();
    }

    @Override
    public void push(T data) {
        Stack.add(data);
        head = data;
    }
}
