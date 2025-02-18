abstract class Bharatvanshi {
    abstract void fight();
    abstract void obey();
    abstract void kind();
}

class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Pandav is fighting");
    }

    @Override
    void obey() {
        System.out.println("Pandav is obedient");
    }

    @Override
    void kind() {
        System.out.println("Pandav is kind");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Kaurav is fighting");
    }

    @Override
    void obey() {
        System.out.println("Kaurav is disobedient");
    }

    @Override
    void kind() {
        System.out.println("Kaurav is cruel");
    }
}

class Arjun extends Pandav {
    @Override
    void fight() {
        System.out.println("Arjun is fighting skillfully");
    }

    @Override
    void obey() {
        System.out.println("Arjun is very obedient");
    }

    @Override
    void kind() {
        System.out.println("Arjun is very kind");
    }
}

class Bheem extends Pandav {
    @Override
    void fight() {
        System.out.println("Bheem is fighting with great strength");
    }

    @Override
    void obey() {
        System.out.println("Bheem is very obedient");
    }

    @Override
    void kind() {
        System.out.println("Bheem is less kind");
    }
}

class Duryodhan extends Kaurav {
    @Override
    void fight() {
        System.out.println("Duryodhan is fighting aggressively");
    }

    @Override
    void obey() {
        System.out.println("Duryodhan is disobedient");
    }

    @Override
    void kind() {
        System.out.println("Duryodhan is cruel");
    }
}

class Vikarn extends Kaurav {
    @Override
    void fight() {
        System.out.println("Vikarn is fighting nobly");
    }

    @Override
    void obey() {
        System.out.println("Vikarn is very obedient");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind");
    }
}

public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        arjun.fight();
        arjun.obey();
        arjun.kind();

        Bharatvanshi bheem = new Bheem();
        bheem.fight();
        bheem.obey();
        bheem.kind();

        Bharatvanshi duryodhan = new Duryodhan();
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        Bharatvanshi vikarn = new Vikarn();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
