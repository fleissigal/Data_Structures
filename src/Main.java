import java.util.function.Function;

/**
 * Created by GalFleissig on 06/12/2018.
 */
public class Main {

    public static void main(String[] args) {

//        Testing HashTable
        System.out.print("TESTING HashTable\n\n");

        Function<Integer, Integer> hash_function = (Integer n) -> n % 10;

        HashTable table = new HashTable(hash_function, 10);

        table.add(58);
        table.add(28);
        table.add(17);
        table.add(39);
        table.add(81);

        table.print_table();
        System.out.print('\n');


//        Testing StringBuilder
        System.out.print("TESTING StringBuilder\n\n");

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
        System.out.print('\n');

//        Testing ArrayList
        System.out.print("TESTING ArrayList\n\n");

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
        System.out.print('\n');

//        Testing HashTableNew
        System.out.print("TESTING HashTableNew\n\n");

        Function<String, Integer> hf = String::hashCode;
        HashTableNew ht = new HashTableNew(10, hf);

        ht.storeItem("Cracking");
        ht.storeItem("The");
        ht.storeItem("Coding");
        ht.storeItem("Interview");

        ht.printTable();
        System.out.print('\n');

        System.out.print(ht.itemExists("Cracing"));
        System.out.print('\n');
        System.out.print(ht.itemExists("Cracking"));
        System.out.print('\n');
        System.out.print(ht.itemExists("the"));
        System.out.print('\n');
        System.out.print(ht.itemExists("The"));
        System.out.print('\n');
        System.out.print(ht.itemExists("Coding"));
        System.out.print('\n');
        System.out.print(ht.itemExists("Interview"));
        System.out.print('\n');
        System.out.print('\n');

    }

}
