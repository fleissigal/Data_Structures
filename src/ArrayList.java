import java.util.Arrays;

/**
 * Created by GalFleissig on 11/09/2021.
 */


public class ArrayList {
    private int[] array;
    private int indexHead;

    private static final int initValueSize = 4;
    private static final int expansionFactor = 2;

    //    Constructor
    public ArrayList() {
        this.array = new int[initValueSize];
        this.indexHead = 0;
    }

//    Setters
    public void setArray(int[] newArray) {
        this.array = newArray;
    }

    public void setIndexHead(int newIndexHead) {
        this.indexHead = newIndexHead;
    }

    //    Getters
    public int[] getArray() {
        return this.array;
    }

    public int getIndexHead() {
        return this.indexHead;
    }

    //    Functions
    public void push(int newElement) {
        this.array[indexHead] = newElement;
        this.indexHead += 1;
        if (indexHead >= this.array.length) {
            this.expand(); // Expand array if reached limit
        }
    }

    public int pop() {
        if (this.indexHead == 0) {
            System.out.print("Array is empty");
            return Integer.MIN_VALUE;
        } else {
            this.indexHead -= 1;
            return this.array[this.indexHead];
        }
    }

    public int elementAt(int index) {
        if (index < 0 || index >= this.array.length) {
            System.out.print("Index out of bounds");
            return Integer.MIN_VALUE;
        } else {
            return this.array[index];
        }
    }

    //    The function that expands the size of the int[] - by "expansionFactor"
    private void expand() {
        int[] newArray = Arrays.copyOf(this.array, this.array.length * expansionFactor);
        this.setArray(newArray);
    }

    //    Print the current string
    public void print() {
        for (int i = 0; i < this.indexHead; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.print('\n');
    }

}
