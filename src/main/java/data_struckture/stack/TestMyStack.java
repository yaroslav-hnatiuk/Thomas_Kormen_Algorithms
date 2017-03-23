package data_struckture.stack;

public class TestMyStack {
    public static void main(String[] args) {
        /*boolean ex = false;
        while (ex){

        }*/

        StackOfInteger stackOfInteger = new StackOfInteger(2);
        stackOfInteger.push(10);
        stackOfInteger.push(20);
        stackOfInteger.push(30);

        System.out.println("last el is: " + stackOfInteger.peek());
        System.out.println(stackOfInteger.toString());

        System.out.println(stackOfInteger.pop());
        System.out.println(stackOfInteger.pop());
        System.out.println(stackOfInteger.pop());

        stackOfInteger.push(10);
        stackOfInteger.push(20);
        stackOfInteger.push(30);

        System.out.println("last el is: " + stackOfInteger.peek());
        System.out.println(stackOfInteger.toString());
    }
}
