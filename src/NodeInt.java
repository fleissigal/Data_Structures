/**
 * Created by GalFleissig on 06/12/2018.
 */
public class NodeInt {
    private int data;
    private NodeInt next;

    public NodeInt(int data) {
        this.data = data;
    }

    public void set_next(NodeInt next) {
        this.next = next;
    }

    public NodeInt get_next() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }
}
