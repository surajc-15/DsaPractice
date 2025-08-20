import java.util.Hashtable;
import java.util.logging.Logger;

public class HashTableExample {
    private static final Logger logger = Logger.getLogger(HashTableExample.class.getName());

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        // Instead of System.out.println
        logger.info("Hashtable elements: " + table);

        String value = table.get(2);
        logger.info("Value for key 2: " + value);

        boolean contains = table.containsKey(3);
        logger.info("Contains key 3? " + contains);

        table.remove(1);
        logger.info("After removing key 1: " + table);
    }
}
