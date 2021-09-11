/**
 * Created by GalFleissig on 11/09/2021.
 */


public class StringBuilder {
    private int size;
    private char[] value;
    private int indexValueEnds;

    private static final int initValueSize = 30;

    public StringBuilder() {
        this.value = new char[initValueSize];
        this.size = initValueSize;
        this.indexValueEnds = 0;
    }

    public void setIndexValueEnds(int index_value_ends) {
        this.indexValueEnds = index_value_ends;
    }

    public void append(String str) {
//        If adding the new string won't exceed the size of the StringBuilder, then insert
            if (str.length() <= this.size - this.indexValueEnds - 1) {
                this.addNewString(str);
            } else {
//        Otherwise expand (make sure can accommodate for the change)
                this.expand(str.length());
                this.addNewString(str);
            }
    }

//    The function that expands the size of the char[]
    private void expand(int addAtLeast) {

    }

    private void addNewString(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.value[this.indexValueEnds + 1 + i] = str.charAt(i);
        }
        this.setIndexValueEnds(this.indexValueEnds + str.length());
    }

    public void print() {

    }

}
