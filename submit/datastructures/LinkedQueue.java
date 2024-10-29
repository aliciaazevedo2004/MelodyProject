package datastructures;
import itsc2214.Node;
import itsc2214.QueueADT;

/**
 * Linked list implementation of Queues. 
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 * @param <T> 
 */
public class LinkedQueue<T> implements QueueADT<T> {
    /* front: the beginning of the queue */
    private Node<T> front;
    
    /* rear: the end of the queue */
    private Node<T> rear;
    
    /* size: the number of elements in the queue */
    private int size;
    
    /**
     * Constructor.
     */
    public LinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;

        

    }
    
    /**
     * Insert an element in the end of the queue.
     * @param target input element
     */
    @Override
    public boolean enqueue(T target) {
        /**
         * if queue is not empty, insert new node in 
         * the rear of the queue
        **/
        if (rear == null) {
            front = new Node<>(target);
            rear = front;
        } else {
            Node<T> newNode = new Node<>(target);
            rear.setNext(newNode);
            rear = newNode;

        }
        size++;
        return true;
    }
    
    /**
     * Remove from the beginning of the queue.
     * @return the removed element
     */
    @Override
    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        T data = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return data;


    }
    
    /**
     * Examine whether the queue is empty.
     * @return true: if the queue is empty
     *         false: if the queue is not empty
     */
    @Override
    public boolean isEmpty() {
        //Evaluate whether the queue is empty
        return size == 0;
    }
    
    /**
     * Retrieve the front.
     * @return the element in the beginning of the queue 
     */
    @Override
    public T frontValue() {

        if (front == null) {
            return null;
        }
        return front.getData();
    }
    
    /**
     * Retrieve the size.
     * @return number of elements in the queue
     */
    @Override
    public int size() {
        //Return the size of the QueueADT
        return size;
    }

    /**
     * Clear the queue.
     */
    @Override
    public void clear() {
        while (!this.isEmpty()) {
            this.dequeue();
        }
    }
}