import java.util.function.Function;

/**
 * Created by GalFleissig on 06/12/2018.
 */
public class Main {

    public static void main(String[] args) {

//        Testing HashTable

        Function<Integer, Integer> hash_function = (Integer n) -> n % 10;

        HashTable table = new HashTable(hash_function, 10);

        table.add(58);
        table.add(28);
        table.add(17);
        table.add(39);
        table.add(81);

        table.print_table();


//        Testing StringBuilder

        StringBuilder sb = new StringBuilder();
        sb.print();

        String first = "hello,";
        sb.append(first);
        sb.print();

        String second = " world!";
        sb.append(second);
        sb.print();

        String third = " Period.";
        sb.append(third);
        sb.print();

//        Testing ArrayList

        ArrayList arr = new ArrayList();
        arr.print();

        arr.push(1);
        arr.push(3);
        arr.push(6);
        arr.push(0);
        arr.print();

        arr.push(5);
        arr.push(99);
        arr.push(64);
        arr.push(2);
        arr.push(60);
        arr.print();

        System.out.print(arr.pop());
        System.out.print('\n');
        System.out.print(arr.pop());
        System.out.print('\n');
        System.out.print(arr.pop());
        System.out.print('\n');


        System.out.print(arr.elementAt(2));
        System.out.print('\n');
        System.out.print(arr.elementAt(4));
        System.out.print('\n');
        System.out.print(arr.elementAt(5));
        System.out.print('\n');

        arr.push(313);
        arr.print();

    }

}
