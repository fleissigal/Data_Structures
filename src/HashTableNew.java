import java.util.function.Function;

/**
 * Created by GalFleissig on 11/09/2021.
 */


// This implementation is based on an int[] where every cell links to a linked list
public class HashTableNew {
    private NodeString[] array;
    private Function<String, Integer> hashFunction;

    //    Constructor
    public HashTableNew(int numOfCells, Function<String, Integer> hashFunction) {
        this.array = new NodeString[numOfCells];
        this.hashFunction = hashFunction;
    }

    //    Setters
    public void setArray(NodeString[] newArray) {
        this.array = newArray;
    }

    public void setHashFunction(Function<String, Integer> newHashFunction) {
        this.hashFunction = newHashFunction;
    }

    //    Getters
    public NodeString[] getArray() {
        return this.array;
    }

    public Function<String, Integer> getHashFunction() {
        return this.hashFunction;
    }

    //    Functions
    public void storeItem(String newElement) {
        int code = this.hashFunction.apply(newElement);
        // Using modulu here. Can use a more sophisticated function
        int bucket = getBucket(code);
        this.addElement(bucket, newElement);
    }

    private void addElement(int bucket, String newElement) {
        NodeString node = this.array[bucket];
        NodeString newNode = new NodeString(newElement);
        if (node == null) {
            this.array[bucket] = newNode;
        } else {
//        We first reach the last node in the bucket
            while (node.hasNext()) {
                node = node.getNext();
            }
//        Then we insert the new node to the end of the list
            node.setNext(newNode);
        }
    }

    public boolean itemExists(String element) {
        int code = this.hashFunction.apply(element);
        int bucket = getBucket(code);
        NodeString node = this.array[bucket];
        if (node == null) return false;
        if (node.getData().equals(element)) return true;
        while (node.hasNext()) {
            node = node.getNext();
            if (node.getData().equals(element)) return true;
        }
        return false;

    }

    public int getBucket(int code) {
        int bucket = code % this.array.length;
        return Math.abs(bucket);
    }

    //    Print the current Table
    public void printTable() {

        for (NodeString nodeString : this.array) {
            NodeString node = nodeString;
            if (node != null) {
                System.out.print(node.getData() + " ");
                while (node.hasNext()) {
                    node = node.getNext();
                    System.out.print(node.getData() + " ");
                }
            }
            System.out.print('\n');
        }
    }

}
