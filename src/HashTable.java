import java.util.function.Function;

/**
 * Created by GalFleissig on 06/12/2018.
 */
public class HashTable {
    // Array of Nodes, initialized to Null's

    private NodeInt[] table;
    private int num_of_cells;
    private Function<Integer, Integer> hash_function;


    public HashTable(Function<Integer, Integer> hashFunction, int num_of_cells) {

        this.table = new NodeInt[num_of_cells];
        this.hash_function = hashFunction;
        this.num_of_cells = num_of_cells;

    }

    public void add(int n) {
        int bucket = this.hash_function.apply(n);
        NodeInt tmp = this.table[bucket];
        NodeInt node = new NodeInt(n);
        node.set_next(tmp);
        this.table[bucket] = node;
    }

    public void print_table() {
        for (int i = 0; i < this.num_of_cells; i++) {
            System.out.printf("Bucket num %d: ", i);

            NodeInt current_node = this.table[i];
            while (current_node != null) {
                System.out.print(current_node.getData() + " ");
                current_node = current_node.get_next();
            }
            System.out.print("\n");
        }
    }

}
