package A1026.prac;

import A1026.homework.main;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.tire = new Tire();
        mycar.run();
        mycar.tire2 = new Tire();
        mycar.run();
        mycar.tire3 = new HankookTire();
        mycar.run();
        
        
        
        mycar.tire = new HankookTire();
        mycar.run();
        mycar.tire2 = new HankookTire();
        mycar.run();
        mycar.tire3 = new HankookTire();
        mycar.run();
        

    }
}
