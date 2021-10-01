import java.util.Vector;
import java.util.function.Function;

/**
 * Created by GalFleissig on 11/09/2021.
 */

public class Stack {
    private int[] stack;
    private int idx;
    private int numOfCells = 3;

    //    Constructor
    public Stack() {
        this.stack = new int[numOfCells];
        this.idx = 0;
    }

    //    Functions
    public int pop() {
        return peek_pop_aux("pop");
    }

    public void pushItem(int item) {
//         If exceeding length of array: need to expand array
        if (idx == numOfCells) {
            this.numOfCells *= 2;
            int[] newStack = new int[numOfCells];
            System.arraycopy(this.stack, 0, newStack, 0, idx);
            this.stack = newStack;
        }

//        Pushing the element
        this.stack[idx] = item;
        idx++;

    }

    public int peek() {
        return peek_pop_aux("peek");
    }

    public boolean isEmpty() {
        return idx == 0;
    }

    //    Print the current stack
    public void print() {
        for (int i = 0; i < idx; i++) {
            System.out.print(this.stack[i]);
            System.out.print(" ");
        }
    }

    private int peek_pop_aux(String type) {
        if (idx == 0) {
            return Integer.MIN_VALUE;
        }

        int item = this.stack[idx - 1];
        if (type.equals("pop")) idx--;
        return item;
    }

}
