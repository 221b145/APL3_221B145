import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EagerSolutions {

    public static void main(String[] args) {
        // Example 1: Swapping Variables with a Temporary Variable
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b + "\n");

        // Example 2: Creating a List of Squares using a Traditional Loop
        List<Integer> squares = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            squares.add(i * i);
        }
        System.out.println("Squares: " + squares + "\n");

        // Example 3: Traditional If-Else Statement
        int x = 15;
        String y;
        if (x > 10) {
            y = "Greater";
        } else {
            y = "Smaller";
        }
        System.out.println("x = " + x + ", so y is '" + y + "'\n");

        // Example 4: Checking for Key Existence in a HashMap
        Map<String, String> myMap = new HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");

        String value;
        if (myMap.containsKey("key")) {
            value = myMap.get("key");
        } else {
            value = "default_value";
        }
        System.out.println("Value for 'key': " + value + "\n");

        // Example 5: String Concatenation
        String name = "Alice";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    }
}
