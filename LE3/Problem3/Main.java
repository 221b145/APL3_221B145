// FlyBehavior interface
interface FlyBehavior {
    void fly();
}

// QuackBehavior interface
interface QuackBehavior {
    void quack();
}

// SwimBehavior interface
interface SwimBehavior {
    void swim();
}

// Concrete FlyBehavior classes
class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}

class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}

// Concrete QuackBehavior classes
class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silent");
    }
}

// Concrete SwimBehavior class
class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}

// Abstract Duck class
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setSwimBehavior(SwimBehavior sb) {
        swimBehavior = sb;
    }

    public abstract void display();
}

// Concrete Duck classes
class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I'm a Wooden Duck");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck");
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I'm a Lake Duck");
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.performSwim();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.display();
        lakeDuck.performFly();
        lakeDuck.performQuack();
        lakeDuck.performSwim();
    }
}
