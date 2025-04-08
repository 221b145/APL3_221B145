// Basic Offering: Tea
class Tea extends Offering {
    @Override
    String getName() {
        return "Tea";
    }

    // Method to get price
    int getPrice() {
        return 10; // Example price
    }
}