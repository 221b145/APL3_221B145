public class LazySolutions {

    public static void main(String[] args) {
        // Example 1: Swapping Variables without a Temporary Variable
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b; // a becomes 15
        b = a - b; // b becomes 5 (original value of a)
        a = a - b; // a becomes 10 (original value of b)
        System.out.println("After Swap: a = " + a + ", b = " + b + "\n");

        // Example 2: Using Streams to Create a List of Squares
        java.util.List<Integer> squares = java.util.stream.IntStream.range(0, 10)
                                            .map(i -> i * i)
                                            .boxed()
                                            .toList();
        System.out.println("Squares: " + squares + "\n");

        // Example 3: Ternary Conditional Operator
        int x = 15;
        String y = (x > 10) ? "Greater" : "Smaller";
        System.out.println("x = " + x + ", so y is '" + y + "'\n");

        // Example 4: Using getOrDefault Method for HashMap
        java.util.Map<String, String> myMap = new java.util.HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");
        String value = myMap.getOrDefault("key", "default_value");
        System.out.println("Value for 'key': " + value + "\n");

        // Example 5: String Formatting
        String name = "Alice";
        String greeting = String.format("Hello, %s!", name);
        System.out.println(greeting);
    }
}
