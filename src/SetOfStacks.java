import java.util.Arrays;

/**
 * Created by GalFleissig on 11/09/2021.
 */

public class SetOfStacks {
    private int[][] stacks;
    private int currentStack;
    private int indexToPush;
    private int[] stacksLengths;
    private int numOfCells = 3;

    //    Constructor
    public SetOfStacks() {
        this.stacks = new int[1][numOfCells];
        this.stacksLengths = new int[1];
        this.currentStack = 0;
        this.indexToPush = 0;
    }

    //    Functions
    public int pop() {
        return peek_pop_aux("pop");
    }

    public void push(int item) {
//         If exceeding length of array: need to create a new array
        if (indexToPush == numOfCells) {
            int[][] newStacks = Arrays.copyOf(this.stacks, this.stacks.length + 1);
            int[] newArray = new int[numOfCells];
            newStacks[currentStack + 1] = newArray;

            int[] newStacksLengths = Arrays.copyOf(this.stacksLengths, this.stacksLengths.length + 1);
            stacksLengths = newStacksLengths;

            stacks = newStacks;
            currentStack++;
            indexToPush = 0;
        }

//        Pushing the element
        this.stacks[currentStack][indexToPush] = item;
        indexToPush++;
        this.stacksLengths[currentStack]++;

    }

    public int peek() {
        return peek_pop_aux("peek");
    }

    public boolean isEmpty() {
        return currentStack == 0 && indexToPush == 0;
    }

    //    Print the current stack
    public void print() {
        for (int i = 0; i < stacks.length; i++) {
            for (int j = 0; j < stacks[i].length; j++) {
                System.out.print(stacks[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private int peek_pop_aux(String type) {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
//        At this point we know there is an element to peek/pop

//        The regular case
        if (indexToPush != 0) {
            int item = this.stacks[currentStack][indexToPush - 1];
            if (type.equals("pop")) {
                indexToPush--;
                this.stacksLengths[currentStack]--;
            }
            return item;
//            The case where we need to go back to the previous stack
        } else {
            int indexToReturnToAtPreviousStack = stacksLengths[currentStack - 1] - 1;

            int item = this.stacks[currentStack - 1][indexToReturnToAtPreviousStack];
            if (type.equals("pop")) {
                currentStack--;
                indexToPush = indexToReturnToAtPreviousStack;

                int[][] newStacks = Arrays.copyOf(this.stacks, this.stacks.length - 1);
                stacks = newStacks;

                int[] newStacksLengths = Arrays.copyOf(this.stacksLengths, this.stacksLengths.length - 1);
                stacksLengths = newStacksLengths;
            }
            return item;
        }
    }

    public int popAt(int stackIndex) {
        if (stackIndex == currentStack) {
            return peek_pop_aux("pop");
        } else {
            if (stacksLengths[stackIndex] == 0) {
                return Integer.MIN_VALUE;
            } else {
                int lengthOfRequestedStack = this.stacksLengths[stackIndex] - 1;
                int item = this.stacks[stackIndex][lengthOfRequestedStack];
                this.stacksLengths[stackIndex]--;
                return item;
            }
        }
    }

}
