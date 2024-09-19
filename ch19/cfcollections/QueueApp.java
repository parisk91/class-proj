package gr.aueb.cl.ch19.cfcollections;

public class QueueApp {

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.enQueue("Red Car");
        myQueue.enQueue("Green Car");
        myQueue.enQueue("Yellow Car");

        String s = myQueue.deQueue();
        System.out.println(s);

        myQueue.forEach(System.out::println);

    }
}
