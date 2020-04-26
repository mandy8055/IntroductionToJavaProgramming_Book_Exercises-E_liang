package thinkinginobjects.casestudiesandutilities;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private final int DEFAULT_CAPACITY = 16;
//  A no-arg constructor to create the stack of default size i.e. 16
    public StackOfIntegers(){
        this.elements = new int[DEFAULT_CAPACITY];
    }
//  Parameterized constructor for creating the stack of desired size
    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
    }
//  Check if the stack is empty or not
    public boolean empty(){
        return size == 0;
    }
//  Return the top of the stack
    public int peek(){
        return elements[size - 1];
    }
//  Add an element at the top of the stack
    public void push(int value){
/*      If the size of stack is full then create a new array of length twice that of original
 *       Copy the entire array to the new array
 *       Pass the reference of original array to the new array.
*/
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
//  Remove and return the top of the stack
    public int pop(){
        return elements[--size];
    }
//  Return the number of elements in the stack
    public int getSize(){
        return size;
    }

}
