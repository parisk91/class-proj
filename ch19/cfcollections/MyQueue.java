package gr.aueb.cl.ch19.cfcollections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

//FIFO
public class MyQueue<T> {
    private final Deque<T> myQueue = new LinkedList<>();

    public MyQueue() {

    }

    public void enQueue(T t) {
        myQueue.addLast(t);
    }

    public T deQueue(){
        return myQueue.poll();
    }

    public void forEach (Consumer<T> action) {
        myQueue.forEach(action);
    }

}
