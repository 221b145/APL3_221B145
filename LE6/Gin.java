// Concrete Decorator: Gin
class Gin extends Decorator {
    Gin(Offering offering) {
        super(offering); // Use the parent class constructor
    }

    @Override
    String getName() {
        return offering.getName() + ", Gin";
    }
}