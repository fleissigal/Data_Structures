import java.util.function.Function;

/**
 * Created by GalFleissig on 11/09/2021.
 */


// This implementation is based on an int[] where every cell links to a linked list
public class NodeString {
    private String data;
    private NodeString next;

    //    Constructor
    public NodeString(String data) {
        this.data = data;
        this.next = null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

//    Setters
    public void setData(String data) {
        this.data = data;
    }

    public void setNext(NodeString next) {
        this.next = next;
    }

//    Getters
    public NodeString getNext() {
        return this.next;
    }

    public String getData() {
        return this.data;
    }


}
