package datastructures;
import itsc2214.Node;
import itsc2214.StackADT;

/**
 * Linked list implementation of Stacks. 
 * 
 * @author ITSC 2214
 * @version 1.0
 * @param <T> 
 */
public class LinkedStack<T> implements StackADT<T> {
    /* top: the top of the stack */
    private Node<T> top;

    /* size: the number of elements in the stack */
    private int size;

    /**
     * Constructor to instantiate the linked stack.
     */
    public LinkedStack() {
        this.top = null;
        this.size = 0;

    }

    /**
     * Insert an element on the top of the stack.
     * @param target input element
     */
    @Override
    public boolean push(T target) {

        if (top == null) {
            top = new Node<>(target);
        } else {
            Node<T> newTop = new Node<>(target);
            newTop.setNext(top);
            top = newTop;
        }
        size++;
        return true;
    }

    /**
     * Remove out of the top of the stack.
     * @return the removed element
     */
    @Override
    public T pop() {

        if (top == null) {
            return null;
        }

        T value = top.getData();
        this.top = this.top.getNext();
        size--;

        return value;

    }

    /**
     * Retrieve the element on the top of the stack.
     * @return the element on the top of the stack
     */
    @Override
    public T topValue() {

        if (top == null) {
            return null;
        }
        return top.getData();

    }

    /**
    * Examine whether the stack is empty.
    * @return true: if the stack is empty
    *         false: if the stack is not empty
    */
    @Override
    public boolean isEmpty() {
        //Evaluate whether the stack is empty
        return size == 0;
    }

    /**
    * Retrieve the size.
    * @return number of elements in the queue
    */
    @Override
    public int size() {
        //Return the size of the stack 
        return size;
    }

    /**
     * Clear the stack.
     */
    @Override
    public void clear() {
        while (!this.isEmpty()) {
            this.pop();
        }
    }
}

//bellow is unused code
/*
 *     //**
     * main() function.
     * @param argv no arguments
     //
    public static void main(String argv[]){
        final  int iSIZE = 10;
        LinkedStack<String> stringStack = new LinkedStack<String>();
        
        String line;
        for (int i = 0; i < iSIZE; i++) {
            //push the new element
            stringStack.push(Integer.valueOf(i).toString());
        }
        try{            
            System.out.println("\nOpposite order is: ");
            for (int i = 0; i < iSIZE; i++){
                // TODORemove an element in the order opposite to they were entered
                //      Save it to the String variable, named line
                line = stringStack.pop();
                
                System.out.println(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
 */

