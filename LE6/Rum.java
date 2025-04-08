// Concrete Decorator: Rum
class Rum extends Decorator {
    Rum(Offering offering) {
        super(offering); // Use the parent class constructor
    }

    @Override
    String getName() {
        return offering.getName() + ", Rum";
    }
}