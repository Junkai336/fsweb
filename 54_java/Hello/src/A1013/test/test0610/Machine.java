package A1013.test.test0610;

public class Machine {
    public void powerOn() {
    }

    public void powerOff() {
    }

    public abstract void work(); {
        
    }
}

class Computer extends Machine {

    @Override
    public void work () {
        System.out.println("워크");
    }
}
