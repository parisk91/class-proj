package gr.aueb.cl.ch19.cfcollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;


/**
 * Simulates a LIFO data stracture.
 * @param <T>
 */
public class MyStack<T> {
    //interface
    private final Deque<T> myStack = new ArrayDeque<>();

    public MyStack(){

    }

    public void push(T t) {
        myStack.push(t);
    }

    public T pop() {
        return myStack.pop();
    }

    public void forEach(Consumer<T> action) {
        myStack.forEach(action);
    }

}
