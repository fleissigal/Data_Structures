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

//        Testing Stack
        System.out.print("TESTING Stack\n\n");

        Stack stack = new Stack();

        stack.push(5);
        stack.push(3);
        stack.push(9);
        stack.push(12);
        stack.push(11);

        stack.print();
        System.out.print('\n');

        System.out.print(stack.pop());
        System.out.print('\n');
        System.out.print(stack.peek());
        System.out.print('\n');
        System.out.print(stack.isEmpty());
        System.out.print('\n');
        System.out.print(stack.pop());
        System.out.print('\n');
        System.out.print(stack.pop());
        System.out.print('\n');
        System.out.print(stack.pop());
        System.out.print('\n');
        System.out.print(stack.isEmpty());
        System.out.print('\n');
        System.out.print(stack.peek());
        System.out.print('\n');
        System.out.print(stack.pop());
        System.out.print('\n');
        System.out.print(stack.peek());
        System.out.print('\n');
        System.out.print(stack.isEmpty());
        System.out.print('\n');
        System.out.print('\n');

//        Testing Queue
        System.out.print("TESTING Queue\n\n");

        Queue queue = new Queue();

        queue.push(5);
        queue.push(3);
        queue.push(9);
        queue.push(12);
        queue.push(11);

        queue.print();
        System.out.print('\n');

        System.out.print(queue.pop());
        System.out.print('\n');
        System.out.print(queue.peek());
        System.out.print('\n');
        System.out.print(queue.isEmpty());
        System.out.print('\n');
        System.out.print(queue.pop());
        System.out.print('\n');
        System.out.print(queue.pop());
        System.out.print('\n');
        System.out.print(queue.pop());
        System.out.print('\n');
        System.out.print(queue.isEmpty());
        System.out.print('\n');
        System.out.print(queue.peek());
        System.out.print('\n');
        System.out.print(queue.pop());
        System.out.print('\n');
        System.out.print(queue.peek());
        System.out.print('\n');
        System.out.print(queue.isEmpty());
        System.out.print('\n');
        System.out.print('\n');
    }

}
