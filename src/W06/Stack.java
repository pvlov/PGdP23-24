package W06;

public class Stack {

    int[] stack;
    int stackpointer = -1;

    public Stack() {
        stack = new int[32];
    }

    public static void main(String[] args) {
        var stack = new Stack();
        System.out.println(stack.pop());
    }

    public int pop() {
        return stack[stackpointer--];
    }
}
