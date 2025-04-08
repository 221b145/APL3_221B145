// Test class
public class Test {
    public static void main(String[] args) {
        Offering coffee = new Coffee(); // Basic Coffee
        Offering rumCoffee = new Rum(coffee); // Coffee with Rum
        Offering ginRumCoffee = new Gin(rumCoffee); // Coffee with Rum and Gin

        System.out.println(ginRumCoffee.getName()); // Output: Coffee, Rum, Gin
    }
}