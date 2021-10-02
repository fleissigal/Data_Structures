import java.util.EmptyStackException;

/**
 * Created by GalFleissig on 11/09/2021.
 */

public class Queue {
    private int[] queue;
    private int push_idx;
    private int pop_idx;
    private int numOfCells = 100;

    //    Constructor
    public Queue() {
        this.queue = new int[numOfCells];
        this.push_idx = 0;
        this.pop_idx = 0;
    }

    //    Functions
    public int pop() {
        return peek_pop_aux("pop");
    }

    public void push(int item) {
//         If exceeding length of array: need to expand array
        if (push_idx == numOfCells) {
            this.numOfCells *= 2;
            int[] newQueue = new int[numOfCells];
            System.arraycopy(this.queue, 0, newQueue, 0, push_idx);
            this.queue = newQueue;
        }

//        Pushing the element
        this.queue[push_idx] = item;
        push_idx++;

    }

    public int peek() {
        return peek_pop_aux("peek");
    }

    public boolean isEmpty() {
        return push_idx == pop_idx;
    }

    //    Print the current stack
    public void print() {
        for (int i = 0; i < push_idx; i++) {
            System.out.print(this.queue[i]);
            System.out.print(" ");
        }
    }

    private int peek_pop_aux(String type) {
        if (this.isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int item = this.queue[pop_idx];
        if (type.equals("pop")) pop_idx++;
        return item;
    }

}
