package data_struckture.stack;

import java.util.Arrays;

public class StackOfInteger {
    private int maxSize;
    private Integer[] array;
    private int top;

    public StackOfInteger(int maxSize) {
        top = -1;
        this.maxSize = maxSize;
        array = new Integer[maxSize];
    }

    public void push(int value) {
        if (top >= (maxSize - 1)) {
            System.out.println("The stack is full!!");
        } else {
            array[++top] = value;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("The stack is empty!!!");
            return -1;
        } else if (top > 0) {
            int value = array[top];
            array[top--] = null;
            return value;
        } else if (top == 0) {
            int value = array[top];
            array[top--] = null;
            System.out.println("This is last element in the stack!!!");
            return value;
        }
        return -1;
    }

    public int peek() {
        if (array[top] != null) {
            return array[top];
        } else {
            System.out.println("The stack is empty!!!");
        }
        return -1;
    }

    @Override
    public String toString() {
        return "StackOfInteger{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
