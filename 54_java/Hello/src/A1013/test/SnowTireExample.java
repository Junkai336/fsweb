package A1013.test;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
        Tire tireParent = tire;

        tireParent.run();
        snowTire.run();
        tire.run();
        tireParent.run();
    }
}
