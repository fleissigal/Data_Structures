import java.util.function.Function;

/**
 * Created by GalFleissig on 06/12/2018.
 */
public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> hash_function = (Integer n) -> {
            return n % 10;
        };

        HashTable table = new HashTable(hash_function, 10);

        table.add(58);
        table.add(28);
        table.add(17);
        table.add(39);
        table.add(81);

        table.print_table();


    }

}
