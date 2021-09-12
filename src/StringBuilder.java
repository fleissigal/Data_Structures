import java.util.Arrays;

/**
 * Created by GalFleissig on 11/09/2021.
 */


public class StringBuilder {
    private char[] value;
    private int indexValueEnds;

    private static final int initValueSize = 7;

//    Constructor
    public StringBuilder() {
        this.value = new char[initValueSize];
        this.indexValueEnds = -1;
    }

//    Setters
    public void setIndexValueEnds(int indexValueEnds) {
        this.indexValueEnds = indexValueEnds;
    }

    public void setValue(char[] newValue) {
        this.value = newValue;
    }

//    Getters
    public char[] getValue() {
        return this.value;
    }

    public int getIndexValueEnds() {
        return this.indexValueEnds;
    }

//    Functions
    public void append(String str) {
//        If adding the new string won't exceed the size of the StringBuilder, then insert
            if (str.length() <= this.value.length - this.indexValueEnds - 1) {
                this.addNewString(str);
            } else {
//        Otherwise expand (make sure can accommodate for the change)
                this.expand(str.length());
                this.addNewString(str);
            }
    }

//    The function that expands the size of the char[]
    private void expand(int addAtLeast) {
        int numToAdd = addAtLeast;
        if (numToAdd < this.value.length) numToAdd = this.value.length;
        char[] newArray = Arrays.copyOf(this.value, this.value.length + numToAdd);
        this.setValue(newArray);
    }

//    The function that does the actual concatenating of the new string
    private void addNewString(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.value[this.indexValueEnds + 1 + i] = str.charAt(i);
        }
        this.setIndexValueEnds(this.indexValueEnds + str.length());
    }

//    Print the current string
    public void print() {
        System.out.print(this.value);
        System.out.print('\n');
    }

}
