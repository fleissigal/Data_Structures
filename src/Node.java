/**
 * Created by GalFleissig on 06/12/2018.
 */
public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public void set_next(Node next) {
        this.next = next;
    }

    public Node get_next() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }
}
