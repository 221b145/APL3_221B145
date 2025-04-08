// Abstract Decorator
abstract class Decorator extends Offering {
    protected Offering offering;

    Decorator(Offering offering) {
        this.offering = offering;
    }
}